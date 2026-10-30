package io.github.piotr_janczukowicz.github.webhook.issues;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.CatalogSimpleXor;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The value that was set or updated for the issue field. When updating an existing value, the previous value is
 * available in {@code changes}.
 *
 * @param id The unique identifier of the issue field value.
 * @param option The selected option details. Present for single_select field types.
 * @param options The selected option details. Present for multi_select field types.
 * @param value The value of the field. Present for text, date, and number field types.
 * @param valueId The identifier of the selected option. Present for single_select field types.
 * @param valueIds The identifiers of the selected options. Present for multi_select field types.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/issues-field-added/requestBody/properties/changes/properties/issue_field_value/properties/from")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookIssuesFieldAddedIssueFieldValue(
        long id,
        @Nullable GitHubWebhookIssuesFieldAddedIssueFieldValueOption option,
        @Nullable List<GitHubWebhookIssuesFieldAddedIssueFieldValueOption> options,
        @Nullable @CatalogSimpleXor("string|number|integer") String value,
        @Nullable Long valueId,
        @Nullable List<Long> valueIds) {}
