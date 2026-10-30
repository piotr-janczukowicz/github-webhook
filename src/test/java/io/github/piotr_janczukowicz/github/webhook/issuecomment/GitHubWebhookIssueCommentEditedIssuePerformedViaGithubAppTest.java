package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentEditedIssuePerformedViaGithubApp())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentEditedIssuePerformedViaGithubApp())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentEditedIssuePerformedViaGithubApp())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
