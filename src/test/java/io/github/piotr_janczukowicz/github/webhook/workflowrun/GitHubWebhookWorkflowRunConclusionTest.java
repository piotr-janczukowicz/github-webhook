package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookWorkflowRunConclusionTest {

    @ParameterizedTest
    @CsvSource({
        "'action_required',ACTION_REQUIRED",
        "'cancelled',CANCELLED",
        "'failure',FAILURE",
        "'neutral',NEUTRAL",
        "'skipped',SKIPPED",
        "'stale',STALE",
        "'success',SUCCESS",
        "'timed_out',TIMED_OUT",
        "'startup_failure',STARTUP_FAILURE"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookWorkflowRunConclusion value) {
        final GitHubWebhookWorkflowRunConclusion decoded = GitHubWebhookWorkflowRunConclusion.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookWorkflowRunConclusion decoded =
                GitHubWebhookWorkflowRunConclusion.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookWorkflowRunConclusion.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookWorkflowRunConclusion.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
