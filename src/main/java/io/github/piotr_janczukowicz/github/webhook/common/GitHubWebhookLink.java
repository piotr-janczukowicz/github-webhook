package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * Hypermedia Link
 *
 * @param href href
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/deployment-protection-rule-requested/requestBody/properties/pull_requests/items/properties/_links/properties/comments")
public record GitHubWebhookLink(String href) {
    public GitHubWebhookLink {
        requireNonNull(href, "href");
    }
}
