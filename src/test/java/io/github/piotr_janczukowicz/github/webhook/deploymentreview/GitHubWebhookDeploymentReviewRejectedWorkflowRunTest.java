package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentReviewRejectedWorkflowRunTest {

    @Test
    void constructor_shouldThrow_whenCheckSuiteNodeIdNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .checkSuiteNodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkSuiteNodeId");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDisplayTitleNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .displayTitle(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("displayTitle");
    }

    @Test
    void constructor_shouldThrow_whenEventNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .event(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("event");
    }

    @Test
    void constructor_shouldThrow_whenHeadBranchNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .headBranch(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headBranch");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPathNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .path(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("path");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestsNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .pullRequests(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequests");
    }

    @Test
    void constructor_shouldThrow_whenRunStartedAtNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .runStartedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("runStartedAt");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder builder =
                GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
