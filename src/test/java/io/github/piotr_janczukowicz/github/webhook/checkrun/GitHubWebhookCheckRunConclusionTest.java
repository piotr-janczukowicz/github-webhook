package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookCheckRunConclusionTest {

    @ParameterizedTest
    @CsvSource({
        "'waiting',WAITING",
        "'pending',PENDING",
        "'startup_failure',STARTUP_FAILURE",
        "'stale',STALE",
        "'success',SUCCESS",
        "'failure',FAILURE",
        "'neutral',NEUTRAL",
        "'cancelled',CANCELLED",
        "'skipped',SKIPPED",
        "'timed_out',TIMED_OUT",
        "'action_required',ACTION_REQUIRED"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(final String wire, final GitHubWebhookCheckRunConclusion value) {
        final GitHubWebhookCheckRunConclusion decoded = GitHubWebhookCheckRunConclusion.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookCheckRunConclusion decoded =
                GitHubWebhookCheckRunConclusion.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookCheckRunConclusion.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookCheckRunConclusion.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
