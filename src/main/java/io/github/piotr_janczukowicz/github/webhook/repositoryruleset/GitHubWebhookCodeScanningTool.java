package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * A tool that must provide code scanning results for this rule to pass.
 *
 * @param alertsThreshold The severity level at which code scanning results that raise alerts block a reference update.
 *     For more information on alert severity levels, see "[About code scanning
 *     alerts](https://docs.github.com/code-security/code-scanning/managing-code-scanning-alerts/about-code-scanning-alerts#about-alert-severity-and-security-severity-levels)."
 * @param securityAlertsThreshold The severity level at which code scanning results that raise security alerts block a
 *     reference update. For more information on security severity levels, see "[About code scanning
 *     alerts](https://docs.github.com/code-security/code-scanning/managing-code-scanning-alerts/about-code-scanning-alerts#about-alert-severity-and-security-severity-levels)."
 * @param tool The name of a code scanning tool
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/16/properties/parameters/properties/code_scanning_tools/items")
public record GitHubWebhookCodeScanningTool(
        GitHubWebhookCodeScanningToolAlertsThreshold alertsThreshold,
        GitHubWebhookCodeScanningToolSecurityAlertsThreshold securityAlertsThreshold,
        String tool) {
    public GitHubWebhookCodeScanningTool {
        requireNonNull(alertsThreshold, "alertsThreshold");
        requireNonNull(securityAlertsThreshold, "securityAlertsThreshold");
        requireNonNull(tool, "tool");
    }
}
