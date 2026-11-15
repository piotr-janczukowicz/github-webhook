package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesStatusChangedChangesStatusTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookIssuesStatusChangedChangesStatus fixture =
                IssuesCatalogFixtures.webhookIssuesStatusChangedChangesStatus();

        final GitHubWebhookIssuesStatusChangedChangesStatus copy =
                GitHubWebhookIssuesStatusChangedChangesStatusBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
