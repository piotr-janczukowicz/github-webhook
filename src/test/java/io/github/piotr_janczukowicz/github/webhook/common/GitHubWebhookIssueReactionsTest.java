package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueReactionsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookIssueReactions fixture = CommonCatalogFixtures.webhookIssueReactions();

        final GitHubWebhookIssueReactions copy =
                GitHubWebhookIssueReactionsBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
