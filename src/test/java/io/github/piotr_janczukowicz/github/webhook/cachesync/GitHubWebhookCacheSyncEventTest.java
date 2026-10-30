package io.github.piotr_janczukowicz.github.webhook.cachesync;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCacheSyncEventTest {

    @Test
    void constructor_shouldThrow_whenAfterNull() {
        final GitHubWebhookCacheSyncEventBuilder builder = GitHubWebhookCacheSyncEventBuilder.builder(
                        CacheSyncCatalogFixtures.webhookCacheSyncEvent())
                .after(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("after");
    }

    @Test
    void constructor_shouldThrow_whenBeforeNull() {
        final GitHubWebhookCacheSyncEventBuilder builder = GitHubWebhookCacheSyncEventBuilder.builder(
                        CacheSyncCatalogFixtures.webhookCacheSyncEvent())
                .before(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("before");
    }

    @Test
    void constructor_shouldThrow_whenCacheLocationNull() {
        final GitHubWebhookCacheSyncEventBuilder builder = GitHubWebhookCacheSyncEventBuilder.builder(
                        CacheSyncCatalogFixtures.webhookCacheSyncEvent())
                .cacheLocation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cacheLocation");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookCacheSyncEventBuilder builder = GitHubWebhookCacheSyncEventBuilder.builder(
                        CacheSyncCatalogFixtures.webhookCacheSyncEvent())
                .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }
}
