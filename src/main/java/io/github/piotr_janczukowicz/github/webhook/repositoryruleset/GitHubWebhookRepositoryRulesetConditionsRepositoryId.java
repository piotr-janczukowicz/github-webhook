package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The repository ruleset conditions repository id payload.
 *
 * @param repositoryIds The repository IDs that the ruleset applies to. One of these IDs must match for the condition to
 *     pass.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/conditions/properties/repository_id")
public record GitHubWebhookRepositoryRulesetConditionsRepositoryId(
        @Nullable List<Long> repositoryIds) {}
