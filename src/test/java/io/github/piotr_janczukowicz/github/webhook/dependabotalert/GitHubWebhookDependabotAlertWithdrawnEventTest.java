package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertWithdrawnEventTest {

    @Test
    void constructor_shouldThrow_whenAlertNull() {
        final GitHubWebhookDependabotAlertWithdrawnEventBuilder builder =
                GitHubWebhookDependabotAlertWithdrawnEventBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnEvent())
                        .alert(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("alert");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDependabotAlertWithdrawnEventBuilder builder =
                GitHubWebhookDependabotAlertWithdrawnEventBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDependabotAlertWithdrawnEventBuilder builder =
                GitHubWebhookDependabotAlertWithdrawnEventBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
