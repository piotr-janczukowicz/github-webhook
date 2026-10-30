package io.github.piotr_janczukowicz.github.webhook.deployment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookDeploymentBuilder builder = GitHubWebhookDeploymentBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeployment())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEnvironmentNull() {
        final GitHubWebhookDeploymentBuilder builder = GitHubWebhookDeploymentBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeployment())
                .environment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("environment");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookDeploymentBuilder builder = GitHubWebhookDeploymentBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeployment())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenOriginalEnvironmentNull() {
        final GitHubWebhookDeploymentBuilder builder = GitHubWebhookDeploymentBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeployment())
                .originalEnvironment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("originalEnvironment");
    }

    @Test
    void constructor_shouldThrow_whenPayloadNull() {
        final GitHubWebhookDeploymentBuilder builder = GitHubWebhookDeploymentBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeployment())
                .payload(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("payload");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookDeploymentBuilder builder = GitHubWebhookDeploymentBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeployment())
                .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookDeploymentBuilder builder = GitHubWebhookDeploymentBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeployment())
                .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookDeploymentBuilder builder = GitHubWebhookDeploymentBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeployment())
                .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookDeploymentBuilder builder = GitHubWebhookDeploymentBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeployment())
                .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTaskNull() {
        final GitHubWebhookDeploymentBuilder builder = GitHubWebhookDeploymentBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeployment())
                .task(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("task");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookDeploymentBuilder builder = GitHubWebhookDeploymentBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeployment())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookDeploymentBuilder builder = GitHubWebhookDeploymentBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeployment())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
