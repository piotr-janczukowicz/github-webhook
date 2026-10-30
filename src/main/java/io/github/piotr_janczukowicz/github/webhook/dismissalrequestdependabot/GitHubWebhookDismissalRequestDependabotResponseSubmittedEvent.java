package io.github.piotr_janczukowicz.github.webhook.dismissalrequestdependabot;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookEnterprise;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookExemptionRequest;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookExemptionResponse;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The dismissal request dependabot response submitted event payload.
 *
 * @param enterprise An enterprise on GitHub. Webhook payloads contain the {@code enterprise} property when the webhook
 *     is configured on an enterprise account or an organization that's part of an enterprise account. For more
 *     information, see "[About enterprise
 *     accounts](https://docs.github.com/enterprise-cloud@latest/admin/overview/about-enterprise-accounts)."
 * @param exemptionRequest A request from a user to be exempted from a set of rules.
 * @param exemptionResponse A response to an exemption request by a delegated bypasser.
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/enterprise-cloud@latest/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param repository The repository on GitHub where the event occurred. Webhook payloads contain the {@code repository}
 *     property when the event occurs from activity in a repository.
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/dismissal-request-dependabot-response-submitted/requestBody")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public record GitHubWebhookDismissalRequestDependabotResponseSubmittedEvent(
        @Nullable GitHubWebhookEnterprise enterprise,
        GitHubWebhookExemptionRequest exemptionRequest,
        GitHubWebhookExemptionResponse exemptionResponse,
        @Nullable GitHubWebhookSimpleInstallation installation,
        @Nullable GitHubWebhookOrganizationSimple organization,
        @Nullable GitHubWebhookForkRepository repository,
        GitHubWebhookSimpleUser sender)
        implements GitHubWebhookDismissalRequestDependabotEvent {
    public GitHubWebhookDismissalRequestDependabotResponseSubmittedEvent {
        requireNonNull(exemptionRequest, "exemptionRequest");
        requireNonNull(exemptionResponse, "exemptionResponse");
        requireNonNull(sender, "sender");
    }
}
