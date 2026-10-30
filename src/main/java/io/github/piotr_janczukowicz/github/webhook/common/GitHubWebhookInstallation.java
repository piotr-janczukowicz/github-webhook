package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * Installation
 *
 * @param accessTokensUrl access_tokens_url
 * @param account account
 * @param appId app_id
 * @param appSlug app_slug
 * @param clientId client_id
 * @param contactEmail contact_email
 * @param createdAt created_at
 * @param events events
 * @param hasMultipleSingleFiles has_multiple_single_files
 * @param htmlUrl html_url
 * @param id The ID of the installation.
 * @param permissions The permissions granted to the fine-grained access token.
 * @param repositoriesUrl repositories_url
 * @param repositorySelection Describe whether all repositories have been selected or there's a selection involved
 * @param singleFileName single_file_name
 * @param singleFilePaths single_file_paths
 * @param suspendedAt suspended_at
 * @param suspendedBy suspended_by
 * @param targetId The ID of the user or organization this token is being scoped to.
 * @param targetType target_type
 * @param updatedAt updated_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/installation-created/requestBody/properties/installation")
public record GitHubWebhookInstallation(
        String accessTokensUrl,
        @Nullable GitHubWebhookGitHubAppOwner account,
        long appId,
        String appSlug,
        @Nullable String clientId,
        @Nullable String contactEmail,
        Instant createdAt,
        List<String> events,
        @Nullable Boolean hasMultipleSingleFiles,
        String htmlUrl,
        long id,
        GitHubWebhookAppPermissions permissions,
        String repositoriesUrl,
        GitHubWebhookInstallationRepositorySelection repositorySelection,
        @Nullable String singleFileName,
        @Nullable List<String> singleFilePaths,
        @Nullable Instant suspendedAt,
        @Nullable GitHubWebhookSimpleUser suspendedBy,
        long targetId,
        String targetType,
        Instant updatedAt) {
    public GitHubWebhookInstallation {
        requireNonNull(accessTokensUrl, "accessTokensUrl");
        requireNonNull(appSlug, "appSlug");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(events, "events");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(permissions, "permissions");
        requireNonNull(repositoriesUrl, "repositoriesUrl");
        requireNonNull(repositorySelection, "repositorySelection");
        requireNonNull(targetType, "targetType");
        requireNonNull(updatedAt, "updatedAt");
    }
}
