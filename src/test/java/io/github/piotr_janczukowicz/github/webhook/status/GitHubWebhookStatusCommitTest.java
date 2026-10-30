package io.github.piotr_janczukowicz.github.webhook.status;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookStatusCommitTest {

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookStatusCommitBuilder builder = GitHubWebhookStatusCommitBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommit())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitNull() {
        final GitHubWebhookStatusCommitBuilder builder = GitHubWebhookStatusCommitBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommit())
                .commit(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commit");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookStatusCommitBuilder builder = GitHubWebhookStatusCommitBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommit())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookStatusCommitBuilder builder = GitHubWebhookStatusCommitBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommit())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenParentsNull() {
        final GitHubWebhookStatusCommitBuilder builder = GitHubWebhookStatusCommitBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommit())
                .parents(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("parents");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookStatusCommitBuilder builder = GitHubWebhookStatusCommitBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommit())
                .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookStatusCommitBuilder builder = GitHubWebhookStatusCommitBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommit())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
