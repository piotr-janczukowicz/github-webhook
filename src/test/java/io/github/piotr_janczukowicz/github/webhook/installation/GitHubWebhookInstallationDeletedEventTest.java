package io.github.piotr_janczukowicz.github.webhook.installation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookInstallationDeletedEventTest {

    @Test
    void constructor_shouldThrow_whenInstallationNull() {
        final GitHubWebhookInstallationDeletedEventBuilder builder =
                GitHubWebhookInstallationDeletedEventBuilder.builder(
                                InstallationCatalogFixtures.webhookInstallationDeletedEvent())
                        .installation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installation");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookInstallationDeletedEventBuilder builder =
                GitHubWebhookInstallationDeletedEventBuilder.builder(
                                InstallationCatalogFixtures.webhookInstallationDeletedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
