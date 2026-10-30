package io.github.piotr_janczukowicz.github.webhook.issuerelatesto;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A issue relates to webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookIssueRelatesToEvent extends GitHubWebhookEvent
        permits GitHubWebhookIssueRelatesToRelatesToAddedEvent,
                GitHubWebhookIssueRelatesToRelatesToRemovedEvent,
                GitHubWebhookIssueRelatesToUnknownActionEvent {}
