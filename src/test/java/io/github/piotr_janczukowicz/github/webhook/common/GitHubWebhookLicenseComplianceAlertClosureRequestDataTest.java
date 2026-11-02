package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookLicenseComplianceAlertClosureRequestDataTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookLicenseComplianceAlertClosureRequestData fixture =
                CommonCatalogFixtures.webhookLicenseComplianceAlertClosureRequestData();

        final GitHubWebhookLicenseComplianceAlertClosureRequestData copy =
                GitHubWebhookLicenseComplianceAlertClosureRequestDataBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
