package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryTest {

    @Test
    void constructor_shouldThrow_whenCwesNull() {
        final GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryWithdrawnSecurityAdvisory())
                        .cwes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cwes");
    }

    @Test
    void constructor_shouldThrow_whenDescriptionNull() {
        final GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryWithdrawnSecurityAdvisory())
                        .description(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("description");
    }

    @Test
    void constructor_shouldThrow_whenGhsaIdNull() {
        final GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryWithdrawnSecurityAdvisory())
                        .ghsaId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ghsaId");
    }

    @Test
    void constructor_shouldThrow_whenIdentifiersNull() {
        final GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryWithdrawnSecurityAdvisory())
                        .identifiers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("identifiers");
    }

    @Test
    void constructor_shouldThrow_whenPublishedAtNull() {
        final GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryWithdrawnSecurityAdvisory())
                        .publishedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("publishedAt");
    }

    @Test
    void constructor_shouldThrow_whenReferencesNull() {
        final GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryWithdrawnSecurityAdvisory())
                        .references(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("references");
    }

    @Test
    void constructor_shouldThrow_whenSeverityNull() {
        final GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryWithdrawnSecurityAdvisory())
                        .severity(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("severity");
    }

    @Test
    void constructor_shouldThrow_whenSummaryNull() {
        final GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryWithdrawnSecurityAdvisory())
                        .summary(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("summary");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryWithdrawnSecurityAdvisory())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenVulnerabilitiesNull() {
        final GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryWithdrawnSecurityAdvisory())
                        .vulnerabilities(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("vulnerabilities");
    }

    @Test
    void constructor_shouldThrow_whenWithdrawnAtNull() {
        final GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryWithdrawnSecurityAdvisory())
                        .withdrawnAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("withdrawnAt");
    }
}
