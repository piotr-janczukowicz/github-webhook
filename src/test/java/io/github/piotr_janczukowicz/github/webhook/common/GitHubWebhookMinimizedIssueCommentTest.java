package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMinimizedIssueCommentTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookMinimizedIssueComment fixture = CommonCatalogFixtures.webhookMinimizedIssueComment();

        final GitHubWebhookMinimizedIssueComment copy =
                GitHubWebhookMinimizedIssueCommentBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
