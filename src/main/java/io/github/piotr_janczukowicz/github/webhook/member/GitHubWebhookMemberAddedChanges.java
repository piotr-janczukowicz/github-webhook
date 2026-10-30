package io.github.piotr_janczukowicz.github.webhook.member;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The member added changes payload.
 *
 * @param permission This field is included for legacy purposes; use the {@code role_name} field instead. The
 *     {@code maintain} role is mapped to {@code write} and the {@code triage} role is mapped to {@code read}. To
 *     determine the role assigned to the collaborator, use the {@code role_name} field instead, which will provide the
 *     full role name, including custom roles.
 * @param roleName The role assigned to the collaborator.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/member-added/requestBody/properties/changes")
public record GitHubWebhookMemberAddedChanges(
        @Nullable GitHubWebhookMemberAddedChangesPermission permission,
        @Nullable GitHubWebhookMemberAddedChangesRoleName roleName) {}
