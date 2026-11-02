package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningAlertCreatedAlertTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookSecretScanningAlertCreatedAlert fixture =
                CommonCatalogFixtures.webhookSecretScanningAlertCreatedAlert();

        final GitHubWebhookSecretScanningAlertCreatedAlert copy =
                GitHubWebhookSecretScanningAlertCreatedAlertBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
