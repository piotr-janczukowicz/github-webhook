package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/** The pull request review requested event: one of its members, told apart by the properties it has. */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
    @JsonSubTypes.Type(GitHubWebhookPullRequestReviewRequestedRequestedReviewerEvent.class),
    @JsonSubTypes.Type(GitHubWebhookPullRequestReviewRequestedRequestedTeamEvent.class)
})
public sealed interface GitHubWebhookPullRequestReviewRequestedEvent extends GitHubWebhookPullRequestEvent
        permits GitHubWebhookPullRequestReviewRequestedRequestedReviewerEvent,
                GitHubWebhookPullRequestReviewRequestedRequestedTeamEvent {}
