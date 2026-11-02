package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Attribution information for the alert.
 *
 * @param actionsLog Delivered source location details for a public monitoring alert.
 * @param commit commit
 * @param commitComment Delivered source location details for a public monitoring alert.
 * @param commitMetadata Delivered source location details for a public monitoring alert.
 * @param committerEmail The email address associated with the secret's author.
 * @param discussionBody discussion_body
 * @param discussionComment discussion_comment
 * @param discussionTitle discussion_title
 * @param gistBlob Delivered source location details for a public monitoring alert.
 * @param issueBody issue_body
 * @param issueComment issue_comment
 * @param issueTitle issue_title
 * @param method The method used to attribute the alert to the enterprise.
 * @param pullRequestBody pull_request_body
 * @param pullRequestComment pull_request_comment
 * @param pullRequestReview pull_request_review
 * @param pullRequestReviewComment pull_request_review_comment
 * @param pullRequestTimelineComment Delivered source location details for a public monitoring alert.
 * @param pullRequestTitle pull_request_title
 * @param secretAuthor secret_author
 * @param wikiCommit wiki_commit
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/secret-scanning-public-monitoring-alert-created/requestBody/properties/alert/properties/attribution")
@Flavors({GitHubWebhookFlavor.GHEC})
public record GitHubWebhookPublicMonitoringAlertWebhookAttribution(
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionActionsLog actionsLog,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionCommit commit,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionActionsLog commitComment,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionActionsLog commitMetadata,
        @Nullable String committerEmail,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionDiscussionBody discussionBody,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionDiscussionComment discussionComment,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionDiscussionTitle discussionTitle,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionActionsLog gistBlob,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionIssueBody issueBody,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionIssueComment issueComment,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionIssueTitle issueTitle,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionMethod method,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestBody pullRequestBody,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestComment pullRequestComment,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestReview pullRequestReview,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestReviewComment pullRequestReviewComment,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionActionsLog pullRequestTimelineComment,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestTitle pullRequestTitle,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionSecretAuthor secretAuthor,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookAttributionWikiCommit wikiCommit) {}
