package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A pull request review webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookPullRequestReviewEvent extends GitHubWebhookEvent
        permits GitHubWebhookPullRequestReviewDismissedEvent,
                GitHubWebhookPullRequestReviewEditedEvent,
                GitHubWebhookPullRequestReviewSubmittedEvent,
                GitHubWebhookPullRequestReviewUnknownActionEvent {}
