package io.github.piotr_janczukowicz.github.webhook.team;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookTeamAddedToRepositoryEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookTeamAddedToRepositoryEventBuilder builder =
                GitHubWebhookTeamAddedToRepositoryEventBuilder.builder(
                                TeamCatalogFixtures.webhookTeamAddedToRepositoryEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenTeamNull() {
        final GitHubWebhookTeamAddedToRepositoryEventBuilder builder =
                GitHubWebhookTeamAddedToRepositoryEventBuilder.builder(
                                TeamCatalogFixtures.webhookTeamAddedToRepositoryEvent())
                        .team(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("team");
    }
}
