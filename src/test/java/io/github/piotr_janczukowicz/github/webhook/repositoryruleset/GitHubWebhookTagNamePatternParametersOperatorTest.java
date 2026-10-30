package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookTagNamePatternParametersOperatorTest {

    @ParameterizedTest
    @CsvSource({"'starts_with',STARTS_WITH", "'ends_with',ENDS_WITH", "'contains',CONTAINS", "'regex',REGEX"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookTagNamePatternParametersOperator value) {
        final GitHubWebhookTagNamePatternParametersOperator decoded =
                GitHubWebhookTagNamePatternParametersOperator.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookTagNamePatternParametersOperator decoded =
                GitHubWebhookTagNamePatternParametersOperator.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookTagNamePatternParametersOperator.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookTagNamePatternParametersOperator.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
