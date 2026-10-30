package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A deployment status webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookDeploymentStatusEvent extends GitHubWebhookEvent
        permits GitHubWebhookDeploymentStatusCreatedEvent, GitHubWebhookDeploymentStatusUnknownActionEvent {}
