package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesClosedIssuePerformedViaGithubAppTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesClosedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssuesClosedIssuePerformedViaGithubAppBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesClosedIssuePerformedViaGithubApp())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookIssuesClosedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssuesClosedIssuePerformedViaGithubAppBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesClosedIssuePerformedViaGithubApp())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesClosedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssuesClosedIssuePerformedViaGithubAppBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesClosedIssuePerformedViaGithubApp())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
