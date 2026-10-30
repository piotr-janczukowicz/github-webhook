package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMarketplacePurchaseCancelledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMarketplacePurchaseCancelledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-marketplace-purchase-cancelled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-marketplace-purchase-cancelled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchaseCancelledEvent();
    }
}
