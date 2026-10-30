package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesMilestonedIssuePerformedViaGithubAppTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesMilestonedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssuesMilestonedIssuePerformedViaGithubAppBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesMilestonedIssuePerformedViaGithubApp())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookIssuesMilestonedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssuesMilestonedIssuePerformedViaGithubAppBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesMilestonedIssuePerformedViaGithubApp())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesMilestonedIssuePerformedViaGithubAppBuilder builder =
                GitHubWebhookIssuesMilestonedIssuePerformedViaGithubAppBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesMilestonedIssuePerformedViaGithubApp())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
