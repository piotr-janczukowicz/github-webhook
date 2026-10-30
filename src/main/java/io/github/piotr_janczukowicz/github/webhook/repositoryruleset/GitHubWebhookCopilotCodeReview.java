package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Request Copilot code review for new pull requests automatically if the author has access to Copilot code review and
 * AI credits.
 *
 * @param parameters parameters
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/19")
public record GitHubWebhookCopilotCodeReview(
        @Nullable GitHubWebhookCopilotCodeReviewParameters parameters, GitHubWebhookCopilotCodeReviewType type)
        implements GitHubWebhookRepositoryRulesetRule {
    public GitHubWebhookCopilotCodeReview {
        requireNonNull(type, "type");
    }
}
