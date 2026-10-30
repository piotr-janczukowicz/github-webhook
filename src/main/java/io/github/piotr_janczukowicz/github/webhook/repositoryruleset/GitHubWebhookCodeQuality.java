package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Choose which severity levels of code quality results should block pull request merges. When configured, a code
 * quality analysis must be done on the pull request before the changes can be merged.
 *
 * @param parameters parameters
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/17")
public record GitHubWebhookCodeQuality(
        @Nullable GitHubWebhookCodeQualityParameters parameters, GitHubWebhookCodeQualityType type)
        implements GitHubWebhookRepositoryRulesetRule {
    public GitHubWebhookCodeQuality {
        requireNonNull(type, "type");
    }
}
