package io.github.piotr_janczukowicz.github.webhook.customproperty;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A custom property webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookCustomPropertyEvent extends GitHubWebhookEvent
        permits GitHubWebhookCustomPropertyCreatedEvent,
                GitHubWebhookCustomPropertyDeletedEvent,
                GitHubWebhookCustomPropertyPromoteToEnterpriseEvent,
                GitHubWebhookCustomPropertyUpdatedEvent,
                GitHubWebhookCustomPropertyUnknownActionEvent {}
