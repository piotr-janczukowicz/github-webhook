package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookCodeScanningToolSecurityAlertsThresholdTest {

    @ParameterizedTest
    @CsvSource({
        "'none',NONE",
        "'critical',CRITICAL",
        "'high_or_higher',HIGH_OR_HIGHER",
        "'medium_or_higher',MEDIUM_OR_HIGHER",
        "'all',ALL"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookCodeScanningToolSecurityAlertsThreshold value) {
        final GitHubWebhookCodeScanningToolSecurityAlertsThreshold decoded =
                GitHubWebhookCodeScanningToolSecurityAlertsThreshold.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookCodeScanningToolSecurityAlertsThreshold decoded =
                GitHubWebhookCodeScanningToolSecurityAlertsThreshold.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookCodeScanningToolSecurityAlertsThreshold.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookCodeScanningToolSecurityAlertsThreshold.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
