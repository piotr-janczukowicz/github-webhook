package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;

/**
 * The code scanning parameters payload.
 *
 * @param codeScanningTools Tools that must provide code scanning results for this rule to pass.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/16/properties/parameters")
public record GitHubWebhookCodeScanningParameters(List<GitHubWebhookCodeScanningTool> codeScanningTools) {
    public GitHubWebhookCodeScanningParameters {
        requireNonNull(codeScanningTools, "codeScanningTools");
    }
}
