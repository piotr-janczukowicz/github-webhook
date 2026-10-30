package io.github.piotr_janczukowicz.github.webhook.team;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookTeamEditedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookTeamEditedEventBuilder builder = GitHubWebhookTeamEditedEventBuilder.builder(
                        TeamCatalogFixtures.webhookTeamEditedEvent())
                .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookTeamEditedEventBuilder builder = GitHubWebhookTeamEditedEventBuilder.builder(
                        TeamCatalogFixtures.webhookTeamEditedEvent())
                .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookTeamEditedEventBuilder builder = GitHubWebhookTeamEditedEventBuilder.builder(
                        TeamCatalogFixtures.webhookTeamEditedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenTeamNull() {
        final GitHubWebhookTeamEditedEventBuilder builder = GitHubWebhookTeamEditedEventBuilder.builder(
                        TeamCatalogFixtures.webhookTeamEditedEvent())
                .team(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("team");
    }
}
