package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookCheckRunCheckSuiteConclusionTest {

    @ParameterizedTest
    @CsvSource({
        "'success',SUCCESS",
        "'failure',FAILURE",
        "'neutral',NEUTRAL",
        "'cancelled',CANCELLED",
        "'skipped',SKIPPED",
        "'timed_out',TIMED_OUT",
        "'action_required',ACTION_REQUIRED",
        "'stale',STALE",
        "'startup_failure',STARTUP_FAILURE"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookCheckRunCheckSuiteConclusion value) {
        final GitHubWebhookCheckRunCheckSuiteConclusion decoded =
                GitHubWebhookCheckRunCheckSuiteConclusion.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookCheckRunCheckSuiteConclusion decoded =
                GitHubWebhookCheckRunCheckSuiteConclusion.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookCheckRunCheckSuiteConclusion.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookCheckRunCheckSuiteConclusion.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
