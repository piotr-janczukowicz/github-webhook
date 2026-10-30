package io.github.piotr_janczukowicz.github.webhook.discussioncomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionCommentEditedCommentTest {

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookDiscussionCommentEditedCommentBuilder builder =
                GitHubWebhookDiscussionCommentEditedCommentBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedComment())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBodyNull() {
        final GitHubWebhookDiscussionCommentEditedCommentBuilder builder =
                GitHubWebhookDiscussionCommentEditedCommentBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedComment())
                        .body(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("body");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookDiscussionCommentEditedCommentBuilder builder =
                GitHubWebhookDiscussionCommentEditedCommentBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedComment())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookDiscussionCommentEditedCommentBuilder builder =
                GitHubWebhookDiscussionCommentEditedCommentBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedComment())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookDiscussionCommentEditedCommentBuilder builder =
                GitHubWebhookDiscussionCommentEditedCommentBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedComment())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookDiscussionCommentEditedCommentBuilder builder =
                GitHubWebhookDiscussionCommentEditedCommentBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedComment())
                        .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookDiscussionCommentEditedCommentBuilder builder =
                GitHubWebhookDiscussionCommentEditedCommentBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedComment())
                        .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookDiscussionCommentEditedCommentBuilder builder =
                GitHubWebhookDiscussionCommentEditedCommentBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedComment())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
