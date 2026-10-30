package io.github.piotr_janczukowicz.github.webhook.team;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A team webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookTeamEvent extends GitHubWebhookEvent
        permits GitHubWebhookTeamAddedToRepositoryEvent,
                GitHubWebhookTeamCreatedEvent,
                GitHubWebhookTeamDeletedEvent,
                GitHubWebhookTeamEditedEvent,
                GitHubWebhookTeamRemovedFromRepositoryEvent,
                GitHubWebhookTeamUnknownActionEvent {}
