package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySubmissionTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySubmission fixture =
                RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedRepositoryAdvisorySubmission();

        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySubmission copy =
                GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySubmissionBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
