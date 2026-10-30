package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A pull request webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookPullRequestEvent extends GitHubWebhookEvent
        permits GitHubWebhookPullRequestAssignedEvent,
                GitHubWebhookPullRequestAutoMergeDisabledEvent,
                GitHubWebhookPullRequestAutoMergeEnabledEvent,
                GitHubWebhookPullRequestClosedEvent,
                GitHubWebhookPullRequestConvertedToDraftEvent,
                GitHubWebhookPullRequestDemilestonedEvent,
                GitHubWebhookPullRequestDequeuedEvent,
                GitHubWebhookPullRequestEditedEvent,
                GitHubWebhookPullRequestEnqueuedEvent,
                GitHubWebhookPullRequestLabeledEvent,
                GitHubWebhookPullRequestLockedEvent,
                GitHubWebhookPullRequestMilestonedEvent,
                GitHubWebhookPullRequestOpenedEvent,
                GitHubWebhookPullRequestReadyForReviewEvent,
                GitHubWebhookPullRequestReopenedEvent,
                GitHubWebhookPullRequestReviewRequestRemovedEvent,
                GitHubWebhookPullRequestReviewRequestedEvent,
                GitHubWebhookPullRequestStackedEvent,
                GitHubWebhookPullRequestSynchronizeEvent,
                GitHubWebhookPullRequestUnassignedEvent,
                GitHubWebhookPullRequestUnlabeledEvent,
                GitHubWebhookPullRequestUnlockedEvent,
                GitHubWebhookPullRequestUnknownActionEvent {}
