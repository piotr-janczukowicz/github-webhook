package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A workflow job webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookWorkflowJobEvent extends GitHubWebhookEvent
        permits GitHubWebhookWorkflowJobCompletedEvent,
                GitHubWebhookWorkflowJobInProgressEvent,
                GitHubWebhookWorkflowJobQueuedEvent,
                GitHubWebhookWorkflowJobWaitingEvent,
                GitHubWebhookWorkflowJobUnknownActionEvent {}
