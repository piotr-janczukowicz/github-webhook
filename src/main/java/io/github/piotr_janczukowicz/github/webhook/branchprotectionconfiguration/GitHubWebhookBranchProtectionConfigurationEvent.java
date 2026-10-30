package io.github.piotr_janczukowicz.github.webhook.branchprotectionconfiguration;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A branch protection configuration webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookBranchProtectionConfigurationEvent extends GitHubWebhookEvent
        permits GitHubWebhookBranchProtectionConfigurationDisabledEvent,
                GitHubWebhookBranchProtectionConfigurationEnabledEvent,
                GitHubWebhookBranchProtectionConfigurationUnknownActionEvent {}
