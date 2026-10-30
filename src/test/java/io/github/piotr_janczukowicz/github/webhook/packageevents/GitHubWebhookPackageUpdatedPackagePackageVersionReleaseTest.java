package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackageUpdatedPackagePackageVersionReleaseTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionRelease())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionRelease())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionRelease())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenPublishedAtNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionRelease())
                        .publishedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("publishedAt");
    }

    @Test
    void constructor_shouldThrow_whenTagNameNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionRelease())
                        .tagName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagName");
    }

    @Test
    void constructor_shouldThrow_whenTargetCommitishNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionRelease())
                        .targetCommitish(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("targetCommitish");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionRelease())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
