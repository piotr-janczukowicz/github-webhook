package io.github.piotr_janczukowicz.github.webhook.installationtarget;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The installation target renamed account payload.
 *
 * @param archivedAt archived_at
 * @param avatarUrl avatar_url
 * @param createdAt created_at
 * @param eventsUrl events_url
 * @param followers followers
 * @param followersUrl followers_url
 * @param following following
 * @param followingUrl following_url
 * @param gistsUrl gists_url
 * @param gravatarId gravatar_id
 * @param hasOrganizationProjects has_organization_projects
 * @param hasRepositoryProjects has_repository_projects
 * @param hooksUrl hooks_url
 * @param htmlUrl html_url
 * @param id id
 * @param isVerified is_verified
 * @param issuesUrl issues_url
 * @param login login
 * @param membersUrl members_url
 * @param name name
 * @param nodeId node_id
 * @param organizationsUrl organizations_url
 * @param publicGists public_gists
 * @param publicMembersUrl public_members_url
 * @param publicRepos public_repos
 * @param receivedEventsUrl received_events_url
 * @param reposUrl repos_url
 * @param siteAdmin site_admin
 * @param slug slug
 * @param starredUrl starred_url
 * @param subscriptionsUrl subscriptions_url
 * @param type type
 * @param updatedAt updated_at
 * @param url url
 * @param userViewType user_view_type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/installation-target-renamed/requestBody/properties/account")
public record GitHubWebhookInstallationTargetRenamedAccount(
        @Nullable String archivedAt,
        String avatarUrl,
        @Nullable String createdAt,
        @Nullable String eventsUrl,
        @Nullable Long followers,
        @Nullable String followersUrl,
        @Nullable Long following,
        @Nullable String followingUrl,
        @Nullable String gistsUrl,
        @Nullable String gravatarId,
        @Nullable Boolean hasOrganizationProjects,
        @Nullable Boolean hasRepositoryProjects,
        @Nullable String hooksUrl,
        String htmlUrl,
        long id,
        @Nullable Boolean isVerified,
        @Nullable String issuesUrl,
        @Nullable String login,
        @Nullable String membersUrl,
        @Nullable String name,
        String nodeId,
        @Nullable String organizationsUrl,
        @Nullable Long publicGists,
        @Nullable String publicMembersUrl,
        @Nullable Long publicRepos,
        @Nullable String receivedEventsUrl,
        @Nullable String reposUrl,
        @Nullable Boolean siteAdmin,
        @Nullable String slug,
        @Nullable String starredUrl,
        @Nullable String subscriptionsUrl,
        @Nullable String type,
        @Nullable String updatedAt,
        @Nullable String url,
        @Nullable String userViewType) {
    public GitHubWebhookInstallationTargetRenamedAccount {
        requireNonNull(avatarUrl, "avatarUrl");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(nodeId, "nodeId");
    }
}
