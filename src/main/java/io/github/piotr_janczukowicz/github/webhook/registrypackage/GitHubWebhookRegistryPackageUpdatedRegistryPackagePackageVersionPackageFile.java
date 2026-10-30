package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The registry package updated registry package package version package file payload.
 *
 * @param contentType content_type
 * @param createdAt created_at
 * @param downloadUrl download_url
 * @param id id
 * @param md5 md5
 * @param name name
 * @param sha1 sha1
 * @param sha256 sha256
 * @param size size
 * @param state state
 * @param updatedAt updated_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/registry-package-updated/requestBody/properties/registry_package/properties/package_version/properties/package_files/items")
public record GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFile(
        @Nullable String contentType,
        @Nullable String createdAt,
        @Nullable String downloadUrl,
        @Nullable Long id,
        @Nullable String md5,
        @Nullable String name,
        @Nullable String sha1,
        @Nullable String sha256,
        @Nullable Long size,
        @Nullable String state,
        @Nullable String updatedAt) {}
