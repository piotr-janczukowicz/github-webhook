package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookEnterprise;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueCommentEditedChanges;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The pull request review comment edited event payload.
 *
 * @param changes The changes to the comment.
 * @param comment The [comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request)
 *     itself.
 * @param enterprise An enterprise on GitHub. Webhook payloads contain the {@code enterprise} property when the webhook
 *     is configured on an enterprise account or an organization that's part of an enterprise account. For more
 *     information, see "[About enterprise accounts](https://docs.github.com/admin/overview/about-enterprise-accounts)."
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param pullRequest pull_request
 * @param repository The repository on GitHub where the event occurred. Webhook payloads contain the {@code repository}
 *     property when the event occurs from activity in a repository.
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-review-comment-edited/requestBody")
public record GitHubWebhookPullRequestReviewCommentEditedEvent(
        GitHubWebhookIssueCommentEditedChanges changes,
        GitHubWebhookPullRequestReviewComment comment,
        @Nullable GitHubWebhookEnterprise enterprise,
        @Nullable GitHubWebhookSimpleInstallation installation,
        @Nullable GitHubWebhookOrganizationSimple organization,
        GitHubWebhookPullRequestReviewCommentEditedPullRequest pullRequest,
        GitHubWebhookForkRepository repository,
        GitHubWebhookSimpleUser sender)
        implements GitHubWebhookPullRequestReviewCommentEvent {
    public GitHubWebhookPullRequestReviewCommentEditedEvent {
        requireNonNull(changes, "changes");
        requireNonNull(comment, "comment");
        requireNonNull(pullRequest, "pullRequest");
        requireNonNull(repository, "repository");
        requireNonNull(sender, "sender");
    }
}
