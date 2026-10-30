package io.github.piotr_janczukowicz.github.webhook.release;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The release edited changes make latest payload.
 *
 * @param to Whether this release was explicitly {@code edited} to be the latest.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/release-edited/requestBody/properties/changes/properties/make_latest")
public record GitHubWebhookReleaseEditedChangesMakeLatest(boolean to) {}
