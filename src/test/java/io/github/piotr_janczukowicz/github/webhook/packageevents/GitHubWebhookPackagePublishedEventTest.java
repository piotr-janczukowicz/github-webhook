package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPackagePublishedEventTest {

    @Test
    void constructor_shouldThrow_whenPackageValueNull() {
        final GitHubWebhookPackagePublishedEventBuilder builder = GitHubWebhookPackagePublishedEventBuilder.builder(
                        PackageCatalogFixtures.webhookPackagePublishedEvent())
                .packageValue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("packageValue");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookPackagePublishedEventBuilder builder = GitHubWebhookPackagePublishedEventBuilder.builder(
                        PackageCatalogFixtures.webhookPackagePublishedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
