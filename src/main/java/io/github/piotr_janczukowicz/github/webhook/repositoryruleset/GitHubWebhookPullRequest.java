package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Require all commits be made to a non-target branch and submitted via a pull request before they can be merged.
 *
 * @param parameters parameters
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/7")
public record GitHubWebhookPullRequest(
        @Nullable GitHubWebhookPullRequestParameters parameters, GitHubWebhookPullRequestType type)
        implements GitHubWebhookRepositoryRulesetRule {
    public GitHubWebhookPullRequest {
        requireNonNull(type, "type");
    }
}
