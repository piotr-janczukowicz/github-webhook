package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSimplePullRequestHeadTest {

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookSimplePullRequestHeadBuilder builder = GitHubWebhookSimplePullRequestHeadBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestHead())
                .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookSimplePullRequestHeadBuilder builder = GitHubWebhookSimplePullRequestHeadBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestHead())
                .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
