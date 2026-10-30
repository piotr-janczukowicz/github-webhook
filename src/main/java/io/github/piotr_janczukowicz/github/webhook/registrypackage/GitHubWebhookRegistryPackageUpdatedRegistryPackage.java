package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * The registry package updated registry package payload.
 *
 * @param createdAt created_at
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
@CatalogSchema("webhooks/registry-package-updated/requestBody/properties/registry_package")
public record GitHubWebhookRegistryPackageUpdatedRegistryPackage(
        String createdAt,
        String ecosystem,
        String htmlUrl,
        long id,
        String name,
        String namespace,
        GitHubWebhookRegistryPackageUpdatedRegistryPackageOwner owner,
        String packageType,
        GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersion packageVersion,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> registry,

        String updatedAt) {
    public GitHubWebhookRegistryPackageUpdatedRegistryPackage {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(ecosystem, "ecosystem");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(name, "name");
        requireNonNull(namespace, "namespace");
        requireNonNull(owner, "owner");
        requireNonNull(packageType, "packageType");
        requireNonNull(packageVersion, "packageVersion");
        requireNonNull(updatedAt, "updatedAt");
    }
}
