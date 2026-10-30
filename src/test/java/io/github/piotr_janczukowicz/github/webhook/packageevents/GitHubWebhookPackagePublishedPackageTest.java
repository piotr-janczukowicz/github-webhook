package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackagePublishedPackageTest {

    @Test
    void constructor_shouldThrow_whenEcosystemNull() {
        final GitHubWebhookPackagePublishedPackageBuilder builder = GitHubWebhookPackagePublishedPackageBuilder.builder(
                        PackageCatalogFixtures.webhookPackagePublishedPackage())
                .ecosystem(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ecosystem");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPackagePublishedPackageBuilder builder = GitHubWebhookPackagePublishedPackageBuilder.builder(
                        PackageCatalogFixtures.webhookPackagePublishedPackage())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPackagePublishedPackageBuilder builder = GitHubWebhookPackagePublishedPackageBuilder.builder(
                        PackageCatalogFixtures.webhookPackagePublishedPackage())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNamespaceNull() {
        final GitHubWebhookPackagePublishedPackageBuilder builder = GitHubWebhookPackagePublishedPackageBuilder.builder(
                        PackageCatalogFixtures.webhookPackagePublishedPackage())
                .namespace(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("namespace");
    }

    @Test
    void constructor_shouldThrow_whenPackageTypeNull() {
        final GitHubWebhookPackagePublishedPackageBuilder builder = GitHubWebhookPackagePublishedPackageBuilder.builder(
                        PackageCatalogFixtures.webhookPackagePublishedPackage())
                .packageType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("packageType");
    }
}
