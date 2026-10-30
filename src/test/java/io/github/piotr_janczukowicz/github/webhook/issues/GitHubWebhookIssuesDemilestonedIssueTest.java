package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesDemilestonedIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssuesDemilestonedIssueBuilder builder = GitHubWebhookIssuesDemilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDemilestonedIssue())
                .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssuesDemilestonedIssueBuilder builder = GitHubWebhookIssuesDemilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDemilestonedIssue())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssuesDemilestonedIssueBuilder builder = GitHubWebhookIssuesDemilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDemilestonedIssue())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesDemilestonedIssueBuilder builder = GitHubWebhookIssuesDemilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDemilestonedIssue())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssuesDemilestonedIssueBuilder builder = GitHubWebhookIssuesDemilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDemilestonedIssue())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesDemilestonedIssueBuilder builder = GitHubWebhookIssuesDemilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDemilestonedIssue())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesDemilestonedIssueBuilder builder = GitHubWebhookIssuesDemilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDemilestonedIssue())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesDemilestonedIssueBuilder builder = GitHubWebhookIssuesDemilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDemilestonedIssue())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssuesDemilestonedIssueBuilder builder = GitHubWebhookIssuesDemilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDemilestonedIssue())
                .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssuesDemilestonedIssueBuilder builder = GitHubWebhookIssuesDemilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDemilestonedIssue())
                .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssuesDemilestonedIssueBuilder builder = GitHubWebhookIssuesDemilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDemilestonedIssue())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesDemilestonedIssueBuilder builder = GitHubWebhookIssuesDemilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDemilestonedIssue())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesDemilestonedIssueBuilder builder = GitHubWebhookIssuesDemilestonedIssueBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesDemilestonedIssue())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
