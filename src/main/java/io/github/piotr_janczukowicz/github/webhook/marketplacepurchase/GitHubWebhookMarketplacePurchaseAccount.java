package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The marketplace purchase account payload.
 *
 * @param id id
 * @param login login
 * @param nodeId node_id
 * @param organizationBillingEmail organization_billing_email
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/marketplace-purchase-cancelled/requestBody/properties/marketplace_purchase/properties/account")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookMarketplacePurchaseAccount(
        long id, String login, String nodeId, @Nullable String organizationBillingEmail, String type) {
    public GitHubWebhookMarketplacePurchaseAccount {
        requireNonNull(login, "login");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(type, "type");
    }
}
