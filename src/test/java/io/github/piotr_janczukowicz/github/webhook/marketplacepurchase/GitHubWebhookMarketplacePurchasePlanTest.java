package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMarketplacePurchasePlanTest {

    @Test
    void constructor_shouldThrow_whenBulletsNull() {
        final GitHubWebhookMarketplacePurchasePlanBuilder builder = GitHubWebhookMarketplacePurchasePlanBuilder.builder(
                        MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchasePlan())
                .bullets(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("bullets");
    }

    @Test
    void constructor_shouldThrow_whenDescriptionNull() {
        final GitHubWebhookMarketplacePurchasePlanBuilder builder = GitHubWebhookMarketplacePurchasePlanBuilder.builder(
                        MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchasePlan())
                .description(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("description");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookMarketplacePurchasePlanBuilder builder = GitHubWebhookMarketplacePurchasePlanBuilder.builder(
                        MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchasePlan())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenPriceModelNull() {
        final GitHubWebhookMarketplacePurchasePlanBuilder builder = GitHubWebhookMarketplacePurchasePlanBuilder.builder(
                        MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchasePlan())
                .priceModel(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("priceModel");
    }
}
