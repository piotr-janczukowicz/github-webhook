package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertWithdrawnAlertTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookDependabotAlertWithdrawnAlertBuilder builder =
                GitHubWebhookDependabotAlertWithdrawnAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnAlert())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDependencyNull() {
        final GitHubWebhookDependabotAlertWithdrawnAlertBuilder builder =
                GitHubWebhookDependabotAlertWithdrawnAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnAlert())
                        .dependency(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("dependency");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookDependabotAlertWithdrawnAlertBuilder builder =
                GitHubWebhookDependabotAlertWithdrawnAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnAlert())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookDependabotAlertWithdrawnAlertBuilder builder =
                GitHubWebhookDependabotAlertWithdrawnAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnAlert())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenSecurityAdvisoryNull() {
        final GitHubWebhookDependabotAlertWithdrawnAlertBuilder builder =
                GitHubWebhookDependabotAlertWithdrawnAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnAlert())
                        .securityAdvisory(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("securityAdvisory");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookDependabotAlertWithdrawnAlertBuilder builder =
                GitHubWebhookDependabotAlertWithdrawnAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnAlert())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookDependabotAlertWithdrawnAlertBuilder builder =
                GitHubWebhookDependabotAlertWithdrawnAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnAlert())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenWithdrawnAtNull() {
        final GitHubWebhookDependabotAlertWithdrawnAlertBuilder builder =
                GitHubWebhookDependabotAlertWithdrawnAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnAlert())
                        .withdrawnAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("withdrawnAt");
    }
}
