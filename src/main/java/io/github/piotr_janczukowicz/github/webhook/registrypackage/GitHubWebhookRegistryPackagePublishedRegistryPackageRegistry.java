package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The registry package published registry package registry payload.
 *
 * @param aboutUrl about_url
 * @param name name
 * @param type type
 * @param url url
 * @param vendor vendor
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/registry-package-published/requestBody/properties/registry_package/properties/registry")
public record GitHubWebhookRegistryPackagePublishedRegistryPackageRegistry(
        @Nullable String aboutUrl,
        @Nullable String name,
        @Nullable String type,
        @Nullable String url,
        @Nullable String vendor) {}
