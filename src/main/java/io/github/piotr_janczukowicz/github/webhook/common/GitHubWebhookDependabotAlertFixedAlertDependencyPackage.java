package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * Details for the vulnerable package.
 *
 * @param ecosystem ecosystem
 * @param name name
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/dependency/properties/package")
public record GitHubWebhookDependabotAlertFixedAlertDependencyPackage(String ecosystem, String name) {
    public GitHubWebhookDependabotAlertFixedAlertDependencyPackage {
        requireNonNull(ecosystem, "ecosystem");
        requireNonNull(name, "name");
    }
}
