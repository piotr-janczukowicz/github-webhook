package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The public monitoring alert webhook repository payload.
 *
 * @param archiveUrl A template for the API URL to download the repository as an archive.
 * @param assigneesUrl A template for the API URL to list the available assignees for issues in the repository.
 * @param blobsUrl A template for the API URL to create or retrieve a raw Git blob in the repository.
 * @param branchesUrl A template for the API URL to get information about branches in the repository.
 * @param collaboratorsUrl A template for the API URL to get information about collaborators of the repository.
 * @param commentsUrl A template for the API URL to get information about comments on the repository.
 * @param commitsUrl A template for the API URL to get information about commits on the repository.
 * @param compareUrl A template for the API URL to compare two commits or refs.
 * @param contentsUrl A template for the API URL to get the contents of the repository.
 * @param contributorsUrl A template for the API URL to list the contributors to the repository.
 * @param deploymentsUrl The API URL to list the deployments of the repository.
 * @param description The repository description.
 * @param downloadsUrl The API URL to list the downloads on the repository.
 * @param eventsUrl The API URL to list the events of the repository.
 * @param fork Whether the repository is a fork.
 * @param forksUrl The API URL to list the forks of the repository.
 * @param fullName The full, globally unique, name of the repository.
 * @param gitCommitsUrl A template for the API URL to get information about Git commits of the repository.
 * @param gitRefsUrl A template for the API URL to get information about Git refs of the repository.
 * @param gitTagsUrl A template for the API URL to get information about Git tags of the repository.
 * @param hooksUrl The API URL to list the hooks on the repository.
 * @param htmlUrl The URL to view the repository on GitHub.com.
 * @param id A unique identifier of the repository.
 * @param issueCommentUrl A template for the API URL to get information about issue comments on the repository.
 * @param issueEventsUrl A template for the API URL to get information about issue events on the repository.
 * @param issuesUrl A template for the API URL to get information about issues on the repository.
 * @param keysUrl A template for the API URL to get information about deploy keys on the repository.
 * @param labelsUrl A template for the API URL to get information about labels of the repository.
 * @param languagesUrl The API URL to get information about the languages of the repository.
 * @param mergesUrl The API URL to merge branches in the repository.
 * @param milestonesUrl A template for the API URL to get information about milestones of the repository.
 * @param name The name of the repository.
 * @param nodeId The GraphQL identifier of the repository.
 * @param notificationsUrl A template for the API URL to get information about notifications on the repository.
 * @param owner A GitHub user.
 * @param privateValue Whether the repository is private.
 * @param pullsUrl A template for the API URL to get information about pull requests on the repository.
 * @param releasesUrl A template for the API URL to get information about releases on the repository.
 * @param stargazersUrl The API URL to list the stargazers on the repository.
 * @param statusesUrl A template for the API URL to get information about statuses of a commit.
 * @param subscribersUrl The API URL to list the subscribers on the repository.
 * @param subscriptionUrl The API URL to subscribe to notifications for this repository.
 * @param tagsUrl The API URL to get information about tags on the repository.
 * @param teamsUrl The API URL to list the teams on the repository.
 * @param treesUrl A template for the API URL to create or retrieve a raw Git tree of the repository.
 * @param url The URL to get more information about the repository from the GitHub API.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/secret-scanning-public-monitoring-alert-created/requestBody/properties/alert/properties/repository")
@Flavors({GitHubWebhookFlavor.GHEC})
public record GitHubWebhookPublicMonitoringAlertWebhookRepository(
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
        @Nullable String description,
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
        @Nullable GitHubWebhookSimpleUser owner,
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
