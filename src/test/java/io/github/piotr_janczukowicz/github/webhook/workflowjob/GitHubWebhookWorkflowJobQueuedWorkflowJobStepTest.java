package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowJobQueuedWorkflowJobStepTest {

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobStepBuilder builder =
                GitHubWebhookWorkflowJobQueuedWorkflowJobStepBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJobStep())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobStepBuilder builder =
                GitHubWebhookWorkflowJobQueuedWorkflowJobStepBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJobStep())
                        .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }
}
