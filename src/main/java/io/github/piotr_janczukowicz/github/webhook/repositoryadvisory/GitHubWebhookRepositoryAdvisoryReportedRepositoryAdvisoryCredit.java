package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The repository advisory reported repository advisory credit payload.
 *
 * @param login The username of the user credited.
 * @param type The type of credit the user is receiving.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-advisory-published/requestBody/properties/repository_advisory/properties/credits/items")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCredit(
        @Nullable String login, @Nullable GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType type) {}
