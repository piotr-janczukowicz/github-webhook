package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A issues webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookIssuesEvent extends GitHubWebhookEvent
        permits GitHubWebhookIssuesAssignedEvent,
                GitHubWebhookIssuesClosedEvent,
                GitHubWebhookIssuesDeletedEvent,
                GitHubWebhookIssuesDemilestonedEvent,
                GitHubWebhookIssuesEditedEvent,
                GitHubWebhookIssuesFieldAddedEvent,
                GitHubWebhookIssuesFieldRemovedEvent,
                GitHubWebhookIssuesLabeledEvent,
                GitHubWebhookIssuesLockedEvent,
                GitHubWebhookIssuesMilestonedEvent,
                GitHubWebhookIssuesOpenedEvent,
                GitHubWebhookIssuesPinnedEvent,
                GitHubWebhookIssuesReopenedEvent,
                GitHubWebhookIssuesTransferredEvent,
                GitHubWebhookIssuesTypedEvent,
                GitHubWebhookIssuesUnassignedEvent,
                GitHubWebhookIssuesUnlabeledEvent,
                GitHubWebhookIssuesUnlockedEvent,
                GitHubWebhookIssuesUnpinnedEvent,
                GitHubWebhookIssuesUntypedEvent,
                GitHubWebhookIssuesUnknownActionEvent {}
