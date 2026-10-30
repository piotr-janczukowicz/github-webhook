package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckRunRerequestedEventTest {

    @Test
    void constructor_shouldThrow_whenCheckRunNull() {
        final GitHubWebhookCheckRunRerequestedEventBuilder builder =
                GitHubWebhookCheckRunRerequestedEventBuilder.builder(
                                CheckRunCatalogFixtures.webhookCheckRunRerequestedEvent())
                        .checkRun(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkRun");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCheckRunRerequestedEventBuilder builder =
                GitHubWebhookCheckRunRerequestedEventBuilder.builder(
                                CheckRunCatalogFixtures.webhookCheckRunRerequestedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCheckRunRerequestedEventBuilder builder =
                GitHubWebhookCheckRunRerequestedEventBuilder.builder(
                                CheckRunCatalogFixtures.webhookCheckRunRerequestedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
