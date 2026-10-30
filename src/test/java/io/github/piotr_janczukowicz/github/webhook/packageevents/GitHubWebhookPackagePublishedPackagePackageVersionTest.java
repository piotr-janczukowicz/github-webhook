package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackagePublishedPackagePackageVersionTest {

    @Test
    void constructor_shouldThrow_whenDescriptionNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersion())
                        .description(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("description");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersion())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenInstallationCommandNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersion())
                        .installationCommand(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installationCommand");
    }

    @Test
    void constructor_shouldThrow_whenMetadataNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersion())
                        .metadata(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("metadata");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersion())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenPackageFilesNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersion())
                        .packageFiles(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("packageFiles");
    }

    @Test
    void constructor_shouldThrow_whenSummaryNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersion())
                        .summary(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("summary");
    }

    @Test
    void constructor_shouldThrow_whenVersionNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersion())
                        .version(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("version");
    }
}
