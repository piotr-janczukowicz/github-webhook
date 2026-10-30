package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMarketplacePurchaseAccountCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMarketplacePurchaseAccount.class;
    }

    @Override
    protected String fixture() {
        return "webhook-marketplace-purchase-account.json";
    }

    @Override
    protected String schema() {
        return "webhook-marketplace-purchase-account-schema.json";
    }

    @Override
    protected Object expected() {
        return MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchaseAccount();
    }
}
