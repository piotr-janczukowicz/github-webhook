package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The tag name pattern parameters payload.
 *
 * @param name How this rule appears when configuring it.
 * @param negate If true, the rule will fail if the pattern matches.
 * @param operator The operator to use for matching.
 * @param pattern The pattern to match with.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/10/properties/parameters")
public record GitHubWebhookTagNamePatternParameters(
        @Nullable String name,
        @Nullable Boolean negate,
        GitHubWebhookTagNamePatternParametersOperator operator,
        String pattern) {
    public GitHubWebhookTagNamePatternParameters {
        requireNonNull(operator, "operator");
        requireNonNull(pattern, "pattern");
    }
}
