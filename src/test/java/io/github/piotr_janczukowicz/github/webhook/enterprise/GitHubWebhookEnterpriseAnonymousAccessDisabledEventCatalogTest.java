package io.github.piotr_janczukowicz.github.webhook.enterprise;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookEnterpriseAnonymousAccessDisabledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookEnterpriseAnonymousAccessDisabledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-enterprise-anonymous-access-disabled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-enterprise-anonymous-access-disabled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return EnterpriseCatalogFixtures.webhookEnterpriseAnonymousAccessDisabledEvent();
    }
}
