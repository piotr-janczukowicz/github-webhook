package io.github.piotr_janczukowicz.github.webhook.status;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The status branch commit payload.
 *
 * @param sha sha
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/status/requestBody/properties/branches/items/properties/commit")
public record GitHubWebhookStatusBranchCommit(
        @Nullable String sha, @Nullable String url) {}
