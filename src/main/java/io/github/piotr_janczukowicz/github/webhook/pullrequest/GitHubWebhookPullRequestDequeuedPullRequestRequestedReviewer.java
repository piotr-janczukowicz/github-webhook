package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * The pull request dequeued pull request requested reviewer: one of its members, told apart by the properties it has.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({@JsonSubTypes.Type(GitHubWebhookUser.class), @JsonSubTypes.Type(GitHubWebhookTeam.class)})
public sealed interface GitHubWebhookPullRequestDequeuedPullRequestRequestedReviewer
        permits GitHubWebhookUser, GitHubWebhookTeam {}
