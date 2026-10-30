package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowRunPullRequestTest {

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookWorkflowRunPullRequestBuilder builder = GitHubWebhookWorkflowRunPullRequestBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRunPullRequest())
                .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookWorkflowRunPullRequestBuilder builder = GitHubWebhookWorkflowRunPullRequestBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRunPullRequest())
                .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookWorkflowRunPullRequestBuilder builder = GitHubWebhookWorkflowRunPullRequestBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRunPullRequest())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
