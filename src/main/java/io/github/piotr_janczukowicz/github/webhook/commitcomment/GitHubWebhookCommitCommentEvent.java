package io.github.piotr_janczukowicz.github.webhook.commitcomment;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A commit comment webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookCommitCommentEvent extends GitHubWebhookEvent
        permits GitHubWebhookCommitCommentCreatedEvent, GitHubWebhookCommitCommentUnknownActionEvent {}
