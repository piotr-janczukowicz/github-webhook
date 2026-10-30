package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * A link to additional advisory information.
 *
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/security_advisory/properties/references/items")
public record GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryReference(String url) {
    public GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryReference {
        requireNonNull(url, "url");
    }
}
