package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The deployment review approved approver payload.
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
@CatalogSchema("webhooks/deployment-review-approved/requestBody/properties/approver")
public record GitHubWebhookDeploymentReviewApprovedApprover(
        @Nullable String avatarUrl,
        @Nullable String eventsUrl,
        @Nullable String followersUrl,
        @Nullable String followingUrl,
        @Nullable String gistsUrl,
        @Nullable String gravatarId,
        @Nullable String htmlUrl,
        @Nullable Long id,
        @Nullable String login,
        @Nullable String nodeId,
        @Nullable String organizationsUrl,
        @Nullable String receivedEventsUrl,
        @Nullable String reposUrl,
        @Nullable Boolean siteAdmin,
        @Nullable String starredUrl,
        @Nullable String subscriptionsUrl,
        @Nullable String type,
        @Nullable String url,
        @Nullable String userViewType) {}
