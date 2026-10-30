package io.github.piotr_janczukowicz.github.webhook.organizationcustompropertyvalues;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCustomPropertyValue;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookEnterprise;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The organization custom property values updated event payload.
 *
 * @param enterprise An enterprise on GitHub. Webhook payloads contain the {@code enterprise} property when the webhook
 *     is configured on an enterprise account or an organization that's part of an enterprise account. For more
 *     information, see "[About enterprise
 *     accounts](https://docs.github.com/enterprise-cloud@latest/admin/overview/about-enterprise-accounts)."
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/enterprise-cloud@latest/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param newPropertyValues The new custom property values.
 * @param oldPropertyValues The old custom property values.
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/organization-custom-property-values-updated/requestBody")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public record GitHubWebhookOrganizationCustomPropertyValuesUpdatedEvent(
        GitHubWebhookEnterprise enterprise,
        @Nullable GitHubWebhookSimpleInstallation installation,
        List<GitHubWebhookCustomPropertyValue> newPropertyValues,
        List<GitHubWebhookCustomPropertyValue> oldPropertyValues,
        GitHubWebhookOrganizationSimple organization,
        @Nullable GitHubWebhookSimpleUser sender)
        implements GitHubWebhookOrganizationCustomPropertyValuesEvent {
    public GitHubWebhookOrganizationCustomPropertyValuesUpdatedEvent {
        requireNonNull(enterprise, "enterprise");
        requireNonNull(newPropertyValues, "newPropertyValues");
        requireNonNull(oldPropertyValues, "oldPropertyValues");
        requireNonNull(organization, "organization");
    }
}
