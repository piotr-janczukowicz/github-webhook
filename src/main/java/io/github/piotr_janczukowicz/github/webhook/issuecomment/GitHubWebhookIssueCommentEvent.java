package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A issue comment webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookIssueCommentEvent extends GitHubWebhookEvent
        permits GitHubWebhookIssueCommentCreatedEvent,
                GitHubWebhookIssueCommentDeletedEvent,
                GitHubWebhookIssueCommentEditedEvent,
                GitHubWebhookIssueCommentPinnedEvent,
                GitHubWebhookIssueCommentUnpinnedEvent,
                GitHubWebhookIssueCommentUnknownActionEvent {}
