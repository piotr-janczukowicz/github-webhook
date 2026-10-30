package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A deployment review webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookDeploymentReviewEvent extends GitHubWebhookEvent
        permits GitHubWebhookDeploymentReviewApprovedEvent,
                GitHubWebhookDeploymentReviewRejectedEvent,
                GitHubWebhookDeploymentReviewRequestedEvent,
                GitHubWebhookDeploymentReviewUnknownActionEvent {}
