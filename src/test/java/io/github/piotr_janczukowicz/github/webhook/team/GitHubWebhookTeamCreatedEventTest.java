package io.github.piotr_janczukowicz.github.webhook.team;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookTeamCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookTeamCreatedEventBuilder builder = GitHubWebhookTeamCreatedEventBuilder.builder(
                        TeamCatalogFixtures.webhookTeamCreatedEvent())
                .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookTeamCreatedEventBuilder builder = GitHubWebhookTeamCreatedEventBuilder.builder(
                        TeamCatalogFixtures.webhookTeamCreatedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenTeamNull() {
        final GitHubWebhookTeamCreatedEventBuilder builder = GitHubWebhookTeamCreatedEventBuilder.builder(
                        TeamCatalogFixtures.webhookTeamCreatedEvent())
                .team(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("team");
    }
}
