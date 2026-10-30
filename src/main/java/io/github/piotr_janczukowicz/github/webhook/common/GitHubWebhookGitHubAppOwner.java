package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/** The git hub app owner: one of its members, told apart by the properties it has. */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({@JsonSubTypes.Type(GitHubWebhookSimpleUser.class), @JsonSubTypes.Type(GitHubWebhookEnterprise.class)})
public sealed interface GitHubWebhookGitHubAppOwner permits GitHubWebhookSimpleUser, GitHubWebhookEnterprise {}
