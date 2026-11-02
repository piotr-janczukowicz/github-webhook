package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryEditedChangesTopicsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryEditedChangesTopics fixture =
                CommonCatalogFixtures.webhookRepositoryEditedChangesTopics();

        final GitHubWebhookRepositoryEditedChangesTopics copy =
                GitHubWebhookRepositoryEditedChangesTopicsBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
