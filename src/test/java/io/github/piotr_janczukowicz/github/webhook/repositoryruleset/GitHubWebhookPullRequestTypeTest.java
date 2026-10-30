package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookPullRequestTypeTest {

    @ParameterizedTest
    @CsvSource({"'pull_request',PULL_REQUEST"})
    void fromWire_shouldReturnConstant_whenKnownValue(final String wire, final GitHubWebhookPullRequestType value) {
        final GitHubWebhookPullRequestType decoded = GitHubWebhookPullRequestType.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookPullRequestType decoded =
                GitHubWebhookPullRequestType.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookPullRequestType.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookPullRequestType.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
