package io.github.piotr_janczukowicz.github.webhook.team;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookTeamEditedChangesRepositoryPermissionsFromTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookTeamEditedChangesRepositoryPermissionsFrom fixture =
                TeamCatalogFixtures.webhookTeamEditedChangesRepositoryPermissionsFrom();

        final GitHubWebhookTeamEditedChangesRepositoryPermissionsFrom copy =
                GitHubWebhookTeamEditedChangesRepositoryPermissionsFromBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
