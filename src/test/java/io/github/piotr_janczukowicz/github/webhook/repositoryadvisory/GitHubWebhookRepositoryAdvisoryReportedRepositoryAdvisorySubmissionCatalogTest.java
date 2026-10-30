package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySubmissionCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySubmission.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-advisory-reported-repository-advisory-submission.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-advisory-reported-repository-advisory-submission-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedRepositoryAdvisorySubmission();
    }
}
