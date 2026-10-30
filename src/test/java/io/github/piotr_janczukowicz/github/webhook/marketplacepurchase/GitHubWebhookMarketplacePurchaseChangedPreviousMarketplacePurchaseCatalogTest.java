package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMarketplacePurchaseChangedPreviousMarketplacePurchase.class;
    }

    @Override
    protected String fixture() {
        return "webhook-marketplace-purchase-changed-previous-marketplace-purchase.json";
    }

    @Override
    protected String schema() {
        return "webhook-marketplace-purchase-changed-previous-marketplace-purchase-schema.json";
    }

    @Override
    protected Object expected() {
        return MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchaseChangedPreviousMarketplacePurchase();
    }
}
