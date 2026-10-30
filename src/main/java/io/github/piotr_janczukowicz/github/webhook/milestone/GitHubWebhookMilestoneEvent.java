package io.github.piotr_janczukowicz.github.webhook.milestone;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A milestone webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookMilestoneEvent extends GitHubWebhookEvent
        permits GitHubWebhookMilestoneClosedEvent,
                GitHubWebhookMilestoneCreatedEvent,
                GitHubWebhookMilestoneDeletedEvent,
                GitHubWebhookMilestoneEditedEvent,
                GitHubWebhookMilestoneOpenedEvent,
                GitHubWebhookMilestoneUnknownActionEvent {}
