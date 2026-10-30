package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookProjectsV2StatusUpdateStatusTest {

    @ParameterizedTest
    @CsvSource({
        "'INACTIVE',INACTIVE",
        "'ON_TRACK',ON_TRACK",
        "'AT_RISK',AT_RISK",
        "'OFF_TRACK',OFF_TRACK",
        "'COMPLETE',COMPLETE"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookProjectsV2StatusUpdateStatus value) {
        final GitHubWebhookProjectsV2StatusUpdateStatus decoded =
                GitHubWebhookProjectsV2StatusUpdateStatus.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookProjectsV2StatusUpdateStatus decoded =
                GitHubWebhookProjectsV2StatusUpdateStatus.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookProjectsV2StatusUpdateStatus.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookProjectsV2StatusUpdateStatus.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
