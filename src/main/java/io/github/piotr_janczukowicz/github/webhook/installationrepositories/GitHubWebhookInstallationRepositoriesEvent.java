package io.github.piotr_janczukowicz.github.webhook.installationrepositories;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A installation repositories webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookInstallationRepositoriesEvent extends GitHubWebhookEvent
        permits GitHubWebhookInstallationRepositoriesAddedEvent,
                GitHubWebhookInstallationRepositoriesRemovedEvent,
                GitHubWebhookInstallationRepositoriesUnknownActionEvent {}
