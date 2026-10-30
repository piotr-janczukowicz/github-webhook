package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentWorkflowRunReferencedWorkflowTest {

    @Test
    void constructor_shouldThrow_whenPathNull() {
        final GitHubWebhookDeploymentWorkflowRunReferencedWorkflowBuilder builder =
                GitHubWebhookDeploymentWorkflowRunReferencedWorkflowBuilder.builder(
                                CommonCatalogFixtures.webhookDeploymentWorkflowRunReferencedWorkflow())
                        .path(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("path");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookDeploymentWorkflowRunReferencedWorkflowBuilder builder =
                GitHubWebhookDeploymentWorkflowRunReferencedWorkflowBuilder.builder(
                                CommonCatalogFixtures.webhookDeploymentWorkflowRunReferencedWorkflow())
                        .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
