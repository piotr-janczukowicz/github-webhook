package io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A bypass request secret scanning webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookBypassRequestSecretScanningEvent extends GitHubWebhookEvent
        permits GitHubWebhookBypassRequestSecretScanningCancelledEvent,
                GitHubWebhookBypassRequestSecretScanningCompletedEvent,
                GitHubWebhookBypassRequestSecretScanningCreatedEvent,
                GitHubWebhookBypassRequestSecretScanningResponseDismissedEvent,
                GitHubWebhookBypassRequestSecretScanningResponseSubmittedEvent,
                GitHubWebhookBypassRequestSecretScanningUnknownActionEvent {}
