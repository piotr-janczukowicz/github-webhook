package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPullRequestEditedChanges fixture =
                PullRequestCatalogFixtures.webhookPullRequestEditedChanges();

        final GitHubWebhookPullRequestEditedChanges copy =
                GitHubWebhookPullRequestEditedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
