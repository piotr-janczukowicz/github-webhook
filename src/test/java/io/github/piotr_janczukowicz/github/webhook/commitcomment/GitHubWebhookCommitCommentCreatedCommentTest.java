package io.github.piotr_janczukowicz.github.webhook.commitcomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCommitCommentCreatedCommentTest {

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookCommitCommentCreatedCommentBuilder builder =
                GitHubWebhookCommitCommentCreatedCommentBuilder.builder(
                                CommitCommentCatalogFixtures.webhookCommitCommentCreatedComment())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBodyNull() {
        final GitHubWebhookCommitCommentCreatedCommentBuilder builder =
                GitHubWebhookCommitCommentCreatedCommentBuilder.builder(
                                CommitCommentCatalogFixtures.webhookCommitCommentCreatedComment())
                        .body(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("body");
    }

    @Test
    void constructor_shouldThrow_whenCommitIdNull() {
        final GitHubWebhookCommitCommentCreatedCommentBuilder builder =
                GitHubWebhookCommitCommentCreatedCommentBuilder.builder(
                                CommitCommentCatalogFixtures.webhookCommitCommentCreatedComment())
                        .commitId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitId");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookCommitCommentCreatedCommentBuilder builder =
                GitHubWebhookCommitCommentCreatedCommentBuilder.builder(
                                CommitCommentCatalogFixtures.webhookCommitCommentCreatedComment())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookCommitCommentCreatedCommentBuilder builder =
                GitHubWebhookCommitCommentCreatedCommentBuilder.builder(
                                CommitCommentCatalogFixtures.webhookCommitCommentCreatedComment())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookCommitCommentCreatedCommentBuilder builder =
                GitHubWebhookCommitCommentCreatedCommentBuilder.builder(
                                CommitCommentCatalogFixtures.webhookCommitCommentCreatedComment())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookCommitCommentCreatedCommentBuilder builder =
                GitHubWebhookCommitCommentCreatedCommentBuilder.builder(
                                CommitCommentCatalogFixtures.webhookCommitCommentCreatedComment())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCommitCommentCreatedCommentBuilder builder =
                GitHubWebhookCommitCommentCreatedCommentBuilder.builder(
                                CommitCommentCatalogFixtures.webhookCommitCommentCreatedComment())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
