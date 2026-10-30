package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A repository ruleset webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookRepositoryRulesetEvent extends GitHubWebhookEvent
        permits GitHubWebhookRepositoryRulesetCreatedEvent,
                GitHubWebhookRepositoryRulesetDeletedEvent,
                GitHubWebhookRepositoryRulesetEditedEvent,
                GitHubWebhookRepositoryRulesetUnknownActionEvent {}
