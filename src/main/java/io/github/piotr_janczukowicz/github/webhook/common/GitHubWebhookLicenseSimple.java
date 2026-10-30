package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * License Simple
 *
 * @param htmlUrl html_url
 * @param key key
 * @param name name
 * @param nodeId node_id
 * @param spdxId spdx_id
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/branch-protection-configuration-disabled/requestBody/properties/repository/properties/license")
public record GitHubWebhookLicenseSimple(
        @Nullable String htmlUrl,
        String key,
        String name,
        String nodeId,
        @Nullable String spdxId,
        @Nullable String url) {
    public GitHubWebhookLicenseSimple {
        requireNonNull(key, "key");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
    }
}
