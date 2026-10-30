package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRegistryPackagePublishedRegistryPackageTest {

    @Test
    void constructor_shouldThrow_whenEcosystemNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedRegistryPackage())
                        .ecosystem(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ecosystem");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedRegistryPackage())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedRegistryPackage())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNamespaceNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedRegistryPackage())
                        .namespace(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("namespace");
    }

    @Test
    void constructor_shouldThrow_whenOwnerNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedRegistryPackage())
                        .owner(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("owner");
    }

    @Test
    void constructor_shouldThrow_whenPackageTypeNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedRegistryPackage())
                        .packageType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("packageType");
    }
}
