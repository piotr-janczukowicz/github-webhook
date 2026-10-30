package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookPullRequestDequeuedReasonTest {

    @ParameterizedTest
    @CsvSource({
        "'UNKNOWN_REMOVAL_REASON',UNKNOWN_REMOVAL_REASON",
        "'MANUAL',MANUAL",
        "'MERGE',MERGE",
        "'MERGE_CONFLICT',MERGE_CONFLICT",
        "'CI_FAILURE',CI_FAILURE",
        "'CI_TIMEOUT',CI_TIMEOUT",
        "'ALREADY_MERGED',ALREADY_MERGED",
        "'QUEUE_CLEARED',QUEUE_CLEARED",
        "'ROLL_BACK',ROLL_BACK",
        "'BRANCH_PROTECTIONS',BRANCH_PROTECTIONS",
        "'GIT_TREE_INVALID',GIT_TREE_INVALID",
        "'INVALID_MERGE_COMMIT',INVALID_MERGE_COMMIT"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookPullRequestDequeuedReason value) {
        final GitHubWebhookPullRequestDequeuedReason decoded = GitHubWebhookPullRequestDequeuedReason.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookPullRequestDequeuedReason decoded =
                GitHubWebhookPullRequestDequeuedReason.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookPullRequestDequeuedReason.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookPullRequestDequeuedReason.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
