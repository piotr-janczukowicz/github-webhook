package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * Prevent users with push access from force pushing to refs.
 *
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/9")
public record GitHubWebhookNonFastForward(GitHubWebhookNonFastForwardType type)
        implements GitHubWebhookRepositoryRulesetRule {
    public GitHubWebhookNonFastForward {
        requireNonNull(type, "type");
    }
}
