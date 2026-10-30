package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackagePublishedPackagePackageVersionReleaseTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionReleaseBuilder.builder(
                                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersionRelease())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionReleaseBuilder.builder(
                                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersionRelease())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenPublishedAtNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionReleaseBuilder.builder(
                                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersionRelease())
                        .publishedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("publishedAt");
    }

    @Test
    void constructor_shouldThrow_whenTagNameNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionReleaseBuilder.builder(
                                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersionRelease())
                        .tagName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagName");
    }

    @Test
    void constructor_shouldThrow_whenTargetCommitishNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionReleaseBuilder.builder(
                                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersionRelease())
                        .targetCommitish(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("targetCommitish");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPackagePublishedPackagePackageVersionReleaseBuilder builder =
                GitHubWebhookPackagePublishedPackagePackageVersionReleaseBuilder.builder(
                                PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersionRelease())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
