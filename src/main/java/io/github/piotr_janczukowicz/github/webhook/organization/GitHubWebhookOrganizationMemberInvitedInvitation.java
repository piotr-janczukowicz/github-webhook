package io.github.piotr_janczukowicz.github.webhook.organization;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The invitation for the user or email if the action is {@code member_invited}.
 *
 * @param createdAt created_at
 * @param email email
 * @param failedAt failed_at
 * @param failedReason failed_reason
 * @param id id
 * @param invitationSource invitation_source
 * @param invitationTeamsUrl invitation_teams_url
 * @param inviter inviter
 * @param login login
 * @param nodeId node_id
 * @param role role
 * @param teamCount team_count
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/organization-member-invited/requestBody/properties/invitation")
public record GitHubWebhookOrganizationMemberInvitedInvitation(
        Instant createdAt,
        @Nullable String email,
        @Nullable Instant failedAt,
        @Nullable String failedReason,
        double id,
        @Nullable String invitationSource,
        String invitationTeamsUrl,
        @Nullable GitHubWebhookUser inviter,
        @Nullable String login,
        String nodeId,
        String role,
        double teamCount) {
    public GitHubWebhookOrganizationMemberInvitedInvitation {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(invitationTeamsUrl, "invitationTeamsUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(role, "role");
    }
}
