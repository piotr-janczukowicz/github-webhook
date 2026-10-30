package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileTest {

    @Test
    void constructor_shouldThrow_whenContentTypeNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionPackageFile())
                        .contentType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentType");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionPackageFile())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDownloadUrlNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionPackageFile())
                        .downloadUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionPackageFile())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenSha256Null() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionPackageFile())
                        .sha256(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha256");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionPackageFile())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionPackageFile())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
