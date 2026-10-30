package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookMarketplacePurchasePlanPriceModelTest {

    @ParameterizedTest
    @CsvSource({"'FREE',FREE", "'FLAT_RATE',FLAT_RATE", "'PER_UNIT',PER_UNIT"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookMarketplacePurchasePlanPriceModel value) {
        final GitHubWebhookMarketplacePurchasePlanPriceModel decoded =
                GitHubWebhookMarketplacePurchasePlanPriceModel.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookMarketplacePurchasePlanPriceModel decoded =
                GitHubWebhookMarketplacePurchasePlanPriceModel.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookMarketplacePurchasePlanPriceModel.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookMarketplacePurchasePlanPriceModel.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
