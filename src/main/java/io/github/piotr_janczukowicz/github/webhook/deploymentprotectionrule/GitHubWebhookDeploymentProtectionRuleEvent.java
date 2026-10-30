package io.github.piotr_janczukowicz.github.webhook.deploymentprotectionrule;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A deployment protection rule webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookDeploymentProtectionRuleEvent extends GitHubWebhookEvent
        permits GitHubWebhookDeploymentProtectionRuleRequestedEvent,
                GitHubWebhookDeploymentProtectionRuleUnknownActionEvent {}
