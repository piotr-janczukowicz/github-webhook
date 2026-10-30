package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookPersonalAccessTokenRequestRepositorySelectionTest {

    @ParameterizedTest
    @CsvSource({"'none',NONE", "'all',ALL", "'subset',SUBSET"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookPersonalAccessTokenRequestRepositorySelection value) {
        final GitHubWebhookPersonalAccessTokenRequestRepositorySelection decoded =
                GitHubWebhookPersonalAccessTokenRequestRepositorySelection.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookPersonalAccessTokenRequestRepositorySelection decoded =
                GitHubWebhookPersonalAccessTokenRequestRepositorySelection.fromWire(
                        "a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookPersonalAccessTokenRequestRepositorySelection.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookPersonalAccessTokenRequestRepositorySelection.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
