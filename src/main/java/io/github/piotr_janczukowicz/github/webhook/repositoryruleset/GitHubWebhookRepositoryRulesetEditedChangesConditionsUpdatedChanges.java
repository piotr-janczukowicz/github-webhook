package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookProjectCardEditedChangesNote;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryEditedChangesTopics;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The repository ruleset edited changes conditions updated changes payload.
 *
 * @param conditionType condition_type
 * @param exclude exclude
 * @param include include
 * @param target target
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-edited/requestBody/properties/changes/properties/conditions/properties/updated/items/properties/changes")
public record GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdatedChanges(
        @Nullable GitHubWebhookProjectCardEditedChangesNote conditionType,
        @Nullable GitHubWebhookRepositoryEditedChangesTopics exclude,
        @Nullable GitHubWebhookRepositoryEditedChangesTopics include,
        @Nullable GitHubWebhookProjectCardEditedChangesNote target) {}
