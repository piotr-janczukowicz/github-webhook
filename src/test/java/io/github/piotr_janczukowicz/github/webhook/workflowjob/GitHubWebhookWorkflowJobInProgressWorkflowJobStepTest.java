package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowJobInProgressWorkflowJobStepTest {

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobStepBuilder builder =
                GitHubWebhookWorkflowJobInProgressWorkflowJobStepBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJobStep())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobStepBuilder builder =
                GitHubWebhookWorkflowJobInProgressWorkflowJobStepBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJobStep())
                        .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }
}
