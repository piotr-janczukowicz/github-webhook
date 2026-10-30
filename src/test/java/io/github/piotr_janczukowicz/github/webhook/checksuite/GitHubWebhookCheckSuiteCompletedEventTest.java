package io.github.piotr_janczukowicz.github.webhook.checksuite;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckSuiteCompletedEventTest {

    @Test
    void constructor_shouldThrow_whenCheckSuiteNull() {
        final GitHubWebhookCheckSuiteCompletedEventBuilder builder =
                GitHubWebhookCheckSuiteCompletedEventBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteCompletedEvent())
                        .checkSuite(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkSuite");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCheckSuiteCompletedEventBuilder builder =
                GitHubWebhookCheckSuiteCompletedEventBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteCompletedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCheckSuiteCompletedEventBuilder builder =
                GitHubWebhookCheckSuiteCompletedEventBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteCompletedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
