package io.github.piotr_janczukowicz.github.webhook.issues;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueActiveLockReason;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueComment;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueDependenciesSummary;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueFieldValue;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuePullRequest;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueType;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookLabel;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookReactions;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSubIssuesSummary;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
 *
 * @param activeLockReason active_lock_reason
 * @param assignee assignee
 * @param assignees assignees
 * @param authorAssociation How the author is associated with the repository.
 * @param body Contents of the issue
 * @param closedAt closed_at
 * @param comments comments
 * @param commentsUrl comments_url
 * @param createdAt created_at
 * @param draft draft
 * @param eventsUrl events_url
 * @param htmlUrl html_url
 * @param id id
 * @param issueDependenciesSummary issue_dependencies_summary
 * @param issueFieldValues issue_field_values
 * @param labels labels
 * @param labelsUrl labels_url
 * @param locked locked
 * @param milestone A collection of related issues and pull requests.
 * @param nodeId node_id
 * @param number number
 * @param performedViaGithubApp GitHub apps are a new way to extend GitHub. They can be installed directly on
 *     organizations and user accounts and granted access to specific repositories. They come with granular permissions
 *     and built-in webhooks. GitHub apps are first class actors within GitHub.
 * @param pinnedComment pinned_comment
 * @param pullRequest pull_request
 * @param reactions reactions
 * @param repositoryUrl repository_url
 * @param state State of the issue; either 'open' or 'closed'
 * @param stateReason state_reason
 * @param subIssuesSummary sub_issues_summary
 * @param timelineUrl timeline_url
 * @param title Title of the issue
 * @param type The type assigned to the issue. This is only present for issues in repositories where issue types are
 *     supported.
 * @param updatedAt updated_at
 * @param url URL for the issue
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issues-unlocked/requestBody/properties/issue")
public record GitHubWebhookIssuesUnlockedIssue(
        @Nullable GitHubWebhookIssueActiveLockReason activeLockReason,
        @Nullable GitHubWebhookUser assignee,
        List<GitHubWebhookUser> assignees,
        GitHubWebhookIssueAuthorAssociation authorAssociation,
        @Nullable String body,
        @Nullable Instant closedAt,
        long comments,
        String commentsUrl,
        Instant createdAt,
        @Nullable Boolean draft,
        String eventsUrl,
        String htmlUrl,
        long id,
        @Nullable GitHubWebhookIssueDependenciesSummary issueDependenciesSummary,
        @Nullable List<GitHubWebhookIssueFieldValue> issueFieldValues,
        @Nullable List<GitHubWebhookLabel> labels,
        String labelsUrl,
        boolean locked,
        @Nullable GitHubWebhookIssuesLockedIssueMilestone milestone,
        String nodeId,
        long number,
        @Nullable GitHubWebhookIssuesPinnedIssuePerformedViaGithubApp performedViaGithubApp,
        @Nullable GitHubWebhookIssueComment pinnedComment,
        @Nullable GitHubWebhookIssuePullRequest pullRequest,
        GitHubWebhookReactions reactions,
        String repositoryUrl,
        @Nullable GitHubWebhookMilestoneState state,
        @Nullable String stateReason,
        @Nullable GitHubWebhookSubIssuesSummary subIssuesSummary,
        @Nullable String timelineUrl,
        String title,
        @Nullable GitHubWebhookIssueType type,
        Instant updatedAt,
        String url,
        @Nullable GitHubWebhookUser user) {
    public GitHubWebhookIssuesUnlockedIssue {
        requireNonNull(assignees, "assignees");
        requireNonNull(authorAssociation, "authorAssociation");
        requireNonNull(commentsUrl, "commentsUrl");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(eventsUrl, "eventsUrl");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(labelsUrl, "labelsUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(reactions, "reactions");
        requireNonNull(repositoryUrl, "repositoryUrl");
        requireNonNull(title, "title");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
