package io.github.piotr_janczukowicz.github.webhook.team;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The team edited changes repository permissions payload.
 *
 * @param from from
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/team-edited/requestBody/properties/changes/properties/repository/properties/permissions")
public record GitHubWebhookTeamEditedChangesRepositoryPermissions(
        GitHubWebhookTeamEditedChangesRepositoryPermissionsFrom from) {
    public GitHubWebhookTeamEditedChangesRepositoryPermissions {
        requireNonNull(from, "from");
    }
}
