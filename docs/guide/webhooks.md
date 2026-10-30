# Receiving GitHub webhooks

This guide covers the receiver, the decoded types, and what happens with events this library version does not know. The
list of events is in [webhook-events.md](webhook-events.md).

## Receive a delivery

A delivery has three parts you hand over unchanged: the `X-GitHub-Event` header, the `X-Hub-Signature-256` header and the
raw request body. Build the receiver once (it is thread-safe) with the webhook secret:

```java
GitHubWebhookReceiver receiver = GitHubWebhookReceiver.of(secret);

GitHubWebhookEvent event = receiver.receive(eventHeader, signatureHeader, body);
```

`body` must be the bytes exactly as received: a single changed byte changes the signature. The receiver checks the
signature first, in constant time, and throws `GitHubWebhookSignatureException` when it is missing or wrong, without parsing
the body. Answer such a request with 401.

If you verify somewhere else, use the two parts alone: `GitHubWebhookVerifier.of(secret).isValid(body, signatureHeader)` and
`GitHubWebhookDecoder.create().decode(eventHeader, body)`.

## The decoded types

Every event of GitHub belongs to a family (a group of events with one `X-GitHub-Event` value, for example `issues`).

| GitHub sends | You get |
|---|---|
| a family with actions (`issues`, `pull_request`, ...) | `GitHubWebhook<Family>Event`, a sealed interface with one record for each action (`GitHubWebhookIssuesOpenedEvent`) and `GitHubWebhook<Family>UnknownActionEvent` |
| a family without actions (`push`, `ping`, `create`, ...) | one record, `GitHubWebhook<Family>Event` (`GitHubWebhookPushEvent`) |
| an event this version does not know | `GitHubWebhookUnknownEvent` |

All of them are `GitHubWebhookEvent`, a sealed interface, so a `switch` over it needs no cast and the compiler tells you
which families you left out:

```java
switch (event) {
    case GitHubWebhookPullRequestOpenedEvent opened -> review(opened.pullRequest());
    case GitHubWebhookPullRequestEvent other -> { }
    case GitHubWebhookPushEvent push -> build(push.after());
    default -> { }
}
```

A few events have a body that is one of several shapes. `pull_request` `review_requested` is a sealed interface of
`...RequestedReviewerEvent` and `...RequestedTeamEvent`; a `switch` over it covers both.

### Fields

A record has the fields of the event, named in camelCase (`pull_request` is `pullRequest()`). A field that GitHub does not
always send is `@Nullable` (and absent in the JSON when `null`); a field that it always sends is never `null`. The action
is not a field: it is the type (`GitHubWebhookIssuesOpenedEvent` is the `opened` action).

Nested objects are records too, named from their title or their parent (`GitHubWebhookSimpleUser`, `GitHubWebhookIssuesOpenedChanges`).
Names never depend on other families: a change in one family cannot rename a type of another.

Where GitHub sends either a text or an object (for example the `payload` of a deployment), the field is a
`Map<String, Object>`, and a bare text is read as `{"value": text}`. An issue label that GitHub sends as a plain string is
read as the label with only its `name`. Enum fields are enums with an `UNKNOWN` constant (or `UNRECOGNIZED` when `unknown`
is a real value) for a value added later.

## What never fails

- **An event this version does not know**: `GitHubWebhookUnknownEvent(eventName, payload)`; `payload` is the body as a map.
  The header is compared exactly, so `Push` is not `push`; a missing header gives this type too.
- **An action it does not know** in a known family: `GitHubWebhook<Family>UnknownActionEvent(action, payload)`; `action` is
  `null` when the body has none.
- **Fields it does not know**: ignored.
- **Enum values it does not know**: the fallback constant.
- **A known event that does not fit its record**: a union it cannot resolve (a new `type` value, or properties that fit
  no member), a required property that is missing or `null`, or a value of another JSON type. It becomes the
  unknown-action record of the family (`GitHubWebhookUnknownEvent` for a family without
  actions, such as `push`), with the whole body as `payload` and the `action` it had. The typed fields of that event are
  not available. This is also what a known event turns into when GitHub or GHES omits a property the specification
  requires, so it is not only for new actions: the decoder logs it at `WARN` (event, action, failing property, never the
  body), and `decodeDelivery(...).fallbackReason()` is non-`null` for it and `null` for a genuinely new event or action.

## What does fail

`GitHubWebhookDecodeException` (unchecked) when the body of a delivery is empty, larger than 25 MiB, not a JSON object, or
over a JSON limit such as the nesting depth. The message says which (a repeated key, a limit, or not JSON). It carries
`eventName()` and `action()`, and its message never contains the body.

## What the payload map holds

`payload` is read without types: integers are `Integer`, `Long` or `BigInteger` by size, decimals are `Double`, and
nested objects and arrays are mutable, so copy them before changing them. The top-level map is unmodifiable.

## Stability

The records are generated from GitHub's OpenAPI descriptions, so a sync can change a component type, rename a record or
add a record to a sealed interface. A `switch` over events or over the records of a family should end with a `default`
or a family-level case.

## Products

Records and enums carry `@Flavors` when not every product sends them: GitHub.com (`CLOUD`), GitHub Enterprise Cloud (`GHEC`)
and GitHub Enterprise Server (`GHES`). The decoder has no product check: it decodes whatever it receives.
