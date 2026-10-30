package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * The package version container metadata payload.
 *
 * @param labels labels
 * @param manifest manifest
 * @param tag tag
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/package-published/requestBody/properties/package/properties/package_version/properties/container_metadata")
public record GitHubWebhookPackageVersionContainerMetadata(
        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> labels,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> manifest,

        @Nullable GitHubWebhookPackageVersionContainerMetadataTag tag) {}
