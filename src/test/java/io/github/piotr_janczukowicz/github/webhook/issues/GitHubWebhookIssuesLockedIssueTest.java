package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesLockedIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssuesLockedIssueBuilder builder = GitHubWebhookIssuesLockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLockedIssue())
                .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssuesLockedIssueBuilder builder = GitHubWebhookIssuesLockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLockedIssue())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssuesLockedIssueBuilder builder = GitHubWebhookIssuesLockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLockedIssue())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesLockedIssueBuilder builder = GitHubWebhookIssuesLockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLockedIssue())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssuesLockedIssueBuilder builder = GitHubWebhookIssuesLockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLockedIssue())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesLockedIssueBuilder builder = GitHubWebhookIssuesLockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLockedIssue())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesLockedIssueBuilder builder = GitHubWebhookIssuesLockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLockedIssue())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesLockedIssueBuilder builder = GitHubWebhookIssuesLockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLockedIssue())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssuesLockedIssueBuilder builder = GitHubWebhookIssuesLockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLockedIssue())
                .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssuesLockedIssueBuilder builder = GitHubWebhookIssuesLockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLockedIssue())
                .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssuesLockedIssueBuilder builder = GitHubWebhookIssuesLockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLockedIssue())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesLockedIssueBuilder builder = GitHubWebhookIssuesLockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLockedIssue())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesLockedIssueBuilder builder = GitHubWebhookIssuesLockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLockedIssue())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
