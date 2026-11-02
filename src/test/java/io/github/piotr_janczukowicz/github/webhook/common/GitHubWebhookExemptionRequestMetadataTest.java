package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookExemptionRequestMetadataTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookExemptionRequestMetadata fixture = CommonCatalogFixtures.webhookExemptionRequestMetadata();

        final GitHubWebhookExemptionRequestMetadata copy =
                GitHubWebhookExemptionRequestMetadataBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
