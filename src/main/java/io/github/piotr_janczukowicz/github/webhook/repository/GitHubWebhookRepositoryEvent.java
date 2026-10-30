package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A repository webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookRepositoryEvent extends GitHubWebhookEvent
        permits GitHubWebhookRepositoryAnonymousAccessDisabledEvent,
                GitHubWebhookRepositoryAnonymousAccessEnabledEvent,
                GitHubWebhookRepositoryArchivedEvent,
                GitHubWebhookRepositoryCreatedEvent,
                GitHubWebhookRepositoryDeletedEvent,
                GitHubWebhookRepositoryEditedEvent,
                GitHubWebhookRepositoryPrivatizedEvent,
                GitHubWebhookRepositoryPublicizedEvent,
                GitHubWebhookRepositoryRenamedEvent,
                GitHubWebhookRepositoryTransferredEvent,
                GitHubWebhookRepositoryUnarchivedEvent,
                GitHubWebhookRepositoryUnknownActionEvent {}
