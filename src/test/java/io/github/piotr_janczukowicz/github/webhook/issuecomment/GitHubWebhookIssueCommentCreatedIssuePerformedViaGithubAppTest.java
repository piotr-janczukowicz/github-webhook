package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssuePerformedViaGithubApp())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssuePerformedViaGithubApp())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssuePerformedViaGithubApp())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
