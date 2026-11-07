package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails fixture =
                SecretScanningAlertLocationCatalogFixtures.webhookSecretScanningAlertLocationCreatedLocationDetails();

        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails copy =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
