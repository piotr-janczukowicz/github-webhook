package io.github.piotr_janczukowicz.github.webhook.gollum;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookGollumPageCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookGollumPage.class;
    }

    @Override
    protected String fixture() {
        return "webhook-gollum-page.json";
    }

    @Override
    protected String schema() {
        return "webhook-gollum-page-schema.json";
    }

    @Override
    protected Object expected() {
        return GollumCatalogFixtures.webhookGollumPage();
    }
}
