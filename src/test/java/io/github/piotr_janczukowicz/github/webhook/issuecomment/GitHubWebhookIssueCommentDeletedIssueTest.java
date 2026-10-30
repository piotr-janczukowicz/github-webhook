package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentDeletedIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssueCommentDeletedIssueBuilder builder =
                GitHubWebhookIssueCommentDeletedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
