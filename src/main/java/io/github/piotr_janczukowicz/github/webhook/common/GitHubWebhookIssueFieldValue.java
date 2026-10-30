package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.CatalogSimpleXor;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * A value assigned to an issue field
 *
 * @param dataType The data type of the issue field
 * @param issueFieldId Unique identifier for the issue field.
 * @param issueFieldName The human-readable name of the issue field.
 * @param multiSelectOptions Details about the selected options
 * @param nodeId node_id
 * @param singleSelectOption Details about the selected option (only present for single_select fields)
 * @param value The value of the issue field
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/issue-dependencies-blocked-by-added/requestBody/properties/blocked_issue/properties/issue_field_values/items")
public record GitHubWebhookIssueFieldValue(
        GitHubWebhookIssueFieldValueDataType dataType,
        long issueFieldId,
        @Nullable String issueFieldName,
        @Nullable List<GitHubWebhookIssueFieldValueMultiSelectOption> multiSelectOptions,
        String nodeId,
        @Nullable GitHubWebhookIssueFieldValueMultiSelectOption singleSelectOption,
        @Nullable @CatalogSimpleXor("string|number|integer") String value) {
    public GitHubWebhookIssueFieldValue {
        requireNonNull(dataType, "dataType");
        requireNonNull(nodeId, "nodeId");
    }
}
