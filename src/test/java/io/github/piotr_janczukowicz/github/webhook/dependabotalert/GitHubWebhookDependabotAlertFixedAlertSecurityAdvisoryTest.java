package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryTest {

    @Test
    void constructor_shouldThrow_whenCwesNull() {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisory())
                        .cwes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cwes");
    }

    @Test
    void constructor_shouldThrow_whenDescriptionNull() {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisory())
                        .description(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("description");
    }

    @Test
    void constructor_shouldThrow_whenGhsaIdNull() {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisory())
                        .ghsaId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ghsaId");
    }

    @Test
    void constructor_shouldThrow_whenIdentifiersNull() {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisory())
                        .identifiers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("identifiers");
    }

    @Test
    void constructor_shouldThrow_whenPublishedAtNull() {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisory())
                        .publishedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("publishedAt");
    }

    @Test
    void constructor_shouldThrow_whenReferencesNull() {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisory())
                        .references(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("references");
    }

    @Test
    void constructor_shouldThrow_whenSeverityNull() {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisory())
                        .severity(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("severity");
    }

    @Test
    void constructor_shouldThrow_whenSummaryNull() {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisory())
                        .summary(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("summary");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisory())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenVulnerabilitiesNull() {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisory())
                        .vulnerabilities(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("vulnerabilities");
    }
}
