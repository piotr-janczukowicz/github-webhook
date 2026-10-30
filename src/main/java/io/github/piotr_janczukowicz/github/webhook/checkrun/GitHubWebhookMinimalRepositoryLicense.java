package io.github.piotr_janczukowicz.github.webhook.checkrun;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The minimal repository license payload.
 *
 * @param key key
 * @param name name
 * @param nodeId node_id
 * @param spdxId spdx_id
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/check-run-completed/requestBody/properties/check_run/properties/check_suite/properties/repository/properties/license")
public record GitHubWebhookMinimalRepositoryLicense(
        @Nullable String key,
        @Nullable String name,
        @Nullable String nodeId,
        @Nullable String spdxId,
        @Nullable String url) {}
