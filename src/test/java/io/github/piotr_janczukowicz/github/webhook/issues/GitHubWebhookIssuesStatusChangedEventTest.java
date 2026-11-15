package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesStatusChangedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookIssuesStatusChangedEventBuilder builder =
                GitHubWebhookIssuesStatusChangedEventBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesStatusChangedEvent())
                        .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssuesStatusChangedEventBuilder builder =
                GitHubWebhookIssuesStatusChangedEventBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesStatusChangedEvent())
                        .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssuesStatusChangedEventBuilder builder =
                GitHubWebhookIssuesStatusChangedEventBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesStatusChangedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssuesStatusChangedEventBuilder builder =
                GitHubWebhookIssuesStatusChangedEventBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesStatusChangedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookIssuesStatusChangedEventBuilder builder =
                GitHubWebhookIssuesStatusChangedEventBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesStatusChangedEvent())
                        .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }
}
