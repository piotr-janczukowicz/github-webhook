package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookDependabotAlertFixedAlertDependencyRelationshipTest {

    @ParameterizedTest
    @CsvSource({"'unknown',UNKNOWN", "'direct',DIRECT", "'transitive',TRANSITIVE", "'inconclusive',INCONCLUSIVE"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookDependabotAlertFixedAlertDependencyRelationship value) {
        final GitHubWebhookDependabotAlertFixedAlertDependencyRelationship decoded =
                GitHubWebhookDependabotAlertFixedAlertDependencyRelationship.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookDependabotAlertFixedAlertDependencyRelationship decoded =
                GitHubWebhookDependabotAlertFixedAlertDependencyRelationship.fromWire(
                        "a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookDependabotAlertFixedAlertDependencyRelationship.UNRECOGNIZED);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookDependabotAlertFixedAlertDependencyRelationship.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
