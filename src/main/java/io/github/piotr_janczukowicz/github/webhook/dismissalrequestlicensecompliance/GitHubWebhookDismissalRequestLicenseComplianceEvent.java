package io.github.piotr_janczukowicz.github.webhook.dismissalrequestlicensecompliance;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/**
 * A dismissal request license compliance webhook event: one record for each action GitHub sends, or the unknown action.
 */
public sealed interface GitHubWebhookDismissalRequestLicenseComplianceEvent extends GitHubWebhookEvent
        permits GitHubWebhookDismissalRequestLicenseComplianceCancelledEvent,
                GitHubWebhookDismissalRequestLicenseComplianceCreatedEvent,
                GitHubWebhookDismissalRequestLicenseComplianceResponseSubmittedEvent,
                GitHubWebhookDismissalRequestLicenseComplianceUnknownActionEvent {}
