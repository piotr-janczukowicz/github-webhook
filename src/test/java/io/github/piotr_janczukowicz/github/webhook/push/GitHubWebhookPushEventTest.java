package io.github.piotr_janczukowicz.github.webhook.push;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPushEventTest {

    @Test
    void constructor_shouldThrow_whenAfterNull() {
        final GitHubWebhookPushEventBuilder builder = GitHubWebhookPushEventBuilder.builder(
                        PushCatalogFixtures.webhookPushEvent())
                .after(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("after");
    }

    @Test
    void constructor_shouldThrow_whenBeforeNull() {
        final GitHubWebhookPushEventBuilder builder = GitHubWebhookPushEventBuilder.builder(
                        PushCatalogFixtures.webhookPushEvent())
                .before(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("before");
    }

    @Test
    void constructor_shouldThrow_whenCommitsNull() {
        final GitHubWebhookPushEventBuilder builder = GitHubWebhookPushEventBuilder.builder(
                        PushCatalogFixtures.webhookPushEvent())
                .commits(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commits");
    }

    @Test
    void constructor_shouldThrow_whenCompareNull() {
        final GitHubWebhookPushEventBuilder builder = GitHubWebhookPushEventBuilder.builder(
                        PushCatalogFixtures.webhookPushEvent())
                .compare(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compare");
    }

    @Test
    void constructor_shouldThrow_whenPusherNull() {
        final GitHubWebhookPushEventBuilder builder = GitHubWebhookPushEventBuilder.builder(
                        PushCatalogFixtures.webhookPushEvent())
                .pusher(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pusher");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookPushEventBuilder builder = GitHubWebhookPushEventBuilder.builder(
                        PushCatalogFixtures.webhookPushEvent())
                .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookPushEventBuilder builder = GitHubWebhookPushEventBuilder.builder(
                        PushCatalogFixtures.webhookPushEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }
}
