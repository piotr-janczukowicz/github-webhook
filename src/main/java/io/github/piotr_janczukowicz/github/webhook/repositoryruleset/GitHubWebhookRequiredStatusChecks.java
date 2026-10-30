package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Choose which status checks must pass before the ref is updated. When enabled, commits must first be pushed to another
 * ref where the checks pass.
 *
 * @param parameters parameters
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/8")
public record GitHubWebhookRequiredStatusChecks(
        @Nullable GitHubWebhookRequiredStatusChecksParameters parameters, GitHubWebhookRequiredStatusChecksType type)
        implements GitHubWebhookRepositoryRulesetRule {
    public GitHubWebhookRequiredStatusChecks {
        requireNonNull(type, "type");
    }
}
