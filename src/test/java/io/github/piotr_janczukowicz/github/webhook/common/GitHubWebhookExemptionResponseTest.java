package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookExemptionResponseTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookExemptionResponse fixture = CommonCatalogFixtures.webhookExemptionResponse();

        final GitHubWebhookExemptionResponse copy =
                GitHubWebhookExemptionResponseBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
