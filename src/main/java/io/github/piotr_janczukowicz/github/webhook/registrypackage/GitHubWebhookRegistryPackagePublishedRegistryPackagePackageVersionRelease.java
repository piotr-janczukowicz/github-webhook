package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDeploymentReviewApprovedApprover;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The registry package published registry package package version release payload.
 *
 * @param author author
 * @param createdAt created_at
 * @param draft draft
 * @param htmlUrl html_url
 * @param id id
 * @param name name
 * @param prerelease prerelease
 * @param publishedAt published_at
 * @param tagName tag_name
 * @param targetCommitish target_commitish
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/registry-package-published/requestBody/properties/registry_package/properties/package_version/properties/release")
public record GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease(
        @Nullable GitHubWebhookDeploymentReviewApprovedApprover author,
        @Nullable String createdAt,
        @Nullable Boolean draft,
        @Nullable String htmlUrl,
        @Nullable Long id,
        @Nullable String name,
        @Nullable Boolean prerelease,
        @Nullable String publishedAt,
        @Nullable String tagName,
        @Nullable String targetCommitish,
        @Nullable String url) {}
