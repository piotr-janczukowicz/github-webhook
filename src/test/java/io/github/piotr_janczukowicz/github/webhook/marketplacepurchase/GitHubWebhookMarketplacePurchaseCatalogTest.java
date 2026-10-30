package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMarketplacePurchaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMarketplacePurchase.class;
    }

    @Override
    protected String fixture() {
        return "webhook-marketplace-purchase.json";
    }

    @Override
    protected String schema() {
        return "webhook-marketplace-purchase-schema.json";
    }

    @Override
    protected Object expected() {
        return MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchase();
    }
}
