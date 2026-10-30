package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMarketplacePurchasePurchasedEventTest {

    @Test
    void constructor_shouldThrow_whenEffectiveDateNull() {
        final GitHubWebhookMarketplacePurchasePurchasedEventBuilder builder =
                GitHubWebhookMarketplacePurchasePurchasedEventBuilder.builder(
                                MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchasePurchasedEvent())
                        .effectiveDate(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("effectiveDate");
    }

    @Test
    void constructor_shouldThrow_whenMarketplacePurchaseNull() {
        final GitHubWebhookMarketplacePurchasePurchasedEventBuilder builder =
                GitHubWebhookMarketplacePurchasePurchasedEventBuilder.builder(
                                MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchasePurchasedEvent())
                        .marketplacePurchase(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("marketplacePurchase");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookMarketplacePurchasePurchasedEventBuilder builder =
                GitHubWebhookMarketplacePurchasePurchasedEventBuilder.builder(
                                MarketplacePurchaseCatalogFixtures.webhookMarketplacePurchasePurchasedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
