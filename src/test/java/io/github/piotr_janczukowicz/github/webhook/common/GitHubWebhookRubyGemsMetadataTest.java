package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRubyGemsMetadataTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRubyGemsMetadata fixture = CommonCatalogFixtures.webhookRubyGemsMetadata();

        final GitHubWebhookRubyGemsMetadata copy =
                GitHubWebhookRubyGemsMetadataBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
