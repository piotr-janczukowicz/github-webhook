package io.github.piotr_janczukowicz.github.webhook.discussioncomment;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A discussion comment webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookDiscussionCommentEvent extends GitHubWebhookEvent
        permits GitHubWebhookDiscussionCommentCreatedEvent,
                GitHubWebhookDiscussionCommentDeletedEvent,
                GitHubWebhookDiscussionCommentEditedEvent,
                GitHubWebhookDiscussionCommentUnknownActionEvent {}
