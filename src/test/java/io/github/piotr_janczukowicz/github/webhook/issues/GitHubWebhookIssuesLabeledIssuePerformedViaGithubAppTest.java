package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesLabeledIssuePerformedViaGithubAppTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesLabeledIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssuesLabeledIssuePerformedViaGithubAppBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesLabeledIssuePerformedViaGithubApp())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookIssuesLabeledIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssuesLabeledIssuePerformedViaGithubAppBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesLabeledIssuePerformedViaGithubApp())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesLabeledIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssuesLabeledIssuePerformedViaGithubAppBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesLabeledIssuePerformedViaGithubApp())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
