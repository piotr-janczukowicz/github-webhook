package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSimplePullRequestBaseTest {

    @Test
    void constructor_shouldThrow_whenLabelNull() {
        final GitHubWebhookSimplePullRequestBaseBuilder builder = GitHubWebhookSimplePullRequestBaseBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequestBase())
                .label(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("label");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookSimplePullRequestBaseBuilder builder = GitHubWebhookSimplePullRequestBaseBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequestBase())
                .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepoNull() {
        final GitHubWebhookSimplePullRequestBaseBuilder builder = GitHubWebhookSimplePullRequestBaseBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequestBase())
                .repo(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repo");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookSimplePullRequestBaseBuilder builder = GitHubWebhookSimplePullRequestBaseBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequestBase())
                .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
