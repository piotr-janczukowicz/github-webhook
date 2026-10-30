package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMarketplacePurchasePlanCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMarketplacePurchasePlan.class;
    }

    @Override
    protected String fixture() {
        return "webhook-marketplace-purchase-plan.json";
    }

    @Override
    protected String schema() {
        return "webhook-marketplace-purchase-plan-schema.json";
    }

    @Override
    protected Object expected() {
        return MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchasePlan();
    }
}
