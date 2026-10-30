package io.github.piotr_janczukowicz.github.webhook.subissues;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssue;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The sub issues sub issue removed event payload.
 *
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param parentIssue Issues are a great way to keep track of tasks, enhancements, and bugs for your projects.
 * @param parentIssueId The ID of the parent issue.
 * @param repository The repository on GitHub where the event occurred. Webhook payloads contain the {@code repository}
 *     property when the event occurs from activity in a repository.
 * @param sender A GitHub user.
 * @param subIssue Issues are a great way to keep track of tasks, enhancements, and bugs for your projects.
 * @param subIssueId The ID of the sub-issue.
 * @param subIssueRepo A repository on GitHub.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/sub-issues-sub-issue-removed/requestBody")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookSubIssuesSubIssueRemovedEvent(
        @Nullable GitHubWebhookSimpleInstallation installation,
        @Nullable GitHubWebhookOrganizationSimple organization,
        GitHubWebhookIssue parentIssue,
        double parentIssueId,
        GitHubWebhookForkRepository repository,
        GitHubWebhookSimpleUser sender,
        @Nullable GitHubWebhookIssue subIssue,
        @Nullable Double subIssueId,
        @Nullable GitHubWebhookRepository subIssueRepo)
        implements GitHubWebhookSubIssuesEvent {
    public GitHubWebhookSubIssuesSubIssueRemovedEvent {
        requireNonNull(parentIssue, "parentIssue");
        requireNonNull(repository, "repository");
        requireNonNull(sender, "sender");
    }
}
