package io.github.piotr_janczukowicz.github.webhook.gollum;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookGollumEventTest {

    @Test
    void constructor_shouldThrow_whenPagesNull() {
        final GitHubWebhookGollumEventBuilder builder = GitHubWebhookGollumEventBuilder.builder(
                        GollumCatalogFixtures.webhookGollumEvent())
                .pages(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pages");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookGollumEventBuilder builder = GitHubWebhookGollumEventBuilder.builder(
                        GollumCatalogFixtures.webhookGollumEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookGollumEventBuilder builder = GitHubWebhookGollumEventBuilder.builder(
                        GollumCatalogFixtures.webhookGollumEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
