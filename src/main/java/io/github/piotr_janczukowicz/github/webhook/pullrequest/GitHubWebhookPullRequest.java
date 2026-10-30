package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookAutoMerge;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestBase;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestLabel;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestLinks;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestMilestone;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestStack;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryMergeCommitMessage;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryMergeCommitTitle;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositorySquashMergeCommitMessage;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositorySquashMergeCommitTitle;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamSimple;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The pull request payload.
 *
 * @param links _links
 * @param activeLockReason active_lock_reason
 * @param additions additions
 * @param allowAutoMerge Whether to allow auto-merge for pull requests.
 * @param allowUpdateBranch Whether to allow updating the pull request's branch.
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
 * @param deleteBranchOnMerge Whether to delete head branches when pull requests are merged.
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
 * @param mergeCommitMessage The default value for a merge commit message. - {@code PR_TITLE} - default to the pull
 *     request's title. - {@code PR_BODY} - default to the pull request's body. - {@code BLANK} - default to a blank
 *     commit message.
 * @param mergeCommitTitle The default value for a merge commit title. - {@code PR_TITLE} - default to the pull
 *     request's title. - {@code MERGE_MESSAGE} - default to the classic title for a merge message (e.g., "Merge pull
 *     request #123 from branch-name").
 * @param mergeable mergeable
 * @param mergeableState mergeable_state
 * @param merged merged
 * @param mergedAt merged_at
 * @param mergedBy merged_by
 * @param milestone milestone
 * @param nodeId node_id
 * @param number Number uniquely identifying the pull request within its repository.
 * @param patchUrl patch_url
 * @param rebaseable rebaseable
 * @param requestedReviewers requested_reviewers
 * @param requestedTeams requested_teams
 * @param reviewCommentUrl review_comment_url
 * @param reviewComments review_comments
 * @param reviewCommentsUrl review_comments_url
 * @param squashMergeCommitMessage The default value for a squash merge commit message: - {@code PR_BODY} - default to
 *     the pull request's body. - {@code COMMIT_MESSAGES} - default to the branch's commit messages. - {@code BLANK} -
 *     default to a blank commit message.
 * @param squashMergeCommitTitle The default value for a squash merge commit title: - {@code PR_TITLE} - default to the
 *     pull request's title. - {@code COMMIT_OR_PR_TITLE} - default to the commit's title (if only one commit) or the
 *     pull request's title (when more than one commit).
 * @param stack The stack information associated with a pull request.
 * @param state State of this Pull Request. Either {@code open} or {@code closed}.
 * @param statusesUrl statuses_url
 * @param title The title of the pull request.
 * @param updatedAt updated_at
 * @param url url
 * @param useSquashPrTitleAsDefault Whether a squash merge commit can use the pull request title as default. **This
 *     property is closing down. Please use {@code squash_merge_commit_title} instead.**
 * @param user A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-closed/requestBody/properties/pull_request")
public record GitHubWebhookPullRequest(
        @JsonProperty("_links") GitHubWebhookPullRequestLinks links,
        @Nullable String activeLockReason,
        long additions,
        @Nullable Boolean allowAutoMerge,
        @Nullable Boolean allowUpdateBranch,
        @Nullable List<GitHubWebhookSimpleUser> assignees,
        GitHubWebhookIssueAuthorAssociation authorAssociation,
        @Nullable GitHubWebhookAutoMerge autoMerge,
        GitHubWebhookPullRequestBase base,
        @Nullable String body,
        long changedFiles,
        @Nullable Instant closedAt,
        long comments,
        String commentsUrl,
        long commits,
        String commitsUrl,
        Instant createdAt,
        @Nullable Boolean deleteBranchOnMerge,
        long deletions,
        String diffUrl,
        @Nullable Boolean draft,
        GitHubWebhookPullRequestBase head,
        String htmlUrl,
        long id,
        String issueUrl,
        List<GitHubWebhookPullRequestLabel> labels,
        boolean locked,
        boolean maintainerCanModify,
        @Nullable GitHubWebhookRepositoryMergeCommitMessage mergeCommitMessage,
        @Nullable GitHubWebhookRepositoryMergeCommitTitle mergeCommitTitle,
        @Nullable Boolean mergeable,
        String mergeableState,
        boolean merged,
        @Nullable Instant mergedAt,
        @Nullable GitHubWebhookSimpleUser mergedBy,
        @Nullable GitHubWebhookPullRequestMilestone milestone,
        String nodeId,
        long number,
        String patchUrl,
        @Nullable Boolean rebaseable,
        @Nullable List<GitHubWebhookSimpleUser> requestedReviewers,
        @Nullable List<GitHubWebhookTeamSimple> requestedTeams,
        String reviewCommentUrl,
        long reviewComments,
        String reviewCommentsUrl,
        @Nullable GitHubWebhookRepositorySquashMergeCommitMessage squashMergeCommitMessage,
        @Nullable GitHubWebhookRepositorySquashMergeCommitTitle squashMergeCommitTitle,
        @Nullable GitHubWebhookPullRequestStack stack,
        GitHubWebhookMilestoneState state,
        String statusesUrl,
        String title,
        Instant updatedAt,
        String url,
        @Nullable Boolean useSquashPrTitleAsDefault,
        GitHubWebhookSimpleUser user) {
    public GitHubWebhookPullRequest {
        requireNonNull(links, "links");
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
        requireNonNull(mergeableState, "mergeableState");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(patchUrl, "patchUrl");
        requireNonNull(reviewCommentUrl, "reviewCommentUrl");
        requireNonNull(reviewCommentsUrl, "reviewCommentsUrl");
        requireNonNull(state, "state");
        requireNonNull(statusesUrl, "statusesUrl");
        requireNonNull(title, "title");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
        requireNonNull(user, "user");
    }
}
