package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The repo ref payload.
 *
 * @param id id
 * @param name name
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/check-run-completed/requestBody/properties/check_run/properties/check_suite/properties/pull_requests/items/properties/base/properties/repo")
public record GitHubWebhookRepoRef(long id, String name, String url) {
    public GitHubWebhookRepoRef {
        requireNonNull(name, "name");
        requireNonNull(url, "url");
    }
}
