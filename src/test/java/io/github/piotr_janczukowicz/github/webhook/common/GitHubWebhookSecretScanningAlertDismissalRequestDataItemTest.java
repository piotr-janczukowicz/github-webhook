package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningAlertDismissalRequestDataItemTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookSecretScanningAlertDismissalRequestDataItem fixture =
                CommonCatalogFixtures.webhookSecretScanningAlertDismissalRequestDataItem();

        final GitHubWebhookSecretScanningAlertDismissalRequestDataItem copy =
                GitHubWebhookSecretScanningAlertDismissalRequestDataItemBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
