package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryTemplateRepositoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryTemplateRepository.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-template-repository.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-template-repository-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookRepositoryTemplateRepository();
    }
}
