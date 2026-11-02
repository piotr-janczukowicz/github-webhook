package io.github.piotr_janczukowicz.github.webhook.team;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookTeamEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookTeamEditedChanges fixture = TeamCatalogFixtures.webhookTeamEditedChanges();

        final GitHubWebhookTeamEditedChanges copy =
                GitHubWebhookTeamEditedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
