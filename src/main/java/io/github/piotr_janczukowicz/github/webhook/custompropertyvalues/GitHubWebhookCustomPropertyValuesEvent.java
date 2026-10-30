package io.github.piotr_janczukowicz.github.webhook.custompropertyvalues;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A custom property values webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookCustomPropertyValuesEvent extends GitHubWebhookEvent
        permits GitHubWebhookCustomPropertyValuesUpdatedEvent, GitHubWebhookCustomPropertyValuesUnknownActionEvent {}
