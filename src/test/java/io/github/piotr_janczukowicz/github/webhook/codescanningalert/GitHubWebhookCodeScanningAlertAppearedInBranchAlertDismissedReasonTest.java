package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReasonTest {

    @ParameterizedTest
    @CsvSource({
        "'false positive',FALSE_POSITIVE",
        "'won''t fix',WON_T_FIX",
        "'used in tests',USED_IN_TESTS",
        "'mitigated',MITIGATED"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason value) {
        final GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason decoded =
                GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason decoded =
                GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason.fromWire(
                        "a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
