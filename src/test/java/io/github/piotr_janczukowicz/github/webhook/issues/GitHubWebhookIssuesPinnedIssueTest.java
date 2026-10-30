package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesPinnedIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssuesPinnedIssueBuilder builder = GitHubWebhookIssuesPinnedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesPinnedIssue())
                .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssuesPinnedIssueBuilder builder = GitHubWebhookIssuesPinnedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesPinnedIssue())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssuesPinnedIssueBuilder builder = GitHubWebhookIssuesPinnedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesPinnedIssue())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesPinnedIssueBuilder builder = GitHubWebhookIssuesPinnedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesPinnedIssue())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssuesPinnedIssueBuilder builder = GitHubWebhookIssuesPinnedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesPinnedIssue())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesPinnedIssueBuilder builder = GitHubWebhookIssuesPinnedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesPinnedIssue())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesPinnedIssueBuilder builder = GitHubWebhookIssuesPinnedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesPinnedIssue())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesPinnedIssueBuilder builder = GitHubWebhookIssuesPinnedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesPinnedIssue())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssuesPinnedIssueBuilder builder = GitHubWebhookIssuesPinnedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesPinnedIssue())
                .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssuesPinnedIssueBuilder builder = GitHubWebhookIssuesPinnedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesPinnedIssue())
                .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssuesPinnedIssueBuilder builder = GitHubWebhookIssuesPinnedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesPinnedIssue())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesPinnedIssueBuilder builder = GitHubWebhookIssuesPinnedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesPinnedIssue())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesPinnedIssueBuilder builder = GitHubWebhookIssuesPinnedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesPinnedIssue())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
