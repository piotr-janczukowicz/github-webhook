package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackageUpdatedPackageRegistryTest {

    @Test
    void constructor_shouldThrow_whenAboutUrlNull() {
        final GitHubWebhookPackageUpdatedPackageRegistryBuilder builder =
                GitHubWebhookPackageUpdatedPackageRegistryBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackageRegistry())
                        .aboutUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("aboutUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPackageUpdatedPackageRegistryBuilder builder =
                GitHubWebhookPackageUpdatedPackageRegistryBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackageRegistry())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenTypeNull() {
        final GitHubWebhookPackageUpdatedPackageRegistryBuilder builder =
                GitHubWebhookPackageUpdatedPackageRegistryBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackageRegistry())
                        .type(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPackageUpdatedPackageRegistryBuilder builder =
                GitHubWebhookPackageUpdatedPackageRegistryBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackageRegistry())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenVendorNull() {
        final GitHubWebhookPackageUpdatedPackageRegistryBuilder builder =
                GitHubWebhookPackageUpdatedPackageRegistryBuilder.builder(
                                PackageCatalogFixtures.webhookPackageUpdatedPackageRegistry())
                        .vendor(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("vendor");
    }
}
