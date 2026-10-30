package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The projects v2 item edited event payload.
 *
 * @param changes The changes made to the item may involve modifications in the item's fields and draft issue body. It
 *     includes altered values for text, number, date, single select, and iteration fields, along with the GraphQL node
 *     ID of the changed field.
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param projectsV2Item An item belonging to a project
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-item-edited/requestBody")
public record GitHubWebhookProjectsV2ItemEditedEvent(
        @Nullable GitHubWebhookProjectsV2ItemEditedChanges changes,
        @Nullable GitHubWebhookSimpleInstallation installation,
        GitHubWebhookOrganizationSimple organization,
        GitHubWebhookProjectsV2Item projectsV2Item,
        GitHubWebhookSimpleUser sender)
        implements GitHubWebhookProjectsV2ItemEvent {
    public GitHubWebhookProjectsV2ItemEditedEvent {
        requireNonNull(organization, "organization");
        requireNonNull(projectsV2Item, "projectsV2Item");
        requireNonNull(sender, "sender");
    }
}
