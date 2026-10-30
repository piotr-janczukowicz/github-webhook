package io.github.piotr_janczukowicz.github.webhook.subissues;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A sub issues webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookSubIssuesEvent extends GitHubWebhookEvent
        permits GitHubWebhookSubIssuesParentIssueAddedEvent,
                GitHubWebhookSubIssuesParentIssueRemovedEvent,
                GitHubWebhookSubIssuesSubIssueAddedEvent,
                GitHubWebhookSubIssuesSubIssueRemovedEvent,
                GitHubWebhookSubIssuesUnknownActionEvent {}
