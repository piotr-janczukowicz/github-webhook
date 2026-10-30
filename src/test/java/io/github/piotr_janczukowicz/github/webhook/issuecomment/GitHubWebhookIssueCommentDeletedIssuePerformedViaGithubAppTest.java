package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentDeletedIssuePerformedViaGithubAppTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssueCommentDeletedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssueCommentDeletedIssuePerformedViaGithubAppBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssuePerformedViaGithubApp())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookIssueCommentDeletedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssueCommentDeletedIssuePerformedViaGithubAppBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssuePerformedViaGithubApp())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssueCommentDeletedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssueCommentDeletedIssuePerformedViaGithubAppBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssuePerformedViaGithubApp())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
