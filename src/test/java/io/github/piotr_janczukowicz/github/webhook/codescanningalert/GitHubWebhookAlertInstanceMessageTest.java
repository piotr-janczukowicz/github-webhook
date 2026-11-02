package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookAlertInstanceMessageTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookAlertInstanceMessage fixture =
                CodeScanningAlertCatalogFixtures.webhookAlertInstanceMessage();

        final GitHubWebhookAlertInstanceMessage copy =
                GitHubWebhookAlertInstanceMessageBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
