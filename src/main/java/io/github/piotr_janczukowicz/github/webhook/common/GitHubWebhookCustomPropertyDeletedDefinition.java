package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The custom property deleted definition payload.
 *
 * @param propertyName The name of the property that was deleted.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/custom-property-deleted/requestBody/properties/definition")
public record GitHubWebhookCustomPropertyDeletedDefinition(String propertyName) {
    public GitHubWebhookCustomPropertyDeletedDefinition {
        requireNonNull(propertyName, "propertyName");
    }
}
