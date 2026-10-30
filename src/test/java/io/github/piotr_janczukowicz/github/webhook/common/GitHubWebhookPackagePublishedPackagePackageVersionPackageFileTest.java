package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackagePublishedPackagePackageVersionPackageFileTest {

    @Test
    void constructor_shouldThrow_whenContentTypeNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionPackageFileBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionPackageFileBuilder.builder(
                                CommonCatalogFixtures.webhookPackagePublishedPackagePackageVersionPackageFile())
                        .contentType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentType");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionPackageFileBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionPackageFileBuilder.builder(
                                CommonCatalogFixtures.webhookPackagePublishedPackagePackageVersionPackageFile())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDownloadUrlNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionPackageFileBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionPackageFileBuilder.builder(
                                CommonCatalogFixtures.webhookPackagePublishedPackagePackageVersionPackageFile())
                        .downloadUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionPackageFileBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionPackageFileBuilder.builder(
                                CommonCatalogFixtures.webhookPackagePublishedPackagePackageVersionPackageFile())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionPackageFileBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionPackageFileBuilder.builder(
                                CommonCatalogFixtures.webhookPackagePublishedPackagePackageVersionPackageFile())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
