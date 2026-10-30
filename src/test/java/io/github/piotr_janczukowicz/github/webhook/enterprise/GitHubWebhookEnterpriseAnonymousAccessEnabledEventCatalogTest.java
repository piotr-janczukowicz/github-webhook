package io.github.piotr_janczukowicz.github.webhook.enterprise;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookEnterpriseAnonymousAccessEnabledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookEnterpriseAnonymousAccessEnabledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-enterprise-anonymous-access-enabled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-enterprise-anonymous-access-enabled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return EnterpriseCatalogFixtures.webhookEnterpriseAnonymousAccessEnabledEvent();
    }
}
