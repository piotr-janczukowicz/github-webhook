package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesFieldAddedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookIssuesFieldAddedChanges fixture = IssuesCatalogFixtures.webhookIssuesFieldAddedChanges();

        final GitHubWebhookIssuesFieldAddedChanges copy =
                GitHubWebhookIssuesFieldAddedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
