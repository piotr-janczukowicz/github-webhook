package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookDependabotAlertFixedAlertDismissedReasonTest {

    @ParameterizedTest
    @CsvSource({
        "'fix_started',FIX_STARTED",
        "'inaccurate',INACCURATE",
        "'no_bandwidth',NO_BANDWIDTH",
        "'not_used',NOT_USED",
        "'tolerable_risk',TOLERABLE_RISK"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookDependabotAlertFixedAlertDismissedReason value) {
        final GitHubWebhookDependabotAlertFixedAlertDismissedReason decoded =
                GitHubWebhookDependabotAlertFixedAlertDismissedReason.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookDependabotAlertFixedAlertDismissedReason decoded =
                GitHubWebhookDependabotAlertFixedAlertDismissedReason.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookDependabotAlertFixedAlertDismissedReason.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookDependabotAlertFixedAlertDismissedReason.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
