package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookExemptionRequestRequestTypeTest {

    @ParameterizedTest
    @CsvSource({
        "'push_ruleset_bypass',PUSH_RULESET_BYPASS",
        "'secret_scanning',SECRET_SCANNING",
        "'secret_scanning_closure',SECRET_SCANNING_CLOSURE",
        "'code_scanning_alert_dismissal',CODE_SCANNING_ALERT_DISMISSAL",
        "'dependabot_alert_dismissal',DEPENDABOT_ALERT_DISMISSAL",
        "'license_compliance_dismissal',LICENSE_COMPLIANCE_DISMISSAL"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookExemptionRequestRequestType value) {
        final GitHubWebhookExemptionRequestRequestType decoded =
                GitHubWebhookExemptionRequestRequestType.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookExemptionRequestRequestType decoded =
                GitHubWebhookExemptionRequestRequestType.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookExemptionRequestRequestType.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookExemptionRequestRequestType.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
