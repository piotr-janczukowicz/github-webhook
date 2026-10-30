package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A security advisory webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookSecurityAdvisoryEvent extends GitHubWebhookEvent
        permits GitHubWebhookSecurityAdvisoryPublishedEvent,
                GitHubWebhookSecurityAdvisoryUpdatedEvent,
                GitHubWebhookSecurityAdvisoryWithdrawnEvent,
                GitHubWebhookSecurityAdvisoryUnknownActionEvent {}
