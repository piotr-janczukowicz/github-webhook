package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCredit fixture =
                RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedRepositoryAdvisoryCredit();

        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCredit copy =
                GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
