package io.github.piotr_janczukowicz.github.webhook.release;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * Data related to a release.
 *
 * @param browserDownloadUrl browser_download_url
 * @param contentType content_type
 * @param createdAt created_at
 * @param digest digest
 * @param downloadCount download_count
 * @param id id
 * @param label label
 * @param name The file name of the asset.
 * @param nodeId node_id
 * @param size size
 * @param state State of the release asset.
 * @param updatedAt updated_at
 * @param uploader uploader
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/release-created/requestBody/properties/release/properties/assets/items")
public record GitHubWebhookReleaseAsset(
        String browserDownloadUrl,
        String contentType,
        Instant createdAt,
        @Nullable String digest,
        long downloadCount,
        long id,
        @Nullable String label,
        String name,
        String nodeId,
        long size,
        GitHubWebhookReleaseAssetState state,
        Instant updatedAt,
        @Nullable GitHubWebhookUser uploader,
        String url) {
    public GitHubWebhookReleaseAsset {
        requireNonNull(browserDownloadUrl, "browserDownloadUrl");
        requireNonNull(contentType, "contentType");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(state, "state");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
