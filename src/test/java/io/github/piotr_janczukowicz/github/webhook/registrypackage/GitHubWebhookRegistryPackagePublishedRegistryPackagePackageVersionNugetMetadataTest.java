package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadata fixture =
                RegistryPackageCatalogFixtures
                        .webhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadata();

        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadata copy =
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
