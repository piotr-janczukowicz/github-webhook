package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * Only allow users with bypass permission to create matching refs.
 *
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/0")
public record GitHubWebhookCreation(GitHubWebhookCreationType type) implements GitHubWebhookRepositoryRulesetRule {
    public GitHubWebhookCreation {
        requireNonNull(type, "type");
    }
}
