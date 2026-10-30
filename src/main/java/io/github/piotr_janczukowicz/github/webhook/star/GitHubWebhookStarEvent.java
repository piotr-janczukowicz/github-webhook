package io.github.piotr_janczukowicz.github.webhook.star;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A star webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookStarEvent extends GitHubWebhookEvent
        permits GitHubWebhookStarCreatedEvent, GitHubWebhookStarDeletedEvent, GitHubWebhookStarUnknownActionEvent {}
