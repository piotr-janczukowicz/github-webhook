package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentCreatedIssueTest {

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssueCommentCreatedIssueBuilder builder =
                GitHubWebhookIssueCommentCreatedIssueBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
