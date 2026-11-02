package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookTeamPermissionsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookTeamPermissions fixture = RepositoryAdvisoryCatalogFixtures.webhookTeamPermissions();

        final GitHubWebhookTeamPermissions copy =
                GitHubWebhookTeamPermissionsBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
