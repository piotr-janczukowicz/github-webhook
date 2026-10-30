package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookMergeGroupDestroyedReasonTest {

    @ParameterizedTest
    @CsvSource({"'merged',MERGED", "'invalidated',INVALIDATED", "'dequeued',DEQUEUED"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookMergeGroupDestroyedReason value) {
        final GitHubWebhookMergeGroupDestroyedReason decoded = GitHubWebhookMergeGroupDestroyedReason.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookMergeGroupDestroyedReason decoded =
                GitHubWebhookMergeGroupDestroyedReason.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookMergeGroupDestroyedReason.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookMergeGroupDestroyedReason.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
