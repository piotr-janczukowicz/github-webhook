package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The sponsorship tier changed changes tier payload.
 *
 * @param from The {@code tier_changed} and {@code pending_tier_change} will include the original tier before the change
 *     or pending change. For more information, see the pending tier change payload.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/sponsorship-pending-tier-change/requestBody/properties/changes/properties/tier")
public record GitHubWebhookSponsorshipTierChangedChangesTier(GitHubWebhookSponsorshipTier from) {
    public GitHubWebhookSponsorshipTierChangedChangesTier {
        requireNonNull(from, "from");
    }
}
