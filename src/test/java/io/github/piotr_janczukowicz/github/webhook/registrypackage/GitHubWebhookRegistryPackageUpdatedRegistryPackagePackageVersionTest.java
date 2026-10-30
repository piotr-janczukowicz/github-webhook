package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionTest {

    @Test
    void constructor_shouldThrow_whenAuthorNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .author(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("author");
    }

    @Test
    void constructor_shouldThrow_whenBodyNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .body(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("body");
    }

    @Test
    void constructor_shouldThrow_whenBodyHtmlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .bodyHtml(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("bodyHtml");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDescriptionNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .description(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("description");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenInstallationCommandNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .installationCommand(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installationCommand");
    }

    @Test
    void constructor_shouldThrow_whenMetadataNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .metadata(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("metadata");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenPackageFilesNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .packageFiles(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("packageFiles");
    }

    @Test
    void constructor_shouldThrow_whenPackageUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .packageUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("packageUrl");
    }

    @Test
    void constructor_shouldThrow_whenSummaryNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .summary(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("summary");
    }

    @Test
    void constructor_shouldThrow_whenTargetCommitishNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .targetCommitish(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("targetCommitish");
    }

    @Test
    void constructor_shouldThrow_whenTargetOidNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .targetOid(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("targetOid");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenVersionNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                        .version(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("version");
    }
}
