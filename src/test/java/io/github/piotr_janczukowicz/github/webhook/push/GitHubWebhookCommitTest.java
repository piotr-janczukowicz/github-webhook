package io.github.piotr_janczukowicz.github.webhook.push;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCommitTest {

    @Test
    void constructor_shouldThrow_whenAuthorNull() {
        final GitHubWebhookCommitBuilder builder = GitHubWebhookCommitBuilder.builder(
                        PushCatalogFixtures.webhookCommit())
                .author(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("author");
    }

    @Test
    void constructor_shouldThrow_whenCommitterNull() {
        final GitHubWebhookCommitBuilder builder = GitHubWebhookCommitBuilder.builder(
                        PushCatalogFixtures.webhookCommit())
                .committer(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("committer");
    }

    @Test
    void constructor_shouldThrow_whenIdNull() {
        final GitHubWebhookCommitBuilder builder = GitHubWebhookCommitBuilder.builder(
                        PushCatalogFixtures.webhookCommit())
                .id(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("id");
    }

    @Test
    void constructor_shouldThrow_whenMessageNull() {
        final GitHubWebhookCommitBuilder builder = GitHubWebhookCommitBuilder.builder(
                        PushCatalogFixtures.webhookCommit())
                .message(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("message");
    }

    @Test
    void constructor_shouldThrow_whenTimestampNull() {
        final GitHubWebhookCommitBuilder builder = GitHubWebhookCommitBuilder.builder(
                        PushCatalogFixtures.webhookCommit())
                .timestamp(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("timestamp");
    }

    @Test
    void constructor_shouldThrow_whenTreeIdNull() {
        final GitHubWebhookCommitBuilder builder = GitHubWebhookCommitBuilder.builder(
                        PushCatalogFixtures.webhookCommit())
                .treeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treeId");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCommitBuilder builder = GitHubWebhookCommitBuilder.builder(
                        PushCatalogFixtures.webhookCommit())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
