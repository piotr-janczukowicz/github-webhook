package io.github.piotr_janczukowicz.github.webhook.packageevents;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.CatalogSimpleXor;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * The package published package package version nuget metadata payload.
 *
 * @param id id
 * @param name name
 * @param value value
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/package-published/requestBody/properties/package/properties/package_version/properties/nuget_metadata/items")
public record GitHubWebhookPackagePublishedPackagePackageVersionNugetMetadata(
        @Nullable @CatalogSimpleXor("integer|string") String id,
        @Nullable String name,

        @Nullable @SuppressSchemaTypeMismatch(
                "a string or number or boolean is read as the value of `value` of a free-form object")
        Map<String, Object> value) {}
