package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesOpenedIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssuesOpenedIssueBuilder builder = GitHubWebhookIssuesOpenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesOpenedIssue())
                .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssuesOpenedIssueBuilder builder = GitHubWebhookIssuesOpenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesOpenedIssue())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssuesOpenedIssueBuilder builder = GitHubWebhookIssuesOpenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesOpenedIssue())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesOpenedIssueBuilder builder = GitHubWebhookIssuesOpenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesOpenedIssue())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssuesOpenedIssueBuilder builder = GitHubWebhookIssuesOpenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesOpenedIssue())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesOpenedIssueBuilder builder = GitHubWebhookIssuesOpenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesOpenedIssue())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesOpenedIssueBuilder builder = GitHubWebhookIssuesOpenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesOpenedIssue())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesOpenedIssueBuilder builder = GitHubWebhookIssuesOpenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesOpenedIssue())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssuesOpenedIssueBuilder builder = GitHubWebhookIssuesOpenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesOpenedIssue())
                .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssuesOpenedIssueBuilder builder = GitHubWebhookIssuesOpenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesOpenedIssue())
                .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssuesOpenedIssueBuilder builder = GitHubWebhookIssuesOpenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesOpenedIssue())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesOpenedIssueBuilder builder = GitHubWebhookIssuesOpenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesOpenedIssue())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesOpenedIssueBuilder builder = GitHubWebhookIssuesOpenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesOpenedIssue())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
