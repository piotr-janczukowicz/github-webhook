package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionCategoryTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookDiscussionCategoryBuilder builder = GitHubWebhookDiscussionCategoryBuilder.builder(
                        CommonCatalogFixtures.webhookDiscussionCategory())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDescriptionNull() {
        final GitHubWebhookDiscussionCategoryBuilder builder = GitHubWebhookDiscussionCategoryBuilder.builder(
                        CommonCatalogFixtures.webhookDiscussionCategory())
                .description(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("description");
    }

    @Test
    void constructor_shouldThrow_whenEmojiNull() {
        final GitHubWebhookDiscussionCategoryBuilder builder = GitHubWebhookDiscussionCategoryBuilder.builder(
                        CommonCatalogFixtures.webhookDiscussionCategory())
                .emoji(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("emoji");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookDiscussionCategoryBuilder builder = GitHubWebhookDiscussionCategoryBuilder.builder(
                        CommonCatalogFixtures.webhookDiscussionCategory())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenSlugNull() {
        final GitHubWebhookDiscussionCategoryBuilder builder = GitHubWebhookDiscussionCategoryBuilder.builder(
                        CommonCatalogFixtures.webhookDiscussionCategory())
                .slug(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("slug");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookDiscussionCategoryBuilder builder = GitHubWebhookDiscussionCategoryBuilder.builder(
                        CommonCatalogFixtures.webhookDiscussionCategory())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
