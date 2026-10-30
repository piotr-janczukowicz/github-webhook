package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A marketplace purchase webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookMarketplacePurchaseEvent extends GitHubWebhookEvent
        permits GitHubWebhookMarketplacePurchaseCancelledEvent,
                GitHubWebhookMarketplacePurchaseChangedEvent,
                GitHubWebhookMarketplacePurchasePendingChangeCancelledEvent,
                GitHubWebhookMarketplacePurchasePendingChangeEvent,
                GitHubWebhookMarketplacePurchasePurchasedEvent,
                GitHubWebhookMarketplacePurchaseUnknownActionEvent {}
