package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A repository advisory webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookRepositoryAdvisoryEvent extends GitHubWebhookEvent
        permits GitHubWebhookRepositoryAdvisoryPublishedEvent,
                GitHubWebhookRepositoryAdvisoryReportedEvent,
                GitHubWebhookRepositoryAdvisoryUnknownActionEvent {}
