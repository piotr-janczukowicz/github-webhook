package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookNonFastForwardTypeTest {

    @ParameterizedTest
    @CsvSource({"'non_fast_forward',NON_FAST_FORWARD"})
    void fromWire_shouldReturnConstant_whenKnownValue(final String wire, final GitHubWebhookNonFastForwardType value) {
        final GitHubWebhookNonFastForwardType decoded = GitHubWebhookNonFastForwardType.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookNonFastForwardType decoded =
                GitHubWebhookNonFastForwardType.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookNonFastForwardType.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookNonFastForwardType.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
