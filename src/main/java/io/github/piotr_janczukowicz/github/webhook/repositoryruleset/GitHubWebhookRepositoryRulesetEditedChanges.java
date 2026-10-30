package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookProjectCardEditedChangesNote;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The repository ruleset edited changes payload.
 *
 * @param conditions conditions
 * @param enforcement enforcement
 * @param name name
 * @param rules rules
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/repository-ruleset-edited/requestBody/properties/changes")
public record GitHubWebhookRepositoryRulesetEditedChanges(
        @Nullable GitHubWebhookRepositoryRulesetEditedChangesConditions conditions,
        @Nullable GitHubWebhookProjectCardEditedChangesNote enforcement,
        @Nullable GitHubWebhookProjectCardEditedChangesNote name,
        @Nullable GitHubWebhookRepositoryRulesetEditedChangesRules rules) {}
