package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A code scanning alert webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookCodeScanningAlertEvent extends GitHubWebhookEvent
        permits GitHubWebhookCodeScanningAlertAppearedInBranchEvent,
                GitHubWebhookCodeScanningAlertClosedByUserEvent,
                GitHubWebhookCodeScanningAlertCreatedEvent,
                GitHubWebhookCodeScanningAlertFixedEvent,
                GitHubWebhookCodeScanningAlertReopenedByUserEvent,
                GitHubWebhookCodeScanningAlertReopenedEvent,
                GitHubWebhookCodeScanningAlertUpdatedAssignmentEvent,
                GitHubWebhookCodeScanningAlertUnknownActionEvent {}
