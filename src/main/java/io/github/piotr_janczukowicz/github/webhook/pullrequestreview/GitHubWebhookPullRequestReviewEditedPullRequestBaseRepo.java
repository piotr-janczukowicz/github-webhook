package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookLicense;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryPermissions;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryVisibility;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * A git repository
 *
 * @param allowAutoMerge Whether to allow auto-merge for pull requests.
 * @param allowForking Whether to allow private forks
 * @param allowMergeCommit Whether to allow merge commits for pull requests.
 * @param allowRebaseMerge Whether to allow rebase merges for pull requests.
 * @param allowSquashMerge Whether to allow squash merges for pull requests.
 * @param allowUpdateBranch allow_update_branch
 * @param archiveUrl archive_url
 * @param archived Whether the repository is archived.
 * @param assigneesUrl assignees_url
 * @param blobsUrl blobs_url
 * @param branchesUrl branches_url
 * @param cloneUrl clone_url
 * @param collaboratorsUrl collaborators_url
 * @param commentsUrl comments_url
 * @param commitsUrl commits_url
 * @param compareUrl compare_url
 * @param contentsUrl contents_url
 * @param contributorsUrl contributors_url
 * @param createdAt created_at
 * @param defaultBranch The default branch of the repository.
 * @param deleteBranchOnMerge Whether to delete head branches when pull requests are merged
 * @param deploymentsUrl deployments_url
 * @param description description
 * @param disabled Returns whether or not this repository is disabled.
 * @param downloadsUrl downloads_url
 * @param eventsUrl events_url
 * @param fork fork
 * @param forks forks
 * @param forksCount forks_count
 * @param forksUrl forks_url
 * @param fullName full_name
 * @param gitCommitsUrl git_commits_url
 * @param gitRefsUrl git_refs_url
 * @param gitTagsUrl git_tags_url
 * @param gitUrl git_url
 * @param hasDownloads Whether downloads are enabled.
 * @param hasIssues Whether issues are enabled.
 * @param hasPages has_pages
 * @param hasProjects Whether projects are enabled.
 * @param hasWiki Whether the wiki is enabled.
 * @param homepage homepage
 * @param hooksUrl hooks_url
 * @param htmlUrl html_url
 * @param id Unique identifier of the repository
 * @param isTemplate is_template
 * @param issueCommentUrl issue_comment_url
 * @param issueEventsUrl issue_events_url
 * @param issuesUrl issues_url
 * @param keysUrl keys_url
 * @param labelsUrl labels_url
 * @param language language
 * @param languagesUrl languages_url
 * @param license license
 * @param masterBranch master_branch
 * @param mergesUrl merges_url
 * @param milestonesUrl milestones_url
 * @param mirrorUrl mirror_url
 * @param name The name of the repository.
 * @param nodeId node_id
 * @param notificationsUrl notifications_url
 * @param openIssues open_issues
 * @param openIssuesCount open_issues_count
 * @param organization organization
 * @param owner owner
 * @param permissions permissions
 * @param privateValue Whether the repository is private or public.
 * @param publicValue public
 * @param pullsUrl pulls_url
 * @param pushedAt pushed_at
 * @param releasesUrl releases_url
 * @param roleName role_name
 * @param size size
 * @param sshUrl ssh_url
 * @param stargazers stargazers
 * @param stargazersCount stargazers_count
 * @param stargazersUrl stargazers_url
 * @param statusesUrl statuses_url
 * @param subscribersUrl subscribers_url
 * @param subscriptionUrl subscription_url
 * @param svnUrl svn_url
 * @param tagsUrl tags_url
 * @param teamsUrl teams_url
 * @param topics topics
 * @param treesUrl trees_url
 * @param updatedAt updated_at
 * @param url url
 * @param visibility visibility
 * @param watchers watchers
 * @param watchersCount watchers_count
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/pull-request-review-edited/requestBody/properties/pull_request/properties/base/properties/repo")
public record GitHubWebhookPullRequestReviewEditedPullRequestBaseRepo(
        @Nullable Boolean allowAutoMerge,
        @Nullable Boolean allowForking,
        @Nullable Boolean allowMergeCommit,
        @Nullable Boolean allowRebaseMerge,
        @Nullable Boolean allowSquashMerge,
        @Nullable Boolean allowUpdateBranch,
        String archiveUrl,
        boolean archived,
        String assigneesUrl,
        String blobsUrl,
        String branchesUrl,
        String cloneUrl,
        String collaboratorsUrl,
        String commentsUrl,
        String commitsUrl,
        String compareUrl,
        String contentsUrl,
        String contributorsUrl,

        @SuppressSchemaTypeMismatch("epoch seconds or an ISO-8601 string, read as an Instant")
        Instant createdAt,

        String defaultBranch,
        @Nullable Boolean deleteBranchOnMerge,
        String deploymentsUrl,
        @Nullable String description,
        @Nullable Boolean disabled,
        String downloadsUrl,
        String eventsUrl,
        boolean fork,
        long forks,
        long forksCount,
        String forksUrl,
        String fullName,
        String gitCommitsUrl,
        String gitRefsUrl,
        String gitTagsUrl,
        String gitUrl,
        boolean hasDownloads,
        boolean hasIssues,
        boolean hasPages,
        boolean hasProjects,
        boolean hasWiki,
        @Nullable String homepage,
        String hooksUrl,
        String htmlUrl,
        long id,
        @Nullable Boolean isTemplate,
        String issueCommentUrl,
        String issueEventsUrl,
        String issuesUrl,
        String keysUrl,
        String labelsUrl,
        @Nullable String language,
        String languagesUrl,
        @Nullable GitHubWebhookLicense license,
        @Nullable String masterBranch,
        String mergesUrl,
        String milestonesUrl,
        @Nullable String mirrorUrl,
        String name,
        String nodeId,
        String notificationsUrl,
        long openIssues,
        long openIssuesCount,
        @Nullable String organization,
        @Nullable GitHubWebhookPullRequestAutoMergeEnabledBy owner,
        @Nullable GitHubWebhookRepositoryPermissions permissions,
        @JsonProperty("private") boolean privateValue,
        @Nullable @JsonProperty("public") Boolean publicValue,
        String pullsUrl,

        @Nullable @SuppressSchemaTypeMismatch("epoch seconds or an ISO-8601 string, read as an Instant")
        Instant pushedAt,

        String releasesUrl,
        @Nullable String roleName,
        long size,
        String sshUrl,
        @Nullable Long stargazers,
        long stargazersCount,
        String stargazersUrl,
        String statusesUrl,
        String subscribersUrl,
        String subscriptionUrl,
        String svnUrl,
        String tagsUrl,
        String teamsUrl,
        List<String> topics,
        String treesUrl,
        Instant updatedAt,
        String url,
        GitHubWebhookRepositoryVisibility visibility,
        long watchers,
        long watchersCount) {
    public GitHubWebhookPullRequestReviewEditedPullRequestBaseRepo {
        requireNonNull(archiveUrl, "archiveUrl");
        requireNonNull(assigneesUrl, "assigneesUrl");
        requireNonNull(blobsUrl, "blobsUrl");
        requireNonNull(branchesUrl, "branchesUrl");
        requireNonNull(cloneUrl, "cloneUrl");
        requireNonNull(collaboratorsUrl, "collaboratorsUrl");
        requireNonNull(commentsUrl, "commentsUrl");
        requireNonNull(commitsUrl, "commitsUrl");
        requireNonNull(compareUrl, "compareUrl");
        requireNonNull(contentsUrl, "contentsUrl");
        requireNonNull(contributorsUrl, "contributorsUrl");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(defaultBranch, "defaultBranch");
        requireNonNull(deploymentsUrl, "deploymentsUrl");
        requireNonNull(downloadsUrl, "downloadsUrl");
        requireNonNull(eventsUrl, "eventsUrl");
        requireNonNull(forksUrl, "forksUrl");
        requireNonNull(fullName, "fullName");
        requireNonNull(gitCommitsUrl, "gitCommitsUrl");
        requireNonNull(gitRefsUrl, "gitRefsUrl");
        requireNonNull(gitTagsUrl, "gitTagsUrl");
        requireNonNull(gitUrl, "gitUrl");
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
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(notificationsUrl, "notificationsUrl");
        requireNonNull(pullsUrl, "pullsUrl");
        requireNonNull(releasesUrl, "releasesUrl");
        requireNonNull(sshUrl, "sshUrl");
        requireNonNull(stargazersUrl, "stargazersUrl");
        requireNonNull(statusesUrl, "statusesUrl");
        requireNonNull(subscribersUrl, "subscribersUrl");
        requireNonNull(subscriptionUrl, "subscriptionUrl");
        requireNonNull(svnUrl, "svnUrl");
        requireNonNull(tagsUrl, "tagsUrl");
        requireNonNull(teamsUrl, "teamsUrl");
        requireNonNull(topics, "topics");
        requireNonNull(treesUrl, "treesUrl");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
        requireNonNull(visibility, "visibility");
    }
}
