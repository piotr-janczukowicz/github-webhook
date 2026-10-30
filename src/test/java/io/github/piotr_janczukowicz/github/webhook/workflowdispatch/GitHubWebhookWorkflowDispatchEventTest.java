package io.github.piotr_janczukowicz.github.webhook.workflowdispatch;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowDispatchEventTest {

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookWorkflowDispatchEventBuilder builder = GitHubWebhookWorkflowDispatchEventBuilder.builder(
                        WorkflowDispatchCatalogFixtures.webhookWorkflowDispatchEvent())
                .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookWorkflowDispatchEventBuilder builder = GitHubWebhookWorkflowDispatchEventBuilder.builder(
                        WorkflowDispatchCatalogFixtures.webhookWorkflowDispatchEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookWorkflowDispatchEventBuilder builder = GitHubWebhookWorkflowDispatchEventBuilder.builder(
                        WorkflowDispatchCatalogFixtures.webhookWorkflowDispatchEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenWorkflowNull() {
        final GitHubWebhookWorkflowDispatchEventBuilder builder = GitHubWebhookWorkflowDispatchEventBuilder.builder(
                        WorkflowDispatchCatalogFixtures.webhookWorkflowDispatchEvent())
                .workflow(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("workflow");
    }
}
