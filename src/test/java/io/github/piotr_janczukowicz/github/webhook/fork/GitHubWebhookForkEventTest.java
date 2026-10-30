package io.github.piotr_janczukowicz.github.webhook.fork;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookForkEventTest {

    @Test
    void constructor_shouldThrow_whenForkeeNull() {
        final GitHubWebhookForkEventBuilder builder = GitHubWebhookForkEventBuilder.builder(
                        ForkCatalogFixtures.webhookForkEvent())
                .forkee(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forkee");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookForkEventBuilder builder = GitHubWebhookForkEventBuilder.builder(
                        ForkCatalogFixtures.webhookForkEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookForkEventBuilder builder = GitHubWebhookForkEventBuilder.builder(
                        ForkCatalogFixtures.webhookForkEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
