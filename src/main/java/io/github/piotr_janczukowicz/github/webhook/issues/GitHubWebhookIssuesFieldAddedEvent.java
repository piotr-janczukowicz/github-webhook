package io.github.piotr_janczukowicz.github.webhook.issues;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookEnterprise;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The issues field added event payload.
 *
 * @param changes The previous field value, present when an existing value was updated.
 * @param enterprise An enterprise on GitHub. Webhook payloads contain the {@code enterprise} property when the webhook
 *     is configured on an enterprise account or an organization that's part of an enterprise account. For more
 *     information, see "[About enterprise accounts](https://docs.github.com/admin/overview/about-enterprise-accounts)."
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param issue The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
 * @param issueField The issue field whose value was set or updated on the issue.
 * @param issueFieldValue The value that was set or updated for the issue field. When updating an existing value, the
 *     previous value is available in {@code changes}.
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param repository The repository on GitHub where the event occurred. Webhook payloads contain the {@code repository}
 *     property when the event occurs from activity in a repository.
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issues-field-added/requestBody")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookIssuesFieldAddedEvent(
        @Nullable GitHubWebhookIssuesFieldAddedChanges changes,
        @Nullable GitHubWebhookEnterprise enterprise,
        @Nullable GitHubWebhookSimpleInstallation installation,
        GitHubWebhookIssue issue,
        GitHubWebhookIssuesFieldAddedIssueField issueField,
        @Nullable GitHubWebhookIssuesFieldAddedIssueFieldValue issueFieldValue,
        @Nullable GitHubWebhookOrganizationSimple organization,
        GitHubWebhookForkRepository repository,
        GitHubWebhookSimpleUser sender)
        implements GitHubWebhookIssuesEvent {
    public GitHubWebhookIssuesFieldAddedEvent {
        requireNonNull(issue, "issue");
        requireNonNull(issueField, "issueField");
        requireNonNull(repository, "repository");
        requireNonNull(sender, "sender");
    }
}
