package io.github.piotr_janczukowicz.github.webhook.release;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A release webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookReleaseEvent extends GitHubWebhookEvent
        permits GitHubWebhookReleaseCreatedEvent,
                GitHubWebhookReleaseDeletedEvent,
                GitHubWebhookReleaseEditedEvent,
                GitHubWebhookReleasePrereleasedEvent,
                GitHubWebhookReleasePublishedEvent,
                GitHubWebhookReleaseReleasedEvent,
                GitHubWebhookReleaseUnpublishedEvent,
                GitHubWebhookReleaseUnknownActionEvent {}
