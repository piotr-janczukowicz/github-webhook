package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMarketplacePurchaseChangedEventTest {

    @Test
    void constructor_shouldThrow_whenEffectiveDateNull() {
        final GitHubWebhookMarketplacePurchaseChangedEventBuilder builder =
                GitHubWebhookMarketplacePurchaseChangedEventBuilder.builder(
                                MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchaseChangedEvent())
                        .effectiveDate(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("effectiveDate");
    }

    @Test
    void constructor_shouldThrow_whenMarketplacePurchaseNull() {
        final GitHubWebhookMarketplacePurchaseChangedEventBuilder builder =
                GitHubWebhookMarketplacePurchaseChangedEventBuilder.builder(
                                MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchaseChangedEvent())
                        .marketplacePurchase(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("marketplacePurchase");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookMarketplacePurchaseChangedEventBuilder builder =
                GitHubWebhookMarketplacePurchaseChangedEventBuilder.builder(
                                MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchaseChangedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
