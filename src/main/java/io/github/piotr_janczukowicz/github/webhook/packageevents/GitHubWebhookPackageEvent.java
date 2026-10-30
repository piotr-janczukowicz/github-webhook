package io.github.piotr_janczukowicz.github.webhook.packageevents;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A package webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookPackageEvent extends GitHubWebhookEvent
        permits GitHubWebhookPackagePublishedEvent,
                GitHubWebhookPackageUpdatedEvent,
                GitHubWebhookPackageUnknownActionEvent {}
