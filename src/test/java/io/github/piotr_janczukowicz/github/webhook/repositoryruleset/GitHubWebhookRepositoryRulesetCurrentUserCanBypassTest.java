package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookRepositoryRulesetCurrentUserCanBypassTest {

    @ParameterizedTest
    @CsvSource({"'always',ALWAYS", "'pull_requests_only',PULL_REQUESTS_ONLY", "'never',NEVER", "'exempt',EXEMPT"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookRepositoryRulesetCurrentUserCanBypass value) {
        final GitHubWebhookRepositoryRulesetCurrentUserCanBypass decoded =
                GitHubWebhookRepositoryRulesetCurrentUserCanBypass.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookRepositoryRulesetCurrentUserCanBypass decoded =
                GitHubWebhookRepositoryRulesetCurrentUserCanBypass.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookRepositoryRulesetCurrentUserCanBypass.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookRepositoryRulesetCurrentUserCanBypass.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
