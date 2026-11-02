package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesOpenedChangesOldIssueTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookIssuesOpenedChangesOldIssue fixture =
                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldIssue();

        final GitHubWebhookIssuesOpenedChangesOldIssue copy =
                GitHubWebhookIssuesOpenedChangesOldIssueBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
