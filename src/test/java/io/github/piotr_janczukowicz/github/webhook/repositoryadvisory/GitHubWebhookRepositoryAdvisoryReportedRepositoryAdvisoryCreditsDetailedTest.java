package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailedTest {

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailedBuilder builder =
                GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailedBuilder.builder(
                                RepositoryAdvisoryCatalogFixtures
                                        .webhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailed())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenTypeNull() {
        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailedBuilder builder =
                GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailedBuilder.builder(
                                RepositoryAdvisoryCatalogFixtures
                                        .webhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailed())
                        .type(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }

    @Test
    void constructor_shouldThrow_whenUserNull() {
        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailedBuilder builder =
                GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailedBuilder.builder(
                                RepositoryAdvisoryCatalogFixtures
                                        .webhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailed())
                        .user(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("user");
    }
}
