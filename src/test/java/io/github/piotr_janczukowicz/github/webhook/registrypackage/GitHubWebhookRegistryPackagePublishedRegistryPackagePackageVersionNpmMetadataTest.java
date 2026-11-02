package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadataTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata fixture =
                RegistryPackageCatalogFixtures
                        .webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata();

        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata copy =
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadataBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
