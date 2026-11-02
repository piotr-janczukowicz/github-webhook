package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackageVersionContainerMetadataTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPackageVersionContainerMetadata fixture =
                CommonCatalogFixtures.webhookPackageVersionContainerMetadata();

        final GitHubWebhookPackageVersionContainerMetadata copy =
                GitHubWebhookPackageVersionContainerMetadataBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
