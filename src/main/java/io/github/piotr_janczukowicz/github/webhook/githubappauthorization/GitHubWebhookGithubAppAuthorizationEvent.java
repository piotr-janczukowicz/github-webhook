package io.github.piotr_janczukowicz.github.webhook.githubappauthorization;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A github app authorization webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookGithubAppAuthorizationEvent extends GitHubWebhookEvent
        permits GitHubWebhookGithubAppAuthorizationRevokedEvent,
                GitHubWebhookGithubAppAuthorizationUnknownActionEvent {}
