package io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationCustomPropertySourceType;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationCustomPropertyValueType;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.CatalogSimpleXor;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The custom property for organization payload.
 *
 * @param allowedValues An ordered list of the allowed values of the property. The property can have up to 200 allowed
 *     values.
 * @param defaultValue Default value of the property
 * @param description Short description of the property
 * @param propertyName The name of the property
 * @param required Whether the property is required.
 * @param sourceType The source type of the property
 * @param url The URL that can be used to fetch, update, or delete info about this property via the API.
 * @param valueType The type of the value for the property
 * @param valuesEditableBy Who can edit the values of the property
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/organization-custom-property-created/requestBody/properties/definition")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public record GitHubWebhookCustomPropertyForOrganization(
        @Nullable List<String> allowedValues,
        @Nullable @CatalogSimpleXor("string|array") List<String> defaultValue,
        @Nullable String description,
        String propertyName,
        @Nullable Boolean required,
        @Nullable GitHubWebhookOrganizationCustomPropertySourceType sourceType,
        @Nullable String url,
        GitHubWebhookOrganizationCustomPropertyValueType valueType,
        @Nullable GitHubWebhookCustomPropertyForOrganizationValuesEditableBy valuesEditableBy) {
    public GitHubWebhookCustomPropertyForOrganization {
        requireNonNull(propertyName, "propertyName");
        requireNonNull(valueType, "valueType");
    }
}
