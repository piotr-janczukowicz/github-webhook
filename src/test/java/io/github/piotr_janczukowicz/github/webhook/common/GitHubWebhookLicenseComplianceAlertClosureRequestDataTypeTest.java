package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookLicenseComplianceAlertClosureRequestDataTypeTest {

    @ParameterizedTest
    @CsvSource({"'license_compliance_dismissal',LICENSE_COMPLIANCE_DISMISSAL"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookLicenseComplianceAlertClosureRequestDataType value) {
        final GitHubWebhookLicenseComplianceAlertClosureRequestDataType decoded =
                GitHubWebhookLicenseComplianceAlertClosureRequestDataType.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookLicenseComplianceAlertClosureRequestDataType decoded =
                GitHubWebhookLicenseComplianceAlertClosureRequestDataType.fromWire(
                        "a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookLicenseComplianceAlertClosureRequestDataType.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookLicenseComplianceAlertClosureRequestDataType.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
