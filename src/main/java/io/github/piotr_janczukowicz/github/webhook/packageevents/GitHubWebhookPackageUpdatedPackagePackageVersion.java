package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPackageUpdatedPackagePackageVersionDockerMetadata;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRubyGemsMetadata;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * The package updated package package version payload.
 *
 * @param author author
 * @param body body
 * @param bodyHtml body_html
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
 * @param packageFiles package_files
 * @param packageUrl package_url
 * @param prerelease prerelease
 * @param release release
 * @param rubygemsMetadata rubygems_metadata
 * @param sourceUrl source_url
 * @param summary summary
 * @param tagName tag_name
 * @param targetCommitish target_commitish
 * @param targetOid target_oid
 * @param updatedAt updated_at
 * @param version version
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/package-updated/requestBody/properties/package/properties/package_version")
public record GitHubWebhookPackageUpdatedPackagePackageVersion(
        @Nullable GitHubWebhookUser author,
        String body,
        String bodyHtml,
        String createdAt,
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
        List<GitHubWebhookPackageUpdatedPackagePackageVersionPackageFile> packageFiles,
        @Nullable String packageUrl,
        @Nullable Boolean prerelease,
        @Nullable GitHubWebhookPackageUpdatedPackagePackageVersionRelease release,
        @Nullable List<GitHubWebhookRubyGemsMetadata> rubygemsMetadata,
        @Nullable String sourceUrl,
        String summary,
        @Nullable String tagName,
        String targetCommitish,
        String targetOid,
        String updatedAt,
        String version) {
    public GitHubWebhookPackageUpdatedPackagePackageVersion {
        requireNonNull(body, "body");
        requireNonNull(bodyHtml, "bodyHtml");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(description, "description");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(installationCommand, "installationCommand");
        requireNonNull(metadata, "metadata");
        requireNonNull(name, "name");
        requireNonNull(packageFiles, "packageFiles");
        requireNonNull(summary, "summary");
        requireNonNull(targetCommitish, "targetCommitish");
        requireNonNull(targetOid, "targetOid");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(version, "version");
    }
}
