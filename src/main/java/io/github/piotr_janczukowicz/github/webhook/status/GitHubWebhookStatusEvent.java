package io.github.piotr_janczukowicz.github.webhook.status;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookEnterprise;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The status event payload.
 *
 * @param avatarUrl avatar_url
 * @param branches An array of branch objects containing the status' SHA. Each branch contains the given SHA, but the
 *     SHA may or may not be the head of the branch. The array includes a maximum of 10 branches.
 * @param commit commit
 * @param context context
 * @param createdAt created_at
 * @param description The optional human-readable description added to the status.
 * @param enterprise An enterprise on GitHub. Webhook payloads contain the {@code enterprise} property when the webhook
 *     is configured on an enterprise account or an organization that's part of an enterprise account. For more
 *     information, see "[About enterprise accounts](https://docs.github.com/admin/overview/about-enterprise-accounts)."
 * @param id The unique identifier of the status.
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param name name
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param repository The repository on GitHub where the event occurred. Webhook payloads contain the {@code repository}
 *     property when the event occurs from activity in a repository.
 * @param sender A GitHub user.
 * @param sha The Commit SHA.
 * @param state The new state. Can be {@code pending}, {@code success}, {@code failure}, or {@code error}.
 * @param targetUrl The optional link added to the status.
 * @param updatedAt updated_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/status/requestBody")
public record GitHubWebhookStatusEvent(
        @Nullable String avatarUrl,
        List<GitHubWebhookStatusBranch> branches,
        GitHubWebhookStatusCommit commit,
        String context,
        String createdAt,
        @Nullable String description,
        @Nullable GitHubWebhookEnterprise enterprise,
        long id,
        @Nullable GitHubWebhookSimpleInstallation installation,
        String name,
        @Nullable GitHubWebhookOrganizationSimple organization,
        GitHubWebhookForkRepository repository,
        GitHubWebhookSimpleUser sender,
        String sha,
        GitHubWebhookStatusState state,
        @Nullable String targetUrl,
        String updatedAt)
        implements GitHubWebhookEvent {
    public GitHubWebhookStatusEvent {
        requireNonNull(branches, "branches");
        requireNonNull(commit, "commit");
        requireNonNull(context, "context");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(name, "name");
        requireNonNull(repository, "repository");
        requireNonNull(sender, "sender");
        requireNonNull(sha, "sha");
        requireNonNull(state, "state");
        requireNonNull(updatedAt, "updatedAt");
    }
}
