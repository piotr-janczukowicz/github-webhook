package io.github.piotr_janczukowicz.github.webhook.projectcard;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A project card webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookProjectCardEvent extends GitHubWebhookEvent
        permits GitHubWebhookProjectCardConvertedEvent,
                GitHubWebhookProjectCardCreatedEvent,
                GitHubWebhookProjectCardDeletedEvent,
                GitHubWebhookProjectCardEditedEvent,
                GitHubWebhookProjectCardMovedEvent,
                GitHubWebhookProjectCardUnknownActionEvent {}
