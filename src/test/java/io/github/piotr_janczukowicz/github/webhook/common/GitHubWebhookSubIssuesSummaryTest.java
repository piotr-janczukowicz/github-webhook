package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSubIssuesSummaryTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookSubIssuesSummary fixture = CommonCatalogFixtures.webhookSubIssuesSummary();

        final GitHubWebhookSubIssuesSummary copy =
                GitHubWebhookSubIssuesSummaryBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
