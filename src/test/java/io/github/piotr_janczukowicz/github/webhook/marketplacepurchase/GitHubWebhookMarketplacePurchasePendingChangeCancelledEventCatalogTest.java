package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMarketplacePurchasePendingChangeCancelledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMarketplacePurchasePendingChangeCancelledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-marketplace-purchase-pending-change-cancelled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-marketplace-purchase-pending-change-cancelled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchasePendingChangeCancelledEvent();
    }
}
