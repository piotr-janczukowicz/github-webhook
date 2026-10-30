package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Enforce minimum line coverage thresholds on pull requests. This rule evaluates uploaded coverage data but does not
 * wait for coverage uploads. To ensure coverage is evaluated before merging, make each status check associated with a
 * coverage upload a required status check.
 *
 * @param parameters parameters
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/18")
public record GitHubWebhookCodeCoverage(
        @Nullable GitHubWebhookCodeCoverageParameters parameters, GitHubWebhookCodeCoverageType type)
        implements GitHubWebhookRepositoryRulesetRule {
    public GitHubWebhookCodeCoverage {
        requireNonNull(type, "type");
    }
}
