package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The projects v2 item edited changes field value payload.
 *
 * @param fieldValue field_value
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-item-edited/requestBody/properties/changes/oneOf/0")
public record GitHubWebhookProjectsV2ItemEditedChangesFieldValue(
        GitHubWebhookProjectsV2ItemEditedChangesFieldValueValue fieldValue)
        implements GitHubWebhookProjectsV2ItemEditedChanges {
    public GitHubWebhookProjectsV2ItemEditedChangesFieldValue {
        requireNonNull(fieldValue, "fieldValue");
    }
}
