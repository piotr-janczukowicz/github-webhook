package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The package published package package version package file payload.
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
        "webhooks/package-published/requestBody/properties/package/properties/package_version/properties/package_files/items")
public record GitHubWebhookPackagePublishedPackagePackageVersionPackageFile(
        String contentType,
        String createdAt,
        String downloadUrl,
        long id,
        @Nullable String md5,
        String name,
        @Nullable String sha1,
        @Nullable String sha256,
        long size,
        @Nullable String state,
        String updatedAt) {
    public GitHubWebhookPackagePublishedPackagePackageVersionPackageFile {
        requireNonNull(contentType, "contentType");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(downloadUrl, "downloadUrl");
        requireNonNull(name, "name");
        requireNonNull(updatedAt, "updatedAt");
    }
}
