package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverityTest {

    @ParameterizedTest
    @CsvSource({"'low',LOW", "'medium',MEDIUM", "'high',HIGH", "'critical',CRITICAL"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity value) {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity decoded =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity decoded =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity.fromWire(
                        "a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
