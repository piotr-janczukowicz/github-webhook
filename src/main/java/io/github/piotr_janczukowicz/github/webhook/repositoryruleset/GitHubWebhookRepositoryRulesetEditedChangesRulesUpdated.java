package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The repository ruleset edited changes rules updated payload.
 *
 * @param changes changes
 * @param rule A repository rule.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-edited/requestBody/properties/changes/properties/rules/properties/updated/items")
public record GitHubWebhookRepositoryRulesetEditedChangesRulesUpdated(
        @Nullable GitHubWebhookRepositoryRulesetEditedChangesRulesUpdatedChanges changes,
        @Nullable GitHubWebhookRepositoryRulesetRule rule) {}
