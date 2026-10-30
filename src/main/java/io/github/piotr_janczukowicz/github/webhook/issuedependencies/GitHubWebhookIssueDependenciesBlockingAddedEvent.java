package io.github.piotr_janczukowicz.github.webhook.issuedependencies;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssue;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The issue dependencies blocking added event payload.
 *
 * @param blockedIssue Issues are a great way to keep track of tasks, enhancements, and bugs for your projects.
 * @param blockedIssueId The ID of the blocked issue.
 * @param blockedIssueRepo A repository on GitHub.
 * @param blockingIssue Issues are a great way to keep track of tasks, enhancements, and bugs for your projects.
 * @param blockingIssueId The ID of the blocking issue.
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param repository The repository on GitHub where the event occurred. Webhook payloads contain the {@code repository}
 *     property when the event occurs from activity in a repository.
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issue-dependencies-blocking-added/requestBody")
public record GitHubWebhookIssueDependenciesBlockingAddedEvent(
        @Nullable GitHubWebhookIssue blockedIssue,
        @Nullable Double blockedIssueId,
        @Nullable GitHubWebhookRepository blockedIssueRepo,
        @Nullable GitHubWebhookIssue blockingIssue,
        @Nullable Double blockingIssueId,
        @Nullable GitHubWebhookSimpleInstallation installation,
        GitHubWebhookOrganizationSimple organization,
        GitHubWebhookForkRepository repository,
        GitHubWebhookSimpleUser sender)
        implements GitHubWebhookIssueDependenciesEvent {
    public GitHubWebhookIssueDependenciesBlockingAddedEvent {
        requireNonNull(organization, "organization");
        requireNonNull(repository, "repository");
        requireNonNull(sender, "sender");
    }
}
