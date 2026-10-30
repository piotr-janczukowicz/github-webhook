package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * A GitHub user.
 *
 * @param avatarUrl avatar_url
 * @param email email
 * @param eventsUrl events_url
 * @param followersUrl followers_url
 * @param followingUrl following_url
 * @param gistsUrl gists_url
 * @param gravatarId gravatar_id
 * @param htmlUrl html_url
 * @param id id
 * @param login login
 * @param name name
 * @param nodeId node_id
 * @param organizationsUrl organizations_url
 * @param receivedEventsUrl received_events_url
 * @param reposUrl repos_url
 * @param siteAdmin site_admin
 * @param starredAt starred_at
 * @param starredUrl starred_url
 * @param subscriptionsUrl subscriptions_url
 * @param type type
 * @param url url
 * @param userViewType user_view_type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/branch-protection-configuration-disabled/requestBody/properties/repository/properties/organization")
public record GitHubWebhookSimpleUser(
        String avatarUrl,
        @Nullable String email,
        String eventsUrl,
        String followersUrl,
        String followingUrl,
        String gistsUrl,
        @Nullable String gravatarId,
        String htmlUrl,
        long id,
        String login,
        @Nullable String name,
        String nodeId,
        String organizationsUrl,
        String receivedEventsUrl,
        String reposUrl,
        boolean siteAdmin,
        @Nullable String starredAt,
        String starredUrl,
        String subscriptionsUrl,
        String type,
        String url,
        @Nullable String userViewType)
        implements GitHubWebhookGitHubAppOwner {
    public GitHubWebhookSimpleUser {
        requireNonNull(avatarUrl, "avatarUrl");
        requireNonNull(eventsUrl, "eventsUrl");
        requireNonNull(followersUrl, "followersUrl");
        requireNonNull(followingUrl, "followingUrl");
        requireNonNull(gistsUrl, "gistsUrl");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(login, "login");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(organizationsUrl, "organizationsUrl");
        requireNonNull(receivedEventsUrl, "receivedEventsUrl");
        requireNonNull(reposUrl, "reposUrl");
        requireNonNull(starredUrl, "starredUrl");
        requireNonNull(subscriptionsUrl, "subscriptionsUrl");
        requireNonNull(type, "type");
        requireNonNull(url, "url");
    }
}
