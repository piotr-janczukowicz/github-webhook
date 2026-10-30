package io.github.piotr_janczukowicz.github.webhook.issuedependencies;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A issue dependencies webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookIssueDependenciesEvent extends GitHubWebhookEvent
        permits GitHubWebhookIssueDependenciesBlockedByAddedEvent,
                GitHubWebhookIssueDependenciesBlockedByRemovedEvent,
                GitHubWebhookIssueDependenciesBlockingAddedEvent,
                GitHubWebhookIssueDependenciesBlockingRemovedEvent,
                GitHubWebhookIssueDependenciesUnknownActionEvent {}
