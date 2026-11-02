package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackagePublishedPackagePackageVersionNpmMetadataTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPackagePublishedPackagePackageVersionNpmMetadata fixture =
                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersionNpmMetadata();

        final GitHubWebhookPackagePublishedPackagePackageVersionNpmMetadata copy =
                GitHubWebhookPackagePublishedPackagePackageVersionNpmMetadataBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
