package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A workflow run webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookWorkflowRunEvent extends GitHubWebhookEvent
        permits GitHubWebhookWorkflowRunCompletedEvent,
                GitHubWebhookWorkflowRunInProgressEvent,
                GitHubWebhookWorkflowRunRequestedEvent,
                GitHubWebhookWorkflowRunUnknownActionEvent {}
