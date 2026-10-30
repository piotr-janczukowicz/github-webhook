package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueActiveLockReason;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookLabel;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestLinks;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestStack;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The pull request review comment edited pull request payload.
 *
 * @param links _links
 * @param activeLockReason active_lock_reason
 * @param assignee assignee
 * @param assignees assignees
 * @param authorAssociation How the author is associated with the repository.
 * @param autoMerge The status of auto merging a pull request.
 * @param base base
 * @param body body
 * @param closedAt closed_at
 * @param commentsUrl comments_url
 * @param commitsUrl commits_url
 * @param createdAt created_at
 * @param diffUrl diff_url
 * @param draft draft
 * @param head head
 * @param htmlUrl html_url
 * @param id id
 * @param issueUrl issue_url
 * @param labels labels
 * @param locked locked
 * @param mergedAt merged_at
 * @param milestone A collection of related issues and pull requests.
 * @param nodeId node_id
 * @param number number
 * @param patchUrl patch_url
 * @param requestedReviewers requested_reviewers
 * @param requestedTeams requested_teams
 * @param reviewCommentUrl review_comment_url
 * @param reviewCommentsUrl review_comments_url
 * @param stack The stack information associated with a pull request.
 * @param state state
 * @param statusesUrl statuses_url
 * @param title title
 * @param updatedAt updated_at
 * @param url url
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-review-comment-edited/requestBody/properties/pull_request")
public record GitHubWebhookPullRequestReviewCommentEditedPullRequest(
        @JsonProperty("_links") GitHubWebhookPullRequestLinks links,
        @Nullable GitHubWebhookIssueActiveLockReason activeLockReason,
        @Nullable GitHubWebhookUser assignee,
        List<GitHubWebhookUser> assignees,
        GitHubWebhookIssueAuthorAssociation authorAssociation,
        @Nullable GitHubWebhookPullRequestAutoMerge autoMerge,
        GitHubWebhookPullRequestReviewCommentEditedPullRequestBase base,
        @Nullable String body,
        @Nullable String closedAt,
        String commentsUrl,
        String commitsUrl,
        String createdAt,
        String diffUrl,
        @Nullable Boolean draft,
        GitHubWebhookPullRequestReviewCommentEditedPullRequestHead head,
        String htmlUrl,
        long id,
        String issueUrl,
        List<GitHubWebhookLabel> labels,
        boolean locked,
        @Nullable String mergedAt,
        @Nullable GitHubWebhookMilestone milestone,
        String nodeId,
        long number,
        String patchUrl,
        List<GitHubWebhookPullRequestReviewCommentEditedPullRequestRequestedReviewer> requestedReviewers,
        List<GitHubWebhookTeam> requestedTeams,
        String reviewCommentUrl,
        String reviewCommentsUrl,
        @Nullable GitHubWebhookPullRequestStack stack,
        GitHubWebhookMilestoneState state,
        String statusesUrl,
        String title,
        String updatedAt,
        String url,
        @Nullable GitHubWebhookMilestoneCreator user) {
    public GitHubWebhookPullRequestReviewCommentEditedPullRequest {
        requireNonNull(links, "links");
        requireNonNull(assignees, "assignees");
        requireNonNull(authorAssociation, "authorAssociation");
        requireNonNull(base, "base");
        requireNonNull(commentsUrl, "commentsUrl");
        requireNonNull(commitsUrl, "commitsUrl");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(diffUrl, "diffUrl");
        requireNonNull(head, "head");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(issueUrl, "issueUrl");
        requireNonNull(labels, "labels");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(patchUrl, "patchUrl");
        requireNonNull(requestedReviewers, "requestedReviewers");
        requireNonNull(requestedTeams, "requestedTeams");
        requireNonNull(reviewCommentUrl, "reviewCommentUrl");
        requireNonNull(reviewCommentsUrl, "reviewCommentsUrl");
        requireNonNull(state, "state");
        requireNonNull(statusesUrl, "statusesUrl");
        requireNonNull(title, "title");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
