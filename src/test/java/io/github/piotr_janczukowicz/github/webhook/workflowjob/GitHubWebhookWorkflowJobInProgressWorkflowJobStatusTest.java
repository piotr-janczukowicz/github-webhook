package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookWorkflowJobInProgressWorkflowJobStatusTest {

    @ParameterizedTest
    @CsvSource({"'in_progress',IN_PROGRESS", "'completed',COMPLETED", "'queued',QUEUED"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookWorkflowJobInProgressWorkflowJobStatus value) {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobStatus decoded =
                GitHubWebhookWorkflowJobInProgressWorkflowJobStatus.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobStatus decoded =
                GitHubWebhookWorkflowJobInProgressWorkflowJobStatus.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookWorkflowJobInProgressWorkflowJobStatus.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookWorkflowJobInProgressWorkflowJobStatus.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
