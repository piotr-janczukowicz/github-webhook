package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackageUpdatedPackagePackageVersionTest {

    @Test
    void constructor_shouldThrow_whenBodyNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion())
                        .body(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("body");
    }

    @Test
    void constructor_shouldThrow_whenBodyHtmlNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion())
                        .bodyHtml(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("bodyHtml");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDescriptionNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion())
                        .description(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("description");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenInstallationCommandNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion())
                        .installationCommand(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installationCommand");
    }

    @Test
    void constructor_shouldThrow_whenMetadataNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion())
                        .metadata(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("metadata");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenPackageFilesNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion())
                        .packageFiles(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("packageFiles");
    }

    @Test
    void constructor_shouldThrow_whenSummaryNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion())
                        .summary(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("summary");
    }

    @Test
    void constructor_shouldThrow_whenTargetCommitishNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion())
                        .targetCommitish(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("targetCommitish");
    }

    @Test
    void constructor_shouldThrow_whenTargetOidNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion())
                        .targetOid(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("targetOid");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenVersionNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion())
                        .version(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("version");
    }
}
