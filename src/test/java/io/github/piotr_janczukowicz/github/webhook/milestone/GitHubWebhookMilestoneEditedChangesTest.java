package io.github.piotr_janczukowicz.github.webhook.milestone;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMilestoneEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookMilestoneEditedChanges fixture = MilestoneCatalogFixtures.webhookMilestoneEditedChanges();

        final GitHubWebhookMilestoneEditedChanges copy =
                GitHubWebhookMilestoneEditedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
