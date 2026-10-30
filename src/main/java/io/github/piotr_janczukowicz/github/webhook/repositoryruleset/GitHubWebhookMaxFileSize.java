package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Prevent commits with individual files that exceed the specified limit from being pushed to the commit graph.
 *
 * @param parameters parameters
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/24")
public record GitHubWebhookMaxFileSize(
        @Nullable GitHubWebhookMaxFileSizeParameters parameters, GitHubWebhookMaxFileSizeType type)
        implements GitHubWebhookRepositoryRulesetRule {
    public GitHubWebhookMaxFileSize {
        requireNonNull(type, "type");
    }
}
