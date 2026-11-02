package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookIssueCommentEditedChanges fixture = CommonCatalogFixtures.webhookIssueCommentEditedChanges();

        final GitHubWebhookIssueCommentEditedChanges copy =
                GitHubWebhookIssueCommentEditedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
