package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookDeploymentWorkflowRunConclusionTest {

    @ParameterizedTest
    @CsvSource({
        "'success',SUCCESS",
        "'failure',FAILURE",
        "'neutral',NEUTRAL",
        "'cancelled',CANCELLED",
        "'timed_out',TIMED_OUT",
        "'action_required',ACTION_REQUIRED",
        "'stale',STALE",
        "'startup_failure',STARTUP_FAILURE"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookDeploymentWorkflowRunConclusion value) {
        final GitHubWebhookDeploymentWorkflowRunConclusion decoded =
                GitHubWebhookDeploymentWorkflowRunConclusion.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookDeploymentWorkflowRunConclusion decoded =
                GitHubWebhookDeploymentWorkflowRunConclusion.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookDeploymentWorkflowRunConclusion.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookDeploymentWorkflowRunConclusion.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
