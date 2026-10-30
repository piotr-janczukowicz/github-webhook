package io.github.piotr_janczukowicz.github.webhook.discussion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionCategoryChangedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookDiscussionCategoryChangedEventBuilder builder =
                GitHubWebhookDiscussionCategoryChangedEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionCategoryChangedEvent())
                        .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenDiscussionNull() {
        final GitHubWebhookDiscussionCategoryChangedEventBuilder builder =
                GitHubWebhookDiscussionCategoryChangedEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionCategoryChangedEvent())
                        .discussion(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("discussion");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDiscussionCategoryChangedEventBuilder builder =
                GitHubWebhookDiscussionCategoryChangedEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionCategoryChangedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDiscussionCategoryChangedEventBuilder builder =
                GitHubWebhookDiscussionCategoryChangedEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionCategoryChangedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
