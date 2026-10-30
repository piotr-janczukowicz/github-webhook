package io.github.piotr_janczukowicz.github.webhook.installationtarget;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A installation target webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookInstallationTargetEvent extends GitHubWebhookEvent
        permits GitHubWebhookInstallationTargetRenamedEvent, GitHubWebhookInstallationTargetUnknownActionEvent {}
