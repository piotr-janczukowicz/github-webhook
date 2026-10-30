package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A sponsorship webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookSponsorshipEvent extends GitHubWebhookEvent
        permits GitHubWebhookSponsorshipCancelledEvent,
                GitHubWebhookSponsorshipCreatedEvent,
                GitHubWebhookSponsorshipEditedEvent,
                GitHubWebhookSponsorshipPendingCancellationEvent,
                GitHubWebhookSponsorshipPendingTierChangeEvent,
                GitHubWebhookSponsorshipTierChangedEvent,
                GitHubWebhookSponsorshipUnknownActionEvent {}
