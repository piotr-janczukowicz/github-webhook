package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The repository ruleset conditions repository property payload.
 *
 * @param exclude The repository properties and values to exclude. The condition will not pass if any of these
 *     properties match.
 * @param include The repository properties and values to include. All of these properties must match for the condition
 *     to pass.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/conditions/properties/repository_property")
public record GitHubWebhookRepositoryRulesetConditionsRepositoryProperty(
        @Nullable List<GitHubWebhookRepositoryRulesetPropertyTargetingDefinition> exclude,
        @Nullable List<GitHubWebhookRepositoryRulesetPropertyTargetingDefinition> include) {}
