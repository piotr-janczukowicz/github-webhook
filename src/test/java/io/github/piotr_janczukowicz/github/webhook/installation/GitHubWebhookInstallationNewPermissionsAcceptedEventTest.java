package io.github.piotr_janczukowicz.github.webhook.installation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookInstallationNewPermissionsAcceptedEventTest {

    @Test
    void constructor_shouldThrow_whenInstallationNull() {
        final GitHubWebhookInstallationNewPermissionsAcceptedEventBuilder builder =
                GitHubWebhookInstallationNewPermissionsAcceptedEventBuilder.builder(
                                InstallationCatalogFixtures.webhookInstallationNewPermissionsAcceptedEvent())
                        .installation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installation");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookInstallationNewPermissionsAcceptedEventBuilder builder =
                GitHubWebhookInstallationNewPermissionsAcceptedEventBuilder.builder(
                                InstallationCatalogFixtures.webhookInstallationNewPermissionsAcceptedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
