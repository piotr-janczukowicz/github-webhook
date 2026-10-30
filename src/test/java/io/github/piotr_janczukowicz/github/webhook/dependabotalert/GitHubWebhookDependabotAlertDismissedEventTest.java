package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertDismissedEventTest {

    @Test
    void constructor_shouldThrow_whenAlertNull() {
        final GitHubWebhookDependabotAlertDismissedEventBuilder builder =
                GitHubWebhookDependabotAlertDismissedEventBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertDismissedEvent())
                        .alert(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("alert");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDependabotAlertDismissedEventBuilder builder =
                GitHubWebhookDependabotAlertDismissedEventBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertDismissedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDependabotAlertDismissedEventBuilder builder =
                GitHubWebhookDependabotAlertDismissedEventBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertDismissedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
