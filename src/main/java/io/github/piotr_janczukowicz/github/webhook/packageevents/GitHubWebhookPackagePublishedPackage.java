package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Information about the package.
 *
 * @param createdAt created_at
 * @param description description
 * @param ecosystem ecosystem
 * @param htmlUrl html_url
 * @param id id
 * @param name name
 * @param namespace namespace
 * @param owner owner
 * @param packageType package_type
 * @param packageVersion package_version
 * @param registry registry
 * @param updatedAt updated_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/package-published/requestBody/properties/package")
public record GitHubWebhookPackagePublishedPackage(
        @Nullable String createdAt,
        @Nullable String description,
        String ecosystem,
        String htmlUrl,
        long id,
        String name,
        String namespace,
        @Nullable GitHubWebhookUser owner,
        String packageType,
        @Nullable GitHubWebhookPackagePublishedPackagePackageVersion packageVersion,
        @Nullable GitHubWebhookPackageUpdatedPackageRegistry registry,
        @Nullable String updatedAt) {
    public GitHubWebhookPackagePublishedPackage {
        requireNonNull(ecosystem, "ecosystem");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(name, "name");
        requireNonNull(namespace, "namespace");
        requireNonNull(packageType, "packageType");
    }
}
