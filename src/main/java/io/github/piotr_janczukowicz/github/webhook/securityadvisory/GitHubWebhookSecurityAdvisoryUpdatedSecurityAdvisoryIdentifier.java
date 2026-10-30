package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The security advisory updated security advisory identifier payload.
 *
 * @param type type
 * @param value value
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/security-advisory-published/requestBody/properties/security_advisory/properties/identifiers/items")
public record GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifier(String type, String value) {
    public GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifier {
        requireNonNull(type, "type");
        requireNonNull(value, "value");
    }
}
