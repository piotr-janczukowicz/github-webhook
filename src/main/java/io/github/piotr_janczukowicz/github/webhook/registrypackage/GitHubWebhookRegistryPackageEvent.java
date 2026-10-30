package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A registry package webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookRegistryPackageEvent extends GitHubWebhookEvent
        permits GitHubWebhookRegistryPackagePublishedEvent,
                GitHubWebhookRegistryPackageUpdatedEvent,
                GitHubWebhookRegistryPackageUnknownActionEvent {}
