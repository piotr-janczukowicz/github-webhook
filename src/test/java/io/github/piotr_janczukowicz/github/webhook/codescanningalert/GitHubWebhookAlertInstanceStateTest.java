package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookAlertInstanceStateTest {

    @ParameterizedTest
    @CsvSource({"'open',OPEN", "'dismissed',DISMISSED", "'fixed',FIXED"})
    void fromWire_shouldReturnConstant_whenKnownValue(final String wire, final GitHubWebhookAlertInstanceState value) {
        final GitHubWebhookAlertInstanceState decoded = GitHubWebhookAlertInstanceState.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookAlertInstanceState decoded =
                GitHubWebhookAlertInstanceState.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookAlertInstanceState.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookAlertInstanceState.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
