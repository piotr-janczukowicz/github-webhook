package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookCodeQualityTypeTest {

    @ParameterizedTest
    @CsvSource({"'code_quality',CODE_QUALITY"})
    void fromWire_shouldReturnConstant_whenKnownValue(final String wire, final GitHubWebhookCodeQualityType value) {
        final GitHubWebhookCodeQualityType decoded = GitHubWebhookCodeQualityType.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookCodeQualityType decoded =
                GitHubWebhookCodeQualityType.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookCodeQualityType.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookCodeQualityType.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
