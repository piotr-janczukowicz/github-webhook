package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * Issues are a great way to keep track of tasks, enhancements, and bugs for your projects.
 *
 * @param activeLockReason active_lock_reason
 * @param assignees assignees
 * @param authorAssociation How the author is associated with the repository.
 * @param body Contents of the issue
 * @param bodyHtml body_html
 * @param bodyText body_text
 * @param closedAt closed_at
 * @param closedBy closed_by
 * @param comments comments
 * @param commentsUrl comments_url
 * @param createdAt created_at
 * @param draft draft
 * @param eventsUrl events_url
 * @param htmlUrl html_url
 * @param id id
 * @param issueDependenciesSummary issue_dependencies_summary
 * @param issueFieldValues issue_field_values
 * @param labels Labels to associate with this issue; pass one or more label names to replace the set of labels on this
 *     issue; send an empty array to clear all labels from the issue; note that the labels are silently dropped for
 *     users without push access to the repository
 * @param labelsUrl labels_url
 * @param locked locked
 * @param milestone milestone
 * @param nodeId node_id
 * @param number Number uniquely identifying the issue within its repository
 * @param parentIssueUrl URL to get the parent issue of this issue, if it is a sub-issue
 * @param performedViaGithubApp performed_via_github_app
 * @param pinnedComment pinned_comment
 * @param pullRequest pull_request
 * @param reactions reactions
 * @param repository A repository on GitHub.
 * @param repositoryUrl repository_url
 * @param state State of the issue; either 'open' or 'closed'
 * @param stateReason The reason for the current state
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
@CatalogSchema("webhooks/issue-dependencies-blocked-by-added/requestBody/properties/blocked_issue")
public record GitHubWebhookIssue(
        @Nullable String activeLockReason,
        @Nullable List<GitHubWebhookSimpleUser> assignees,
        @Nullable GitHubWebhookIssueAuthorAssociation authorAssociation,
        @Nullable String body,
        @Nullable String bodyHtml,
        @Nullable String bodyText,
        @Nullable Instant closedAt,
        @Nullable GitHubWebhookSimpleUser closedBy,
        long comments,
        String commentsUrl,
        Instant createdAt,
        @Nullable Boolean draft,
        String eventsUrl,
        String htmlUrl,
        long id,
        @Nullable GitHubWebhookIssueDependenciesSummary issueDependenciesSummary,
        @Nullable List<GitHubWebhookIssueFieldValue> issueFieldValues,

        @SuppressSchemaTypeMismatch("a bare string is read as the object with only its name")
        List<GitHubWebhookIssueLabel> labels,

        String labelsUrl,
        boolean locked,
        @Nullable GitHubWebhookPullRequestMilestone milestone,
        String nodeId,
        long number,
        @Nullable String parentIssueUrl,
        @Nullable GitHubWebhookGitHubApp performedViaGithubApp,
        @Nullable GitHubWebhookIssueComment pinnedComment,
        @Nullable GitHubWebhookIssuePullRequest pullRequest,
        @Nullable GitHubWebhookReactions reactions,
        @Nullable GitHubWebhookRepository repository,
        String repositoryUrl,
        String state,
        @Nullable GitHubWebhookIssueStateReason stateReason,
        @Nullable GitHubWebhookSubIssuesSummary subIssuesSummary,
        @Nullable String timelineUrl,
        String title,
        @Nullable GitHubWebhookIssueType type,
        Instant updatedAt,
        String url,
        @Nullable GitHubWebhookSimpleUser user) {
    public GitHubWebhookIssue {
        requireNonNull(commentsUrl, "commentsUrl");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(eventsUrl, "eventsUrl");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(labels, "labels");
        requireNonNull(labelsUrl, "labelsUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(repositoryUrl, "repositoryUrl");
        requireNonNull(state, "state");
        requireNonNull(title, "title");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
