package io.github.piotr_janczukowicz.github.webhook.pagebuild;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The page build value error payload.
 *
 * @param message message
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/page-build/requestBody/properties/build/properties/error")
public record GitHubWebhookPageBuildValueError(@Nullable String message) {}
