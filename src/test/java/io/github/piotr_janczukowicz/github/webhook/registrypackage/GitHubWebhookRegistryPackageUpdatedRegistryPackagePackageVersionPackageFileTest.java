package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFileTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFile fixture =
                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFile();

        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFile copy =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFileBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
