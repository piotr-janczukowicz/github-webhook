package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryTemplateRepositoryOwnerCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryTemplateRepositoryOwner.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-template-repository-owner.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-template-repository-owner-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookRepositoryTemplateRepositoryOwner();
    }
}
