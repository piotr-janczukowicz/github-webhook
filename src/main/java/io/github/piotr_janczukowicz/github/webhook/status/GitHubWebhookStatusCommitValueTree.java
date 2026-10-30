package io.github.piotr_janczukowicz.github.webhook.status;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The status commit value tree payload.
 *
 * @param sha sha
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/status/requestBody/properties/commit/properties/commit/properties/tree")
public record GitHubWebhookStatusCommitValueTree(String sha, String url) {
    public GitHubWebhookStatusCommitValueTree {
        requireNonNull(sha, "sha");
        requireNonNull(url, "url");
    }
}
