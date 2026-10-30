package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Choose which tools must provide code scanning results before the reference is updated. When configured, code scanning
 * must be enabled and have results for both the commit and the reference being updated.
 *
 * @param parameters parameters
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/16")
public record GitHubWebhookCodeScanning(
        @Nullable GitHubWebhookCodeScanningParameters parameters, GitHubWebhookCodeScanningType type)
        implements GitHubWebhookRepositoryRulesetRule {
    public GitHubWebhookCodeScanning {
        requireNonNull(type, "type");
    }
}
