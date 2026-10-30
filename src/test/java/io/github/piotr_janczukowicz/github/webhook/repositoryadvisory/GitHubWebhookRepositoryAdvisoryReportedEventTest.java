package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryAdvisoryReportedEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookRepositoryAdvisoryReportedEventBuilder builder =
                GitHubWebhookRepositoryAdvisoryReportedEventBuilder.builder(
                                RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryAdvisoryNull() {
        final GitHubWebhookRepositoryAdvisoryReportedEventBuilder builder =
                GitHubWebhookRepositoryAdvisoryReportedEventBuilder.builder(
                                RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedEvent())
                        .repositoryAdvisory(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryAdvisory");
    }
}
