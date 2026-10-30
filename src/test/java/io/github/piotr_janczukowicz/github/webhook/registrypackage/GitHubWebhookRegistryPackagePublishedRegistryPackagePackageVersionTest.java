package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionTest {

    @Test
    void constructor_shouldThrow_whenDescriptionNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackagePublishedRegistryPackagePackageVersion())
                        .description(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("description");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackagePublishedRegistryPackagePackageVersion())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenInstallationCommandNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackagePublishedRegistryPackagePackageVersion())
                        .installationCommand(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installationCommand");
    }

    @Test
    void constructor_shouldThrow_whenMetadataNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackagePublishedRegistryPackagePackageVersion())
                        .metadata(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("metadata");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackagePublishedRegistryPackagePackageVersion())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenPackageFilesNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackagePublishedRegistryPackagePackageVersion())
                        .packageFiles(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("packageFiles");
    }

    @Test
    void constructor_shouldThrow_whenPackageUrlNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackagePublishedRegistryPackagePackageVersion())
                        .packageUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("packageUrl");
    }

    @Test
    void constructor_shouldThrow_whenSummaryNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackagePublishedRegistryPackagePackageVersion())
                        .summary(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("summary");
    }

    @Test
    void constructor_shouldThrow_whenVersionNull() {
        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackagePublishedRegistryPackagePackageVersion())
                        .version(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("version");
    }
}
