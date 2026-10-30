package io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A organization custom property webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookOrganizationCustomPropertyEvent extends GitHubWebhookEvent
        permits GitHubWebhookOrganizationCustomPropertyCreatedEvent,
                GitHubWebhookOrganizationCustomPropertyDeletedEvent,
                GitHubWebhookOrganizationCustomPropertyUpdatedEvent,
                GitHubWebhookOrganizationCustomPropertyUnknownActionEvent {}
