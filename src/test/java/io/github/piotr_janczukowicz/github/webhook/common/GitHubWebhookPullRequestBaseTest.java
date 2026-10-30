package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestBaseTest {

    @Test
    void constructor_shouldThrow_whenLabelNull() {
        final GitHubWebhookPullRequestBaseBuilder builder = GitHubWebhookPullRequestBaseBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestBase())
                .label(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("label");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookPullRequestBaseBuilder builder = GitHubWebhookPullRequestBaseBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestBase())
                .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepoNull() {
        final GitHubWebhookPullRequestBaseBuilder builder = GitHubWebhookPullRequestBaseBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestBase())
                .repo(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repo");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookPullRequestBaseBuilder builder = GitHubWebhookPullRequestBaseBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestBase())
                .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }

    @Test
    void constructor_shouldThrow_whenUserNull() {
        final GitHubWebhookPullRequestBaseBuilder builder = GitHubWebhookPullRequestBaseBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestBase())
                .user(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("user");
    }
}
