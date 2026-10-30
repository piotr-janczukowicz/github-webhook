package io.github.piotr_janczukowicz.github.webhook.release;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookReactions;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The [release](https://docs.github.com/rest/releases/releases/#get-a-release) object.
 *
 * @param assets assets
 * @param assetsUrl assets_url
 * @param author author
 * @param body body
 * @param createdAt created_at
 * @param discussionUrl discussion_url
 * @param draft Whether the release is a draft or published
 * @param htmlUrl html_url
 * @param id id
 * @param immutable Whether or not the release is immutable.
 * @param name name
 * @param nodeId node_id
 * @param prerelease Whether the release is identified as a prerelease or a full release.
 * @param publishedAt published_at
 * @param reactions reactions
 * @param tagName The name of the tag.
 * @param tarballUrl tarball_url
 * @param targetCommitish Specifies the commitish value that determines where the Git tag is created from.
 * @param updatedAt updated_at
 * @param uploadUrl upload_url
 * @param url url
 * @param zipballUrl zipball_url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/release-created/requestBody/properties/release")
public record GitHubWebhookRelease(
        List<GitHubWebhookReleaseAsset> assets,
        String assetsUrl,
        @Nullable GitHubWebhookReleaseAuthor author,
        @Nullable String body,
        @Nullable Instant createdAt,
        @Nullable String discussionUrl,
        boolean draft,
        String htmlUrl,
        long id,
        boolean immutable,
        @Nullable String name,
        String nodeId,
        boolean prerelease,
        @Nullable Instant publishedAt,
        @Nullable GitHubWebhookReactions reactions,
        String tagName,
        @Nullable String tarballUrl,
        String targetCommitish,
        @Nullable Instant updatedAt,
        String uploadUrl,
        String url,
        @Nullable String zipballUrl) {
    public GitHubWebhookRelease {
        requireNonNull(assets, "assets");
        requireNonNull(assetsUrl, "assetsUrl");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(tagName, "tagName");
        requireNonNull(targetCommitish, "targetCommitish");
        requireNonNull(uploadUrl, "uploadUrl");
        requireNonNull(url, "url");
    }
}
