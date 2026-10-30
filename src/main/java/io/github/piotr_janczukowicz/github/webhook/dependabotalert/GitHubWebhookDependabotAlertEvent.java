package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A dependabot alert webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookDependabotAlertEvent extends GitHubWebhookEvent
        permits GitHubWebhookDependabotAlertAssigneesChangedEvent,
                GitHubWebhookDependabotAlertAutoDismissedEvent,
                GitHubWebhookDependabotAlertAutoReopenedEvent,
                GitHubWebhookDependabotAlertCreatedEvent,
                GitHubWebhookDependabotAlertDismissedEvent,
                GitHubWebhookDependabotAlertFixedEvent,
                GitHubWebhookDependabotAlertReintroducedEvent,
                GitHubWebhookDependabotAlertReopenedEvent,
                GitHubWebhookDependabotAlertWithdrawnEvent,
                GitHubWebhookDependabotAlertUnknownActionEvent {}
