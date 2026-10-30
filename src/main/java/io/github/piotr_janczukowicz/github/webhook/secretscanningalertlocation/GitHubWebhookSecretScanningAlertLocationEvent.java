package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A secret scanning alert location webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookSecretScanningAlertLocationEvent extends GitHubWebhookEvent
        permits GitHubWebhookSecretScanningAlertLocationCreatedEvent,
                GitHubWebhookSecretScanningAlertLocationUnknownActionEvent {}
