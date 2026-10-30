package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSimpleCommitTest {

    @Test
    void constructor_shouldThrow_whenAuthorNull() {
        final GitHubWebhookSimpleCommitBuilder builder = GitHubWebhookSimpleCommitBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleCommit())
                .author(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("author");
    }

    @Test
    void constructor_shouldThrow_whenCommitterNull() {
        final GitHubWebhookSimpleCommitBuilder builder = GitHubWebhookSimpleCommitBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleCommit())
                .committer(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("committer");
    }

    @Test
    void constructor_shouldThrow_whenIdNull() {
        final GitHubWebhookSimpleCommitBuilder builder = GitHubWebhookSimpleCommitBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleCommit())
                .id(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("id");
    }

    @Test
    void constructor_shouldThrow_whenMessageNull() {
        final GitHubWebhookSimpleCommitBuilder builder = GitHubWebhookSimpleCommitBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleCommit())
                .message(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("message");
    }

    @Test
    void constructor_shouldThrow_whenTimestampNull() {
        final GitHubWebhookSimpleCommitBuilder builder = GitHubWebhookSimpleCommitBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleCommit())
                .timestamp(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("timestamp");
    }

    @Test
    void constructor_shouldThrow_whenTreeIdNull() {
        final GitHubWebhookSimpleCommitBuilder builder = GitHubWebhookSimpleCommitBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleCommit())
                .treeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treeId");
    }
}
