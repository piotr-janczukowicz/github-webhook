package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSimpleRepositoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSimpleRepository.class;
    }

    @Override
    protected String fixture() {
        return "webhook-simple-repository.json";
    }

    @Override
    protected String schema() {
        return "webhook-simple-repository-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository();
    }
}
