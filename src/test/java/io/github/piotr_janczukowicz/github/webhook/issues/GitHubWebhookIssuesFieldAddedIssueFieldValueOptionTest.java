package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesFieldAddedIssueFieldValueOptionTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookIssuesFieldAddedIssueFieldValueOption fixture =
                IssuesCatalogFixtures.webhookIssuesFieldAddedIssueFieldValueOption();

        final GitHubWebhookIssuesFieldAddedIssueFieldValueOption copy =
                GitHubWebhookIssuesFieldAddedIssueFieldValueOptionBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
