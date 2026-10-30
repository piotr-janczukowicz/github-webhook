package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A projects v2 item webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookProjectsV2ItemEvent extends GitHubWebhookEvent
        permits GitHubWebhookProjectsV2ItemArchivedEvent,
                GitHubWebhookProjectsV2ItemConvertedEvent,
                GitHubWebhookProjectsV2ItemCreatedEvent,
                GitHubWebhookProjectsV2ItemDeletedEvent,
                GitHubWebhookProjectsV2ItemEditedEvent,
                GitHubWebhookProjectsV2ItemReorderedEvent,
                GitHubWebhookProjectsV2ItemRestoredEvent,
                GitHubWebhookProjectsV2ItemUnknownActionEvent {}
