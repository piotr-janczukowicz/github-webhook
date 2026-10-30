package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The repository ruleset edited changes rules payload.
 *
 * @param added added
 * @param deleted deleted
 * @param updated updated
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/repository-ruleset-edited/requestBody/properties/changes/properties/rules")
public record GitHubWebhookRepositoryRulesetEditedChangesRules(
        @Nullable List<GitHubWebhookRepositoryRulesetRule> added,
        @Nullable List<GitHubWebhookRepositoryRulesetRule> deleted,
        @Nullable List<GitHubWebhookRepositoryRulesetEditedChangesRulesUpdated> updated) {}
