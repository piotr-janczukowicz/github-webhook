package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Parameters for a repository ruleset ref name condition
 *
 * @param refName ref_name
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-edited/requestBody/properties/changes/properties/conditions/properties/added/items")
public record GitHubWebhookRepositoryRulesetConditionsForRefNames(
        @Nullable GitHubWebhookRepositoryRulesetConditionsRefName refName) {}
