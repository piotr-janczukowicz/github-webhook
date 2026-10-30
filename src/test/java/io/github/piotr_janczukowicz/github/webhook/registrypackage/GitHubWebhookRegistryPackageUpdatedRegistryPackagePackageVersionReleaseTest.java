package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseTest {

    @Test
    void constructor_shouldThrow_whenAuthorNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease())
                        .author(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("author");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenPublishedAtNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease())
                        .publishedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("publishedAt");
    }

    @Test
    void constructor_shouldThrow_whenTagNameNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease())
                        .tagName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagName");
    }

    @Test
    void constructor_shouldThrow_whenTargetCommitishNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease())
                        .targetCommitish(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("targetCommitish");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder.builder(
                                RegistryPackageCatalogFixtures
                                        .webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
