package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMarketplacePurchaseCancelledEventTest {

    @Test
    void constructor_shouldThrow_whenEffectiveDateNull() {
        final GitHubWebhookMarketplacePurchaseCancelledEventBuilder builder =
                GitHubWebhookMarketplacePurchaseCancelledEventBuilder.builder(
                                MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchaseCancelledEvent())
                        .effectiveDate(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("effectiveDate");
    }

    @Test
    void constructor_shouldThrow_whenMarketplacePurchaseNull() {
        final GitHubWebhookMarketplacePurchaseCancelledEventBuilder builder =
                GitHubWebhookMarketplacePurchaseCancelledEventBuilder.builder(
                                MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchaseCancelledEvent())
                        .marketplacePurchase(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("marketplacePurchase");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookMarketplacePurchaseCancelledEventBuilder builder =
                GitHubWebhookMarketplacePurchaseCancelledEventBuilder.builder(
                                MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchaseCancelledEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
