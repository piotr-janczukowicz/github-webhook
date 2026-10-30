package io.github.piotr_janczukowicz.github.webhook.membership;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A membership webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookMembershipEvent extends GitHubWebhookEvent
        permits GitHubWebhookMembershipAddedEvent,
                GitHubWebhookMembershipRemovedEvent,
                GitHubWebhookMembershipUnknownActionEvent {}
