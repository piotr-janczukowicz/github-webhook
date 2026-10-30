package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The code quality parameters payload.
 *
 * @param severity The lowest severity level at which code quality reviews need to be resolved before commits can be
 *     merged.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/17/properties/parameters")
public record GitHubWebhookCodeQualityParameters(GitHubWebhookCodeQualityParametersSeverity severity) {
    public GitHubWebhookCodeQualityParameters {
        requireNonNull(severity, "severity");
    }
}
