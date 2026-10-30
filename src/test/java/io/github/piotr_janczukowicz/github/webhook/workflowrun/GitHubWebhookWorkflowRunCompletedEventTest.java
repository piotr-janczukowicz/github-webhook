package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowRunCompletedEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookWorkflowRunCompletedEventBuilder builder =
                GitHubWebhookWorkflowRunCompletedEventBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunCompletedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookWorkflowRunCompletedEventBuilder builder =
                GitHubWebhookWorkflowRunCompletedEventBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunCompletedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenWorkflowRunNull() {
        final GitHubWebhookWorkflowRunCompletedEventBuilder builder =
                GitHubWebhookWorkflowRunCompletedEventBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunCompletedEvent())
                        .workflowRun(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("workflowRun");
    }
}
