package io.github.piotr_janczukowicz.github.webhook.enterprise;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The enterprise anonymous access disabled event payload.
 *
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/enterprise-anonymous-access-disabled/requestBody")
@Flavors({GitHubWebhookFlavor.GHES})
public record GitHubWebhookEnterpriseAnonymousAccessDisabledEvent(
        @Nullable GitHubWebhookSimpleUser sender) implements GitHubWebhookEnterpriseEvent {}
