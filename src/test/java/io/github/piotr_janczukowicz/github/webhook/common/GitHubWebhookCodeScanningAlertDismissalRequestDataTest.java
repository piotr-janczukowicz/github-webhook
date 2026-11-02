package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertDismissalRequestDataTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookCodeScanningAlertDismissalRequestData fixture =
                CommonCatalogFixtures.webhookCodeScanningAlertDismissalRequestData();

        final GitHubWebhookCodeScanningAlertDismissalRequestData copy =
                GitHubWebhookCodeScanningAlertDismissalRequestDataBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
