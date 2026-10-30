package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookDeploymentReviewRejectedWorkflowRunStatusTest {

    @ParameterizedTest
    @CsvSource({
        "'requested',REQUESTED",
        "'in_progress',IN_PROGRESS",
        "'completed',COMPLETED",
        "'queued',QUEUED",
        "'waiting',WAITING"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus value) {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus decoded =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus decoded =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
