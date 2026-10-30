package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookProjectCardEditedChangesNote;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The repository ruleset edited changes rules updated changes payload.
 *
 * @param configuration configuration
 * @param pattern pattern
 * @param ruleType rule_type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-edited/requestBody/properties/changes/properties/rules/properties/updated/items/properties/changes")
public record GitHubWebhookRepositoryRulesetEditedChangesRulesUpdatedChanges(
        @Nullable GitHubWebhookProjectCardEditedChangesNote configuration,
        @Nullable GitHubWebhookProjectCardEditedChangesNote pattern,
        @Nullable GitHubWebhookProjectCardEditedChangesNote ruleType) {}
