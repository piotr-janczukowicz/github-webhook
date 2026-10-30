package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookMarketplacePurchasePlanPriceModelCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMarketplacePurchasePlanPriceModel.class;
    }

    @Override
    protected String schema() {
        return "webhook-marketplace-purchase-plan-price-model-schema.json";
    }
}
