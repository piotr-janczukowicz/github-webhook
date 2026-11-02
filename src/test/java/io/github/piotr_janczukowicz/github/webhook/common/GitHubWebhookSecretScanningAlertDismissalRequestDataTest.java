package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningAlertDismissalRequestDataTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookSecretScanningAlertDismissalRequestData fixture =
                CommonCatalogFixtures.webhookSecretScanningAlertDismissalRequestData();

        final GitHubWebhookSecretScanningAlertDismissalRequestData copy =
                GitHubWebhookSecretScanningAlertDismissalRequestDataBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
