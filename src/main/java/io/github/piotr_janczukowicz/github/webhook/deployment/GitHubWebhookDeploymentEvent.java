package io.github.piotr_janczukowicz.github.webhook.deployment;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A deployment webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookDeploymentEvent extends GitHubWebhookEvent
        permits GitHubWebhookDeploymentCreatedEvent, GitHubWebhookDeploymentUnknownActionEvent {}
