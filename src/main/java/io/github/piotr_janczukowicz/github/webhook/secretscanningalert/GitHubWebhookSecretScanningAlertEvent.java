package io.github.piotr_janczukowicz.github.webhook.secretscanningalert;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A secret scanning alert webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookSecretScanningAlertEvent extends GitHubWebhookEvent
        permits GitHubWebhookSecretScanningAlertAssignedEvent,
                GitHubWebhookSecretScanningAlertCreatedEvent,
                GitHubWebhookSecretScanningAlertMetadataCreatedEvent,
                GitHubWebhookSecretScanningAlertMetadataRemovedEvent,
                GitHubWebhookSecretScanningAlertPubliclyLeakedEvent,
                GitHubWebhookSecretScanningAlertReopenedEvent,
                GitHubWebhookSecretScanningAlertResolvedEvent,
                GitHubWebhookSecretScanningAlertUnassignedEvent,
                GitHubWebhookSecretScanningAlertValidatedEvent,
                GitHubWebhookSecretScanningAlertUnknownActionEvent {}
