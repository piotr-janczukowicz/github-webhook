package io.github.piotr_janczukowicz.github.webhook.dismissalrequestdependabot;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A dismissal request dependabot webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookDismissalRequestDependabotEvent extends GitHubWebhookEvent
        permits GitHubWebhookDismissalRequestDependabotCancelledEvent,
                GitHubWebhookDismissalRequestDependabotCreatedEvent,
                GitHubWebhookDismissalRequestDependabotResponseSubmittedEvent,
                GitHubWebhookDismissalRequestDependabotUnknownActionEvent {}
