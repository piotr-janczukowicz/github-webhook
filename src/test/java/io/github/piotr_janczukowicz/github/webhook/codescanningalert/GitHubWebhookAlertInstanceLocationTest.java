package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookAlertInstanceLocationTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookAlertInstanceLocation fixture =
                CodeScanningAlertCatalogFixtures.webhookAlertInstanceLocation();

        final GitHubWebhookAlertInstanceLocation copy =
                GitHubWebhookAlertInstanceLocationBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
