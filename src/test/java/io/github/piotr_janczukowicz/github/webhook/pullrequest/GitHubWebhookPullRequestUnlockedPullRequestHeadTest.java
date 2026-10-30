package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestUnlockedPullRequestHeadTest {

    @Test
    void constructor_shouldThrow_whenLabelNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestHeadBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestHeadBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequestHead())
                        .label(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("label");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestHeadBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestHeadBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequestHead())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestHeadBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestHeadBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequestHead())
                        .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
