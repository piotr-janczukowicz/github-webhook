package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentCreatedCommentTest {

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssueCommentCreatedCommentBuilder builder =
                GitHubWebhookIssueCommentCreatedCommentBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedComment())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBodyNull() {
        final GitHubWebhookIssueCommentCreatedCommentBuilder builder =
                GitHubWebhookIssueCommentCreatedCommentBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedComment())
                        .body(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("body");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssueCommentCreatedCommentBuilder builder =
                GitHubWebhookIssueCommentCreatedCommentBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedComment())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssueCommentCreatedCommentBuilder builder =
                GitHubWebhookIssueCommentCreatedCommentBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedComment())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookIssueCommentCreatedCommentBuilder builder =
                GitHubWebhookIssueCommentCreatedCommentBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedComment())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssueCommentCreatedCommentBuilder builder =
                GitHubWebhookIssueCommentCreatedCommentBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedComment())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssueCommentCreatedCommentBuilder builder =
                GitHubWebhookIssueCommentCreatedCommentBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedComment())
                        .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssueCommentCreatedCommentBuilder builder =
                GitHubWebhookIssueCommentCreatedCommentBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedComment())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssueCommentCreatedCommentBuilder builder =
                GitHubWebhookIssueCommentCreatedCommentBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedComment())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
