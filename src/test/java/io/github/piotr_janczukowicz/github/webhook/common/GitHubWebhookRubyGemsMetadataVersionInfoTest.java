package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRubyGemsMetadataVersionInfoTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRubyGemsMetadataVersionInfo fixture =
                CommonCatalogFixtures.webhookRubyGemsMetadataVersionInfo();

        final GitHubWebhookRubyGemsMetadataVersionInfo copy =
                GitHubWebhookRubyGemsMetadataVersionInfoBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
