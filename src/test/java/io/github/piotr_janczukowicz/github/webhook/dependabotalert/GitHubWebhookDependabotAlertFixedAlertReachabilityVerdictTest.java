package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookDependabotAlertFixedAlertReachabilityVerdictTest {

    @ParameterizedTest
    @CsvSource({
        "'reachable',REACHABLE",
        "'unreachable',UNREACHABLE",
        "'potentially_reachable',POTENTIALLY_REACHABLE",
        "'unavailable',UNAVAILABLE",
        "'disabled',DISABLED"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookDependabotAlertFixedAlertReachabilityVerdict value) {
        final GitHubWebhookDependabotAlertFixedAlertReachabilityVerdict decoded =
                GitHubWebhookDependabotAlertFixedAlertReachabilityVerdict.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookDependabotAlertFixedAlertReachabilityVerdict decoded =
                GitHubWebhookDependabotAlertFixedAlertReachabilityVerdict.fromWire(
                        "a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookDependabotAlertFixedAlertReachabilityVerdict.UNRECOGNIZED);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookDependabotAlertFixedAlertReachabilityVerdict.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
