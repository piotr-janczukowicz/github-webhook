package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;

/**
 * The required deployments parameters payload.
 *
 * @param requiredDeploymentEnvironments The environments that must be successfully deployed to before branches can be
 *     merged.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/5/properties/parameters")
public record GitHubWebhookRequiredDeploymentsParameters(List<String> requiredDeploymentEnvironments) {
    public GitHubWebhookRequiredDeploymentsParameters {
        requireNonNull(requiredDeploymentEnvironments, "requiredDeploymentEnvironments");
    }
}
