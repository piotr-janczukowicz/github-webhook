package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatusTest {

    @ParameterizedTest
    @CsvSource({"'completed',COMPLETED", "'in_progress',IN_PROGRESS", "'queued',QUEUED", "'pending',PENDING"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus value) {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus decoded =
                GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus decoded =
                GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
