package io.github.piotr_janczukowicz.github.webhook.orgblock;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrgBlockUnblockedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrgBlockUnblockedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-org-block-unblocked-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-org-block-unblocked-event-schema.json";
    }

    @Override
    protected Object expected() {
        return OrgBlockCatalogFixtures.webhookOrgBlockUnblockedEvent();
    }
}
