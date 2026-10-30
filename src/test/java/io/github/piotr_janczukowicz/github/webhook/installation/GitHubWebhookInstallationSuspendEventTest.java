package io.github.piotr_janczukowicz.github.webhook.installation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookInstallationSuspendEventTest {

    @Test
    void constructor_shouldThrow_whenInstallationNull() {
        final GitHubWebhookInstallationSuspendEventBuilder builder =
                GitHubWebhookInstallationSuspendEventBuilder.builder(
                                InstallationCatalogFixtures.webhookInstallationSuspendEvent())
                        .installation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installation");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookInstallationSuspendEventBuilder builder =
                GitHubWebhookInstallationSuspendEventBuilder.builder(
                                InstallationCatalogFixtures.webhookInstallationSuspendEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
