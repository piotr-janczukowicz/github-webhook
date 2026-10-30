package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * A repository on GitHub.
 *
 * @param allowAutoMerge Whether to allow Auto-merge to be used on pull requests.
 * @param allowForking Whether to allow forking this repo
 * @param allowMergeCommit Whether to allow merge commits for pull requests.
 * @param allowRebaseMerge Whether to allow rebase merges for pull requests.
 * @param allowSquashMerge Whether to allow squash merges for pull requests.
 * @param allowUpdateBranch Whether or not a pull request head branch that is behind its base branch can always be
 *     updated even if it is not required to be up to date before merging.
 * @param anonymousAccessEnabled Whether anonymous git access is enabled for this repository
 * @param archiveUrl archive_url
 * @param archived Whether the repository is archived.
 * @param assigneesUrl assignees_url
 * @param blobsUrl blobs_url
 * @param branchesUrl branches_url
 * @param cloneUrl clone_url
 * @param codeSearchIndexStatus The status of the code search index for this repository
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
 * @param disabled Returns whether or not this repository disabled.
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
 * @param hasDiscussions Whether discussions are enabled.
 * @param hasIssues Whether issues are enabled.
 * @param hasPages has_pages
 * @param hasProjects Whether projects are enabled.
 * @param hasPullRequests Whether pull requests are enabled.
 * @param hasWiki Whether the wiki is enabled.
 * @param homepage homepage
 * @param hooksUrl hooks_url
 * @param htmlUrl html_url
 * @param id Unique identifier of the repository
 * @param isTemplate Whether this repository acts as a template that can be used to generate new repositories.
 * @param issueCommentUrl issue_comment_url
 * @param issueEventsUrl issue_events_url
 * @param issuesUrl issues_url
 * @param keysUrl keys_url
 * @param labelsUrl labels_url
 * @param language language
 * @param languagesUrl languages_url
 * @param license license
 * @param mergeCommitMessage The default value for a merge commit message. - {@code PR_TITLE} - default to the pull
 *     request's title. - {@code PR_BODY} - default to the pull request's body. - {@code BLANK} - default to a blank
 *     commit message.
 * @param mergeCommitTitle The default value for a merge commit title. - {@code PR_TITLE} - default to the pull
 *     request's title. - {@code MERGE_MESSAGE} - default to the classic title for a merge message (e.g., Merge pull
 *     request #123 from branch-name).
 * @param mergesUrl merges_url
 * @param milestonesUrl milestones_url
 * @param mirrorUrl mirror_url
 * @param name The name of the repository.
 * @param nodeId node_id
 * @param notificationsUrl notifications_url
 * @param openIssues open_issues
 * @param openIssuesCount open_issues_count
 * @param owner A GitHub user.
 * @param permissions permissions
 * @param privateValue Whether the repository is private or public.
 * @param pullRequestCreationPolicy The policy controlling who can create pull requests: all or collaborators_only.
 * @param pullsUrl pulls_url
 * @param pushedAt pushed_at
 * @param releasesUrl releases_url
 * @param size The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially
 *     created, the size is 0.
 * @param squashMergeCommitMessage The default value for a squash merge commit message: - {@code PR_BODY} - default to
 *     the pull request's body. - {@code COMMIT_MESSAGES} - default to the branch's commit messages. - {@code BLANK} -
 *     default to a blank commit message.
 * @param squashMergeCommitTitle The default value for a squash merge commit title: - {@code PR_TITLE} - default to the
 *     pull request's title. - {@code COMMIT_OR_PR_TITLE} - default to the commit's title (if only one commit) or the
 *     pull request's title (when more than one commit).
 * @param sshUrl ssh_url
 * @param stargazersCount stargazers_count
 * @param stargazersUrl stargazers_url
 * @param starredAt starred_at
 * @param statusesUrl statuses_url
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
 * @param visibility The repository visibility: public, private, or internal.
 * @param watchers watchers
 * @param watchersCount watchers_count
 * @param webCommitSignoffRequired Whether to require contributors to sign off on web-based commits
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/deployment-protection-rule-requested/requestBody/properties/pull_requests/items/properties/base/properties/repo")
public record GitHubWebhookRepository(
        @Nullable Boolean allowAutoMerge,
        @Nullable Boolean allowForking,
        @Nullable Boolean allowMergeCommit,
        @Nullable Boolean allowRebaseMerge,
        @Nullable Boolean allowSquashMerge,
        @Nullable Boolean allowUpdateBranch,
        @Nullable Boolean anonymousAccessEnabled,
        String archiveUrl,
        boolean archived,
        String assigneesUrl,
        String blobsUrl,
        String branchesUrl,
        String cloneUrl,
        @Nullable GitHubWebhookRepositoryCodeSearchIndexStatus codeSearchIndexStatus,
        String collaboratorsUrl,
        String commentsUrl,
        String commitsUrl,
        String compareUrl,
        String contentsUrl,
        String contributorsUrl,
        @Nullable Instant createdAt,
        String defaultBranch,
        @Nullable Boolean deleteBranchOnMerge,
        String deploymentsUrl,
        @Nullable String description,
        boolean disabled,
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
        @Nullable Boolean hasDiscussions,
        boolean hasIssues,
        boolean hasPages,
        boolean hasProjects,
        @Nullable Boolean hasPullRequests,
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
        @Nullable GitHubWebhookLicenseSimple license,
        @Nullable GitHubWebhookRepositoryMergeCommitMessage mergeCommitMessage,
        @Nullable GitHubWebhookRepositoryMergeCommitTitle mergeCommitTitle,
        String mergesUrl,
        String milestonesUrl,
        @Nullable String mirrorUrl,
        String name,
        String nodeId,
        String notificationsUrl,
        long openIssues,
        long openIssuesCount,
        GitHubWebhookSimpleUser owner,
        @Nullable GitHubWebhookRepositoryPermissions permissions,
        @JsonProperty("private") boolean privateValue,
        @Nullable GitHubWebhookRepositoryPullRequestCreationPolicy pullRequestCreationPolicy,
        String pullsUrl,
        @Nullable Instant pushedAt,
        String releasesUrl,
        long size,
        @Nullable GitHubWebhookRepositorySquashMergeCommitMessage squashMergeCommitMessage,
        @Nullable GitHubWebhookRepositorySquashMergeCommitTitle squashMergeCommitTitle,
        String sshUrl,
        long stargazersCount,
        String stargazersUrl,
        @Nullable String starredAt,
        String statusesUrl,
        String subscribersUrl,
        String subscriptionUrl,
        String svnUrl,
        String tagsUrl,
        String teamsUrl,
        @Nullable String tempCloneToken,
        @Nullable List<String> topics,
        String treesUrl,
        @Nullable Instant updatedAt,
        String url,
        @Nullable String visibility,
        long watchers,
        long watchersCount,
        @Nullable Boolean webCommitSignoffRequired) {
    public GitHubWebhookRepository {
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
        requireNonNull(owner, "owner");
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
        requireNonNull(treesUrl, "treesUrl");
        requireNonNull(url, "url");
    }
}
