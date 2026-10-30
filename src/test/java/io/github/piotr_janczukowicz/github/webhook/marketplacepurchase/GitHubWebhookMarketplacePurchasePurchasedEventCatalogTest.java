package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMarketplacePurchasePurchasedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMarketplacePurchasePurchasedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-marketplace-purchase-purchased-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-marketplace-purchase-purchased-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchasePurchasedEvent();
    }
}
