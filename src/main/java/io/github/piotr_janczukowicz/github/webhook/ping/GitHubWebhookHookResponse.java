package io.github.piotr_janczukowicz.github.webhook.ping;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The hook response payload.
 *
 * @param code code
 * @param message message
 * @param status status
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/ping/requestBody/properties/hook/properties/last_response")
public record GitHubWebhookHookResponse(
        @Nullable Long code,
        @Nullable String message,
        @Nullable String status) {}
