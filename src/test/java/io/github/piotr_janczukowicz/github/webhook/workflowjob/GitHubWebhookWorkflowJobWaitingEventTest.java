package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowJobWaitingEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookWorkflowJobWaitingEventBuilder builder = GitHubWebhookWorkflowJobWaitingEventBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookWorkflowJobWaitingEventBuilder builder = GitHubWebhookWorkflowJobWaitingEventBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenWorkflowJobNull() {
        final GitHubWebhookWorkflowJobWaitingEventBuilder builder = GitHubWebhookWorkflowJobWaitingEventBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingEvent())
                .workflowJob(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("workflowJob");
    }
}
