package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookEnterprise;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The personal access token request cancelled event payload.
 *
 * @param enterprise An enterprise on GitHub. Webhook payloads contain the {@code enterprise} property when the webhook
 *     is configured on an enterprise account or an organization that's part of an enterprise account. For more
 *     information, see "[About enterprise accounts](https://docs.github.com/admin/overview/about-enterprise-accounts)."
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param personalAccessTokenRequest Details of a Personal Access Token Request.
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/personal-access-token-request-cancelled/requestBody")
public record GitHubWebhookPersonalAccessTokenRequestCancelledEvent(
        @Nullable GitHubWebhookEnterprise enterprise,
        GitHubWebhookSimpleInstallation installation,
        GitHubWebhookOrganizationSimple organization,
        GitHubWebhookPersonalAccessTokenRequest personalAccessTokenRequest,
        GitHubWebhookSimpleUser sender)
        implements GitHubWebhookPersonalAccessTokenRequestEvent {
    public GitHubWebhookPersonalAccessTokenRequestCancelledEvent {
        requireNonNull(installation, "installation");
        requireNonNull(organization, "organization");
        requireNonNull(personalAccessTokenRequest, "personalAccessTokenRequest");
        requireNonNull(sender, "sender");
    }
}
