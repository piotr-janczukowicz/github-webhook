package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueActiveLockReason;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedIssueAssignee;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookLabel;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestLinks;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestStack;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The pull request unassigned pull request payload.
 *
 * @param links _links
 * @param activeLockReason active_lock_reason
 * @param additions additions
 * @param assignee assignee
 * @param assignees assignees
 * @param authorAssociation How the author is associated with the repository.
 * @param autoMerge The status of auto merging a pull request.
 * @param base base
 * @param body body
 * @param changedFiles changed_files
 * @param closedAt closed_at
 * @param comments comments
 * @param commentsUrl comments_url
 * @param commits commits
 * @param commitsUrl commits_url
 * @param createdAt created_at
 * @param deletions deletions
 * @param diffUrl diff_url
 * @param draft Indicates whether or not the pull request is a draft.
 * @param head head
 * @param htmlUrl html_url
 * @param id id
 * @param issueUrl issue_url
 * @param labels labels
 * @param locked locked
 * @param maintainerCanModify Indicates whether maintainers can modify the pull request.
 * @param mergeable mergeable
 * @param mergeableState mergeable_state
 * @param merged merged
 * @param mergedAt merged_at
 * @param mergedBy merged_by
 * @param milestone A collection of related issues and pull requests.
 * @param nodeId node_id
 * @param number Number uniquely identifying the pull request within its repository.
 * @param patchUrl patch_url
 * @param rebaseable rebaseable
 * @param requestedReviewers requested_reviewers
 * @param requestedTeams requested_teams
 * @param reviewCommentUrl review_comment_url
 * @param reviewComments review_comments
 * @param reviewCommentsUrl review_comments_url
 * @param stack The stack information associated with a pull request.
 * @param state State of this Pull Request. Either {@code open} or {@code closed}.
 * @param statusesUrl statuses_url
 * @param title The title of the pull request.
 * @param updatedAt updated_at
 * @param url url
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-unassigned/requestBody/properties/pull_request")
public record GitHubWebhookPullRequestUnassignedPullRequest(
        @JsonProperty("_links") GitHubWebhookPullRequestLinks links,
        @Nullable GitHubWebhookIssueActiveLockReason activeLockReason,
        @Nullable Long additions,
        @Nullable GitHubWebhookMilestoneCreator assignee,
        List<GitHubWebhookIssuesEditedIssueAssignee> assignees,
        GitHubWebhookIssueAuthorAssociation authorAssociation,
        @Nullable GitHubWebhookPullRequestAutoMerge autoMerge,
        GitHubWebhookPullRequestUnassignedPullRequestBase base,
        @Nullable String body,
        @Nullable Long changedFiles,
        @Nullable Instant closedAt,
        @Nullable Long comments,
        String commentsUrl,
        @Nullable Long commits,
        String commitsUrl,
        Instant createdAt,
        @Nullable Long deletions,
        String diffUrl,
        boolean draft,
        GitHubWebhookPullRequestLockedPullRequestHead head,
        String htmlUrl,
        long id,
        String issueUrl,
        List<GitHubWebhookLabel> labels,
        boolean locked,
        @Nullable Boolean maintainerCanModify,
        @Nullable Boolean mergeable,
        @Nullable String mergeableState,
        @Nullable Boolean merged,
        @Nullable Instant mergedAt,
        @Nullable GitHubWebhookMilestoneCreator mergedBy,
        @Nullable GitHubWebhookMilestone milestone,
        String nodeId,
        long number,
        String patchUrl,
        @Nullable Boolean rebaseable,
        List<GitHubWebhookPullRequestLockedPullRequestRequestedReviewer> requestedReviewers,
        List<GitHubWebhookTeam> requestedTeams,
        String reviewCommentUrl,
        @Nullable Long reviewComments,
        String reviewCommentsUrl,
        @Nullable GitHubWebhookPullRequestStack stack,
        GitHubWebhookMilestoneState state,
        String statusesUrl,
        String title,
        Instant updatedAt,
        String url,
        @Nullable GitHubWebhookMilestoneCreator user) {
    public GitHubWebhookPullRequestUnassignedPullRequest {
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
