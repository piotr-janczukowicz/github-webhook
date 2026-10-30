package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookInstallationCreatedRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * Details of a Personal Access Token Request.
 *
 * @param createdAt Date and time when the request for access was created.
 * @param id Unique identifier of the request for access via fine-grained personal access token. Used as the
 *     {@code pat_request_id} parameter in the list and review API calls.
 * @param owner A GitHub user.
 * @param permissionsAdded New requested permissions, categorized by type of permission.
 * @param permissionsResult Permissions requested, categorized by type of permission. This field incorporates
 *     {@code permissions_added} and {@code permissions_upgraded}.
 * @param permissionsUpgraded Requested permissions that elevate access for a previously approved request for access,
 *     categorized by type of permission.
 * @param repositories An array of repository objects the token is requesting access to. This field is only populated
 *     when {@code repository_selection} is {@code subset}.
 * @param repositoryCount The number of repositories the token is requesting access to. This field is only populated
 *     when {@code repository_selection} is {@code subset}.
 * @param repositorySelection Type of repository selection requested.
 * @param tokenExpired Whether the associated fine-grained personal access token has expired.
 * @param tokenExpiresAt Date and time when the associated fine-grained personal access token expires.
 * @param tokenId Unique identifier of the user's token. This field can also be found in audit log events and the
 *     organization's settings for their PAT grants.
 * @param tokenLastUsedAt Date and time when the associated fine-grained personal access token was last used for
 *     authentication.
 * @param tokenName The name given to the user's token. This field can also be found in an organization's settings page
 *     for Active Tokens.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/personal-access-token-request-approved/requestBody/properties/personal_access_token_request")
public record GitHubWebhookPersonalAccessTokenRequest(
        String createdAt,
        long id,
        GitHubWebhookSimpleUser owner,
        GitHubWebhookPersonalAccessTokenRequestPermissionsAdded permissionsAdded,
        GitHubWebhookPersonalAccessTokenRequestPermissionsAdded permissionsResult,
        GitHubWebhookPersonalAccessTokenRequestPermissionsAdded permissionsUpgraded,
        @Nullable List<GitHubWebhookInstallationCreatedRepository> repositories,
        @Nullable Long repositoryCount,
        GitHubWebhookPersonalAccessTokenRequestRepositorySelection repositorySelection,
        boolean tokenExpired,
        @Nullable String tokenExpiresAt,
        long tokenId,
        @Nullable String tokenLastUsedAt,
        String tokenName) {
    public GitHubWebhookPersonalAccessTokenRequest {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(owner, "owner");
        requireNonNull(permissionsAdded, "permissionsAdded");
        requireNonNull(permissionsResult, "permissionsResult");
        requireNonNull(permissionsUpgraded, "permissionsUpgraded");
        requireNonNull(repositorySelection, "repositorySelection");
        requireNonNull(tokenName, "tokenName");
    }
}
