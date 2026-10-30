package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The repository ruleset edited changes conditions payload.
 *
 * @param added added
 * @param deleted deleted
 * @param updated updated
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/repository-ruleset-edited/requestBody/properties/changes/properties/conditions")
public record GitHubWebhookRepositoryRulesetEditedChangesConditions(
        @Nullable List<GitHubWebhookRepositoryRulesetConditionsForRefNames> added,
        @Nullable List<GitHubWebhookRepositoryRulesetConditionsForRefNames> deleted,
        @Nullable List<GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdated> updated) {}
