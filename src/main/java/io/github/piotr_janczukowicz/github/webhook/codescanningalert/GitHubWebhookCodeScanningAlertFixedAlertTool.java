package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The code scanning alert fixed alert tool payload.
 *
 * @param guid guid
 * @param name The name of the tool used to generate the code scanning analysis alert.
 * @param version The version of the tool used to detect the alert.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/code-scanning-alert-closed-by-user/requestBody/properties/alert/properties/tool")
public record GitHubWebhookCodeScanningAlertFixedAlertTool(
        @Nullable String guid, String name, @Nullable String version) {
    public GitHubWebhookCodeScanningAlertFixedAlertTool {
        requireNonNull(name, "name");
    }
}
