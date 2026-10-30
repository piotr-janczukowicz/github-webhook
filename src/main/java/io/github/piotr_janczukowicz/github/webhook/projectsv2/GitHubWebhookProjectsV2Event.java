package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A projects v2 webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookProjectsV2Event extends GitHubWebhookEvent
        permits GitHubWebhookProjectsV2ClosedEvent,
                GitHubWebhookProjectsV2CreatedEvent,
                GitHubWebhookProjectsV2DeletedEvent,
                GitHubWebhookProjectsV2EditedEvent,
                GitHubWebhookProjectsV2ReopenedEvent,
                GitHubWebhookProjectsV2UnknownActionEvent {}
