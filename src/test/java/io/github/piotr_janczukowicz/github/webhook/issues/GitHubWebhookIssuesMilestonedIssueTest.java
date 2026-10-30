package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesMilestonedIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssuesMilestonedIssueBuilder builder = GitHubWebhookIssuesMilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedIssue())
                .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssuesMilestonedIssueBuilder builder = GitHubWebhookIssuesMilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedIssue())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssuesMilestonedIssueBuilder builder = GitHubWebhookIssuesMilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedIssue())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesMilestonedIssueBuilder builder = GitHubWebhookIssuesMilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedIssue())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssuesMilestonedIssueBuilder builder = GitHubWebhookIssuesMilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedIssue())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesMilestonedIssueBuilder builder = GitHubWebhookIssuesMilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedIssue())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesMilestonedIssueBuilder builder = GitHubWebhookIssuesMilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedIssue())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesMilestonedIssueBuilder builder = GitHubWebhookIssuesMilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedIssue())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssuesMilestonedIssueBuilder builder = GitHubWebhookIssuesMilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedIssue())
                .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssuesMilestonedIssueBuilder builder = GitHubWebhookIssuesMilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedIssue())
                .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssuesMilestonedIssueBuilder builder = GitHubWebhookIssuesMilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedIssue())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesMilestonedIssueBuilder builder = GitHubWebhookIssuesMilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedIssue())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesMilestonedIssueBuilder builder = GitHubWebhookIssuesMilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedIssue())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
