package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/** The pull request locked pull request requested reviewer: one of its members, told apart by the properties it has. */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
    @JsonSubTypes.Type(GitHubWebhookMilestoneCreator.class),
    @JsonSubTypes.Type(GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeam.class)
})
public sealed interface GitHubWebhookPullRequestLockedPullRequestRequestedReviewer
        permits GitHubWebhookMilestoneCreator, GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeam {}
