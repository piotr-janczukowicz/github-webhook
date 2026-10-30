package io.github.piotr_janczukowicz.github.webhook.githubappauthorization;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The github app authorization revoked event payload.
 *
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/github-app-authorization-revoked/requestBody")
public record GitHubWebhookGithubAppAuthorizationRevokedEvent(GitHubWebhookSimpleUser sender)
        implements GitHubWebhookGithubAppAuthorizationEvent {
    public GitHubWebhookGithubAppAuthorizationRevokedEvent {
        requireNonNull(sender, "sender");
    }
}
