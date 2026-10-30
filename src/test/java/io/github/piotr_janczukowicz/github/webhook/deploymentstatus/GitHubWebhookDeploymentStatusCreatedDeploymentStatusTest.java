package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentStatusCreatedDeploymentStatusTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder builder =
                GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedDeploymentStatus())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentUrlNull() {
        final GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder builder =
                GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedDeploymentStatus())
                        .deploymentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentUrl");
    }

    @Test
    void constructor_shouldThrow_whenDescriptionNull() {
        final GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder builder =
                GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedDeploymentStatus())
                        .description(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("description");
    }

    @Test
    void constructor_shouldThrow_whenEnvironmentNull() {
        final GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder builder =
                GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedDeploymentStatus())
                        .environment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("environment");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder builder =
                GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedDeploymentStatus())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder builder =
                GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedDeploymentStatus())
                        .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder builder =
                GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedDeploymentStatus())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenTargetUrlNull() {
        final GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder builder =
                GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedDeploymentStatus())
                        .targetUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("targetUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder builder =
                GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedDeploymentStatus())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder builder =
                GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedDeploymentStatus())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
