package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesDeletedIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssuesDeletedIssueBuilder builder = GitHubWebhookIssuesDeletedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDeletedIssue())
                .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssuesDeletedIssueBuilder builder = GitHubWebhookIssuesDeletedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDeletedIssue())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssuesDeletedIssueBuilder builder = GitHubWebhookIssuesDeletedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDeletedIssue())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesDeletedIssueBuilder builder = GitHubWebhookIssuesDeletedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDeletedIssue())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssuesDeletedIssueBuilder builder = GitHubWebhookIssuesDeletedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDeletedIssue())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesDeletedIssueBuilder builder = GitHubWebhookIssuesDeletedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDeletedIssue())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesDeletedIssueBuilder builder = GitHubWebhookIssuesDeletedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDeletedIssue())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesDeletedIssueBuilder builder = GitHubWebhookIssuesDeletedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDeletedIssue())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssuesDeletedIssueBuilder builder = GitHubWebhookIssuesDeletedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDeletedIssue())
                .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssuesDeletedIssueBuilder builder = GitHubWebhookIssuesDeletedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDeletedIssue())
                .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssuesDeletedIssueBuilder builder = GitHubWebhookIssuesDeletedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDeletedIssue())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesDeletedIssueBuilder builder = GitHubWebhookIssuesDeletedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDeletedIssue())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesDeletedIssueBuilder builder = GitHubWebhookIssuesDeletedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDeletedIssue())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
