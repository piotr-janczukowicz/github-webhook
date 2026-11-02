package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackageUpdatedPackagePackageVersionDockerMetadataTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionDockerMetadata fixture =
                CommonCatalogFixtures.webhookPackageUpdatedPackagePackageVersionDockerMetadata();

        final GitHubWebhookPackageUpdatedPackagePackageVersionDockerMetadata copy =
                GitHubWebhookPackageUpdatedPackagePackageVersionDockerMetadataBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
