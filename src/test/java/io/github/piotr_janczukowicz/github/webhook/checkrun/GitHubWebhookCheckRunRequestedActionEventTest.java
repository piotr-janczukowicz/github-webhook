package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckRunRequestedActionEventTest {

    @Test
    void constructor_shouldThrow_whenCheckRunNull() {
        final GitHubWebhookCheckRunRequestedActionEventBuilder builder =
                GitHubWebhookCheckRunRequestedActionEventBuilder.builder(
                                CheckRunCatalogFixtures.webhookCheckRunRequestedActionEvent())
                        .checkRun(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkRun");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCheckRunRequestedActionEventBuilder builder =
                GitHubWebhookCheckRunRequestedActionEventBuilder.builder(
                                CheckRunCatalogFixtures.webhookCheckRunRequestedActionEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCheckRunRequestedActionEventBuilder builder =
                GitHubWebhookCheckRunRequestedActionEventBuilder.builder(
                                CheckRunCatalogFixtures.webhookCheckRunRequestedActionEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
