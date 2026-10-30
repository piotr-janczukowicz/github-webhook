package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentEditedIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssueCommentEditedIssueBuilder builder = GitHubWebhookIssueCommentEditedIssueBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
