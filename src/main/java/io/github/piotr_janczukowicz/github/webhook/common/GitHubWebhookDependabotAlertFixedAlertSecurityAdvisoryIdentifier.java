package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * An advisory identifier.
 *
 * @param type The type of advisory identifier.
 * @param value The value of the advisory identifer.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/security_advisory/properties/identifiers/items")
public record GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier(
        GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierType type, String value) {
    public GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier {
        requireNonNull(type, "type");
        requireNonNull(value, "value");
    }
}
