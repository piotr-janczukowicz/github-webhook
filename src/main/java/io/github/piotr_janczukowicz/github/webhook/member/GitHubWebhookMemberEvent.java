package io.github.piotr_janczukowicz.github.webhook.member;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A member webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookMemberEvent extends GitHubWebhookEvent
        permits GitHubWebhookMemberAddedEvent,
                GitHubWebhookMemberEditedEvent,
                GitHubWebhookMemberRemovedEvent,
                GitHubWebhookMemberUnknownActionEvent {}
