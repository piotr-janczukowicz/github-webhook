package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMarketplacePurchasePendingChangeEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMarketplacePurchasePendingChangeEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-marketplace-purchase-pending-change-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-marketplace-purchase-pending-change-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchasePendingChangeEvent();
    }
}
