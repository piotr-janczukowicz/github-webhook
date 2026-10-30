package io.github.piotr_janczukowicz.github.webhook.repositorydispatch;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryDispatchEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryDispatchEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-dispatch-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-dispatch-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryDispatchCatalogFixtures.webhookRepositoryDispatchEvent();
    }
}
