package io.github.piotr_janczukowicz.github.webhook.installation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookInstallationCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenInstallationNull() {
        final GitHubWebhookInstallationCreatedEventBuilder builder =
                GitHubWebhookInstallationCreatedEventBuilder.builder(
                                InstallationCatalogFixtures.webhookInstallationCreatedEvent())
                        .installation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installation");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookInstallationCreatedEventBuilder builder =
                GitHubWebhookInstallationCreatedEventBuilder.builder(
                                InstallationCatalogFixtures.webhookInstallationCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
