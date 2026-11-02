package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackageVersionContainerMetadataTagTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPackageVersionContainerMetadataTag fixture =
                CommonCatalogFixtures.webhookPackageVersionContainerMetadataTag();

        final GitHubWebhookPackageVersionContainerMetadataTag copy =
                GitHubWebhookPackageVersionContainerMetadataTagBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
