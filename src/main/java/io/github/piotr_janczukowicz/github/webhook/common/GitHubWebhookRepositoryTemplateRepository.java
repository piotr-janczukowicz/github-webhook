package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The repository template repository payload.
 *
 * @param allowAutoMerge allow_auto_merge
 * @param allowMergeCommit allow_merge_commit
 * @param allowRebaseMerge allow_rebase_merge
 * @param allowSquashMerge allow_squash_merge
 * @param allowUpdateBranch allow_update_branch
 * @param archiveUrl archive_url
 * @param archived archived
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
 * @param defaultBranch default_branch
 * @param deleteBranchOnMerge delete_branch_on_merge
 * @param deploymentsUrl deployments_url
 * @param description description
 * @param disabled disabled
 * @param downloadsUrl downloads_url
 * @param eventsUrl events_url
 * @param fork fork
 * @param forksCount forks_count
 * @param forksUrl forks_url
 * @param fullName full_name
 * @param gitCommitsUrl git_commits_url
 * @param gitRefsUrl git_refs_url
 * @param gitTagsUrl git_tags_url
 * @param gitUrl git_url
 * @param hasDownloads has_downloads
 * @param hasIssues has_issues
 * @param hasPages has_pages
 * @param hasProjects has_projects
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
 * @param mergeCommitMessage The default value for a merge commit message. - {@code PR_TITLE} - default to the pull
 *     request's title. - {@code PR_BODY} - default to the pull request's body. - {@code BLANK} - default to a blank
 *     commit message.
 * @param mergeCommitTitle The default value for a merge commit title. - {@code PR_TITLE} - default to the pull
 *     request's title. - {@code MERGE_MESSAGE} - default to the classic title for a merge message (e.g., Merge pull
 *     request #123 from branch-name).
 * @param mergesUrl merges_url
 * @param milestonesUrl milestones_url
 * @param mirrorUrl mirror_url
 * @param name name
 * @param networkCount network_count
 * @param nodeId node_id
 * @param notificationsUrl notifications_url
 * @param openIssuesCount open_issues_count
 * @param owner owner
 * @param permissions permissions
 * @param privateValue private
 * @param pullsUrl pulls_url
 * @param pushedAt pushed_at
 * @param releasesUrl releases_url
 * @param size size
 * @param squashMergeCommitMessage The default value for a squash merge commit message: - {@code PR_BODY} - default to
 *     the pull request's body. - {@code COMMIT_MESSAGES} - default to the branch's commit messages. - {@code BLANK} -
 *     default to a blank commit message.
 * @param squashMergeCommitTitle The default value for a squash merge commit title: - {@code PR_TITLE} - default to the
 *     pull request's title. - {@code COMMIT_OR_PR_TITLE} - default to the commit's title (if only one commit) or the
 *     pull request's title (when more than one commit).
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
 * @param watchersCount watchers_count
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/branch-protection-configuration-disabled/requestBody/properties/repository/properties/template_repository")
public record GitHubWebhookRepositoryTemplateRepository(
        @Nullable Boolean allowAutoMerge,
        @Nullable Boolean allowMergeCommit,
        @Nullable Boolean allowRebaseMerge,
        @Nullable Boolean allowSquashMerge,
        @Nullable Boolean allowUpdateBranch,
        @Nullable String archiveUrl,
        @Nullable Boolean archived,
        @Nullable String assigneesUrl,
        @Nullable String blobsUrl,
        @Nullable String branchesUrl,
        @Nullable String cloneUrl,
        @Nullable String collaboratorsUrl,
        @Nullable String commentsUrl,
        @Nullable String commitsUrl,
        @Nullable String compareUrl,
        @Nullable String contentsUrl,
        @Nullable String contributorsUrl,
        @Nullable String createdAt,
        @Nullable String defaultBranch,
        @Nullable Boolean deleteBranchOnMerge,
        @Nullable String deploymentsUrl,
        @Nullable String description,
        @Nullable Boolean disabled,
        @Nullable String downloadsUrl,
        @Nullable String eventsUrl,
        @Nullable Boolean fork,
        @Nullable Long forksCount,
        @Nullable String forksUrl,
        @Nullable String fullName,
        @Nullable String gitCommitsUrl,
        @Nullable String gitRefsUrl,
        @Nullable String gitTagsUrl,
        @Nullable String gitUrl,
        @Nullable Boolean hasDownloads,
        @Nullable Boolean hasIssues,
        @Nullable Boolean hasPages,
        @Nullable Boolean hasProjects,
        @Nullable Boolean hasWiki,
        @Nullable String homepage,
        @Nullable String hooksUrl,
        @Nullable String htmlUrl,
        @Nullable Long id,
        @Nullable Boolean isTemplate,
        @Nullable String issueCommentUrl,
        @Nullable String issueEventsUrl,
        @Nullable String issuesUrl,
        @Nullable String keysUrl,
        @Nullable String labelsUrl,
        @Nullable String language,
        @Nullable String languagesUrl,
        @Nullable GitHubWebhookRepositoryMergeCommitMessage mergeCommitMessage,
        @Nullable GitHubWebhookRepositoryMergeCommitTitle mergeCommitTitle,
        @Nullable String mergesUrl,
        @Nullable String milestonesUrl,
        @Nullable String mirrorUrl,
        @Nullable String name,
        @Nullable Long networkCount,
        @Nullable String nodeId,
        @Nullable String notificationsUrl,
        @Nullable Long openIssuesCount,
        @Nullable GitHubWebhookRepositoryTemplateRepositoryOwner owner,
        @Nullable GitHubWebhookRepositoryTemplateRepositoryPermissions permissions,
        @Nullable @JsonProperty("private") Boolean privateValue,
        @Nullable String pullsUrl,
        @Nullable String pushedAt,
        @Nullable String releasesUrl,
        @Nullable Long size,
        @Nullable GitHubWebhookRepositorySquashMergeCommitMessage squashMergeCommitMessage,
        @Nullable GitHubWebhookRepositorySquashMergeCommitTitle squashMergeCommitTitle,
        @Nullable String sshUrl,
        @Nullable Long stargazersCount,
        @Nullable String stargazersUrl,
        @Nullable String statusesUrl,
        @Nullable Long subscribersCount,
        @Nullable String subscribersUrl,
        @Nullable String subscriptionUrl,
        @Nullable String svnUrl,
        @Nullable String tagsUrl,
        @Nullable String teamsUrl,
        @Nullable String tempCloneToken,
        @Nullable List<String> topics,
        @Nullable String treesUrl,
        @Nullable String updatedAt,
        @Nullable String url,
        @Nullable String visibility,
        @Nullable Long watchersCount) {}
