package io.github.piotr_janczukowicz.github.webhook.pagebuild;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPageBuildEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPageBuildEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-page-build-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-page-build-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PageBuildCatalogFixtures.webhookPageBuildEvent();
    }
}
