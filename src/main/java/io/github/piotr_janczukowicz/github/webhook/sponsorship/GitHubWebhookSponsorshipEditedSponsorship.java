package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDeploymentReviewApprovedApprover;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The sponsorship edited sponsorship payload.
 *
 * @param createdAt created_at
 * @param maintainer maintainer
 * @param nodeId node_id
 * @param privacyLevel privacy_level
 * @param sponsor sponsor
 * @param sponsorable sponsorable
 * @param tier The {@code tier_changed} and {@code pending_tier_change} will include the original tier before the change
 *     or pending change. For more information, see the pending tier change payload.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/sponsorship-cancelled/requestBody/properties/sponsorship")
public record GitHubWebhookSponsorshipEditedSponsorship(
        String createdAt,
        @Nullable GitHubWebhookDeploymentReviewApprovedApprover maintainer,
        String nodeId,
        String privacyLevel,
        @Nullable GitHubWebhookUser sponsor,
        @Nullable GitHubWebhookUser sponsorable,
        GitHubWebhookSponsorshipTier tier) {
    public GitHubWebhookSponsorshipEditedSponsorship {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(privacyLevel, "privacyLevel");
        requireNonNull(tier, "tier");
    }
}
