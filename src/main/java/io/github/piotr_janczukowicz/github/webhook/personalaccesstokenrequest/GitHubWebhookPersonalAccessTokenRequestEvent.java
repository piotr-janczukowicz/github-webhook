package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;

/** A personal access token request webhook event: one record for each action GitHub sends, or the unknown action. */
public sealed interface GitHubWebhookPersonalAccessTokenRequestEvent extends GitHubWebhookEvent
        permits GitHubWebhookPersonalAccessTokenRequestApprovedEvent,
                GitHubWebhookPersonalAccessTokenRequestCancelledEvent,
                GitHubWebhookPersonalAccessTokenRequestCreatedEvent,
                GitHubWebhookPersonalAccessTokenRequestDeniedEvent,
                GitHubWebhookPersonalAccessTokenRequestUnknownActionEvent {}
