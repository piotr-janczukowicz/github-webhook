package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMarketplacePurchaseTest {

    @Test
    void constructor_shouldThrow_whenAccountNull() {
        final GitHubWebhookMarketplacePurchaseBuilder builder = GitHubWebhookMarketplacePurchaseBuilder.builder(
                        MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchase())
                .account(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("account");
    }

    @Test
    void constructor_shouldThrow_whenBillingCycleNull() {
        final GitHubWebhookMarketplacePurchaseBuilder builder = GitHubWebhookMarketplacePurchaseBuilder.builder(
                        MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchase())
                .billingCycle(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("billingCycle");
    }

    @Test
    void constructor_shouldThrow_whenPlanNull() {
        final GitHubWebhookMarketplacePurchaseBuilder builder = GitHubWebhookMarketplacePurchaseBuilder.builder(
                        MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchase())
                .plan(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("plan");
    }
}
