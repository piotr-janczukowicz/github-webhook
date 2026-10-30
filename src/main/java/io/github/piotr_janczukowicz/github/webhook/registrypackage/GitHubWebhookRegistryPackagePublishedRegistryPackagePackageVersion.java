package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPackagePublishedPackagePackageVersionPackageFile;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPackageUpdatedPackagePackageVersionDockerMetadata;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPackageVersionContainerMetadata;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRubyGemsMetadata;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * The registry package published registry package package version payload.
 *
 * @param author author
 * @param body body
 * @param bodyHtml body_html
 * @param containerMetadata container_metadata
 * @param createdAt created_at
 * @param description description
 * @param dockerMetadata docker_metadata
 * @param draft draft
 * @param htmlUrl html_url
 * @param id id
 * @param installationCommand installation_command
 * @param manifest manifest
 * @param metadata metadata
 * @param name name
 * @param npmMetadata npm_metadata
 * @param nugetMetadata nuget_metadata
 * @param packageFiles package_files
 * @param packageUrl package_url
 * @param prerelease prerelease
 * @param release release
 * @param rubygemsMetadata rubygems_metadata
 * @param summary summary
 * @param tagName tag_name
 * @param targetCommitish target_commitish
 * @param targetOid target_oid
 * @param updatedAt updated_at
 * @param version version
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/registry-package-published/requestBody/properties/registry_package/properties/package_version")
public record GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersion(
        @Nullable GitHubWebhookRegistryPackageUpdatedRegistryPackageOwner author,

        @Nullable @SuppressSchemaTypeMismatch(
                "a string or number or boolean is read as the value of `value` of a free-form object")
        Map<String, Object> body,

        @Nullable String bodyHtml,
        @Nullable GitHubWebhookPackageVersionContainerMetadata containerMetadata,
        @Nullable String createdAt,
        String description,
        @Nullable List<GitHubWebhookPackageUpdatedPackagePackageVersionDockerMetadata> dockerMetadata,
        @Nullable Boolean draft,
        String htmlUrl,
        long id,
        String installationCommand,
        @Nullable String manifest,

        @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        List<Map<String, Object>> metadata,

        String name,
        @Nullable GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata npmMetadata,
        @Nullable List<GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadata> nugetMetadata,
        List<GitHubWebhookPackagePublishedPackagePackageVersionPackageFile> packageFiles,
        String packageUrl,
        @Nullable Boolean prerelease,
        @Nullable GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease release,
        @Nullable List<GitHubWebhookRubyGemsMetadata> rubygemsMetadata,
        String summary,
        @Nullable String tagName,
        @Nullable String targetCommitish,
        @Nullable String targetOid,
        @Nullable String updatedAt,
        String version) {
    public GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersion {
        requireNonNull(description, "description");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(installationCommand, "installationCommand");
        requireNonNull(metadata, "metadata");
        requireNonNull(name, "name");
        requireNonNull(packageFiles, "packageFiles");
        requireNonNull(packageUrl, "packageUrl");
        requireNonNull(summary, "summary");
        requireNonNull(version, "version");
    }
}
