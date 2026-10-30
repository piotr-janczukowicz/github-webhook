package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesUnlockedIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssuesUnlockedIssueBuilder builder = GitHubWebhookIssuesUnlockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlockedIssue())
                .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssuesUnlockedIssueBuilder builder = GitHubWebhookIssuesUnlockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlockedIssue())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssuesUnlockedIssueBuilder builder = GitHubWebhookIssuesUnlockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlockedIssue())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesUnlockedIssueBuilder builder = GitHubWebhookIssuesUnlockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlockedIssue())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssuesUnlockedIssueBuilder builder = GitHubWebhookIssuesUnlockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlockedIssue())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesUnlockedIssueBuilder builder = GitHubWebhookIssuesUnlockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlockedIssue())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesUnlockedIssueBuilder builder = GitHubWebhookIssuesUnlockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlockedIssue())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesUnlockedIssueBuilder builder = GitHubWebhookIssuesUnlockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlockedIssue())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssuesUnlockedIssueBuilder builder = GitHubWebhookIssuesUnlockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlockedIssue())
                .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssuesUnlockedIssueBuilder builder = GitHubWebhookIssuesUnlockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlockedIssue())
                .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssuesUnlockedIssueBuilder builder = GitHubWebhookIssuesUnlockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlockedIssue())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesUnlockedIssueBuilder builder = GitHubWebhookIssuesUnlockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlockedIssue())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesUnlockedIssueBuilder builder = GitHubWebhookIssuesUnlockedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlockedIssue())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
