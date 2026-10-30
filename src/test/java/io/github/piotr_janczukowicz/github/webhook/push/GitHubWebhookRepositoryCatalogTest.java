package io.github.piotr_janczukowicz.github.webhook.push;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepository.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-schema.json";
    }

    @Override
    protected Object expected() {
        return PushCatalogFixtures.webhookRepository();
    }
}
