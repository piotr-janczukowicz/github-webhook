package io.github.piotr_janczukowicz.github.webhook;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import io.github.piotr_janczukowicz.github.webhook.issues.GitHubWebhookIssuesOpenedEvent;
import io.github.piotr_janczukowicz.github.webhook.push.GitHubWebhookPushEvent;
import io.github.piotr_janczukowicz.github.webhook.workflowrun.GitHubWebhookWorkflowRunCompletedEvent;
import io.github.piotr_janczukowicz.testsupport.UnitTest;
import io.github.piotr_janczukowicz.util.FileUtils;
import org.junit.jupiter.api.Test;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.node.ObjectNode;

@UnitTest
class GitHubWebhookRealWorldPayloadTest {

    private static final JsonMapper TREE = JsonMapper.builder().build();
    private static final long BEYOND_INT = 12_345_678_901L;

    private final GitHubWebhookDecoder decoder = GitHubWebhookDecoder.create();

    private static ObjectNode fixture(final String path) {
        return (ObjectNode) TREE.readTree(FileUtils.readBytes(GitHubWebhookRealWorldPayloadTest.class, path));
    }

    private static byte[] bytes(final ObjectNode node) {
        return TREE.writeValueAsBytes(node);
    }

    @Test
    void decode_shouldKeepLargeIdsAndCommitOffset_whenPushLooksLikeProduction() {
        final ObjectNode push = fixture("push/webhook-push-event.json");
        ((ObjectNode) push.get("repository")).put("id", BEYOND_INT);
        ((ObjectNode) push.get("commits").get(0)).put("timestamp", "2019-05-15T15:20:33-04:00");
        push.putObject("added_by_github_later").put("key", "value");

        final GitHubWebhookEvent event = decoder.decode("push", bytes(push));

        assertThat(event)
                .isInstanceOfSatisfying(
                        GitHubWebhookPushEvent.class,
                        decoded -> assertSoftly(softly -> {
                            softly.assertThat(decoded.repository().id()).isEqualTo(BEYOND_INT);
                            softly.assertThat(decoded.commits()
                                            .getFirst()
                                            .timestamp()
                                            .getOffset()
                                            .getTotalSeconds())
                                    .isEqualTo(-4 * 3600);
                        }));
    }

    @Test
    void decode_shouldKeepRunIdsBeyondTheIntRange_whenWorkflowRunCompleted() {
        final ObjectNode run = fixture("workflowrun/webhook-workflow-run-completed-event.json");
        run.put("action", "completed");
        ((ObjectNode) run.get("workflow_run")).put("id", BEYOND_INT).put("check_suite_id", BEYOND_INT);

        final GitHubWebhookEvent event = decoder.decode("workflow_run", bytes(run));

        assertThat(event)
                .isInstanceOfSatisfying(
                        GitHubWebhookWorkflowRunCompletedEvent.class,
                        decoded -> assertThat(decoded.workflowRun().id()).isEqualTo(BEYOND_INT));
    }

    @Test
    void decodeDelivery_shouldMapAnEnumValueFromTheFuture_whenIssueOpened() {
        final ObjectNode issues = fixture("issues/webhook-issues-opened-event.json");
        issues.put("action", "opened");
        ((ObjectNode) issues.get("issue")).put("state", "triaged");

        final GitHubWebhookDelivery delivery = decoder.decodeDelivery("issues", bytes(issues));

        assertThat(delivery.event())
                .isInstanceOfSatisfying(
                        GitHubWebhookIssuesOpenedEvent.class,
                        decoded -> assertSoftly(softly -> {
                            softly.assertThat(decoded.issue().state()).isEqualTo(GitHubWebhookMilestoneState.UNKNOWN);
                            softly.assertThat(delivery.payload()).containsKey("issue");
                        }));
    }
}
