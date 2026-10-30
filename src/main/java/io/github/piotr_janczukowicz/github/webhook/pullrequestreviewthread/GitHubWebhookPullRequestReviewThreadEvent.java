package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A pull request review thread webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookPullRequestReviewThreadEvent extends GitHubWebhookEvent
        permits GitHubWebhookPullRequestReviewThreadResolvedEvent,
                GitHubWebhookPullRequestReviewThreadUnresolvedEvent,
                GitHubWebhookPullRequestReviewThreadUnknownActionEvent {}
