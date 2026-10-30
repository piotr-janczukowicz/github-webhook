package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowJobQueuedEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookWorkflowJobQueuedEventBuilder builder = GitHubWebhookWorkflowJobQueuedEventBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookWorkflowJobQueuedEventBuilder builder = GitHubWebhookWorkflowJobQueuedEventBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenWorkflowJobNull() {
        final GitHubWebhookWorkflowJobQueuedEventBuilder builder = GitHubWebhookWorkflowJobQueuedEventBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedEvent())
                .workflowJob(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("workflowJob");
    }
}
