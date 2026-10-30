package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRegistryPackageUpdatedRegistryPackageTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackage())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEcosystemNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackage())
                        .ecosystem(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ecosystem");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackage())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackage())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNamespaceNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackage())
                        .namespace(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("namespace");
    }

    @Test
    void constructor_shouldThrow_whenOwnerNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackage())
                        .owner(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("owner");
    }

    @Test
    void constructor_shouldThrow_whenPackageTypeNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackage())
                        .packageType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("packageType");
    }

    @Test
    void constructor_shouldThrow_whenPackageVersionNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackage())
                        .packageVersion(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("packageVersion");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackage())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
