package io.github.piotr_janczukowicz.github.webhook.installation;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A installation webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookInstallationEvent extends GitHubWebhookEvent
        permits GitHubWebhookInstallationCreatedEvent,
                GitHubWebhookInstallationDeletedEvent,
                GitHubWebhookInstallationNewPermissionsAcceptedEvent,
                GitHubWebhookInstallationSuspendEvent,
                GitHubWebhookInstallationUnsuspendEvent,
                GitHubWebhookInstallationUnknownActionEvent {}
