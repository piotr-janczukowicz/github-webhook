package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The deployment workflow run head repository payload.
 *
 * @param archiveUrl archive_url
 * @param assigneesUrl assignees_url
 * @param blobsUrl blobs_url
 * @param branchesUrl branches_url
 * @param collaboratorsUrl collaborators_url
 * @param commentsUrl comments_url
 * @param commitsUrl commits_url
 * @param compareUrl compare_url
 * @param contentsUrl contents_url
 * @param contributorsUrl contributors_url
 * @param deploymentsUrl deployments_url
 * @param downloadsUrl downloads_url
 * @param eventsUrl events_url
 * @param fork fork
 * @param forksUrl forks_url
 * @param fullName full_name
 * @param gitCommitsUrl git_commits_url
 * @param gitRefsUrl git_refs_url
 * @param gitTagsUrl git_tags_url
 * @param hooksUrl hooks_url
 * @param htmlUrl html_url
 * @param id id
 * @param issueCommentUrl issue_comment_url
 * @param issueEventsUrl issue_events_url
 * @param issuesUrl issues_url
 * @param keysUrl keys_url
 * @param labelsUrl labels_url
 * @param languagesUrl languages_url
 * @param mergesUrl merges_url
 * @param milestonesUrl milestones_url
 * @param name name
 * @param nodeId node_id
 * @param notificationsUrl notifications_url
 * @param owner owner
 * @param privateValue private
 * @param pullsUrl pulls_url
 * @param releasesUrl releases_url
 * @param stargazersUrl stargazers_url
 * @param statusesUrl statuses_url
 * @param subscribersUrl subscribers_url
 * @param subscriptionUrl subscription_url
 * @param tagsUrl tags_url
 * @param teamsUrl teams_url
 * @param treesUrl trees_url
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-created/requestBody/properties/workflow_run/properties/head_repository")
public record GitHubWebhookDeploymentWorkflowRunHeadRepository(
        @Nullable String archiveUrl,
        @Nullable String assigneesUrl,
        @Nullable String blobsUrl,
        @Nullable String branchesUrl,
        @Nullable String collaboratorsUrl,
        @Nullable String commentsUrl,
        @Nullable String commitsUrl,
        @Nullable String compareUrl,
        @Nullable String contentsUrl,
        @Nullable String contributorsUrl,
        @Nullable String deploymentsUrl,
        @Nullable String downloadsUrl,
        @Nullable String eventsUrl,
        @Nullable Boolean fork,
        @Nullable String forksUrl,
        @Nullable String fullName,
        @Nullable String gitCommitsUrl,
        @Nullable String gitRefsUrl,
        @Nullable String gitTagsUrl,
        @Nullable String hooksUrl,
        @Nullable String htmlUrl,
        @Nullable Long id,
        @Nullable String issueCommentUrl,
        @Nullable String issueEventsUrl,
        @Nullable String issuesUrl,
        @Nullable String keysUrl,
        @Nullable String labelsUrl,
        @Nullable String languagesUrl,
        @Nullable String mergesUrl,
        @Nullable String milestonesUrl,
        @Nullable String name,
        @Nullable String nodeId,
        @Nullable String notificationsUrl,
        @Nullable GitHubWebhookRepositoryTemplateRepositoryOwner owner,
        @Nullable @JsonProperty("private") Boolean privateValue,
        @Nullable String pullsUrl,
        @Nullable String releasesUrl,
        @Nullable String stargazersUrl,
        @Nullable String statusesUrl,
        @Nullable String subscribersUrl,
        @Nullable String subscriptionUrl,
        @Nullable String tagsUrl,
        @Nullable String teamsUrl,
        @Nullable String treesUrl,
        @Nullable String url) {}
