package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppPermissionsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppPermissions fixture =
                CommonCatalogFixtures.webhookIssueCommentEditedIssuePerformedViaGithubAppPermissions();

        final GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppPermissions copy =
                GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppPermissionsBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
