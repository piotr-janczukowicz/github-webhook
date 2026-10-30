package io.github.piotr_janczukowicz.github.webhook.organization;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The membership between the user and the organization. Not present when the action is {@code member_invited}.
 *
 * @param directMembership Whether the user has direct membership in the organization.
 * @param enterpriseTeamsProvidingIndirectMembership The slugs of the enterprise teams providing the user with indirect
 *     membership in the organization. A limit of 100 enterprise team slugs is returned.
 * @param organizationUrl organization_url
 * @param role role
 * @param state state
 * @param url url
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/organization-deleted/requestBody/properties/membership")
public record GitHubWebhookMembership(
        @Nullable Boolean directMembership,
        @Nullable List<String> enterpriseTeamsProvidingIndirectMembership,
        String organizationUrl,
        String role,
        String state,
        String url,
        @Nullable GitHubWebhookUser user) {
    public GitHubWebhookMembership {
        requireNonNull(organizationUrl, "organizationUrl");
        requireNonNull(role, "role");
        requireNonNull(state, "state");
        requireNonNull(url, "url");
    }
}
