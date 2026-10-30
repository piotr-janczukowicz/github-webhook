package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The marketplace purchase changed previous marketplace purchase payload.
 *
 * @param account account
 * @param billingCycle billing_cycle
 * @param freeTrialEndsOn free_trial_ends_on
 * @param nextBillingDate next_billing_date
 * @param onFreeTrial on_free_trial
 * @param plan plan
 * @param unitCount unit_count
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/marketplace-purchase-changed/requestBody/properties/previous_marketplace_purchase")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookMarketplacePurchaseChangedPreviousMarketplacePurchase(
        GitHubWebhookMarketplacePurchaseAccount account,
        String billingCycle,
        @Nullable String freeTrialEndsOn,
        @Nullable String nextBillingDate,
        @Nullable Boolean onFreeTrial,
        GitHubWebhookMarketplacePurchasePlan plan,
        long unitCount) {
    public GitHubWebhookMarketplacePurchaseChangedPreviousMarketplacePurchase {
        requireNonNull(account, "account");
        requireNonNull(billingCycle, "billingCycle");
        requireNonNull(plan, "plan");
    }
}
