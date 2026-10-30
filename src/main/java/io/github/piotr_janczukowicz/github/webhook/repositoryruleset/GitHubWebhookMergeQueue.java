package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Merges must be performed via a merge queue.
 *
 * @param parameters parameters
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/4")
public record GitHubWebhookMergeQueue(
        @Nullable GitHubWebhookMergeQueueParameters parameters, GitHubWebhookMergeQueueType type)
        implements GitHubWebhookRepositoryRulesetRule {
    public GitHubWebhookMergeQueue {
        requireNonNull(type, "type");
    }
}
