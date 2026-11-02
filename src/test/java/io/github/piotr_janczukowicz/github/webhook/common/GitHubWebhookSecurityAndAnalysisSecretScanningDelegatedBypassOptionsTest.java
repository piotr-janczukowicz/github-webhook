package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptions fixture =
                CommonCatalogFixtures.webhookSecurityAndAnalysisSecretScanningDelegatedBypassOptions();

        final GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptions copy =
                GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
