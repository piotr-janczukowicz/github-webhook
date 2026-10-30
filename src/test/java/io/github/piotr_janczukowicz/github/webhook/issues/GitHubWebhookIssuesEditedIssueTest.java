package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesEditedIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssuesEditedIssueBuilder builder = GitHubWebhookIssuesEditedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedIssue())
                .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssuesEditedIssueBuilder builder = GitHubWebhookIssuesEditedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedIssue())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssuesEditedIssueBuilder builder = GitHubWebhookIssuesEditedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedIssue())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesEditedIssueBuilder builder = GitHubWebhookIssuesEditedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedIssue())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssuesEditedIssueBuilder builder = GitHubWebhookIssuesEditedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedIssue())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesEditedIssueBuilder builder = GitHubWebhookIssuesEditedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedIssue())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesEditedIssueBuilder builder = GitHubWebhookIssuesEditedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedIssue())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesEditedIssueBuilder builder = GitHubWebhookIssuesEditedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedIssue())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssuesEditedIssueBuilder builder = GitHubWebhookIssuesEditedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedIssue())
                .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssuesEditedIssueBuilder builder = GitHubWebhookIssuesEditedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedIssue())
                .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssuesEditedIssueBuilder builder = GitHubWebhookIssuesEditedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedIssue())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesEditedIssueBuilder builder = GitHubWebhookIssuesEditedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedIssue())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesEditedIssueBuilder builder = GitHubWebhookIssuesEditedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedIssue())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
