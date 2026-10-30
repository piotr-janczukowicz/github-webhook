package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The repository ruleset edited changes conditions updated payload.
 *
 * @param changes changes
 * @param condition Parameters for a repository ruleset ref name condition
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-edited/requestBody/properties/changes/properties/conditions/properties/updated/items")
public record GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdated(
        @Nullable GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdatedChanges changes,
        @Nullable GitHubWebhookRepositoryRulesetConditionsForRefNames condition) {}
