package io.github.piotr_janczukowicz.github.webhook.status;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The status branch payload.
 *
 * @param commit commit
 * @param name name
 * @param protectedValue protected
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/status/requestBody/properties/branches/items")
public record GitHubWebhookStatusBranch(
        GitHubWebhookStatusBranchCommit commit,
        String name,
        @JsonProperty("protected") boolean protectedValue) {
    public GitHubWebhookStatusBranch {
        requireNonNull(commit, "commit");
        requireNonNull(name, "name");
    }
}
