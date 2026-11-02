package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/**
 * A secret scanning public monitoring alert webhook event: one record for each action GitHub sends, or the unknown
 * action.
 */
public sealed interface GitHubWebhookSecretScanningPublicMonitoringAlertEvent extends GitHubWebhookEvent
        permits GitHubWebhookSecretScanningPublicMonitoringAlertCreatedEvent,
                GitHubWebhookSecretScanningPublicMonitoringAlertDismissedEvent,
                GitHubWebhookSecretScanningPublicMonitoringAlertReopenedEvent,
                GitHubWebhookSecretScanningPublicMonitoringAlertValidatedEvent,
                GitHubWebhookSecretScanningPublicMonitoringAlertUnknownActionEvent {}
