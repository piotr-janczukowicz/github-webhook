package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The sponsorship tier changed changes payload.
 *
 * @param tier tier
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/sponsorship-pending-tier-change/requestBody/properties/changes")
public record GitHubWebhookSponsorshipTierChangedChanges(GitHubWebhookSponsorshipTierChangedChangesTier tier) {
    public GitHubWebhookSponsorshipTierChangedChanges {
        requireNonNull(tier, "tier");
    }
}
