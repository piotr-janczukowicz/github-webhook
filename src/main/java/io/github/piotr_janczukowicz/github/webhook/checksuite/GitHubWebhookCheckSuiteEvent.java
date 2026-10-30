package io.github.piotr_janczukowicz.github.webhook.checksuite;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A check suite webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookCheckSuiteEvent extends GitHubWebhookEvent
        permits GitHubWebhookCheckSuiteCompletedEvent,
                GitHubWebhookCheckSuiteRequestedEvent,
                GitHubWebhookCheckSuiteRerequestedEvent,
                GitHubWebhookCheckSuiteUnknownActionEvent {}
