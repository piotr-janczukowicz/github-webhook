package io.github.piotr_janczukowicz.github.webhook.projectcolumn;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A project column webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookProjectColumnEvent extends GitHubWebhookEvent
        permits GitHubWebhookProjectColumnCreatedEvent,
                GitHubWebhookProjectColumnDeletedEvent,
                GitHubWebhookProjectColumnEditedEvent,
                GitHubWebhookProjectColumnMovedEvent,
                GitHubWebhookProjectColumnUnknownActionEvent {}
