package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckRunCheckSuiteTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookCheckRunCheckSuite fixture = CheckRunCatalogFixtures.webhookCheckRunCheckSuite();

        final GitHubWebhookCheckRunCheckSuite copy =
                GitHubWebhookCheckRunCheckSuiteBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
