package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowJobWaitingWorkflowJobStepTest {

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobStepBuilder builder =
                GitHubWebhookWorkflowJobWaitingWorkflowJobStepBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingWorkflowJobStep())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobStepBuilder builder =
                GitHubWebhookWorkflowJobWaitingWorkflowJobStepBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingWorkflowJobStep())
                        .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }
}
