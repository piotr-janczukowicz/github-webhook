package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackageUpdatedPackageTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPackageUpdatedPackageBuilder builder = GitHubWebhookPackageUpdatedPackageBuilder.builder(
                        PackageCatalogFixtures.webhookPackageUpdatedPackage())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEcosystemNull() {
        final GitHubWebhookPackageUpdatedPackageBuilder builder = GitHubWebhookPackageUpdatedPackageBuilder.builder(
                        PackageCatalogFixtures.webhookPackageUpdatedPackage())
                .ecosystem(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ecosystem");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPackageUpdatedPackageBuilder builder = GitHubWebhookPackageUpdatedPackageBuilder.builder(
                        PackageCatalogFixtures.webhookPackageUpdatedPackage())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPackageUpdatedPackageBuilder builder = GitHubWebhookPackageUpdatedPackageBuilder.builder(
                        PackageCatalogFixtures.webhookPackageUpdatedPackage())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNamespaceNull() {
        final GitHubWebhookPackageUpdatedPackageBuilder builder = GitHubWebhookPackageUpdatedPackageBuilder.builder(
                        PackageCatalogFixtures.webhookPackageUpdatedPackage())
                .namespace(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("namespace");
    }

    @Test
    void constructor_shouldThrow_whenPackageTypeNull() {
        final GitHubWebhookPackageUpdatedPackageBuilder builder = GitHubWebhookPackageUpdatedPackageBuilder.builder(
                        PackageCatalogFixtures.webhookPackageUpdatedPackage())
                .packageType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("packageType");
    }

    @Test
    void constructor_shouldThrow_whenPackageVersionNull() {
        final GitHubWebhookPackageUpdatedPackageBuilder builder = GitHubWebhookPackageUpdatedPackageBuilder.builder(
                        PackageCatalogFixtures.webhookPackageUpdatedPackage())
                .packageVersion(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("packageVersion");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPackageUpdatedPackageBuilder builder = GitHubWebhookPackageUpdatedPackageBuilder.builder(
                        PackageCatalogFixtures.webhookPackageUpdatedPackage())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
