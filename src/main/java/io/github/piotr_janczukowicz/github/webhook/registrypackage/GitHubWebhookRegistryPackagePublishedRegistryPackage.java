package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The registry package published registry package payload.
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
@CatalogSchema("webhooks/registry-package-published/requestBody/properties/registry_package")
public record GitHubWebhookRegistryPackagePublishedRegistryPackage(
        @Nullable String createdAt,
        @Nullable String description,
        String ecosystem,
        String htmlUrl,
        long id,
        String name,
        String namespace,
        GitHubWebhookRegistryPackageUpdatedRegistryPackageOwner owner,
        String packageType,
        @Nullable GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersion packageVersion,
        @Nullable GitHubWebhookRegistryPackagePublishedRegistryPackageRegistry registry,
        @Nullable String updatedAt) {
    public GitHubWebhookRegistryPackagePublishedRegistryPackage {
        requireNonNull(ecosystem, "ecosystem");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(name, "name");
        requireNonNull(namespace, "namespace");
        requireNonNull(owner, "owner");
        requireNonNull(packageType, "packageType");
    }
}
