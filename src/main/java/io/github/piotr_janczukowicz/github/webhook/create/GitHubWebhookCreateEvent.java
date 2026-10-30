package io.github.piotr_janczukowicz.github.webhook.create;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCreateRefType;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookEnterprise;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The create event payload.
 *
 * @param description The repository's current description.
 * @param enterprise An enterprise on GitHub. Webhook payloads contain the {@code enterprise} property when the webhook
 *     is configured on an enterprise account or an organization that's part of an enterprise account. For more
 *     information, see "[About enterprise accounts](https://docs.github.com/admin/overview/about-enterprise-accounts)."
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param masterBranch The name of the repository's default branch (usually {@code main}).
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param pusherType The pusher type for the event. Can be either {@code user} or a deploy key.
 * @param ref The [{@code git ref}](https://docs.github.com/rest/git/refs#get-a-reference) resource.
 * @param refType The type of Git ref object created in the repository.
 * @param repository The repository on GitHub where the event occurred. Webhook payloads contain the {@code repository}
 *     property when the event occurs from activity in a repository.
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/create/requestBody")
public record GitHubWebhookCreateEvent(
        @Nullable String description,
        @Nullable GitHubWebhookEnterprise enterprise,
        @Nullable GitHubWebhookSimpleInstallation installation,
        String masterBranch,
        @Nullable GitHubWebhookOrganizationSimple organization,
        String pusherType,
        String ref,
        GitHubWebhookCreateRefType refType,
        GitHubWebhookForkRepository repository,
        GitHubWebhookSimpleUser sender)
        implements GitHubWebhookEvent {
    public GitHubWebhookCreateEvent {
        requireNonNull(masterBranch, "masterBranch");
        requireNonNull(pusherType, "pusherType");
        requireNonNull(ref, "ref");
        requireNonNull(refType, "refType");
        requireNonNull(repository, "repository");
        requireNonNull(sender, "sender");
    }
}
