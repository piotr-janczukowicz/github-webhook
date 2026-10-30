package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * The projects v2 item edited changes field value value payload.
 *
 * @param fieldName field_name
 * @param fieldNodeId field_node_id
 * @param fieldType field_type
 * @param from from
 * @param projectNumber project_number
 * @param to to
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-item-edited/requestBody/properties/changes/oneOf/0/properties/field_value")
public record GitHubWebhookProjectsV2ItemEditedChangesFieldValueValue(
        @Nullable String fieldName,
        @Nullable String fieldNodeId,
        @Nullable String fieldType,

        @Nullable @SuppressSchemaTypeMismatch(
                "a string or number or boolean is read as the value of `value` of a free-form object")
        Map<String, Object> from,

        @Nullable Long projectNumber,

        @Nullable @SuppressSchemaTypeMismatch(
                "a string or number or boolean is read as the value of `value` of a free-form object")
        Map<String, Object> to) {}
