package io.github.piotr_janczukowicz.github.webhook.label;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A label webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookLabelEvent extends GitHubWebhookEvent
        permits GitHubWebhookLabelArchivedEvent,
                GitHubWebhookLabelCreatedEvent,
                GitHubWebhookLabelDeletedEvent,
                GitHubWebhookLabelEditedEvent,
                GitHubWebhookLabelUnarchivedEvent,
                GitHubWebhookLabelUnknownActionEvent {}
