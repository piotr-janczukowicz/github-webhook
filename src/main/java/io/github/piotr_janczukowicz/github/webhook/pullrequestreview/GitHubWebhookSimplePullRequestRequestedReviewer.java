package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/** The simple pull request requested reviewer: one of its members, told apart by the properties it has. */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({@JsonSubTypes.Type(GitHubWebhookUser.class), @JsonSubTypes.Type(GitHubWebhookTeam.class)})
public sealed interface GitHubWebhookSimplePullRequestRequestedReviewer permits GitHubWebhookUser, GitHubWebhookTeam {}
