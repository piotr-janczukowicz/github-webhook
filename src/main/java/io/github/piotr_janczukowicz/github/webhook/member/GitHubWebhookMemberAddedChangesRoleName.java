package io.github.piotr_janczukowicz.github.webhook.member;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The role assigned to the collaborator.
 *
 * @param to to
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/member-added/requestBody/properties/changes/properties/role_name")
public record GitHubWebhookMemberAddedChangesRoleName(String to) {
    public GitHubWebhookMemberAddedChangesRoleName {
        requireNonNull(to, "to");
    }
}
