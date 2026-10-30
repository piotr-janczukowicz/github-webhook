package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookRepositoryRulesetEnforcementTest {

    @ParameterizedTest
    @CsvSource({"'disabled',DISABLED", "'active',ACTIVE", "'evaluate',EVALUATE"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookRepositoryRulesetEnforcement value) {
        final GitHubWebhookRepositoryRulesetEnforcement decoded =
                GitHubWebhookRepositoryRulesetEnforcement.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookRepositoryRulesetEnforcement decoded =
                GitHubWebhookRepositoryRulesetEnforcement.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookRepositoryRulesetEnforcement.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookRepositoryRulesetEnforcement.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
