package io.github.piotr_janczukowicz.github.webhook.exemptionrequestpushruleset;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A exemption request push ruleset webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookExemptionRequestPushRulesetEvent extends GitHubWebhookEvent
        permits GitHubWebhookExemptionRequestPushRulesetCancelledEvent,
                GitHubWebhookExemptionRequestPushRulesetCompletedEvent,
                GitHubWebhookExemptionRequestPushRulesetCreatedEvent,
                GitHubWebhookExemptionRequestPushRulesetResponseDismissedEvent,
                GitHubWebhookExemptionRequestPushRulesetResponseSubmittedEvent,
                GitHubWebhookExemptionRequestPushRulesetUnknownActionEvent {}
