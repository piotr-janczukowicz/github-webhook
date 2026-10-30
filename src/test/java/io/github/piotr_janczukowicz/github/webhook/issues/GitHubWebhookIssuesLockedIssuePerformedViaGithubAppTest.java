package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesLockedIssuePerformedViaGithubAppTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesLockedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssuesLockedIssuePerformedViaGithubAppBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesLockedIssuePerformedViaGithubApp())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookIssuesLockedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssuesLockedIssuePerformedViaGithubAppBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesLockedIssuePerformedViaGithubApp())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesLockedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssuesLockedIssuePerformedViaGithubAppBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesLockedIssuePerformedViaGithubApp())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
