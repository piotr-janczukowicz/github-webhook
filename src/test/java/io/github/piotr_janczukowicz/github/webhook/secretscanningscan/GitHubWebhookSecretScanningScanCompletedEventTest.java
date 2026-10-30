package io.github.piotr_janczukowicz.github.webhook.secretscanningscan;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningScanCompletedEventTest {

    @Test
    void constructor_shouldThrow_whenCompletedAtNull() {
        final GitHubWebhookSecretScanningScanCompletedEventBuilder builder =
                GitHubWebhookSecretScanningScanCompletedEventBuilder.builder(
                                SecretScanningScanCatalogFixtures.webhookSecretScanningScanCompletedEvent())
                        .completedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("completedAt");
    }

    @Test
    void constructor_shouldThrow_whenSourceNull() {
        final GitHubWebhookSecretScanningScanCompletedEventBuilder builder =
                GitHubWebhookSecretScanningScanCompletedEventBuilder.builder(
                                SecretScanningScanCatalogFixtures.webhookSecretScanningScanCompletedEvent())
                        .source(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("source");
    }

    @Test
    void constructor_shouldThrow_whenStartedAtNull() {
        final GitHubWebhookSecretScanningScanCompletedEventBuilder builder =
                GitHubWebhookSecretScanningScanCompletedEventBuilder.builder(
                                SecretScanningScanCatalogFixtures.webhookSecretScanningScanCompletedEvent())
                        .startedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("startedAt");
    }

    @Test
    void constructor_shouldThrow_whenTypeNull() {
        final GitHubWebhookSecretScanningScanCompletedEventBuilder builder =
                GitHubWebhookSecretScanningScanCompletedEventBuilder.builder(
                                SecretScanningScanCatalogFixtures.webhookSecretScanningScanCompletedEvent())
                        .type(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }
}
