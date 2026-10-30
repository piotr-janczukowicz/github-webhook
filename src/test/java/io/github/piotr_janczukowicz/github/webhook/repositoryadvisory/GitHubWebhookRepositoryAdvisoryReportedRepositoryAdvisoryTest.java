package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryTest {

    @Test
    void constructor_shouldThrow_whenGhsaIdNull() {
        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryBuilder builder =
                GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryBuilder.builder(
                                RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedRepositoryAdvisory())
                        .ghsaId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ghsaId");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryBuilder builder =
                GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryBuilder.builder(
                                RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedRepositoryAdvisory())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIdentifiersNull() {
        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryBuilder builder =
                GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryBuilder.builder(
                                RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedRepositoryAdvisory())
                        .identifiers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("identifiers");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryBuilder builder =
                GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryBuilder.builder(
                                RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedRepositoryAdvisory())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenSummaryNull() {
        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryBuilder builder =
                GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryBuilder.builder(
                                RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedRepositoryAdvisory())
                        .summary(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("summary");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryBuilder builder =
                GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryBuilder.builder(
                                RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedRepositoryAdvisory())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
