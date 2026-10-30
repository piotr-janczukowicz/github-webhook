package io.github.piotr_janczukowicz.github.webhook.issuerelatesto;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssue;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The issue relates to relates to added event payload.
 *
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param issue Issues are a great way to keep track of tasks, enhancements, and bugs for your projects.
 * @param issueId The ID of the issue the relationship was added to.
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param relatedIssue Issues are a great way to keep track of tasks, enhancements, and bugs for your projects.
 * @param relatedIssueId The ID of the related issue. Only present when both issues belong to the same repository.
 * @param repository The repository on GitHub where the event occurred. Webhook payloads contain the {@code repository}
 *     property when the event occurs from activity in a repository.
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issue-relates-to-added/requestBody")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookIssueRelatesToRelatesToAddedEvent(
        @Nullable GitHubWebhookSimpleInstallation installation,
        @Nullable GitHubWebhookIssue issue,
        @Nullable Double issueId,
        GitHubWebhookOrganizationSimple organization,
        @Nullable GitHubWebhookIssue relatedIssue,
        @Nullable Double relatedIssueId,
        GitHubWebhookForkRepository repository,
        GitHubWebhookSimpleUser sender)
        implements GitHubWebhookIssueRelatesToEvent {
    public GitHubWebhookIssueRelatesToRelatesToAddedEvent {
        requireNonNull(organization, "organization");
        requireNonNull(repository, "repository");
        requireNonNull(sender, "sender");
    }
}
