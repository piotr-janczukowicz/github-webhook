package io.github.piotr_janczukowicz.github.webhook.status;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The status commit parent payload.
 *
 * @param htmlUrl html_url
 * @param sha sha
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/status/requestBody/properties/commit/properties/parents/items")
public record GitHubWebhookStatusCommitParent(String htmlUrl, String sha, String url) {
    public GitHubWebhookStatusCommitParent {
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(sha, "sha");
        requireNonNull(url, "url");
    }
}
