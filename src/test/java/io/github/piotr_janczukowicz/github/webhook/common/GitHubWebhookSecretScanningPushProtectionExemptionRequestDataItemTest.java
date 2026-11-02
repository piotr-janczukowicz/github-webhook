package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningPushProtectionExemptionRequestDataItemTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookSecretScanningPushProtectionExemptionRequestDataItem fixture =
                CommonCatalogFixtures.webhookSecretScanningPushProtectionExemptionRequestDataItem();

        final GitHubWebhookSecretScanningPushProtectionExemptionRequestDataItem copy =
                GitHubWebhookSecretScanningPushProtectionExemptionRequestDataItemBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
