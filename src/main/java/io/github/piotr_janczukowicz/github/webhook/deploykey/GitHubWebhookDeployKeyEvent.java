package io.github.piotr_janczukowicz.github.webhook.deploykey;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A deploy key webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookDeployKeyEvent extends GitHubWebhookEvent
        permits GitHubWebhookDeployKeyCreatedEvent,
                GitHubWebhookDeployKeyDeletedEvent,
                GitHubWebhookDeployKeyUnknownActionEvent {}
