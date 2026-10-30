package io.github.piotr_janczukowicz.github.webhook.organization;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A organization webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookOrganizationEvent extends GitHubWebhookEvent
        permits GitHubWebhookOrganizationDeletedEvent,
                GitHubWebhookOrganizationMemberAddedEvent,
                GitHubWebhookOrganizationMemberInvitedEvent,
                GitHubWebhookOrganizationMemberRemovedEvent,
                GitHubWebhookOrganizationRenamedEvent,
                GitHubWebhookOrganizationUnknownActionEvent {}
