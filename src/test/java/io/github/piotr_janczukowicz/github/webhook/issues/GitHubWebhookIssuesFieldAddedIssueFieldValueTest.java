package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesFieldAddedIssueFieldValueTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookIssuesFieldAddedIssueFieldValue fixture =
                IssuesCatalogFixtures.webhookIssuesFieldAddedIssueFieldValue();

        final GitHubWebhookIssuesFieldAddedIssueFieldValue copy =
                GitHubWebhookIssuesFieldAddedIssueFieldValueBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
