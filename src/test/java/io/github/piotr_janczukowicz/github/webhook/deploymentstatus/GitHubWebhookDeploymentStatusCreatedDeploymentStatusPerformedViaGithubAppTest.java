package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubAppTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubAppBuilder builder =
                GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubAppBuilder.builder(
                                DeploymentStatusCatalogFixtures
                                        .webhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubApp())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubAppBuilder builder =
                GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubAppBuilder.builder(
                                DeploymentStatusCatalogFixtures
                                        .webhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubApp())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubAppBuilder builder =
                GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubAppBuilder.builder(
                                DeploymentStatusCatalogFixtures
                                        .webhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubApp())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
