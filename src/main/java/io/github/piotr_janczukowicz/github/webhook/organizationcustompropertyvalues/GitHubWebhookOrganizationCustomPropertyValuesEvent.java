package io.github.piotr_janczukowicz.github.webhook.organizationcustompropertyvalues;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/**
 * A organization custom property values webhook event: one record for each action GitHub sends, or the unknown action.
 */
public sealed interface GitHubWebhookOrganizationCustomPropertyValuesEvent extends GitHubWebhookEvent
        permits GitHubWebhookOrganizationCustomPropertyValuesUpdatedEvent,
                GitHubWebhookOrganizationCustomPropertyValuesUnknownActionEvent {}
