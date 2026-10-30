package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowRunRequestedEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookWorkflowRunRequestedEventBuilder builder =
                GitHubWebhookWorkflowRunRequestedEventBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookWorkflowRunRequestedEventBuilder builder =
                GitHubWebhookWorkflowRunRequestedEventBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenWorkflowRunNull() {
        final GitHubWebhookWorkflowRunRequestedEventBuilder builder =
                GitHubWebhookWorkflowRunRequestedEventBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedEvent())
                        .workflowRun(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("workflowRun");
    }
}
