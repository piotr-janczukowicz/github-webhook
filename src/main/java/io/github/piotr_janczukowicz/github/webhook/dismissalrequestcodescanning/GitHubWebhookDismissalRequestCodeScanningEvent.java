package io.github.piotr_janczukowicz.github.webhook.dismissalrequestcodescanning;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A dismissal request code scanning webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookDismissalRequestCodeScanningEvent extends GitHubWebhookEvent
        permits GitHubWebhookDismissalRequestCodeScanningCreatedEvent,
                GitHubWebhookDismissalRequestCodeScanningResponseSubmittedEvent,
                GitHubWebhookDismissalRequestCodeScanningUnknownActionEvent {}
