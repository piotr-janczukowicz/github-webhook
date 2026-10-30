package io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookEnterprise;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The organization custom property created event payload.
 *
 * @param definition Custom property defined for an organization
 * @param enterprise An enterprise on GitHub. Webhook payloads contain the {@code enterprise} property when the webhook
 *     is configured on an enterprise account or an organization that's part of an enterprise account. For more
 *     information, see "[About enterprise
 *     accounts](https://docs.github.com/enterprise-cloud@latest/admin/overview/about-enterprise-accounts)."
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/organization-custom-property-created/requestBody")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public record GitHubWebhookOrganizationCustomPropertyCreatedEvent(
        GitHubWebhookCustomPropertyForOrganization definition,
        GitHubWebhookEnterprise enterprise,
        @Nullable GitHubWebhookSimpleUser sender)
        implements GitHubWebhookOrganizationCustomPropertyEvent {
    public GitHubWebhookOrganizationCustomPropertyCreatedEvent {
        requireNonNull(definition, "definition");
        requireNonNull(enterprise, "enterprise");
    }
}
