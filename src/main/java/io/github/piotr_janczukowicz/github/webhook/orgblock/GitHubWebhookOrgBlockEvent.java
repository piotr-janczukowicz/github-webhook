package io.github.piotr_janczukowicz.github.webhook.orgblock;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A org block webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookOrgBlockEvent extends GitHubWebhookEvent
        permits GitHubWebhookOrgBlockBlockedEvent,
                GitHubWebhookOrgBlockUnblockedEvent,
                GitHubWebhookOrgBlockUnknownActionEvent {}
