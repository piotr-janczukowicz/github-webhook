package io.github.piotr_janczukowicz.github.webhook.projectcard;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectCardDeletedEventTest {

    @Test
    void constructor_shouldThrow_whenProjectCardNull() {
        final GitHubWebhookProjectCardDeletedEventBuilder builder = GitHubWebhookProjectCardDeletedEventBuilder.builder(
                        ProjectCardCatalogFixtures.webhookProjectCardDeletedEvent())
                .projectCard(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectCard");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookProjectCardDeletedEventBuilder builder = GitHubWebhookProjectCardDeletedEventBuilder.builder(
                        ProjectCardCatalogFixtures.webhookProjectCardDeletedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
