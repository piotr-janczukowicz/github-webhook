package io.github.piotr_janczukowicz.github.webhook.meta;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The meta deleted hook config payload.
 *
 * @param contentType content_type
 * @param insecureSsl insecure_ssl
 * @param secret secret
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/meta-deleted/requestBody/properties/hook/properties/config")
public record GitHubWebhookMetaDeletedHookConfig(
        GitHubWebhookMetaDeletedHookConfigContentType contentType,
        String insecureSsl,
        @Nullable String secret,
        String url) {
    public GitHubWebhookMetaDeletedHookConfig {
        requireNonNull(contentType, "contentType");
        requireNonNull(insecureSsl, "insecureSsl");
        requireNonNull(url, "url");
    }
}
