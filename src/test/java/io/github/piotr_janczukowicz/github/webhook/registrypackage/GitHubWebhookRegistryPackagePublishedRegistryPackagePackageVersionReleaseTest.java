package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionReleaseTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease fixture =
                RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease();

        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease copy =
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionReleaseBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
