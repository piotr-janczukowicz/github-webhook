package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * The secret scanning alert location created location details: one of its members, told apart by the properties it has.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
    @JsonSubTypes.Type(GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrl.class),
    @JsonSubTypes.Type(GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrl.class),
    @JsonSubTypes.Type(GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueTitleUrl.class),
    @JsonSubTypes.Type(GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueBodyUrl.class),
    @JsonSubTypes.Type(GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueCommentUrl.class),
    @JsonSubTypes.Type(GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionTitleUrl.class),
    @JsonSubTypes.Type(GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionBodyUrl.class),
    @JsonSubTypes.Type(GitHubWebhookCreatedLocationDetailsDiscussionCommentUrl.class),
    @JsonSubTypes.Type(GitHubWebhookCreatedLocationDetailsPullRequestTitleUrl.class),
    @JsonSubTypes.Type(GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPullRequestBodyUrl.class),
    @JsonSubTypes.Type(GitHubWebhookCreatedLocationDetailsPullRequestCommentUrl.class),
    @JsonSubTypes.Type(GitHubWebhookCreatedLocationDetailsPullRequestReviewUrl.class),
    @JsonSubTypes.Type(GitHubWebhookCreatedLocationDetailsPullRequestReviewCommentUrl.class)
})
public sealed interface GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails
        permits GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrl,
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrl,
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueTitleUrl,
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueBodyUrl,
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueCommentUrl,
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionTitleUrl,
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionBodyUrl,
                GitHubWebhookCreatedLocationDetailsDiscussionCommentUrl,
                GitHubWebhookCreatedLocationDetailsPullRequestTitleUrl,
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPullRequestBodyUrl,
                GitHubWebhookCreatedLocationDetailsPullRequestCommentUrl,
                GitHubWebhookCreatedLocationDetailsPullRequestReviewUrl,
                GitHubWebhookCreatedLocationDetailsPullRequestReviewCommentUrl {}
