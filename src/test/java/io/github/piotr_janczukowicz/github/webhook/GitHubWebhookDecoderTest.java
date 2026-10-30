package io.github.piotr_janczukowicz.github.webhook;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.github.webhook.checkrun.GitHubWebhookCheckRunCreatedEvent;
import io.github.piotr_janczukowicz.github.webhook.checkrun.GitHubWebhookCheckRunUnknownActionEvent;
import io.github.piotr_janczukowicz.github.webhook.ping.GitHubWebhookPingEvent;
import io.github.piotr_janczukowicz.github.webhook.pullrequestreview.GitHubWebhookPullRequestReviewEvent;
import io.github.piotr_janczukowicz.github.webhook.pullrequestreview.GitHubWebhookPullRequestReviewSubmittedEvent;
import io.github.piotr_janczukowicz.github.webhook.pullrequestreview.GitHubWebhookPullRequestReviewUnknownActionEvent;
import io.github.piotr_janczukowicz.github.webhook.push.GitHubWebhookPushEvent;
import io.github.piotr_janczukowicz.testsupport.UnitTest;
import io.github.piotr_janczukowicz.util.FileUtils;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.node.ObjectNode;

@UnitTest
class GitHubWebhookDecoderTest {

    private static final JsonMapper TREE = JsonMapper.builder().build();
    private static final String REVIEW = "pullrequestreview/webhook-pull-request-review-submitted-event.json";

    private static final String CHECK_RUN = "checkrun/webhook-check-run-created-event.json";

    private final GitHubWebhookDecoder decoder = GitHubWebhookDecoder.create();

    private static byte[] body(final String fixture, final String key, final String value) {
        final ObjectNode node =
                (ObjectNode) TREE.readTree(FileUtils.readBytes(GitHubWebhookDecoderTest.class, fixture));
        if (key != null) {
            node.put(key, value);
        }
        return TREE.writeValueAsBytes(node);
    }

    private static byte[] checkRunWithAppOwner(final String owner) {
        final ObjectNode node =
                (ObjectNode) TREE.readTree(FileUtils.readBytes(GitHubWebhookDecoderTest.class, CHECK_RUN));
        node.put("action", "created");
        if (owner != null) {
            ((ObjectNode) node.get("check_run").get("app")).set("owner", TREE.readTree(owner));
        }
        return TREE.writeValueAsBytes(node);
    }

    private static byte[] checkRunWithoutPrimitive() {
        final ObjectNode node =
                (ObjectNode) TREE.readTree(FileUtils.readBytes(GitHubWebhookDecoderTest.class, CHECK_RUN));
        node.put("action", "created");
        ((ObjectNode) node.get("check_run")).remove("id");
        return TREE.writeValueAsBytes(node);
    }

    static Stream<String> pushRepositoryProperties() {
        final ObjectNode node = (ObjectNode)
                TREE.readTree(FileUtils.readBytes(GitHubWebhookDecoderTest.class, "push/webhook-push-event.json"));
        return node.get("repository").propertyNames().stream().toList().stream();
    }

    private static byte[] pushRepositoryWithout(final String property) {
        final ObjectNode node = (ObjectNode)
                TREE.readTree(FileUtils.readBytes(GitHubWebhookDecoderTest.class, "push/webhook-push-event.json"));
        ((ObjectNode) node.get("repository")).remove(property);
        return TREE.writeValueAsBytes(node);
    }

    private static byte[] pushWith(final String property, final String value) {
        final ObjectNode node = (ObjectNode)
                TREE.readTree(FileUtils.readBytes(GitHubWebhookDecoderTest.class, "push/webhook-push-event.json"));
        node.put(property, value);
        return TREE.writeValueAsBytes(node);
    }

    private static byte[] pushWithBadCommit() {
        final ObjectNode node = (ObjectNode)
                TREE.readTree(FileUtils.readBytes(GitHubWebhookDecoderTest.class, "push/webhook-push-event.json"));
        ((ObjectNode) node.get("commits").get(0)).put("timestamp", "not-a-date");
        return TREE.writeValueAsBytes(node);
    }

    private static byte[] pushWithNull(final String property) {
        final ObjectNode node = (ObjectNode)
                TREE.readTree(FileUtils.readBytes(GitHubWebhookDecoderTest.class, "push/webhook-push-event.json"));
        node.putNull(property);
        return TREE.writeValueAsBytes(node);
    }

    private static byte[] pushWithout(final String property) {
        final ObjectNode node = (ObjectNode)
                TREE.readTree(FileUtils.readBytes(GitHubWebhookDecoderTest.class, "push/webhook-push-event.json"));
        node.remove(property);
        return TREE.writeValueAsBytes(node);
    }

    private static byte[] bytes(final String text) {
        return text.getBytes(StandardCharsets.UTF_8);
    }

    @Test
    void decode_shouldReturnTheRecordOfTheAction_whenActionKnown() {
        final GitHubWebhookEvent event = decoder.decode("pull_request_review", body(REVIEW, "action", "submitted"));

        assertThat(event)
                .isInstanceOf(GitHubWebhookPullRequestReviewSubmittedEvent.class)
                .isInstanceOf(GitHubWebhookPullRequestReviewEvent.class);
    }

    @Test
    void decode_shouldReturnUnknownAction_whenActionNotKnown() {
        final GitHubWebhookEvent event = decoder.decode("pull_request_review", body(REVIEW, "action", "future"));

        assertThat(event).isInstanceOfSatisfying(GitHubWebhookPullRequestReviewUnknownActionEvent.class, unknown -> {
            assertThat(unknown.action()).isEqualTo("future");
            assertThat(unknown.payload()).containsEntry("action", "future").containsKey("review");
        });
    }

    @Test
    void decode_shouldReturnUnknownActionWithoutAction_whenBodyHasNoAction() {
        final GitHubWebhookEvent event = decoder.decode("pull_request_review", body(REVIEW, null, null));

        assertThat(event)
                .isInstanceOfSatisfying(
                        GitHubWebhookPullRequestReviewUnknownActionEvent.class,
                        unknown -> assertThat(unknown.action()).isNull());
    }

    @Test
    void decode_shouldReturnUnknownActionWithoutAction_whenActionIsNotText() {
        final byte[] body = bytes("{\"action\":7,\"review\":{}}");

        final GitHubWebhookEvent event = decoder.decode("pull_request_review", body);

        assertThat(event)
                .isInstanceOfSatisfying(
                        GitHubWebhookPullRequestReviewUnknownActionEvent.class,
                        unknown -> assertThat(unknown.action()).isNull());
    }

    @Test
    void decode_shouldReturnOneRecord_whenActionLessFamilyBodyHasAction() {
        final GitHubWebhookEvent event = decoder.decode("push", body("push/webhook-push-event.json", "action", "x"));

        assertThat(event).isInstanceOf(GitHubWebhookPushEvent.class);
    }

    @Test
    void decode_shouldReturnTheRecordOfTheFamily_whenFamilyHasNoActions() {
        final GitHubWebhookEvent event = decoder.decode("ping", body("ping/webhook-ping-event.json", null, null));

        assertThat(event).isInstanceOf(GitHubWebhookPingEvent.class);
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"", " ", "Push", "PUSH", "push ", "no_such_event"})
    void decode_shouldReturnUnknownEvent_whenHeaderNullBlankOrUnknown(final String header) {
        final GitHubWebhookEvent event = decoder.decode(header, bytes("{\"zen\":\"Keep it logically awesome.\"}"));

        assertThat(event).isInstanceOfSatisfying(GitHubWebhookUnknownEvent.class, unknown -> {
            assertThat(unknown.eventName()).isEqualTo(header);
            assertThat(unknown.payload()).containsEntry("zen", "Keep it logically awesome.");
        });
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "not json", "[]", "\"text\"", "null", "7"})
    void decode_shouldThrowDecodeException_whenBodyIsNotAJsonObject(final String body) {
        final Throwable thrown = catchThrowable(() -> decoder.decode("push", bytes(body)));

        assertThat(thrown).isInstanceOf(GitHubWebhookDecodeException.class);
    }

    @Test
    void decode_shouldNameTheEventAndNotCopyTheBody_whenBodyIsNotJson() {
        final Throwable thrown = catchThrowable(() -> decoder.decode("push", bytes("secret-token-in-a-bad-body")));

        assertThat(thrown)
                .isInstanceOfSatisfying(
                        GitHubWebhookDecodeException.class,
                        exception -> assertSoftly(softly -> {
                            softly.assertThat(exception.eventName()).isEqualTo("push");
                            softly.assertThat(exception.action()).isNull();
                            softly.assertThat(exception.getMessage())
                                    .contains("'push'")
                                    .doesNotContain("secret-token");
                        }));
    }

    @Test
    void decode_shouldThrowDecodeException_whenBodyIsLargerThanTheLimit() {
        final byte[] body = new byte[GitHubWebhookDecoder.MAX_BODY_BYTES + 1];

        final Throwable thrown = catchThrowable(() -> decoder.decode("push", body));

        assertThat(thrown).isInstanceOf(GitHubWebhookDecodeException.class).hasMessageContaining("larger than");
    }

    @Test
    void decode_shouldAcceptTheBody_whenItIsExactlyTheLimit() {
        final byte[] json = bytes("{\"zen\":\"z\",\"hook_id\":1}");
        final byte[] body = Arrays.copyOf(json, GitHubWebhookDecoder.MAX_BODY_BYTES);
        Arrays.fill(body, json.length, body.length, (byte) ' ');

        final GitHubWebhookEvent event = decoder.decode("ping", body);

        assertThat(event).isInstanceOf(GitHubWebhookPingEvent.class);
    }

    @Test
    void decodeDelivery_shouldNotPutTheNumberOfTheBodyInTheReason_whenItIsOutOfRange() {
        final byte[] body = bytes("{\"zen\":\"z\",\"hook_id\":99999999999999999999123456}");

        final GitHubWebhookDelivery delivery = decoder.decodeDelivery("ping", body);

        assertThat(delivery.fallbackReason()).isEqualTo("a value cannot be read at hook_id");
    }

    @Test
    void decodeDelivery_shouldKeepEveryFieldAndTheAction_whenEventIsTyped() {
        final byte[] submitted = body(REVIEW, "action", "submitted");

        final GitHubWebhookDelivery delivery = decoder.decodeDelivery("pull_request_review", submitted);

        assertSoftly(softly -> {
            softly.assertThat(delivery.eventName()).isEqualTo("pull_request_review");
            softly.assertThat(delivery.event()).isInstanceOf(GitHubWebhookPullRequestReviewSubmittedEvent.class);
            softly.assertThat(delivery.payload())
                    .containsEntry("action", "submitted")
                    .containsKey("review");
        });
    }

    @Test
    void decodeDelivery_shouldHaveNoFallbackReason_whenEventIsTypedOrNew() {
        final byte[] typed = body(REVIEW, "action", "submitted");
        final byte[] newAction = body(REVIEW, "action", "brand_new");

        final GitHubWebhookDelivery known = decoder.decodeDelivery("pull_request_review", typed);
        final GitHubWebhookDelivery fresh = decoder.decodeDelivery("pull_request_review", newAction);

        assertSoftly(softly -> {
            softly.assertThat(known.fallbackReason()).isNull();
            softly.assertThat(fresh.fallbackReason()).isNull();
        });
    }

    @Test
    void decodeDelivery_shouldNameTheFailingPropertyAndNotTheBody_whenKnownEventFallsBack() {
        final byte[] noId = checkRunWithoutPrimitive();

        final GitHubWebhookDelivery delivery = decoder.decodeDelivery("check_run", noId);

        assertSoftly(softly -> {
            softly.assertThat(delivery.event()).isInstanceOf(GitHubWebhookCheckRunUnknownActionEvent.class);
            softly.assertThat(delivery.fallbackReason())
                    .contains("Missing required creator property 'id'")
                    .contains("check_run")
                    .doesNotContain("octocat");
        });
    }

    @Test
    void decode_shouldReturnUnknownEventWithTheBody_whenActionLessFamilyMissesARequiredPrimitive() {
        final byte[] noForced = pushWithout("forced");

        final GitHubWebhookDelivery delivery = decoder.decodeDelivery("push", noForced);

        assertThat(delivery.event())
                .isInstanceOfSatisfying(
                        GitHubWebhookUnknownEvent.class,
                        unknown -> assertSoftly(softly -> {
                            softly.assertThat(unknown.eventName()).isEqualTo("push");
                            softly.assertThat(unknown.payload()).containsKey("ref");
                            softly.assertThat(delivery.fallbackReason()).contains("'forced'");
                        }));
    }

    @Test
    void decodeDelivery_shouldThrowNullPointerException_whenBodyNull() {
        final Throwable thrown = catchThrowable(() -> decoder.decodeDelivery("ping", null));

        assertThat(thrown).isInstanceOf(NullPointerException.class);
    }

    @Test
    void decode_shouldReturnUnknownActionWithTheBody_whenUnionHasNoMemberThatFits() {
        final GitHubWebhookEvent event = decoder.decode("check_run", checkRunWithAppOwner("{\"zzz\":1}"));

        assertThat(event).isInstanceOfSatisfying(GitHubWebhookCheckRunUnknownActionEvent.class, unknown -> {
            assertThat(unknown.action()).isEqualTo("created");
            assertThat(unknown.payload()).containsEntry("action", "created").containsKey("check_run");
        });
    }

    @Test
    void decode_shouldReturnTheRecord_whenUnionHasAMemberThatFits() {
        final GitHubWebhookEvent event = decoder.decode("check_run", checkRunWithAppOwner(null));

        assertThat(event).isInstanceOf(GitHubWebhookCheckRunCreatedEvent.class);
    }

    @Test
    void decode_shouldKeepAnIdAboveTheIntRange_whenBodyHasOne() {
        final GitHubWebhookEvent event = decoder.decode("ping", bytes("{\"zen\":\"z\",\"hook_id\":3000000000}"));

        assertThat(event)
                .isInstanceOfSatisfying(
                        GitHubWebhookPingEvent.class,
                        ping -> assertThat(ping.hookId()).isEqualTo(3_000_000_000L));
    }

    @Test
    void decode_shouldReturnUnknownActionWithTheBody_whenRequiredObjectIsMissing() {
        final GitHubWebhookEvent event = decoder.decode("pull_request_review", bytes("{\"action\":\"submitted\"}"));

        assertThat(event).isInstanceOfSatisfying(GitHubWebhookPullRequestReviewUnknownActionEvent.class, unknown -> {
            assertThat(unknown.action()).isEqualTo("submitted");
            assertThat(unknown.payload()).containsEntry("action", "submitted");
        });
    }

    @Test
    void decode_shouldReturnUnknownActionWithTheBody_whenRequiredPrimitiveIsMissing() {
        final GitHubWebhookEvent event = decoder.decode("check_run", checkRunWithoutPrimitive());

        assertThat(event).isInstanceOf(GitHubWebhookCheckRunUnknownActionEvent.class);
    }

    @Test
    void decode_shouldReturnUnknownActionWithTheReason_whenAValueHasTheWrongType() {
        final byte[] wrongType = bytes("{\"action\":\"submitted\",\"review\":5}");

        final GitHubWebhookDelivery delivery = decoder.decodeDelivery("pull_request_review", wrongType);

        assertSoftly(softly -> {
            softly.assertThat(delivery.event()).isInstanceOf(GitHubWebhookPullRequestReviewUnknownActionEvent.class);
            softly.assertThat(delivery.fallbackReason()).contains("wrong type").contains("review");
        });
    }

    @Test
    void decode_shouldNotPutTheValueInTheReason_whenAValueHasTheWrongType() {
        final byte[] wrongType = pushWith("forced", "secret-token-value");

        final GitHubWebhookDelivery delivery = decoder.decodeDelivery("push", wrongType);

        assertSoftly(softly -> {
            softly.assertThat(delivery.event()).isInstanceOf(GitHubWebhookUnknownEvent.class);
            softly.assertThat(delivery.fallbackReason()).isNotNull().doesNotContain("secret-token-value");
        });
    }

    @Test
    void decode_shouldReturnUnknownEvent_whenARequiredPrimitiveIsNull() {
        final byte[] withNull = pushWithNull("forced");

        final GitHubWebhookDelivery delivery = decoder.decodeDelivery("push", withNull);

        assertSoftly(softly -> {
            softly.assertThat(delivery.event()).isInstanceOf(GitHubWebhookUnknownEvent.class);
            softly.assertThat(delivery.fallbackReason()).contains("forced");
        });
    }

    @ParameterizedTest
    @MethodSource("pushRepositoryProperties")
    void decodeDelivery_shouldGiveAReasonExactlyWhenTheEventFellBack_whenAPushRepositoryPropertyIsMissing(
            final String property) {
        final byte[] without = pushRepositoryWithout(property);

        final GitHubWebhookDelivery delivery = decoder.decodeDelivery("push", without);

        assertThat(delivery.event() instanceof GitHubWebhookUnknownEvent).isEqualTo(delivery.fallbackReason() != null);
    }

    @Test
    void decode_shouldKeepControlCharactersOutOfTheMessage_whenTheHeaderHasThem() {
        final byte[] empty = new byte[0];

        final Throwable thrown = catchThrowable(() -> decoder.decode("push\r\nFORGED", empty));

        assertThat(thrown.getMessage()).doesNotContain("\r").doesNotContain("\n");
    }

    @Test
    void decode_shouldNameTheFieldsAndIndexOfTheFailure_whenAListItemDoesNotFit() {
        final byte[] badItem = pushWithBadCommit();

        final GitHubWebhookDelivery delivery = decoder.decodeDelivery("push", badItem);

        assertThat(delivery.fallbackReason()).contains("commits[0]").doesNotContain("java.util");
    }

    @Test
    void decode_shouldSayTheBodyRepeatsAKey_whenAKeyIsDuplicated() {
        final byte[] duplicated = bytes("{\"a\":1,\"a\":2}");

        final Throwable thrown = catchThrowable(() -> decoder.decode("push", duplicated));

        assertThat(thrown).isInstanceOf(GitHubWebhookDecodeException.class).hasMessageContaining("repeats a key");
    }

    @Test
    void decode_shouldSayTheBodyIsOverALimit_whenNestingIsTooDeep() {
        final byte[] deep = bytes("[".repeat(2000) + "]".repeat(2000));

        final Throwable thrown = catchThrowable(() -> decoder.decode("push", deep));

        assertThat(thrown).isInstanceOf(GitHubWebhookDecodeException.class).hasMessageContaining("JSON limit");
    }

    @Test
    void decodeDelivery_shouldNotThrow_whenANumberHasAHugeExponent() {
        final byte[] huge = bytes("{\"a\":1e9999999999,\"b\":[1e-9999999999]}");

        final GitHubWebhookDelivery delivery = decoder.decodeDelivery("no_such_event", huge);

        assertThat(delivery.event()).isInstanceOf(GitHubWebhookUnknownEvent.class);
    }

    @Test
    void decode_shouldThrowDecodeException_whenBodyOfAnUnknownEventIsNotAnObject() {
        final Throwable thrown = catchThrowable(() -> decoder.decode("no_such_event", bytes("[1]")));

        assertThat(thrown).isInstanceOf(GitHubWebhookDecodeException.class);
    }

    @Test
    void decode_shouldIgnoreUnknownFields() {
        final ObjectNode node = (ObjectNode) TREE.readTree(body("push/webhook-push-event.json", null, null));
        node.put("added_by_github_later", true);
        node.set("another", TREE.createObjectNode().put("deep", 1));

        final GitHubWebhookEvent event = decoder.decode("push", TREE.writeValueAsBytes(node));

        assertThat(event).isInstanceOf(GitHubWebhookPushEvent.class);
    }

    @Test
    void decode_shouldThrowNullPointerException_whenBodyNull() {
        final Throwable thrown = catchThrowable(() -> decoder.decode("push", null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("body");
    }

    @Test
    void decode_shouldReadTheSameFixtureTwice_becauseTheDecoderKeepsNoState() {
        final byte[] body = body(REVIEW, "action", "submitted");

        final JsonNode first = TREE.valueToTree(decoder.decode("pull_request_review", body));
        final JsonNode second = TREE.valueToTree(decoder.decode("pull_request_review", body));

        assertThat(first).isEqualTo(second);
    }
}
