package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The registry package updated registry package owner payload.
 *
 * @param avatarUrl avatar_url
 * @param eventsUrl events_url
 * @param followersUrl followers_url
 * @param followingUrl following_url
 * @param gistsUrl gists_url
 * @param gravatarId gravatar_id
 * @param htmlUrl html_url
 * @param id id
 * @param login login
 * @param nodeId node_id
 * @param organizationsUrl organizations_url
 * @param receivedEventsUrl received_events_url
 * @param reposUrl repos_url
 * @param siteAdmin site_admin
 * @param starredUrl starred_url
 * @param subscriptionsUrl subscriptions_url
 * @param type type
 * @param url url
 * @param userViewType user_view_type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/registry-package-published/requestBody/properties/registry_package/properties/owner")
public record GitHubWebhookRegistryPackageUpdatedRegistryPackageOwner(
        String avatarUrl,
        String eventsUrl,
        String followersUrl,
        String followingUrl,
        String gistsUrl,
        String gravatarId,
        String htmlUrl,
        long id,
        String login,
        String nodeId,
        String organizationsUrl,
        String receivedEventsUrl,
        String reposUrl,
        boolean siteAdmin,
        String starredUrl,
        String subscriptionsUrl,
        String type,
        String url,
        @Nullable String userViewType) {
    public GitHubWebhookRegistryPackageUpdatedRegistryPackageOwner {
        requireNonNull(avatarUrl, "avatarUrl");
        requireNonNull(eventsUrl, "eventsUrl");
        requireNonNull(followersUrl, "followersUrl");
        requireNonNull(followingUrl, "followingUrl");
        requireNonNull(gistsUrl, "gistsUrl");
        requireNonNull(gravatarId, "gravatarId");
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
