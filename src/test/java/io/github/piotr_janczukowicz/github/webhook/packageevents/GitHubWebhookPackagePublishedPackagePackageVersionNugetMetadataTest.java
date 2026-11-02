package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackagePublishedPackagePackageVersionNugetMetadataTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPackagePublishedPackagePackageVersionNugetMetadata fixture =
                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersionNugetMetadata();

        final GitHubWebhookPackagePublishedPackagePackageVersionNugetMetadata copy =
                GitHubWebhookPackagePublishedPackagePackageVersionNugetMetadataBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
