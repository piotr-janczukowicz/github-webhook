package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The marketplace purchase plan payload.
 *
 * @param bullets bullets
 * @param description description
 * @param hasFreeTrial has_free_trial
 * @param id id
 * @param monthlyPriceInCents monthly_price_in_cents
 * @param name name
 * @param priceModel price_model
 * @param unitName unit_name
 * @param yearlyPriceInCents yearly_price_in_cents
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/marketplace-purchase-cancelled/requestBody/properties/marketplace_purchase/properties/plan")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookMarketplacePurchasePlan(
        List<String> bullets,
        String description,
        boolean hasFreeTrial,
        long id,
        long monthlyPriceInCents,
        String name,
        GitHubWebhookMarketplacePurchasePlanPriceModel priceModel,
        @Nullable String unitName,
        long yearlyPriceInCents) {
    public GitHubWebhookMarketplacePurchasePlan {
        requireNonNull(bullets, "bullets");
        requireNonNull(description, "description");
        requireNonNull(name, "name");
        requireNonNull(priceModel, "priceModel");
    }
}
