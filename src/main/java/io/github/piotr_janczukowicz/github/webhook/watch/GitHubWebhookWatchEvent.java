package io.github.piotr_janczukowicz.github.webhook.watch;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A watch webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookWatchEvent extends GitHubWebhookEvent
        permits GitHubWebhookWatchStartedEvent, GitHubWebhookWatchUnknownActionEvent {}
