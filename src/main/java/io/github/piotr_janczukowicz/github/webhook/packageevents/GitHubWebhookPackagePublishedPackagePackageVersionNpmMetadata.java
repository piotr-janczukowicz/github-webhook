package io.github.piotr_janczukowicz.github.webhook.packageevents;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * The package published package package version npm metadata payload.
 *
 * @param author author
 * @param bin bin
 * @param bugs bugs
 * @param commitOid commit_oid
 * @param contributors contributors
 * @param cpu cpu
 * @param deletedById deleted_by_id
 * @param dependencies dependencies
 * @param description description
 * @param devDependencies dev_dependencies
 * @param directories directories
 * @param dist dist
 * @param engines engines
 * @param files files
 * @param gitHead git_head
 * @param hasShrinkwrap has_shrinkwrap
 * @param homepage homepage
 * @param id id
 * @param installationCommand installation_command
 * @param keywords keywords
 * @param license license
 * @param main main
 * @param maintainers maintainers
 * @param man man
 * @param name name
 * @param nodeVersion node_version
 * @param npmUser npm_user
 * @param npmVersion npm_version
 * @param optionalDependencies optional_dependencies
 * @param os os
 * @param peerDependencies peer_dependencies
 * @param publishedViaActions published_via_actions
 * @param readme readme
 * @param releaseId release_id
 * @param repository repository
 * @param scripts scripts
 * @param version version
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/package-published/requestBody/properties/package/properties/package_version/properties/npm_metadata")
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public record GitHubWebhookPackagePublishedPackagePackageVersionNpmMetadata(
        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> author,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> bin,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> bugs,

        @Nullable String commitOid,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        List<Map<String, Object>> contributors,

        @Nullable List<String> cpu,
        @Nullable Long deletedById,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> dependencies,

        @Nullable String description,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> devDependencies,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> directories,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> dist,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> engines,

        @Nullable List<String> files,
        @Nullable String gitHead,
        @Nullable Boolean hasShrinkwrap,
        @Nullable String homepage,
        @Nullable String id,
        @Nullable String installationCommand,
        @Nullable List<String> keywords,
        @Nullable String license,
        @Nullable String main,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        List<Map<String, Object>> maintainers,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> man,

        @Nullable String name,
        @Nullable String nodeVersion,
        @Nullable String npmUser,
        @Nullable String npmVersion,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> optionalDependencies,

        @Nullable List<String> os,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> peerDependencies,

        @Nullable Boolean publishedViaActions,
        @Nullable String readme,
        @Nullable Long releaseId,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> repository,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> scripts,

        @Nullable String version) {}
