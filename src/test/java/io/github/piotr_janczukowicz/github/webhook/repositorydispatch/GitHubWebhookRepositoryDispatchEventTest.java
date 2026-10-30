package io.github.piotr_janczukowicz.github.webhook.repositorydispatch;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryDispatchEventTest {

    @Test
    void constructor_shouldThrow_whenActionNull() {
        final GitHubWebhookRepositoryDispatchEventBuilder builder = GitHubWebhookRepositoryDispatchEventBuilder.builder(
                        RepositoryDispatchCatalogFixtures.webhookRepositoryDispatchEvent())
                .action(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("action");
    }

    @Test
    void constructor_shouldThrow_whenBranchNull() {
        final GitHubWebhookRepositoryDispatchEventBuilder builder = GitHubWebhookRepositoryDispatchEventBuilder.builder(
                        RepositoryDispatchCatalogFixtures.webhookRepositoryDispatchEvent())
                .branch(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branch");
    }

    @Test
    void constructor_shouldThrow_whenInstallationNull() {
        final GitHubWebhookRepositoryDispatchEventBuilder builder = GitHubWebhookRepositoryDispatchEventBuilder.builder(
                        RepositoryDispatchCatalogFixtures.webhookRepositoryDispatchEvent())
                .installation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installation");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookRepositoryDispatchEventBuilder builder = GitHubWebhookRepositoryDispatchEventBuilder.builder(
                        RepositoryDispatchCatalogFixtures.webhookRepositoryDispatchEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookRepositoryDispatchEventBuilder builder = GitHubWebhookRepositoryDispatchEventBuilder.builder(
                        RepositoryDispatchCatalogFixtures.webhookRepositoryDispatchEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
