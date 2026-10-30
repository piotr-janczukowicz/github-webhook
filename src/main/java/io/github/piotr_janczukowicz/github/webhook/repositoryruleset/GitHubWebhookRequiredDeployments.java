package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Choose which environments must be successfully deployed to before refs can be pushed into a ref that matches this
 * rule.
 *
 * @param parameters parameters
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/5")
public record GitHubWebhookRequiredDeployments(
        @Nullable GitHubWebhookRequiredDeploymentsParameters parameters, GitHubWebhookRequiredDeploymentsType type)
        implements GitHubWebhookRepositoryRulesetRule {
    public GitHubWebhookRequiredDeployments {
        requireNonNull(type, "type");
    }
}
