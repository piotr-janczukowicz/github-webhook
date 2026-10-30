package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The code scanning alert fixed alert rule payload.
 *
 * @param description A short description of the rule used to detect the alert.
 * @param fullDescription full_description
 * @param help help
 * @param helpUri A link to the documentation for the rule used to detect the alert.
 * @param id A unique identifier for the rule used to detect the alert.
 * @param name name
 * @param severity The severity of the alert.
 * @param tags tags
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/code-scanning-alert-closed-by-user/requestBody/properties/alert/properties/rule")
public record GitHubWebhookCodeScanningAlertFixedAlertRule(
        String description,
        @Nullable String fullDescription,
        @Nullable String help,
        @Nullable String helpUri,
        String id,
        @Nullable String name,
        @Nullable GitHubWebhookCodeScanningAlertFixedAlertRuleSeverity severity,
        @Nullable List<String> tags) {
    public GitHubWebhookCodeScanningAlertFixedAlertRule {
        requireNonNull(description, "description");
        requireNonNull(id, "id");
    }
}
