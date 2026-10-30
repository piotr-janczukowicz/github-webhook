package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMarketplacePurchaseChangedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMarketplacePurchaseChangedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-marketplace-purchase-changed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-marketplace-purchase-changed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchaseChangedEvent();
    }
}
