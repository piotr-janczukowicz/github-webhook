package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueDependenciesSummaryTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookIssueDependenciesSummary fixture = CommonCatalogFixtures.webhookIssueDependenciesSummary();

        final GitHubWebhookIssueDependenciesSummary copy =
                GitHubWebhookIssueDependenciesSummaryBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
