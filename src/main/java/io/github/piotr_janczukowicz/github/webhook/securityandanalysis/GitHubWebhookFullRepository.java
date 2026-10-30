package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookFullRepositorySecurityAndAnalysis;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookLicenseSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryMergeCommitMessage;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryMergeCommitTitle;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryPermissions;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryPullRequestCreationPolicy;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositorySquashMergeCommitMessage;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositorySquashMergeCommitTitle;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * Full Repository
 *
 * @param allowAutoMerge allow_auto_merge
 * @param allowForking allow_forking
 * @param allowMergeCommit allow_merge_commit
 * @param allowRebaseMerge allow_rebase_merge
 * @param allowSquashMerge allow_squash_merge
 * @param allowUpdateBranch allow_update_branch
 * @param anonymousAccessEnabled Whether anonymous git access is allowed.
 * @param archiveUrl archive_url
 * @param archived archived
 * @param assigneesUrl assignees_url
 * @param blobsUrl blobs_url
 * @param branchesUrl branches_url
 * @param cloneUrl clone_url
 * @param codeOfConduct Code of Conduct Simple
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
 * @param masterBranch master_branch
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
 * @param openIssues open_issues
 * @param openIssuesCount open_issues_count
 * @param organization organization
 * @param owner A GitHub user.
 * @param parent A repository on GitHub.
 * @param permissions permissions
 * @param privateValue private
 * @param pullRequestCreationPolicy The policy controlling who can create pull requests: all or collaborators_only.
 * @param pullsUrl pulls_url
 * @param pushedAt pushed_at
 * @param releasesUrl releases_url
 * @param securityAndAnalysis security_and_analysis
 * @param size The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially
 *     created, the size is 0.
 * @param source A repository on GitHub.
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
 * @param templateRepository template_repository
 * @param topics topics
 * @param treesUrl trees_url
 * @param updatedAt updated_at
 * @param url url
 * @param visibility The repository visibility: public, private, or internal.
 * @param watchers watchers
 * @param watchersCount watchers_count
 * @param webCommitSignoffRequired web_commit_signoff_required
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/security-and-analysis/requestBody/properties/repository")
public record GitHubWebhookFullRepository(
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
        @Nullable GitHubWebhookCodeOfConductSimple codeOfConduct,
        String collaboratorsUrl,
        String commentsUrl,
        String commitsUrl,
        String compareUrl,
        String contentsUrl,
        String contributorsUrl,
        Instant createdAt,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> customProperties,

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
        boolean hasDiscussions,
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
        @Nullable String masterBranch,
        @Nullable GitHubWebhookRepositoryMergeCommitMessage mergeCommitMessage,
        @Nullable GitHubWebhookRepositoryMergeCommitTitle mergeCommitTitle,
        String mergesUrl,
        String milestonesUrl,
        @Nullable String mirrorUrl,
        String name,
        long networkCount,
        String nodeId,
        String notificationsUrl,
        long openIssues,
        long openIssuesCount,
        @Nullable GitHubWebhookSimpleUser organization,
        GitHubWebhookSimpleUser owner,
        @Nullable GitHubWebhookRepository parent,
        @Nullable GitHubWebhookRepositoryPermissions permissions,
        @JsonProperty("private") boolean privateValue,
        @Nullable GitHubWebhookRepositoryPullRequestCreationPolicy pullRequestCreationPolicy,
        String pullsUrl,
        Instant pushedAt,
        String releasesUrl,
        @Nullable GitHubWebhookFullRepositorySecurityAndAnalysis securityAndAnalysis,
        long size,
        @Nullable GitHubWebhookRepository source,
        @Nullable GitHubWebhookRepositorySquashMergeCommitMessage squashMergeCommitMessage,
        @Nullable GitHubWebhookRepositorySquashMergeCommitTitle squashMergeCommitTitle,
        String sshUrl,
        long stargazersCount,
        String stargazersUrl,
        String statusesUrl,
        long subscribersCount,
        String subscribersUrl,
        String subscriptionUrl,
        String svnUrl,
        String tagsUrl,
        String teamsUrl,
        @Nullable String tempCloneToken,
        @Nullable GitHubWebhookRepository templateRepository,
        @Nullable List<String> topics,
        String treesUrl,
        Instant updatedAt,
        String url,
        @Nullable String visibility,
        long watchers,
        long watchersCount,
        @Nullable Boolean webCommitSignoffRequired) {
    public GitHubWebhookFullRepository {
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
        requireNonNull(owner, "owner");
        requireNonNull(pullsUrl, "pullsUrl");
        requireNonNull(pushedAt, "pushedAt");
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
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
