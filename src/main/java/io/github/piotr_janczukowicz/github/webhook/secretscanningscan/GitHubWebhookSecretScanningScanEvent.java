package io.github.piotr_janczukowicz.github.webhook.secretscanningscan;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A secret scanning scan webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookSecretScanningScanEvent extends GitHubWebhookEvent
        permits GitHubWebhookSecretScanningScanCompletedEvent, GitHubWebhookSecretScanningScanUnknownActionEvent {}
