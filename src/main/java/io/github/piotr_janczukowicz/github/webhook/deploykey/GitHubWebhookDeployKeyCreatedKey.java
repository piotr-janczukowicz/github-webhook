package io.github.piotr_janczukowicz.github.webhook.deploykey;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The [{@code deploy key}](https://docs.github.com/rest/deploy-keys/deploy-keys#get-a-deploy-key) resource.
 *
 * @param addedBy added_by
 * @param createdAt created_at
 * @param enabled enabled
 * @param id id
 * @param key key
 * @param lastUsed last_used
 * @param readOnly read_only
 * @param title title
 * @param url url
 * @param verified verified
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deploy-key-created/requestBody/properties/key")
public record GitHubWebhookDeployKeyCreatedKey(
        @Nullable String addedBy,
        String createdAt,
        @Nullable Boolean enabled,
        long id,
        String key,
        @Nullable String lastUsed,
        boolean readOnly,
        String title,
        String url,
        boolean verified) {
    public GitHubWebhookDeployKeyCreatedKey {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(key, "key");
        requireNonNull(title, "title");
        requireNonNull(url, "url");
    }
}
