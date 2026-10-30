package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * The ruby gems metadata payload.
 *
 * @param commitOid commit_oid
 * @param dependencies dependencies
 * @param description description
 * @param homepage homepage
 * @param metadata metadata
 * @param name name
 * @param platform platform
 * @param readme readme
 * @param repo repo
 * @param versionInfo version_info
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/package-published/requestBody/properties/package/properties/package_version/properties/rubygems_metadata/items")
public record GitHubWebhookRubyGemsMetadata(
        @Nullable String commitOid,
        @Nullable List<Map<String, String>> dependencies,
        @Nullable String description,
        @Nullable String homepage,
        @Nullable Map<String, String> metadata,
        @Nullable String name,
        @Nullable String platform,
        @Nullable String readme,
        @Nullable String repo,
        @Nullable GitHubWebhookRubyGemsMetadataVersionInfo versionInfo) {}
