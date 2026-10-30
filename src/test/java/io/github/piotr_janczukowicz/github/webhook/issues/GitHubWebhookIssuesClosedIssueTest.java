package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesClosedIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssuesClosedIssueBuilder builder = GitHubWebhookIssuesClosedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesClosedIssue())
                .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssuesClosedIssueBuilder builder = GitHubWebhookIssuesClosedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesClosedIssue())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssuesClosedIssueBuilder builder = GitHubWebhookIssuesClosedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesClosedIssue())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesClosedIssueBuilder builder = GitHubWebhookIssuesClosedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesClosedIssue())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssuesClosedIssueBuilder builder = GitHubWebhookIssuesClosedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesClosedIssue())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesClosedIssueBuilder builder = GitHubWebhookIssuesClosedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesClosedIssue())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesClosedIssueBuilder builder = GitHubWebhookIssuesClosedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesClosedIssue())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesClosedIssueBuilder builder = GitHubWebhookIssuesClosedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesClosedIssue())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssuesClosedIssueBuilder builder = GitHubWebhookIssuesClosedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesClosedIssue())
                .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssuesClosedIssueBuilder builder = GitHubWebhookIssuesClosedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesClosedIssue())
                .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookIssuesClosedIssueBuilder builder = GitHubWebhookIssuesClosedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesClosedIssue())
                .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssuesClosedIssueBuilder builder = GitHubWebhookIssuesClosedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesClosedIssue())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesClosedIssueBuilder builder = GitHubWebhookIssuesClosedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesClosedIssue())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesClosedIssueBuilder builder = GitHubWebhookIssuesClosedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesClosedIssue())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
