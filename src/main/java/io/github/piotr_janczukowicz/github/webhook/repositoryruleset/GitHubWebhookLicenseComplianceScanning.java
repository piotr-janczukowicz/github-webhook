package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * Enforce any added or changed dependencies to comply with the organization's license policy.
 *
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/20")
public record GitHubWebhookLicenseComplianceScanning(GitHubWebhookLicenseComplianceScanningType type)
        implements GitHubWebhookRepositoryRulesetRule {
    public GitHubWebhookLicenseComplianceScanning {
        requireNonNull(type, "type");
    }
}
