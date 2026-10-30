package io.github.piotr_janczukowicz.github.webhook.gollum;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookGollumPageActionCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookGollumPageAction.class;
    }

    @Override
    protected String schema() {
        return "webhook-gollum-page-action-schema.json";
    }
}
