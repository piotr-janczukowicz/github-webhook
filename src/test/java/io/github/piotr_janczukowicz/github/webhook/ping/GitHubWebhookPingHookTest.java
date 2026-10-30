package io.github.piotr_janczukowicz.github.webhook.ping;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPingHookTest {

    @Test
    void constructor_shouldThrow_whenConfigNull() {
        final GitHubWebhookPingHookBuilder builder = GitHubWebhookPingHookBuilder.builder(
                        PingCatalogFixtures.webhookPingHook())
                .config(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("config");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPingHookBuilder builder = GitHubWebhookPingHookBuilder.builder(
                        PingCatalogFixtures.webhookPingHook())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsNull() {
        final GitHubWebhookPingHookBuilder builder = GitHubWebhookPingHookBuilder.builder(
                        PingCatalogFixtures.webhookPingHook())
                .events(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("events");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPingHookBuilder builder = GitHubWebhookPingHookBuilder.builder(
                        PingCatalogFixtures.webhookPingHook())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenTypeNull() {
        final GitHubWebhookPingHookBuilder builder = GitHubWebhookPingHookBuilder.builder(
                        PingCatalogFixtures.webhookPingHook())
                .type(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPingHookBuilder builder = GitHubWebhookPingHookBuilder.builder(
                        PingCatalogFixtures.webhookPingHook())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
