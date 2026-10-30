package io.github.piotr_janczukowicz.github.webhook.create;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCreateEventTest {

    @Test
    void constructor_shouldThrow_whenMasterBranchNull() {
        final GitHubWebhookCreateEventBuilder builder = GitHubWebhookCreateEventBuilder.builder(
                        CreateCatalogFixtures.webhookCreateEvent())
                .masterBranch(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("masterBranch");
    }

    @Test
    void constructor_shouldThrow_whenPusherTypeNull() {
        final GitHubWebhookCreateEventBuilder builder = GitHubWebhookCreateEventBuilder.builder(
                        CreateCatalogFixtures.webhookCreateEvent())
                .pusherType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pusherType");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookCreateEventBuilder builder = GitHubWebhookCreateEventBuilder.builder(
                        CreateCatalogFixtures.webhookCreateEvent())
                .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRefTypeNull() {
        final GitHubWebhookCreateEventBuilder builder = GitHubWebhookCreateEventBuilder.builder(
                        CreateCatalogFixtures.webhookCreateEvent())
                .refType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("refType");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCreateEventBuilder builder = GitHubWebhookCreateEventBuilder.builder(
                        CreateCatalogFixtures.webhookCreateEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCreateEventBuilder builder = GitHubWebhookCreateEventBuilder.builder(
                        CreateCatalogFixtures.webhookCreateEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
