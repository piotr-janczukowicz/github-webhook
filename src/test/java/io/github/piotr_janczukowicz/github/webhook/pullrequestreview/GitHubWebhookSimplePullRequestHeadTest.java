package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSimplePullRequestHeadTest {

    @Test
    void constructor_shouldThrow_whenLabelNull() {
        final GitHubWebhookSimplePullRequestHeadBuilder builder = GitHubWebhookSimplePullRequestHeadBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequestHead())
                .label(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("label");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookSimplePullRequestHeadBuilder builder = GitHubWebhookSimplePullRequestHeadBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequestHead())
                .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookSimplePullRequestHeadBuilder builder = GitHubWebhookSimplePullRequestHeadBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequestHead())
                .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
