package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertFixedAlertTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookDependabotAlertFixedAlertBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlert())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDependencyNull() {
        final GitHubWebhookDependabotAlertFixedAlertBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlert())
                        .dependency(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("dependency");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookDependabotAlertFixedAlertBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlert())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenSecurityAdvisoryNull() {
        final GitHubWebhookDependabotAlertFixedAlertBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlert())
                        .securityAdvisory(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("securityAdvisory");
    }

    @Test
    void constructor_shouldThrow_whenSecurityVulnerabilityNull() {
        final GitHubWebhookDependabotAlertFixedAlertBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlert())
                        .securityVulnerability(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("securityVulnerability");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookDependabotAlertFixedAlertBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlert())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookDependabotAlertFixedAlertBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlert())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookDependabotAlertFixedAlertBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlert())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
