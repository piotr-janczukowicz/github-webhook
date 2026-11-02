package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookExemptionRequestTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookExemptionRequest fixture = CommonCatalogFixtures.webhookExemptionRequest();

        final GitHubWebhookExemptionRequest copy =
                GitHubWebhookExemptionRequestBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
