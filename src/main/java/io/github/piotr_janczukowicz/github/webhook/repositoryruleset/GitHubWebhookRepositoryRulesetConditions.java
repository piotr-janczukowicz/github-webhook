package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The repository ruleset conditions payload.
 *
 * @param refName ref_name
 * @param repositoryId repository_id
 * @param repositoryName repository_name
 * @param repositoryProperty repository_property
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/conditions")
public record GitHubWebhookRepositoryRulesetConditions(
        @Nullable GitHubWebhookRepositoryRulesetConditionsRefName refName,
        @Nullable GitHubWebhookRepositoryRulesetConditionsRepositoryId repositoryId,
        @Nullable GitHubWebhookRepositoryRulesetConditionsRepositoryName repositoryName,
        @Nullable GitHubWebhookRepositoryRulesetConditionsRepositoryProperty repositoryProperty) {}
