package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackageUpdatedEventTest {

    @Test
    void constructor_shouldThrow_whenPackageValueNull() {
        final GitHubWebhookPackageUpdatedEventBuilder builder = GitHubWebhookPackageUpdatedEventBuilder.builder(
                        PackageCatalogFixtures.webhookPackageUpdatedEvent())
                .packageValue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("packageValue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookPackageUpdatedEventBuilder builder = GitHubWebhookPackageUpdatedEventBuilder.builder(
                        PackageCatalogFixtures.webhookPackageUpdatedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookPackageUpdatedEventBuilder builder = GitHubWebhookPackageUpdatedEventBuilder.builder(
                        PackageCatalogFixtures.webhookPackageUpdatedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
