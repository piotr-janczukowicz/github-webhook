package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertAssigneesChangedEventTest {

    @Test
    void constructor_shouldThrow_whenAlertNull() {
        final GitHubWebhookDependabotAlertAssigneesChangedEventBuilder builder =
                GitHubWebhookDependabotAlertAssigneesChangedEventBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertAssigneesChangedEvent())
                        .alert(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("alert");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDependabotAlertAssigneesChangedEventBuilder builder =
                GitHubWebhookDependabotAlertAssigneesChangedEventBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertAssigneesChangedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDependabotAlertAssigneesChangedEventBuilder builder =
                GitHubWebhookDependabotAlertAssigneesChangedEventBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertAssigneesChangedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
