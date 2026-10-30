package io.github.piotr_janczukowicz.github.webhook.checksuite;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckSuiteRequestedEventTest {

    @Test
    void constructor_shouldThrow_whenCheckSuiteNull() {
        final GitHubWebhookCheckSuiteRequestedEventBuilder builder =
                GitHubWebhookCheckSuiteRequestedEventBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedEvent())
                        .checkSuite(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkSuite");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCheckSuiteRequestedEventBuilder builder =
                GitHubWebhookCheckSuiteRequestedEventBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCheckSuiteRequestedEventBuilder builder =
                GitHubWebhookCheckSuiteRequestedEventBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
