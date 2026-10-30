package io.github.piotr_janczukowicz.github.webhook.team;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookTeamRemovedFromRepositoryEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookTeamRemovedFromRepositoryEventBuilder builder =
                GitHubWebhookTeamRemovedFromRepositoryEventBuilder.builder(
                                TeamCatalogFixtures.webhookTeamRemovedFromRepositoryEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookTeamRemovedFromRepositoryEventBuilder builder =
                GitHubWebhookTeamRemovedFromRepositoryEventBuilder.builder(
                                TeamCatalogFixtures.webhookTeamRemovedFromRepositoryEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenTeamNull() {
        final GitHubWebhookTeamRemovedFromRepositoryEventBuilder builder =
                GitHubWebhookTeamRemovedFromRepositoryEventBuilder.builder(
                                TeamCatalogFixtures.webhookTeamRemovedFromRepositoryEvent())
                        .team(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("team");
    }
}
