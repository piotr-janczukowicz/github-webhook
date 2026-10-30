package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Require all changes made to a targeted branch to pass the specified workflows before they can be merged.
 *
 * @param parameters parameters
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/15")
public record GitHubWebhookWorkflows(
        @Nullable GitHubWebhookWorkflowsParameters parameters, GitHubWebhookWorkflowsType type)
        implements GitHubWebhookRepositoryRulesetRule {
    public GitHubWebhookWorkflows {
        requireNonNull(type, "type");
    }
}
