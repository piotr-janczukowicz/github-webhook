package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/** The pull request review request removed event: one of its members, told apart by the properties it has. */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
    @JsonSubTypes.Type(GitHubWebhookPullRequestReviewRequestRemovedRequestedReviewerEvent.class),
    @JsonSubTypes.Type(GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamEvent.class)
})
public sealed interface GitHubWebhookPullRequestReviewRequestRemovedEvent extends GitHubWebhookPullRequestEvent
        permits GitHubWebhookPullRequestReviewRequestRemovedRequestedReviewerEvent,
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamEvent {}
