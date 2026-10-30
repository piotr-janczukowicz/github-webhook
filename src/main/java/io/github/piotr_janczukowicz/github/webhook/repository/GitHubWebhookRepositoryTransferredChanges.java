package io.github.piotr_janczukowicz.github.webhook.repository;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The repository transferred changes payload.
 *
 * @param owner owner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/repository-transferred/requestBody/properties/changes")
public record GitHubWebhookRepositoryTransferredChanges(GitHubWebhookRepositoryTransferredChangesOwner owner) {
    public GitHubWebhookRepositoryTransferredChanges {
        requireNonNull(owner, "owner");
    }
}
