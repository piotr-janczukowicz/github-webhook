package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookCodeScanningToolAlertsThresholdTest {

    @ParameterizedTest
    @CsvSource({"'none',NONE", "'errors',ERRORS", "'errors_and_warnings',ERRORS_AND_WARNINGS", "'all',ALL"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookCodeScanningToolAlertsThreshold value) {
        final GitHubWebhookCodeScanningToolAlertsThreshold decoded =
                GitHubWebhookCodeScanningToolAlertsThreshold.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookCodeScanningToolAlertsThreshold decoded =
                GitHubWebhookCodeScanningToolAlertsThreshold.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookCodeScanningToolAlertsThreshold.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookCodeScanningToolAlertsThreshold.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
