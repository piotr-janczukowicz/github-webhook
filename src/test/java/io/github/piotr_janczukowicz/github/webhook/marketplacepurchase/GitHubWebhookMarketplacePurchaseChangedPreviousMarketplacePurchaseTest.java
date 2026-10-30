package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseTest {

    @Test
    void constructor_shouldThrow_whenAccountNull() {
        final GitHubWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseBuilder builder =
                GitHubWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseBuilder.builder(
                                MarketplacePurchaseCatalogFixtures
                                        .webhookMarketplacePurchaseChangedPreviousMarketplacePurchase())
                        .account(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("account");
    }

    @Test
    void constructor_shouldThrow_whenBillingCycleNull() {
        final GitHubWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseBuilder builder =
                GitHubWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseBuilder.builder(
                                MarketplacePurchaseCatalogFixtures
                                        .webhookMarketplacePurchaseChangedPreviousMarketplacePurchase())
                        .billingCycle(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("billingCycle");
    }

    @Test
    void constructor_shouldThrow_whenPlanNull() {
        final GitHubWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseBuilder builder =
                GitHubWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseBuilder.builder(
                                MarketplacePurchaseCatalogFixtures
                                        .webhookMarketplacePurchaseChangedPreviousMarketplacePurchase())
                        .plan(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("plan");
    }
}
