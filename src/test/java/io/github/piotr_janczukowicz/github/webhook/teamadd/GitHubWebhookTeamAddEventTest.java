package io.github.piotr_janczukowicz.github.webhook.teamadd;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookTeamAddEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookTeamAddEventBuilder builder = GitHubWebhookTeamAddEventBuilder.builder(
                        TeamAddCatalogFixtures.webhookTeamAddEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookTeamAddEventBuilder builder = GitHubWebhookTeamAddEventBuilder.builder(
                        TeamAddCatalogFixtures.webhookTeamAddEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenTeamNull() {
        final GitHubWebhookTeamAddEventBuilder builder = GitHubWebhookTeamAddEventBuilder.builder(
                        TeamAddCatalogFixtures.webhookTeamAddEvent())
                .team(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("team");
    }
}
