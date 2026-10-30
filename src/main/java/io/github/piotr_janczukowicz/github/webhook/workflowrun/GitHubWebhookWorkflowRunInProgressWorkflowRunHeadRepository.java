package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The workflow run in progress workflow run head repository payload.
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
 * @param description description
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
 * @param id Unique identifier of the repository
 * @param issueCommentUrl issue_comment_url
 * @param issueEventsUrl issue_events_url
 * @param issuesUrl issues_url
 * @param keysUrl keys_url
 * @param labelsUrl labels_url
 * @param languagesUrl languages_url
 * @param mergesUrl merges_url
 * @param milestonesUrl milestones_url
 * @param name The name of the repository.
 * @param nodeId node_id
 * @param notificationsUrl notifications_url
 * @param owner owner
 * @param privateValue Whether the repository is private or public.
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
@CatalogSchema("webhooks/workflow-run-in-progress/requestBody/properties/workflow_run/properties/head_repository")
public record GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepository(
        String archiveUrl,
        String assigneesUrl,
        String blobsUrl,
        String branchesUrl,
        String collaboratorsUrl,
        String commentsUrl,
        String commitsUrl,
        String compareUrl,
        String contentsUrl,
        String contributorsUrl,
        String deploymentsUrl,
        @Nullable String description,
        String downloadsUrl,
        String eventsUrl,
        boolean fork,
        String forksUrl,
        String fullName,
        String gitCommitsUrl,
        String gitRefsUrl,
        String gitTagsUrl,
        String hooksUrl,
        String htmlUrl,
        long id,
        String issueCommentUrl,
        String issueEventsUrl,
        String issuesUrl,
        String keysUrl,
        String labelsUrl,
        String languagesUrl,
        String mergesUrl,
        String milestonesUrl,
        @Nullable String name,
        String nodeId,
        String notificationsUrl,
        @Nullable GitHubWebhookWorkflowRunInProgressWorkflowRunActor owner,
        @JsonProperty("private") boolean privateValue,
        String pullsUrl,
        String releasesUrl,
        String stargazersUrl,
        String statusesUrl,
        String subscribersUrl,
        String subscriptionUrl,
        String tagsUrl,
        String teamsUrl,
        String treesUrl,
        String url) {
    public GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepository {
        requireNonNull(archiveUrl, "archiveUrl");
        requireNonNull(assigneesUrl, "assigneesUrl");
        requireNonNull(blobsUrl, "blobsUrl");
        requireNonNull(branchesUrl, "branchesUrl");
        requireNonNull(collaboratorsUrl, "collaboratorsUrl");
        requireNonNull(commentsUrl, "commentsUrl");
        requireNonNull(commitsUrl, "commitsUrl");
        requireNonNull(compareUrl, "compareUrl");
        requireNonNull(contentsUrl, "contentsUrl");
        requireNonNull(contributorsUrl, "contributorsUrl");
        requireNonNull(deploymentsUrl, "deploymentsUrl");
        requireNonNull(downloadsUrl, "downloadsUrl");
        requireNonNull(eventsUrl, "eventsUrl");
        requireNonNull(forksUrl, "forksUrl");
        requireNonNull(fullName, "fullName");
        requireNonNull(gitCommitsUrl, "gitCommitsUrl");
        requireNonNull(gitRefsUrl, "gitRefsUrl");
        requireNonNull(gitTagsUrl, "gitTagsUrl");
        requireNonNull(hooksUrl, "hooksUrl");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(issueCommentUrl, "issueCommentUrl");
        requireNonNull(issueEventsUrl, "issueEventsUrl");
        requireNonNull(issuesUrl, "issuesUrl");
        requireNonNull(keysUrl, "keysUrl");
        requireNonNull(labelsUrl, "labelsUrl");
        requireNonNull(languagesUrl, "languagesUrl");
        requireNonNull(mergesUrl, "mergesUrl");
        requireNonNull(milestonesUrl, "milestonesUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(notificationsUrl, "notificationsUrl");
        requireNonNull(pullsUrl, "pullsUrl");
        requireNonNull(releasesUrl, "releasesUrl");
        requireNonNull(stargazersUrl, "stargazersUrl");
        requireNonNull(statusesUrl, "statusesUrl");
        requireNonNull(subscribersUrl, "subscribersUrl");
        requireNonNull(subscriptionUrl, "subscriptionUrl");
        requireNonNull(tagsUrl, "tagsUrl");
        requireNonNull(teamsUrl, "teamsUrl");
        requireNonNull(treesUrl, "treesUrl");
        requireNonNull(url, "url");
    }
}
