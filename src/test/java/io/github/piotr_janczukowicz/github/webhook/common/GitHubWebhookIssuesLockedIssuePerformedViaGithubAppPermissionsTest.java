package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookIssuesLockedIssuePerformedViaGithubAppPermissions fixture =
                CommonCatalogFixtures.webhookIssuesLockedIssuePerformedViaGithubAppPermissions();

        final GitHubWebhookIssuesLockedIssuePerformedViaGithubAppPermissions copy =
                GitHubWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
