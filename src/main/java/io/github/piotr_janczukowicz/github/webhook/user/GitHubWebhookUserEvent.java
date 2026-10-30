package io.github.piotr_janczukowicz.github.webhook.user;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A user webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookUserEvent extends GitHubWebhookEvent
        permits GitHubWebhookUserCreatedEvent, GitHubWebhookUserDeletedEvent, GitHubWebhookUserUnknownActionEvent {}
