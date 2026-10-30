package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatusTest {

    @ParameterizedTest
    @CsvSource({
        "'completed',COMPLETED",
        "'in_progress',IN_PROGRESS",
        "'queued',QUEUED",
        "'pending',PENDING",
        "'waiting',WAITING"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus value) {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus decoded =
                GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus decoded =
                GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
