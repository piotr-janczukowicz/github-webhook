package io.github.piotr_janczukowicz.github.webhook.ping;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.CatalogSimpleXor;
import org.jspecify.annotations.Nullable;

/**
 * The ping hook config payload.
 *
 * @param contentType The media type used to serialize the payloads. Supported values include {@code json} and
 *     {@code form}. The default is {@code form}.
 * @param insecureSsl insecure_ssl
 * @param secret If provided, the {@code secret} will be used as the {@code key} to generate the HMAC hex digest value
 *     for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers).
 * @param url The URL to which the payloads will be delivered.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/ping/requestBody/properties/hook/properties/config")
public record GitHubWebhookPingHookConfig(
        @Nullable String contentType,
        @Nullable @CatalogSimpleXor("string|number") String insecureSsl,
        @Nullable String secret,
        @Nullable String url) {}
