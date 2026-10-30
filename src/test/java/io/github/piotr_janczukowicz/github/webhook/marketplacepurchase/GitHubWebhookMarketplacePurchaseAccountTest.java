package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMarketplacePurchaseAccountTest {

    @Test
    void constructor_shouldThrow_whenLoginNull() {
        final GitHubWebhookMarketplacePurchaseAccountBuilder builder =
                GitHubWebhookMarketplacePurchaseAccountBuilder.builder(
                                MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchaseAccount())
                        .login(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("login");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookMarketplacePurchaseAccountBuilder builder =
                GitHubWebhookMarketplacePurchaseAccountBuilder.builder(
                                MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchaseAccount())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenTypeNull() {
        final GitHubWebhookMarketplacePurchaseAccountBuilder builder =
                GitHubWebhookMarketplacePurchaseAccountBuilder.builder(
                                MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchaseAccount())
                        .type(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }
}
