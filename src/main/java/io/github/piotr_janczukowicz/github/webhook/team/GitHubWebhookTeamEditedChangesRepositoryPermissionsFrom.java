package io.github.piotr_janczukowicz.github.webhook.team;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The team edited changes repository permissions from payload.
 *
 * @param admin The previous version of the team member's {@code admin} permission on a repository, if the action was
 *     {@code edited}.
 * @param pull The previous version of the team member's {@code pull} permission on a repository, if the action was
 *     {@code edited}.
 * @param push The previous version of the team member's {@code push} permission on a repository, if the action was
 *     {@code edited}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/team-edited/requestBody/properties/changes/properties/repository/properties/permissions/properties/from")
public record GitHubWebhookTeamEditedChangesRepositoryPermissionsFrom(
        @Nullable Boolean admin,
        @Nullable Boolean pull,
        @Nullable Boolean push) {}
