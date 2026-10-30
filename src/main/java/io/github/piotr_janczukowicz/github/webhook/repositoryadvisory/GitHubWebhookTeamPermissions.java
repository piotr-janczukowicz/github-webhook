package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The team permissions payload.
 *
 * @param admin admin
 * @param maintain maintain
 * @param pull pull
 * @param push push
 * @param triage triage
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-advisory-published/requestBody/properties/repository_advisory/properties/collaborating_teams/items/properties/permissions")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookTeamPermissions(
        boolean admin, boolean maintain, boolean pull, boolean push, boolean triage) {}
