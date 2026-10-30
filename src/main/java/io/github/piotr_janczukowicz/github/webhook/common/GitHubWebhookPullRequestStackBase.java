package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The pull request stack base payload.
 *
 * @param ref The base ref of the stack this pull request belongs to.
 * @param sha The base SHA of the stack this pull request belongs to.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/deployment-protection-rule-requested/requestBody/properties/pull_requests/items/properties/stack/properties/base")
public record GitHubWebhookPullRequestStackBase(String ref, String sha) {
    public GitHubWebhookPullRequestStackBase {
        requireNonNull(ref, "ref");
        requireNonNull(sha, "sha");
    }
}
