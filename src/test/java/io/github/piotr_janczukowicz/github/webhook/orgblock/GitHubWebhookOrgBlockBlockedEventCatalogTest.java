package io.github.piotr_janczukowicz.github.webhook.orgblock;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrgBlockBlockedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrgBlockBlockedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-org-block-blocked-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-org-block-blocked-event-schema.json";
    }

    @Override
    protected Object expected() {
        return OrgBlockCatalogFixtures.webhookOrgBlockBlockedEvent();
    }
}
