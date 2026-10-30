package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The {@code tier_changed} and {@code pending_tier_change} will include the original tier before the change or pending
 * change. For more information, see the pending tier change payload.
 *
 * @param createdAt created_at
 * @param description description
 * @param isCustomAmmount is_custom_ammount
 * @param isCustomAmount is_custom_amount
 * @param isOneTime is_one_time
 * @param monthlyPriceInCents monthly_price_in_cents
 * @param monthlyPriceInDollars monthly_price_in_dollars
 * @param name name
 * @param nodeId node_id
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/sponsorship-cancelled/requestBody/properties/sponsorship/properties/tier")
public record GitHubWebhookSponsorshipTier(
        String createdAt,
        String description,
        @Nullable Boolean isCustomAmmount,
        @Nullable Boolean isCustomAmount,
        boolean isOneTime,
        long monthlyPriceInCents,
        long monthlyPriceInDollars,
        String name,
        String nodeId) {
    public GitHubWebhookSponsorshipTier {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(description, "description");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
    }
}
