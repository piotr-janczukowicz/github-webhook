package io.github.piotr_janczukowicz.github.webhook.dismissalrequestsecretscanning;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/**
 * A dismissal request secret scanning webhook event: one record for each action GitHub sends, or the unknown action.
 */
public sealed interface GitHubWebhookDismissalRequestSecretScanningEvent extends GitHubWebhookEvent
        permits GitHubWebhookDismissalRequestSecretScanningCancelledEvent,
                GitHubWebhookDismissalRequestSecretScanningCompletedEvent,
                GitHubWebhookDismissalRequestSecretScanningCreatedEvent,
                GitHubWebhookDismissalRequestSecretScanningResponseDismissedEvent,
                GitHubWebhookDismissalRequestSecretScanningResponseSubmittedEvent,
                GitHubWebhookDismissalRequestSecretScanningUnknownActionEvent {}
