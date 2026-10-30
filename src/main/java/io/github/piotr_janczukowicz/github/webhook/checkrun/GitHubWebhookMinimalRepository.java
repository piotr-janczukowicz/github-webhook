package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookFullRepositorySecurityAndAnalysis;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryPullRequestCreationPolicy;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryTemplateRepositoryPermissions;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * Minimal Repository
 *
 * @param allowForking allow_forking
 * @param archiveUrl archive_url
 * @param archived archived
 * @param assigneesUrl assignees_url
 * @param blobsUrl blobs_url
 * @param branchesUrl branches_url
 * @param cloneUrl clone_url
 * @param codeOfConduct Code Of Conduct
 * @param collaboratorsUrl collaborators_url
 * @param commentsUrl comments_url
 * @param commitsUrl commits_url
 * @param compareUrl compare_url
 * @param contentsUrl contents_url
 * @param contributorsUrl contributors_url
 * @param createdAt created_at
 * @param customProperties The custom properties that were defined for the repository. The keys are the custom property
 *     names, and the values are the corresponding custom property values.
 * @param defaultBranch default_branch
 * @param deleteBranchOnMerge delete_branch_on_merge
 * @param deploymentsUrl deployments_url
 * @param description description
 * @param disabled disabled
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
 * @param hasDiscussions has_discussions
 * @param hasIssues has_issues
 * @param hasPages has_pages
 * @param hasProjects has_projects
 * @param hasPullRequests has_pull_requests
 * @param hasWiki has_wiki
 * @param homepage homepage
 * @param hooksUrl hooks_url
 * @param htmlUrl html_url
 * @param id id
 * @param isTemplate is_template
 * @param issueCommentUrl issue_comment_url
 * @param issueEventsUrl issue_events_url
 * @param issuesUrl issues_url
 * @param keysUrl keys_url
 * @param labelsUrl labels_url
 * @param language language
 * @param languagesUrl languages_url
 * @param license license
 * @param mergesUrl merges_url
 * @param milestonesUrl milestones_url
 * @param mirrorUrl mirror_url
 * @param name name
 * @param networkCount network_count
 * @param nodeId node_id
 * @param notificationsUrl notifications_url
 * @param openIssues open_issues
 * @param openIssuesCount open_issues_count
 * @param owner A GitHub user.
 * @param permissions permissions
 * @param privateValue private
 * @param pullRequestCreationPolicy The policy controlling who can create pull requests: all or collaborators_only.
 * @param pullsUrl pulls_url
 * @param pushedAt pushed_at
 * @param releasesUrl releases_url
 * @param roleName role_name
 * @param securityAndAnalysis security_and_analysis
 * @param size The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially
 *     created, the size is 0.
 * @param sshUrl ssh_url
 * @param stargazersCount stargazers_count
 * @param stargazersUrl stargazers_url
 * @param statusesUrl statuses_url
 * @param subscribersCount subscribers_count
 * @param subscribersUrl subscribers_url
 * @param subscriptionUrl subscription_url
 * @param svnUrl svn_url
 * @param tagsUrl tags_url
 * @param teamsUrl teams_url
 * @param tempCloneToken temp_clone_token
 * @param topics topics
 * @param treesUrl trees_url
 * @param updatedAt updated_at
 * @param url url
 * @param visibility visibility
 * @param watchers watchers
 * @param watchersCount watchers_count
 * @param webCommitSignoffRequired web_commit_signoff_required
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/check-run-completed/requestBody/properties/check_run/properties/check_suite/properties/repository")
public record GitHubWebhookMinimalRepository(
        @Nullable Boolean allowForking,
        String archiveUrl,
        @Nullable Boolean archived,
        String assigneesUrl,
        String blobsUrl,
        String branchesUrl,
        @Nullable String cloneUrl,
        @Nullable GitHubWebhookCodeOfConduct codeOfConduct,
        String collaboratorsUrl,
        String commentsUrl,
        String commitsUrl,
        String compareUrl,
        String contentsUrl,
        String contributorsUrl,
        @Nullable Instant createdAt,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> customProperties,

        @Nullable String defaultBranch,
        @Nullable Boolean deleteBranchOnMerge,
        String deploymentsUrl,
        @Nullable String description,
        @Nullable Boolean disabled,
        String downloadsUrl,
        String eventsUrl,
        boolean fork,
        @Nullable Long forks,
        @Nullable Long forksCount,
        String forksUrl,
        String fullName,
        String gitCommitsUrl,
        String gitRefsUrl,
        String gitTagsUrl,
        @Nullable String gitUrl,
        @Nullable Boolean hasDiscussions,
        @Nullable Boolean hasIssues,
        @Nullable Boolean hasPages,
        @Nullable Boolean hasProjects,
        @Nullable Boolean hasPullRequests,
        @Nullable Boolean hasWiki,
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
        @Nullable GitHubWebhookMinimalRepositoryLicense license,
        String mergesUrl,
        String milestonesUrl,
        @Nullable String mirrorUrl,
        String name,
        @Nullable Long networkCount,
        String nodeId,
        String notificationsUrl,
        @Nullable Long openIssues,
        @Nullable Long openIssuesCount,
        GitHubWebhookSimpleUser owner,
        @Nullable GitHubWebhookRepositoryTemplateRepositoryPermissions permissions,
        @JsonProperty("private") boolean privateValue,
        @Nullable GitHubWebhookRepositoryPullRequestCreationPolicy pullRequestCreationPolicy,
        String pullsUrl,
        @Nullable Instant pushedAt,
        String releasesUrl,
        @Nullable String roleName,
        @Nullable GitHubWebhookFullRepositorySecurityAndAnalysis securityAndAnalysis,
        @Nullable Long size,
        @Nullable String sshUrl,
        @Nullable Long stargazersCount,
        String stargazersUrl,
        String statusesUrl,
        @Nullable Long subscribersCount,
        String subscribersUrl,
        String subscriptionUrl,
        @Nullable String svnUrl,
        String tagsUrl,
        String teamsUrl,
        @Nullable String tempCloneToken,
        @Nullable List<String> topics,
        String treesUrl,
        @Nullable Instant updatedAt,
        String url,
        @Nullable String visibility,
        @Nullable Long watchers,
        @Nullable Long watchersCount,
        @Nullable Boolean webCommitSignoffRequired) {
    public GitHubWebhookMinimalRepository {
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
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(notificationsUrl, "notificationsUrl");
        requireNonNull(owner, "owner");
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
