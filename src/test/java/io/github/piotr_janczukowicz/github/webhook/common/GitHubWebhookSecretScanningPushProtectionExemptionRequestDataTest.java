package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningPushProtectionExemptionRequestDataTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookSecretScanningPushProtectionExemptionRequestData fixture =
                CommonCatalogFixtures.webhookSecretScanningPushProtectionExemptionRequestData();

        final GitHubWebhookSecretScanningPushProtectionExemptionRequestData copy =
                GitHubWebhookSecretScanningPushProtectionExemptionRequestDataBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
