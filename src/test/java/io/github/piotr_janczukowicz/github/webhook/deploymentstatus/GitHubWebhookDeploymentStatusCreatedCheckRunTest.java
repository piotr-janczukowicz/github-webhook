package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentStatusCreatedCheckRunTest {

    @Test
    void constructor_shouldThrow_whenDetailsUrlNull() {
        final GitHubWebhookDeploymentStatusCreatedCheckRunBuilder builder =
                GitHubWebhookDeploymentStatusCreatedCheckRunBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedCheckRun())
                        .detailsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("detailsUrl");
    }

    @Test
    void constructor_shouldThrow_whenExternalIdNull() {
        final GitHubWebhookDeploymentStatusCreatedCheckRunBuilder builder =
                GitHubWebhookDeploymentStatusCreatedCheckRunBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedCheckRun())
                        .externalId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("externalId");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookDeploymentStatusCreatedCheckRunBuilder builder =
                GitHubWebhookDeploymentStatusCreatedCheckRunBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedCheckRun())
                        .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookDeploymentStatusCreatedCheckRunBuilder builder =
                GitHubWebhookDeploymentStatusCreatedCheckRunBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedCheckRun())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookDeploymentStatusCreatedCheckRunBuilder builder =
                GitHubWebhookDeploymentStatusCreatedCheckRunBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedCheckRun())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookDeploymentStatusCreatedCheckRunBuilder builder =
                GitHubWebhookDeploymentStatusCreatedCheckRunBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedCheckRun())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenStartedAtNull() {
        final GitHubWebhookDeploymentStatusCreatedCheckRunBuilder builder =
                GitHubWebhookDeploymentStatusCreatedCheckRunBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedCheckRun())
                        .startedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("startedAt");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookDeploymentStatusCreatedCheckRunBuilder builder =
                GitHubWebhookDeploymentStatusCreatedCheckRunBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedCheckRun())
                        .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookDeploymentStatusCreatedCheckRunBuilder builder =
                GitHubWebhookDeploymentStatusCreatedCheckRunBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedCheckRun())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
