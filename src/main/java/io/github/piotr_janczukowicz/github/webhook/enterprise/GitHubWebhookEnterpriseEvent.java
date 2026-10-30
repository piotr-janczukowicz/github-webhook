package io.github.piotr_janczukowicz.github.webhook.enterprise;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A enterprise webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookEnterpriseEvent extends GitHubWebhookEvent
        permits GitHubWebhookEnterpriseAnonymousAccessDisabledEvent,
                GitHubWebhookEnterpriseAnonymousAccessEnabledEvent,
                GitHubWebhookEnterpriseUnknownActionEvent {}
