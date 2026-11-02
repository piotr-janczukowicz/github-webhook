package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRegistryPackagePublishedRegistryPackageRegistryTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackageRegistry fixture =
                RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedRegistryPackageRegistry();

        final GitHubWebhookRegistryPackagePublishedRegistryPackageRegistry copy =
                GitHubWebhookRegistryPackagePublishedRegistryPackageRegistryBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
