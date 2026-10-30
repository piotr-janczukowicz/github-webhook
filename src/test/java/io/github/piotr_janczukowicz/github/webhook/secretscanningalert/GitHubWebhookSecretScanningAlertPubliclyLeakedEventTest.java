package io.github.piotr_janczukowicz.github.webhook.secretscanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningAlertPubliclyLeakedEventTest {

    @Test
    void constructor_shouldThrow_whenAlertNull() {
        final GitHubWebhookSecretScanningAlertPubliclyLeakedEventBuilder builder =
                GitHubWebhookSecretScanningAlertPubliclyLeakedEventBuilder.builder(
                                SecretScanningAlertCatalogFixtures.webhookSecretScanningAlertPubliclyLeakedEvent())
                        .alert(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("alert");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookSecretScanningAlertPubliclyLeakedEventBuilder builder =
                GitHubWebhookSecretScanningAlertPubliclyLeakedEventBuilder.builder(
                                SecretScanningAlertCatalogFixtures.webhookSecretScanningAlertPubliclyLeakedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }
}
