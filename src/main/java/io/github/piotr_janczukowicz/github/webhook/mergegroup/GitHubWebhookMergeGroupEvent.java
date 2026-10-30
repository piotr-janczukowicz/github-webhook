package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A merge group webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookMergeGroupEvent extends GitHubWebhookEvent
        permits GitHubWebhookMergeGroupChecksRequestedEvent,
                GitHubWebhookMergeGroupDestroyedEvent,
                GitHubWebhookMergeGroupUnknownActionEvent {}
