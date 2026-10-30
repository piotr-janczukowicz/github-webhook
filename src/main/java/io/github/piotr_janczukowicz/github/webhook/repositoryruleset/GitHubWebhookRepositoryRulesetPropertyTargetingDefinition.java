package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * Parameters for a targeting a repository property
 *
 * @param name The name of the repository property to target
 * @param propertyValues The values to match for the repository property
 * @param source The source of the repository property. Defaults to 'custom' if not specified.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/conditions/properties/repository_property/properties/exclude/items")
public record GitHubWebhookRepositoryRulesetPropertyTargetingDefinition(
        String name,
        List<String> propertyValues,
        @Nullable GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionSource source) {
    public GitHubWebhookRepositoryRulesetPropertyTargetingDefinition {
        requireNonNull(name, "name");
        requireNonNull(propertyValues, "propertyValues");
    }
}
