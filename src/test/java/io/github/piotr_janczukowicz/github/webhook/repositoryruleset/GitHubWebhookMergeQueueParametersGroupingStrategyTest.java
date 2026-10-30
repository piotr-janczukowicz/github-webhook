package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookMergeQueueParametersGroupingStrategyTest {

    @ParameterizedTest
    @CsvSource({"'ALLGREEN',ALLGREEN", "'HEADGREEN',HEADGREEN"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookMergeQueueParametersGroupingStrategy value) {
        final GitHubWebhookMergeQueueParametersGroupingStrategy decoded =
                GitHubWebhookMergeQueueParametersGroupingStrategy.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookMergeQueueParametersGroupingStrategy decoded =
                GitHubWebhookMergeQueueParametersGroupingStrategy.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookMergeQueueParametersGroupingStrategy.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookMergeQueueParametersGroupingStrategy.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
