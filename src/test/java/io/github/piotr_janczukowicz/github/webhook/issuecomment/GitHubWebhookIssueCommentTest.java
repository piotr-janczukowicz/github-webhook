package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentTest {

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssueCommentBuilder builder = GitHubWebhookIssueCommentBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueComment())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBodyNull() {
        final GitHubWebhookIssueCommentBuilder builder = GitHubWebhookIssueCommentBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueComment())
                .body(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("body");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssueCommentBuilder builder = GitHubWebhookIssueCommentBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueComment())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssueCommentBuilder builder = GitHubWebhookIssueCommentBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueComment())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookIssueCommentBuilder builder = GitHubWebhookIssueCommentBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueComment())
                .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssueCommentBuilder builder = GitHubWebhookIssueCommentBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueComment())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssueCommentBuilder builder = GitHubWebhookIssueCommentBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueComment())
                .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssueCommentBuilder builder = GitHubWebhookIssueCommentBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueComment())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssueCommentBuilder builder = GitHubWebhookIssueCommentBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueComment())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
