package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The code scanning alert reopened by user alert rule payload.
 *
 * @param description A short description of the rule used to detect the alert.
 * @param id A unique identifier for the rule used to detect the alert.
 * @param severity The severity of the alert.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/code-scanning-alert-appeared-in-branch/requestBody/properties/alert/properties/rule")
public record GitHubWebhookCodeScanningAlertReopenedByUserAlertRule(
        String description, String id, @Nullable GitHubWebhookCodeScanningAlertFixedAlertRuleSeverity severity) {
    public GitHubWebhookCodeScanningAlertReopenedByUserAlertRule {
        requireNonNull(description, "description");
        requireNonNull(id, "id");
    }
}
