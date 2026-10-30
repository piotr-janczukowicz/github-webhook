package io.github.piotr_janczukowicz.github.webhook.member;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * This field is included for legacy purposes; use the {@code role_name} field instead. The {@code maintain} role is
 * mapped to {@code write} and the {@code triage} role is mapped to {@code read}. To determine the role assigned to the
 * collaborator, use the {@code role_name} field instead, which will provide the full role name, including custom roles.
 *
 * @param to to
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/member-added/requestBody/properties/changes/properties/permission")
public record GitHubWebhookMemberAddedChangesPermission(GitHubWebhookMemberAddedChangesPermissionTo to) {
    public GitHubWebhookMemberAddedChangesPermission {
        requireNonNull(to, "to");
    }
}
