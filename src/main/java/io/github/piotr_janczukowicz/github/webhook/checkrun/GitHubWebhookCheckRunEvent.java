package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A check run webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookCheckRunEvent extends GitHubWebhookEvent
        permits GitHubWebhookCheckRunCompletedEvent,
                GitHubWebhookCheckRunCreatedEvent,
                GitHubWebhookCheckRunRequestedActionEvent,
                GitHubWebhookCheckRunRerequestedEvent,
                GitHubWebhookCheckRunUnknownActionEvent {}
