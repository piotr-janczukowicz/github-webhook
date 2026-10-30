package io.github.piotr_janczukowicz.github.webhook.secretscanningscan;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookSecretScanningScanCompletedTypeTest {

    @ParameterizedTest
    @CsvSource({
        "'backfill',BACKFILL",
        "'custom-pattern-backfill',CUSTOM_PATTERN_BACKFILL",
        "'pattern-version-backfill',PATTERN_VERSION_BACKFILL"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookSecretScanningScanCompletedType value) {
        final GitHubWebhookSecretScanningScanCompletedType decoded =
                GitHubWebhookSecretScanningScanCompletedType.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookSecretScanningScanCompletedType decoded =
                GitHubWebhookSecretScanningScanCompletedType.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookSecretScanningScanCompletedType.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookSecretScanningScanCompletedType.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
