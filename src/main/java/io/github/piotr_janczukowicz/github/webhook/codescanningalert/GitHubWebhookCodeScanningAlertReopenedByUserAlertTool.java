package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The code scanning alert reopened by user alert tool payload.
 *
 * @param name The name of the tool used to generate the code scanning analysis alert.
 * @param version The version of the tool used to detect the alert.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/code-scanning-alert-appeared-in-branch/requestBody/properties/alert/properties/tool")
public record GitHubWebhookCodeScanningAlertReopenedByUserAlertTool(
        String name, @Nullable String version) {
    public GitHubWebhookCodeScanningAlertReopenedByUserAlertTool {
        requireNonNull(name, "name");
    }
}
