package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A discussion webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookDiscussionEvent extends GitHubWebhookEvent
        permits GitHubWebhookDiscussionAnsweredEvent,
                GitHubWebhookDiscussionCategoryChangedEvent,
                GitHubWebhookDiscussionClosedEvent,
                GitHubWebhookDiscussionCreatedEvent,
                GitHubWebhookDiscussionDeletedEvent,
                GitHubWebhookDiscussionEditedEvent,
                GitHubWebhookDiscussionLabeledEvent,
                GitHubWebhookDiscussionLockedEvent,
                GitHubWebhookDiscussionPinnedEvent,
                GitHubWebhookDiscussionReopenedEvent,
                GitHubWebhookDiscussionTransferredEvent,
                GitHubWebhookDiscussionUnansweredEvent,
                GitHubWebhookDiscussionUnlabeledEvent,
                GitHubWebhookDiscussionUnlockedEvent,
                GitHubWebhookDiscussionUnpinnedEvent,
                GitHubWebhookDiscussionUnknownActionEvent {}
