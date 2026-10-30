package io.github.piotr_janczukowicz.github.webhook.status;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookStatusEventTest {

    @Test
    void constructor_shouldThrow_whenBranchesNull() {
        final GitHubWebhookStatusEventBuilder builder = GitHubWebhookStatusEventBuilder.builder(
                        StatusCatalogFixtures.webhookStatusEvent())
                .branches(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branches");
    }

    @Test
    void constructor_shouldThrow_whenCommitNull() {
        final GitHubWebhookStatusEventBuilder builder = GitHubWebhookStatusEventBuilder.builder(
                        StatusCatalogFixtures.webhookStatusEvent())
                .commit(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commit");
    }

    @Test
    void constructor_shouldThrow_whenContextNull() {
        final GitHubWebhookStatusEventBuilder builder = GitHubWebhookStatusEventBuilder.builder(
                        StatusCatalogFixtures.webhookStatusEvent())
                .context(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("context");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookStatusEventBuilder builder = GitHubWebhookStatusEventBuilder.builder(
                        StatusCatalogFixtures.webhookStatusEvent())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookStatusEventBuilder builder = GitHubWebhookStatusEventBuilder.builder(
                        StatusCatalogFixtures.webhookStatusEvent())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookStatusEventBuilder builder = GitHubWebhookStatusEventBuilder.builder(
                        StatusCatalogFixtures.webhookStatusEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookStatusEventBuilder builder = GitHubWebhookStatusEventBuilder.builder(
                        StatusCatalogFixtures.webhookStatusEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookStatusEventBuilder builder = GitHubWebhookStatusEventBuilder.builder(
                        StatusCatalogFixtures.webhookStatusEvent())
                .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookStatusEventBuilder builder = GitHubWebhookStatusEventBuilder.builder(
                        StatusCatalogFixtures.webhookStatusEvent())
                .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookStatusEventBuilder builder = GitHubWebhookStatusEventBuilder.builder(
                        StatusCatalogFixtures.webhookStatusEvent())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
