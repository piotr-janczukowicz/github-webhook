package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The package updated package package version release payload.
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
@CatalogSchema("webhooks/package-updated/requestBody/properties/package/properties/package_version/properties/release")
public record GitHubWebhookPackageUpdatedPackagePackageVersionRelease(
        @Nullable GitHubWebhookUser author,
        String createdAt,
        boolean draft,
        String htmlUrl,
        long id,
        String name,
        boolean prerelease,
        String publishedAt,
        String tagName,
        String targetCommitish,
        String url) {
    public GitHubWebhookPackageUpdatedPackagePackageVersionRelease {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(name, "name");
        requireNonNull(publishedAt, "publishedAt");
        requireNonNull(tagName, "tagName");
        requireNonNull(targetCommitish, "targetCommitish");
        requireNonNull(url, "url");
    }
}
