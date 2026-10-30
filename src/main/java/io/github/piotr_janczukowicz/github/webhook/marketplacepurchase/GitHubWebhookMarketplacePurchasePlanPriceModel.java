package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The marketplace purchase plan price model. */
@CatalogSchema(
        "webhooks/marketplace-purchase-cancelled/requestBody/properties/marketplace_purchase/properties/plan/properties/price_model")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public enum GitHubWebhookMarketplacePurchasePlanPriceModel {
    FREE("FREE"),
    FLAT_RATE("FLAT_RATE"),
    PER_UNIT("PER_UNIT"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookMarketplacePurchasePlanPriceModel> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookMarketplacePurchasePlanPriceModel.class,
                    GitHubWebhookMarketplacePurchasePlanPriceModel::wireValue);

    private final String wireValue;

    GitHubWebhookMarketplacePurchasePlanPriceModel(final String wireValue) {
        this.wireValue = wireValue;
    }

    /**
     * Value GitHub sends in JSON.
     *
     * @return wire string
     */
    @JsonValue
    public String wireValue() {
        return wireValue;
    }

    /**
     * The marketplace purchase plan price model from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookMarketplacePurchasePlanPriceModel fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
