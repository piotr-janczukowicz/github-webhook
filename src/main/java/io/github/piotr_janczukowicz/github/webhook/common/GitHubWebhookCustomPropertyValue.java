package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.CatalogSimpleXor;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * Custom property name and associated value
 *
 * @param propertyName The name of the property
 * @param value The value assigned to the property
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/custom-property-values-updated/requestBody/properties/new_property_values/items")
public record GitHubWebhookCustomPropertyValue(
        String propertyName,
        @Nullable @CatalogSimpleXor("string|array") List<String> value) {
    public GitHubWebhookCustomPropertyValue {
        requireNonNull(propertyName, "propertyName");
    }
}
