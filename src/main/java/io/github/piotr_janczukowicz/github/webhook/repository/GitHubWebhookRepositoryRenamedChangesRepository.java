package io.github.piotr_janczukowicz.github.webhook.repository;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The repository renamed changes repository payload.
 *
 * @param name name
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/repository-renamed/requestBody/properties/changes/properties/repository")
public record GitHubWebhookRepositoryRenamedChangesRepository(GitHubWebhookIssuesEditedChangesBody name) {
    public GitHubWebhookRepositoryRenamedChangesRepository {
        requireNonNull(name, "name");
    }
}
