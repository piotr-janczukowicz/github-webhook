package io.github.piotr_janczukowicz.github.webhook.issues;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The selected option details. Present for single_select field types.
 *
 * @param color color
 * @param description description
 * @param id id
 * @param name name
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/issues-field-added/requestBody/properties/changes/properties/issue_field_value/properties/from/properties/option")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookIssuesFieldAddedIssueFieldValueOption(
        @Nullable String color,
        @Nullable String description,
        @Nullable Long id,
        @Nullable String name) {}
