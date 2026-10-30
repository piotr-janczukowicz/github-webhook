package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookForkRepositoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookForkRepository.class;
    }

    @Override
    protected String fixture() {
        return "webhook-fork-repository.json";
    }

    @Override
    protected String schema() {
        return "webhook-fork-repository-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookForkRepository();
    }
}
