package io.github.piotr_janczukowicz.github.webhook.meta;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMetaDeletedHookTest {

    @Test
    void constructor_shouldThrow_whenConfigNull() {
        final GitHubWebhookMetaDeletedHookBuilder builder = GitHubWebhookMetaDeletedHookBuilder.builder(
                        MetaCatalogFixtures.webhookMetaDeletedHook())
                .config(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("config");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookMetaDeletedHookBuilder builder = GitHubWebhookMetaDeletedHookBuilder.builder(
                        MetaCatalogFixtures.webhookMetaDeletedHook())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsNull() {
        final GitHubWebhookMetaDeletedHookBuilder builder = GitHubWebhookMetaDeletedHookBuilder.builder(
                        MetaCatalogFixtures.webhookMetaDeletedHook())
                .events(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("events");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookMetaDeletedHookBuilder builder = GitHubWebhookMetaDeletedHookBuilder.builder(
                        MetaCatalogFixtures.webhookMetaDeletedHook())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenTypeNull() {
        final GitHubWebhookMetaDeletedHookBuilder builder = GitHubWebhookMetaDeletedHookBuilder.builder(
                        MetaCatalogFixtures.webhookMetaDeletedHook())
                .type(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookMetaDeletedHookBuilder builder = GitHubWebhookMetaDeletedHookBuilder.builder(
                        MetaCatalogFixtures.webhookMetaDeletedHook())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
