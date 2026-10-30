package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The license payload.
 *
 * @param key key
 * @param name name
 * @param nodeId node_id
 * @param spdxId spdx_id
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/fork/requestBody/properties/forkee/properties/license")
public record GitHubWebhookLicense(
        String key,
        String name,
        String nodeId,
        String spdxId,
        @Nullable String url) {
    public GitHubWebhookLicense {
        requireNonNull(key, "key");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(spdxId, "spdxId");
    }
}
