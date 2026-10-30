package io.github.piotr_janczukowicz.github.webhook.project;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A project webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookProjectEvent extends GitHubWebhookEvent
        permits GitHubWebhookProjectClosedEvent,
                GitHubWebhookProjectCreatedEvent,
                GitHubWebhookProjectDeletedEvent,
                GitHubWebhookProjectEditedEvent,
                GitHubWebhookProjectReopenedEvent,
                GitHubWebhookProjectUnknownActionEvent {}
