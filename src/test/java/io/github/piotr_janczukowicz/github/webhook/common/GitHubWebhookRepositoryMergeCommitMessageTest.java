package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookRepositoryMergeCommitMessageTest {

    @ParameterizedTest
    @CsvSource({"'PR_BODY',PR_BODY", "'PR_TITLE',PR_TITLE", "'BLANK',BLANK"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookRepositoryMergeCommitMessage value) {
        final GitHubWebhookRepositoryMergeCommitMessage decoded =
                GitHubWebhookRepositoryMergeCommitMessage.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookRepositoryMergeCommitMessage decoded =
                GitHubWebhookRepositoryMergeCommitMessage.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookRepositoryMergeCommitMessage.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookRepositoryMergeCommitMessage.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
