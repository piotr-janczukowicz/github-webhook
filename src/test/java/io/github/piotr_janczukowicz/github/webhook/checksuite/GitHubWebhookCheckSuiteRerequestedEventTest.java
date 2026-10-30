package io.github.piotr_janczukowicz.github.webhook.checksuite;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckSuiteRerequestedEventTest {

    @Test
    void constructor_shouldThrow_whenCheckSuiteNull() {
        final GitHubWebhookCheckSuiteRerequestedEventBuilder builder =
                GitHubWebhookCheckSuiteRerequestedEventBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedEvent())
                        .checkSuite(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkSuite");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCheckSuiteRerequestedEventBuilder builder =
                GitHubWebhookCheckSuiteRerequestedEventBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCheckSuiteRerequestedEventBuilder builder =
                GitHubWebhookCheckSuiteRerequestedEventBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
