package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMinimalRepositoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMinimalRepository.class;
    }

    @Override
    protected String fixture() {
        return "webhook-minimal-repository.json";
    }

    @Override
    protected String schema() {
        return "webhook-minimal-repository-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckRunCatalogFixtures.webhookMinimalRepository();
    }
}
