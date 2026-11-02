package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesTransferredChangesNewIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssuesTransferredChangesNewIssueBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewIssueBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewIssue())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssuesTransferredChangesNewIssueBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewIssueBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewIssue())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewIssueBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewIssueBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewIssue())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesTransferredChangesNewIssueBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewIssueBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewIssue())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewIssueBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewIssueBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewIssue())
                        .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewIssueBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewIssueBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewIssue())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewIssueBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewIssueBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewIssue())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesTransferredChangesNewIssueBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewIssueBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewIssue())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssuesTransferredChangesNewIssueBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewIssueBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewIssue())
                        .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewIssueBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewIssueBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewIssue())
                        .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssuesTransferredChangesNewIssueBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewIssueBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewIssue())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesTransferredChangesNewIssueBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewIssueBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewIssue())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewIssueBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewIssueBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewIssue())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
