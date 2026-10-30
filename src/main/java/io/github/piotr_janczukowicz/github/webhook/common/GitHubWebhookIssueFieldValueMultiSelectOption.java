package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * Details about the selected option (only present for single_select fields)
 *
 * @param color The color of the option
 * @param id Unique identifier for the option.
 * @param name The name of the option
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/issue-dependencies-blocked-by-added/requestBody/properties/blocked_issue/properties/issue_field_values/items/properties/multi_select_options/items")
public record GitHubWebhookIssueFieldValueMultiSelectOption(String color, long id, String name) {
    public GitHubWebhookIssueFieldValueMultiSelectOption {
        requireNonNull(color, "color");
        requireNonNull(name, "name");
    }
}
