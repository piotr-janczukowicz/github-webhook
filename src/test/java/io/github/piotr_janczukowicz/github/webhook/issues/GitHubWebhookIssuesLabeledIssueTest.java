package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesLabeledIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssuesLabeledIssueBuilder builder = GitHubWebhookIssuesLabeledIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledIssue())
                .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssuesLabeledIssueBuilder builder = GitHubWebhookIssuesLabeledIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledIssue())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssuesLabeledIssueBuilder builder = GitHubWebhookIssuesLabeledIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledIssue())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesLabeledIssueBuilder builder = GitHubWebhookIssuesLabeledIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledIssue())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssuesLabeledIssueBuilder builder = GitHubWebhookIssuesLabeledIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledIssue())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesLabeledIssueBuilder builder = GitHubWebhookIssuesLabeledIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledIssue())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesLabeledIssueBuilder builder = GitHubWebhookIssuesLabeledIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledIssue())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesLabeledIssueBuilder builder = GitHubWebhookIssuesLabeledIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledIssue())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssuesLabeledIssueBuilder builder = GitHubWebhookIssuesLabeledIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledIssue())
                .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssuesLabeledIssueBuilder builder = GitHubWebhookIssuesLabeledIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledIssue())
                .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssuesLabeledIssueBuilder builder = GitHubWebhookIssuesLabeledIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledIssue())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesLabeledIssueBuilder builder = GitHubWebhookIssuesLabeledIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledIssue())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesLabeledIssueBuilder builder = GitHubWebhookIssuesLabeledIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledIssue())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
