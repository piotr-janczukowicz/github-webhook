package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A pull request review comment webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookPullRequestReviewCommentEvent extends GitHubWebhookEvent
        permits GitHubWebhookPullRequestReviewCommentCreatedEvent,
                GitHubWebhookPullRequestReviewCommentDeletedEvent,
                GitHubWebhookPullRequestReviewCommentEditedEvent,
                GitHubWebhookPullRequestReviewCommentUnknownActionEvent {}
