package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRegistryPackagePublishedEventTest {

    @Test
    void constructor_shouldThrow_whenRegistryPackageNull() {
        final GitHubWebhookRegistryPackagePublishedEventBuilder builder =
                GitHubWebhookRegistryPackagePublishedEventBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedEvent())
                        .registryPackage(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("registryPackage");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookRegistryPackagePublishedEventBuilder builder =
                GitHubWebhookRegistryPackagePublishedEventBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
