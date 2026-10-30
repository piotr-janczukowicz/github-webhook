package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestLockedPullRequestHeadTest {

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookPullRequestLockedPullRequestHeadBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestHeadBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestHead())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookPullRequestLockedPullRequestHeadBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestHeadBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestHead())
                        .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
