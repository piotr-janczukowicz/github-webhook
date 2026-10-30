package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMarketplacePurchasePendingChangeCancelledEventTest {

    @Test
    void constructor_shouldThrow_whenEffectiveDateNull() {
        final GitHubWebhookMarketplacePurchasePendingChangeCancelledEventBuilder builder =
                GitHubWebhookMarketplacePurchasePendingChangeCancelledEventBuilder.builder(
                                MarketplacePurchaseCatalogFixtures
                                        .webhookMarketplacePurchasePendingChangeCancelledEvent())
                        .effectiveDate(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("effectiveDate");
    }

    @Test
    void constructor_shouldThrow_whenMarketplacePurchaseNull() {
        final GitHubWebhookMarketplacePurchasePendingChangeCancelledEventBuilder builder =
                GitHubWebhookMarketplacePurchasePendingChangeCancelledEventBuilder.builder(
                                MarketplacePurchaseCatalogFixtures
                                        .webhookMarketplacePurchasePendingChangeCancelledEvent())
                        .marketplacePurchase(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("marketplacePurchase");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookMarketplacePurchasePendingChangeCancelledEventBuilder builder =
                GitHubWebhookMarketplacePurchasePendingChangeCancelledEventBuilder.builder(
                                MarketplacePurchaseCatalogFixtures
                                        .webhookMarketplacePurchasePendingChangeCancelledEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
