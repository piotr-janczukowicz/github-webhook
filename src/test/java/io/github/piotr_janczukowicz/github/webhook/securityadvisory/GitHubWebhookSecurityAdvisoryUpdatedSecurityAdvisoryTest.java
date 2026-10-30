package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryTest {

    @Test
    void constructor_shouldThrow_whenCwesNull() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisory())
                        .cwes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cwes");
    }

    @Test
    void constructor_shouldThrow_whenDescriptionNull() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisory())
                        .description(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("description");
    }

    @Test
    void constructor_shouldThrow_whenGhsaIdNull() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisory())
                        .ghsaId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ghsaId");
    }

    @Test
    void constructor_shouldThrow_whenIdentifiersNull() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisory())
                        .identifiers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("identifiers");
    }

    @Test
    void constructor_shouldThrow_whenPublishedAtNull() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisory())
                        .publishedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("publishedAt");
    }

    @Test
    void constructor_shouldThrow_whenReferencesNull() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisory())
                        .references(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("references");
    }

    @Test
    void constructor_shouldThrow_whenSeverityNull() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisory())
                        .severity(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("severity");
    }

    @Test
    void constructor_shouldThrow_whenSummaryNull() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisory())
                        .summary(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("summary");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisory())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenVulnerabilitiesNull() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder builder =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisory())
                        .vulnerabilities(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("vulnerabilities");
    }
}
