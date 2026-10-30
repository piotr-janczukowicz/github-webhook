[![Codacy Badge](https://app.codacy.com/project/badge/Grade/ada66a425c214e32817976810d3f6635)](https://app.codacy.com/gh/piotr-janczukowicz/github-webhook/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_grade)
[![Codacy Coverage](https://app.codacy.com/project/badge/Coverage/ada66a425c214e32817976810d3f6635)](https://app.codacy.com/gh/piotr-janczukowicz/github-webhook/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_coverage)
[![Build](https://github.com/piotr-janczukowicz/github-webhook/actions/workflows/main.yml/badge.svg)](https://github.com/piotr-janczukowicz/github-webhook/actions/workflows/main.yml)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.piotr-janczukowicz/github-webhook)](https://central.sonatype.com/artifact/io.github.piotr-janczukowicz/github-webhook)
[![Release](https://img.shields.io/github/v/release/piotr-janczukowicz/github-webhook)](https://github.com/piotr-janczukowicz/github-webhook/releases)
[![License: MIT](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
![Java 21](https://img.shields.io/badge/Java-21-orange.svg)

# github-webhook

Typed GitHub webhook events for Java 21: a record for every event GitHub documents (309 events in 87 families, for
github.com, GitHub Enterprise Cloud and GitHub Enterprise Server), a decoder, and a receiver that verifies the signature
before it parses anything.

- **Typed.** Every event is a record and every family a sealed interface, so the compiler checks a `switch` over the
  decoded event.
- **Safe by default.** The receiver checks `X-Hub-Signature-256` against the raw body in constant time, and a delivery
  with a bad signature is never parsed.
- **Stable when GitHub changes.** A new event, action, enum value, field or union variant never fails decoding. A known
  event that does not fit its record (a required property is missing or `null`, or a value has another JSON type) is kept
  as an unknown event with its body and logged at `WARN`; `fallbackReason()` says why (`decodeDelivery` and
  `receiveDelivery` carry it, `decode` and `receive` return the unknown event without the reason).
- **Light.** Synchronous, no HTTP client, no dependency on the REST client. Jackson 3 and a few small modules.

**Requirements:** Java 21. The library is a Java module, `io.github.piotr_janczukowicz.githubwebhook`, and also works on the
class path. It is published on
[Maven Central](https://central.sonatype.com/artifact/io.github.piotr-janczukowicz/github-webhook):

```xml
<dependency>
    <groupId>io.github.piotr-janczukowicz</groupId>
    <artifactId>github-webhook</artifactId>
    <version>2026.3.10.0</version>
</dependency>
```

The library is in prerelease; see the [Disclaimer](#disclaimer) before relying on it.

## Supported GitHub products

| Product | Status |
|---|---|
| GitHub.com | Supported: every event of the description; a record or enum that not every product sends is marked `@Flavors` |
| GitHub Enterprise Cloud | Supported: an event that only it sends is marked `@Flavors(GitHubWebhookFlavor.GHEC)` |
| GitHub Enterprise Server | Supported: version 3.22; an event that only it sends is marked `@Flavors(GitHubWebhookFlavor.GHES)` |

The decoder has no product check: it decodes whatever it receives. [webhook-events.md](docs/guide/webhook-events.md) shows
which product sends which event.

## Usage

Build the receiver once with the webhook secret (it is thread-safe) and hand it the two headers and the raw body of every
delivery:

```java
GitHubWebhookReceiver receiver = GitHubWebhookReceiver.of(secret); // the webhook secret, as text or bytes

GitHubWebhookEvent event = receiver.receive(
        request.header("X-GitHub-Event"), request.header("X-Hub-Signature-256"), request.readBody());

switch (event) {
    case GitHubWebhookIssuesOpenedEvent opened -> handle(opened.issue());
    case GitHubWebhookIssuesEvent other -> { /* another action of issues, or an action this version does not know */ }
    case GitHubWebhookPushEvent push -> handle(push.commits());
    case GitHubWebhookUnknownEvent unknown -> log(unknown.eventName());
    default -> { }
}
```

`receive` throws `GitHubWebhookSignatureException` for a missing or wrong signature (answer with 401) and
`GitHubWebhookDecodeException` for a body that is empty, above 25 MiB, not a JSON object or over a JSON limit (answer with
400). A body above 25 MiB is refused before the signature is computed. The body must be the bytes exactly as received: a
single changed byte changes the signature.

To rotate a secret, `GitHubWebhookReceiver.ofSecrets(List.of(newSecret, oldSecret))` accepts either one. To keep the body
next to the typed event (to queue or forward it), use `receiveDelivery`, which returns a `GitHubWebhookDelivery`.

The library is generated from GitHub's OpenAPI descriptions and is not source-stable: a sync can change a component type,
rename a record or add a record to a sealed interface, so end a `switch` over events with a `default`. The
[guide](docs/guide/webhooks.md) has the detail, and [webhook-events.md](docs/guide/webhook-events.md) lists every
supported event with the products that send it.

## Try it

[`WebhookServerExample`](src/test/java/io/github/piotr_janczukowicz/github/webhook/WebhookServerExample.java) is a complete
endpoint on the JDK's own `HttpServer` (about fifty lines): it takes `POST /github/webhook`, lets the receiver verify and
decode the delivery, and prints one line per event. Run its `main` with the environment variable `WEBHOOK_SECRET` set to the
webhook's secret (the port is the first argument, default 8080), expose it with a tunnel such as `ngrok http 8080`, and add a
webhook in a repository's Settings with the tunnel URL plus `/github/webhook`, content type `application/json` and the same
secret. GitHub's first delivery is a `ping`.

## Disclaimer

This library is built on the OpenAPI descriptions that GitHub publishes in
[github/rest-api-description](https://github.com/github/rest-api-description), which are licensed under the MIT license.
The caveats of that project apply here too: the descriptions of the webhooks are not always exact, and a payload GitHub
sends can differ from its description.

**The library is a prerelease. It is checked against the descriptions and a few real deliveries, not against every event
on a live GitHub instance. Verify the behavior of any event you depend on before using it in production.**

## License

See [LICENSE](LICENSE).
