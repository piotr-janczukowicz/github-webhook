package io.github.piotr_janczukowicz.github.webhook.secretscanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningAlertResolvedEventTest {

    @Test
    void constructor_shouldThrow_whenAlertNull() {
        final GitHubWebhookSecretScanningAlertResolvedEventBuilder builder =
                GitHubWebhookSecretScanningAlertResolvedEventBuilder.builder(
                                SecretScanningAlertCatalogFixtures.webhookSecretScanningAlertResolvedEvent())
                        .alert(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("alert");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookSecretScanningAlertResolvedEventBuilder builder =
                GitHubWebhookSecretScanningAlertResolvedEventBuilder.builder(
                                SecretScanningAlertCatalogFixtures.webhookSecretScanningAlertResolvedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }
}
