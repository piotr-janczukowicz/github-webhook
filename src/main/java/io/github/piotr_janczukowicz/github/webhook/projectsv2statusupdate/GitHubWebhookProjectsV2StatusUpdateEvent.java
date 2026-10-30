package io.github.piotr_janczukowicz.github.webhook.projectsv2statusupdate;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A projects v2 status update webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookProjectsV2StatusUpdateEvent extends GitHubWebhookEvent
        permits GitHubWebhookProjectsV2StatusUpdateCreatedEvent,
                GitHubWebhookProjectsV2StatusUpdateDeletedEvent,
                GitHubWebhookProjectsV2StatusUpdateEditedEvent,
                GitHubWebhookProjectsV2StatusUpdateUnknownActionEvent {}
