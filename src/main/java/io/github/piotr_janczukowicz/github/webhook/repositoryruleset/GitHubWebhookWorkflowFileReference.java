package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * A workflow that must run for this rule to pass
 *
 * @param path The path to the workflow file
 * @param ref The ref (branch or tag) of the workflow file to use
 * @param repositoryId The ID of the repository where the workflow is defined
 * @param sha The commit SHA of the workflow file to use
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/15/properties/parameters/properties/workflows/items")
public record GitHubWebhookWorkflowFileReference(
        String path,
        @Nullable String ref,
        long repositoryId,
        @Nullable String sha) {
    public GitHubWebhookWorkflowFileReference {
        requireNonNull(path, "path");
    }
}
