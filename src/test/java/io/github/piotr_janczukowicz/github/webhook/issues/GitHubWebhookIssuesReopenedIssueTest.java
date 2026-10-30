package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesReopenedIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssuesReopenedIssueBuilder builder = GitHubWebhookIssuesReopenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedIssue())
                .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssuesReopenedIssueBuilder builder = GitHubWebhookIssuesReopenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedIssue())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssuesReopenedIssueBuilder builder = GitHubWebhookIssuesReopenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedIssue())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesReopenedIssueBuilder builder = GitHubWebhookIssuesReopenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedIssue())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssuesReopenedIssueBuilder builder = GitHubWebhookIssuesReopenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedIssue())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesReopenedIssueBuilder builder = GitHubWebhookIssuesReopenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedIssue())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesReopenedIssueBuilder builder = GitHubWebhookIssuesReopenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedIssue())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesReopenedIssueBuilder builder = GitHubWebhookIssuesReopenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedIssue())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssuesReopenedIssueBuilder builder = GitHubWebhookIssuesReopenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedIssue())
                .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssuesReopenedIssueBuilder builder = GitHubWebhookIssuesReopenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedIssue())
                .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookIssuesReopenedIssueBuilder builder = GitHubWebhookIssuesReopenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedIssue())
                .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssuesReopenedIssueBuilder builder = GitHubWebhookIssuesReopenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedIssue())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesReopenedIssueBuilder builder = GitHubWebhookIssuesReopenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedIssue())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesReopenedIssueBuilder builder = GitHubWebhookIssuesReopenedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedIssue())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
