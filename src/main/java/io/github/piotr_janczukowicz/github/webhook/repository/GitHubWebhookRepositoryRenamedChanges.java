package io.github.piotr_janczukowicz.github.webhook.repository;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The repository renamed changes payload.
 *
 * @param repository repository
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/repository-renamed/requestBody/properties/changes")
public record GitHubWebhookRepositoryRenamedChanges(GitHubWebhookRepositoryRenamedChangesRepository repository) {
    public GitHubWebhookRepositoryRenamedChanges {
        requireNonNull(repository, "repository");
    }
}
