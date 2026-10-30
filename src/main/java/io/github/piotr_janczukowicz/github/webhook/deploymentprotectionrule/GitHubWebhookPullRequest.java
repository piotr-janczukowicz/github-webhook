package io.github.piotr_janczukowicz.github.webhook.deploymentprotectionrule;

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
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamSimple;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * Pull requests let you tell others about changes you've pushed to a repository on GitHub. Once a pull request is sent,
 * interested parties can review the set of changes, discuss potential modifications, and even push follow-up commits if
 * necessary.
 *
 * @param links _links
 * @param activeLockReason active_lock_reason
 * @param additions additions
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
 * @param stack The stack information associated with a pull request.
 * @param state State of this Pull Request. Either {@code open} or {@code closed}.
 * @param statusesUrl statuses_url
 * @param title The title of the pull request.
 * @param updatedAt updated_at
 * @param url url
 * @param user A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-protection-rule-requested/requestBody/properties/pull_requests/items")
public record GitHubWebhookPullRequest(
        @JsonProperty("_links") GitHubWebhookPullRequestLinks links,
        @Nullable String activeLockReason,
        long additions,
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
        @Nullable GitHubWebhookPullRequestStack stack,
        GitHubWebhookMilestoneState state,
        String statusesUrl,
        String title,
        Instant updatedAt,
        String url,
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
