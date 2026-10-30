package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRegistryPackageUpdatedEventTest {

    @Test
    void constructor_shouldThrow_whenRegistryPackageNull() {
        final GitHubWebhookRegistryPackageUpdatedEventBuilder builder =
                GitHubWebhookRegistryPackageUpdatedEventBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedEvent())
                        .registryPackage(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("registryPackage");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookRegistryPackageUpdatedEventBuilder builder =
                GitHubWebhookRegistryPackageUpdatedEventBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
