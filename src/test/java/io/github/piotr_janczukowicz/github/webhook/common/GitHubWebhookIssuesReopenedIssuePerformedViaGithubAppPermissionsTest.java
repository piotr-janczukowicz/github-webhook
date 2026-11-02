package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookIssuesReopenedIssuePerformedViaGithubAppPermissions fixture =
                CommonCatalogFixtures.webhookIssuesReopenedIssuePerformedViaGithubAppPermissions();

        final GitHubWebhookIssuesReopenedIssuePerformedViaGithubAppPermissions copy =
                GitHubWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
