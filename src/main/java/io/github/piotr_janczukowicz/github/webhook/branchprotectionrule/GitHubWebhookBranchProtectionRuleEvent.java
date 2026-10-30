package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A branch protection rule webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookBranchProtectionRuleEvent extends GitHubWebhookEvent
        permits GitHubWebhookBranchProtectionRuleCreatedEvent,
                GitHubWebhookBranchProtectionRuleDeletedEvent,
                GitHubWebhookBranchProtectionRuleEditedEvent,
                GitHubWebhookBranchProtectionRuleUnknownActionEvent {}
