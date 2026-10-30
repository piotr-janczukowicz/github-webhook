package io.github.piotr_janczukowicz.github.webhook.deployment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentWorkflowRunTest {

    @Test
    void constructor_shouldThrow_whenCheckSuiteNodeIdNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .checkSuiteNodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkSuiteNodeId");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDisplayTitleNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .displayTitle(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("displayTitle");
    }

    @Test
    void constructor_shouldThrow_whenEventNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .event(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("event");
    }

    @Test
    void constructor_shouldThrow_whenHeadBranchNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .headBranch(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headBranch");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPathNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .path(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("path");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestsNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .pullRequests(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequests");
    }

    @Test
    void constructor_shouldThrow_whenRunStartedAtNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .runStartedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("runStartedAt");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookDeploymentWorkflowRunBuilder builder = GitHubWebhookDeploymentWorkflowRunBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentWorkflowRun())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
