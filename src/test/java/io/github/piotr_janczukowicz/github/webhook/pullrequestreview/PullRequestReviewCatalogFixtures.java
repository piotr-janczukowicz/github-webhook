package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssueCommentEditedChanges;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedIssueAssignee;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookLabel;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookLicense;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookLink;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookPullRequestLinks;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookPullRequestStack;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookRepositoryPermissions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookTeamParent;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueActiveLockReason;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAssigneeType;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestAutoMergeMergeMethod;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryMergeCommitMessage;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryMergeCommitTitle;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryPullRequestCreationPolicy;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositorySquashMergeCommitMessage;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositorySquashMergeCommitTitle;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryVisibility;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamPrivacy;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;
import java.util.List;

final class PullRequestReviewCatalogFixtures {

    private PullRequestReviewCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookMilestone webhookMilestone() {
        return GitHubWebhookMilestoneBuilder.builder()
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .closedIssues(1L)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .creator(webhookUser())
                .description("description")
                .dueOn(Instant.parse("2026-01-01T00:00:00Z"))
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .labelsUrl("https://api.github.com/labels_url")
                .nodeId("node_id")
                .number(1L)
                .openIssues(1L)
                .state(GitHubWebhookMilestoneState.OPEN)
                .title("title")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookPullRequestAutoMerge webhookPullRequestAutoMerge() {
        return GitHubWebhookPullRequestAutoMergeBuilder.builder()
                .commitMessage("commit_message")
                .commitTitle("commit_title")
                .enabledBy(webhookPullRequestAutoMergeEnabledBy())
                .mergeMethod(GitHubWebhookPullRequestAutoMergeMergeMethod.MERGE)
                .build();
    }

    static GitHubWebhookPullRequestAutoMergeEnabledBy webhookPullRequestAutoMergeEnabledBy() {
        return GitHubWebhookPullRequestAutoMergeEnabledByBuilder.builder()
                .avatarUrl("https://api.github.com/avatar_url")
                .deleted(true)
                .email("email")
                .eventsUrl("https://api.github.com/events_url{/id}")
                .followersUrl("https://api.github.com/followers_url")
                .followingUrl("https://api.github.com/following_url{/id}")
                .gistsUrl("https://api.github.com/gists_url{/id}")
                .gravatarId("gravatar_id")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .login("login")
                .name("name")
                .nodeId("node_id")
                .organizationsUrl("https://api.github.com/organizations_url")
                .receivedEventsUrl("https://api.github.com/received_events_url")
                .reposUrl("https://api.github.com/repos_url")
                .siteAdmin(true)
                .starredUrl("https://api.github.com/starred_url{/id}")
                .subscriptionsUrl("https://api.github.com/subscriptions_url")
                .type(GitHubWebhookUserType.BOT)
                .url("https://api.github.com/url")
                .userViewType("user_view_type")
                .build();
    }

    static GitHubWebhookPullRequestReviewDismissedEvent webhookPullRequestReviewDismissedEvent() {
        return GitHubWebhookPullRequestReviewDismissedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .pullRequest(webhookSimplePullRequest())
                .repository(webhookForkRepository())
                .review(webhookPullRequestReviewDismissedReview())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookPullRequestReviewDismissedReview webhookPullRequestReviewDismissedReview() {
        return GitHubWebhookPullRequestReviewDismissedReviewBuilder.builder()
                .links(webhookPullRequestReviewEditedReviewLinks())
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .commitId("commit_id")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .nodeId("node_id")
                .pullRequestUrl("https://api.github.com/pull_request_url")
                .state(GitHubWebhookPullRequestReviewDismissedReviewState.DISMISSED)
                .submittedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookPullRequestReviewEditedEvent webhookPullRequestReviewEditedEvent() {
        return GitHubWebhookPullRequestReviewEditedEventBuilder.builder()
                .changes(webhookIssueCommentEditedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .pullRequest(webhookPullRequestReviewEditedPullRequest())
                .repository(webhookForkRepository())
                .review(webhookPullRequestReviewEditedReview())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookPullRequestReviewEditedPullRequest webhookPullRequestReviewEditedPullRequest() {
        return GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder()
                .links(webhookPullRequestLinks())
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookUser())
                .assignees(List.of(webhookIssuesEditedIssueAssignee()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .autoMerge(webhookPullRequestAutoMerge())
                .base(webhookPullRequestReviewEditedPullRequestBase())
                .body("body")
                .closedAt("closed_at")
                .commentsUrl("https://api.github.com/comments_url")
                .commitsUrl("https://api.github.com/commits_url")
                .createdAt("created_at")
                .diffUrl("https://api.github.com/diff_url")
                .draft(true)
                .head(webhookPullRequestReviewEditedPullRequestHead())
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueUrl("https://api.github.com/issue_url")
                .labels(List.of(webhookLabel()))
                .locked(true)
                .mergedAt("merged_at")
                .milestone(webhookMilestone())
                .nodeId("node_id")
                .number(1L)
                .patchUrl("https://api.github.com/patch_url")
                .requestedReviewers(List.of(webhookUser()))
                .requestedTeams(List.of(webhookSimplePullRequestRequestedTeam()))
                .reviewCommentUrl("https://api.github.com/review_comment_url{/id}")
                .reviewCommentsUrl("https://api.github.com/review_comments_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .statusesUrl("https://api.github.com/statuses_url")
                .title("title")
                .updatedAt("updated_at")
                .url("https://api.github.com/url")
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookPullRequestReviewEditedPullRequestBase webhookPullRequestReviewEditedPullRequestBase() {
        return GitHubWebhookPullRequestReviewEditedPullRequestBaseBuilder.builder()
                .label("label")
                .ref("ref")
                .repo(webhookPullRequestReviewEditedPullRequestBaseRepo())
                .sha("sha")
                .user(webhookPullRequestAutoMergeEnabledBy())
                .build();
    }

    static GitHubWebhookPullRequestReviewEditedPullRequestBaseRepo webhookPullRequestReviewEditedPullRequestBaseRepo() {
        return GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder()
                .allowAutoMerge(true)
                .allowForking(true)
                .allowMergeCommit(true)
                .allowRebaseMerge(true)
                .allowSquashMerge(true)
                .allowUpdateBranch(true)
                .archiveUrl("https://api.github.com/archive_url{/id}")
                .archived(true)
                .assigneesUrl("https://api.github.com/assignees_url{/id}")
                .blobsUrl("https://api.github.com/blobs_url{/id}")
                .branchesUrl("https://api.github.com/branches_url{/id}")
                .cloneUrl("https://api.github.com/clone_url")
                .collaboratorsUrl("https://api.github.com/collaborators_url{/id}")
                .commentsUrl("https://api.github.com/comments_url{/id}")
                .commitsUrl("https://api.github.com/commits_url{/id}")
                .compareUrl("https://api.github.com/compare_url{/id}")
                .contentsUrl("https://api.github.com/contents_url{/id}")
                .contributorsUrl("https://api.github.com/contributors_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .defaultBranch("default_branch")
                .deleteBranchOnMerge(true)
                .deploymentsUrl("https://api.github.com/deployments_url")
                .description("description")
                .disabled(true)
                .downloadsUrl("https://api.github.com/downloads_url")
                .eventsUrl("https://api.github.com/events_url")
                .fork(true)
                .forks(1L)
                .forksCount(1L)
                .forksUrl("https://api.github.com/forks_url")
                .fullName("full_name")
                .gitCommitsUrl("https://api.github.com/git_commits_url{/id}")
                .gitRefsUrl("https://api.github.com/git_refs_url{/id}")
                .gitTagsUrl("https://api.github.com/git_tags_url{/id}")
                .gitUrl("https://api.github.com/git_url")
                .hasDownloads(true)
                .hasIssues(true)
                .hasPages(true)
                .hasProjects(true)
                .hasWiki(true)
                .homepage("homepage")
                .hooksUrl("https://api.github.com/hooks_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .isTemplate(true)
                .issueCommentUrl("https://api.github.com/issue_comment_url{/id}")
                .issueEventsUrl("https://api.github.com/issue_events_url{/id}")
                .issuesUrl("https://api.github.com/issues_url{/id}")
                .keysUrl("https://api.github.com/keys_url{/id}")
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .language("language")
                .languagesUrl("https://api.github.com/languages_url")
                .license(webhookLicense())
                .masterBranch("master_branch")
                .mergesUrl("https://api.github.com/merges_url")
                .milestonesUrl("https://api.github.com/milestones_url{/id}")
                .mirrorUrl("https://api.github.com/mirror_url")
                .name("name")
                .nodeId("node_id")
                .notificationsUrl("https://api.github.com/notifications_url{/id}")
                .openIssues(1L)
                .openIssuesCount(1L)
                .organization("organization")
                .owner(webhookPullRequestAutoMergeEnabledBy())
                .permissions(webhookRepositoryPermissions())
                .privateValue(true)
                .publicValue(true)
                .pullsUrl("https://api.github.com/pulls_url{/id}")
                .pushedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .releasesUrl("https://api.github.com/releases_url{/id}")
                .roleName("role_name")
                .size(1L)
                .sshUrl("ssh_url")
                .stargazers(1L)
                .stargazersCount(1L)
                .stargazersUrl("https://api.github.com/stargazers_url")
                .statusesUrl("https://api.github.com/statuses_url{/id}")
                .subscribersUrl("https://api.github.com/subscribers_url")
                .subscriptionUrl("https://api.github.com/subscription_url")
                .svnUrl("https://api.github.com/svn_url")
                .tagsUrl("https://api.github.com/tags_url")
                .teamsUrl("https://api.github.com/teams_url")
                .topics(List.of("topics"))
                .treesUrl("https://api.github.com/trees_url{/id}")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .visibility(GitHubWebhookRepositoryVisibility.PUBLIC)
                .watchers(1L)
                .watchersCount(1L)
                .build();
    }

    static GitHubWebhookPullRequestReviewEditedPullRequestHead webhookPullRequestReviewEditedPullRequestHead() {
        return GitHubWebhookPullRequestReviewEditedPullRequestHeadBuilder.builder()
                .label("label")
                .ref("ref")
                .repo(webhookPullRequestReviewEditedPullRequestBaseRepo())
                .sha("sha")
                .user(webhookPullRequestAutoMergeEnabledBy())
                .build();
    }

    static GitHubWebhookPullRequestReviewEditedReview webhookPullRequestReviewEditedReview() {
        return GitHubWebhookPullRequestReviewEditedReviewBuilder.builder()
                .links(webhookPullRequestReviewEditedReviewLinks())
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .commitId("commit_id")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .nodeId("node_id")
                .pullRequestUrl("https://api.github.com/pull_request_url")
                .state("state")
                .submittedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .user(webhookPullRequestAutoMergeEnabledBy())
                .build();
    }

    static GitHubWebhookPullRequestReviewEditedReviewLinks webhookPullRequestReviewEditedReviewLinks() {
        return GitHubWebhookPullRequestReviewEditedReviewLinksBuilder.builder()
                .html(webhookLink())
                .pullRequest(webhookLink())
                .build();
    }

    static GitHubWebhookPullRequestReviewSubmittedEvent webhookPullRequestReviewSubmittedEvent() {
        return GitHubWebhookPullRequestReviewSubmittedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .pullRequest(webhookPullRequestReviewSubmittedPullRequest())
                .repository(webhookForkRepository())
                .review(webhookPullRequestReviewEditedReview())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookPullRequestReviewSubmittedPullRequest webhookPullRequestReviewSubmittedPullRequest() {
        return GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder()
                .links(webhookPullRequestLinks())
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookUser())
                .assignees(List.of(webhookIssuesEditedIssueAssignee()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .autoMerge(webhookPullRequestAutoMerge())
                .base(webhookSimplePullRequestBase())
                .body("body")
                .closedAt("closed_at")
                .commentsUrl("https://api.github.com/comments_url")
                .commitsUrl("https://api.github.com/commits_url")
                .createdAt("created_at")
                .diffUrl("https://api.github.com/diff_url")
                .draft(true)
                .head(webhookPullRequestReviewSubmittedPullRequestHead())
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueUrl("https://api.github.com/issue_url")
                .labels(List.of(webhookLabel()))
                .locked(true)
                .mergedAt("merged_at")
                .milestone(webhookMilestone())
                .nodeId("node_id")
                .number(1L)
                .patchUrl("https://api.github.com/patch_url")
                .requestedReviewers(List.of(webhookUser()))
                .requestedTeams(List.of(webhookSimplePullRequestRequestedTeam()))
                .reviewCommentUrl("https://api.github.com/review_comment_url{/id}")
                .reviewCommentsUrl("https://api.github.com/review_comments_url")
                .stack(webhookPullRequestStack())
                .state(GitHubWebhookMilestoneState.OPEN)
                .statusesUrl("https://api.github.com/statuses_url")
                .title("title")
                .updatedAt("updated_at")
                .url("https://api.github.com/url")
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookPullRequestReviewSubmittedPullRequestHead webhookPullRequestReviewSubmittedPullRequestHead() {
        return GitHubWebhookPullRequestReviewSubmittedPullRequestHeadBuilder.builder()
                .label("label")
                .ref("ref")
                .repo(webhookSimplePullRequestBaseRepo())
                .sha("sha")
                .user(webhookPullRequestAutoMergeEnabledBy())
                .build();
    }

    static GitHubWebhookSimplePullRequest webhookSimplePullRequest() {
        return GitHubWebhookSimplePullRequestBuilder.builder()
                .links(webhookPullRequestLinks())
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookUser())
                .assignees(List.of(webhookIssuesEditedIssueAssignee()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .autoMerge(webhookPullRequestAutoMerge())
                .base(webhookSimplePullRequestBase())
                .body("body")
                .closedAt("closed_at")
                .commentsUrl("https://api.github.com/comments_url")
                .commitsUrl("https://api.github.com/commits_url")
                .createdAt("created_at")
                .diffUrl("https://api.github.com/diff_url")
                .draft(true)
                .head(webhookSimplePullRequestHead())
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueUrl("https://api.github.com/issue_url")
                .labels(List.of(webhookLabel()))
                .locked(true)
                .mergedAt("merged_at")
                .milestone(webhookSimplePullRequestMilestone())
                .nodeId("node_id")
                .number(1L)
                .patchUrl("https://api.github.com/patch_url")
                .requestedReviewers(List.of(webhookUser()))
                .requestedTeams(List.of(webhookSimplePullRequestRequestedTeam()))
                .reviewCommentUrl("https://api.github.com/review_comment_url{/id}")
                .reviewCommentsUrl("https://api.github.com/review_comments_url")
                .stack(webhookPullRequestStack())
                .state(GitHubWebhookMilestoneState.OPEN)
                .statusesUrl("https://api.github.com/statuses_url")
                .title("title")
                .updatedAt("updated_at")
                .url("https://api.github.com/url")
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookSimplePullRequestBase webhookSimplePullRequestBase() {
        return GitHubWebhookSimplePullRequestBaseBuilder.builder()
                .label("label")
                .ref("ref")
                .repo(webhookSimplePullRequestBaseRepo())
                .sha("sha")
                .user(webhookPullRequestAutoMergeEnabledBy())
                .build();
    }

    static GitHubWebhookSimplePullRequestBaseRepo webhookSimplePullRequestBaseRepo() {
        return GitHubWebhookSimplePullRequestBaseRepoBuilder.builder()
                .allowAutoMerge(true)
                .allowForking(true)
                .allowMergeCommit(true)
                .allowRebaseMerge(true)
                .allowSquashMerge(true)
                .allowUpdateBranch(true)
                .archiveUrl("https://api.github.com/archive_url{/id}")
                .archived(true)
                .assigneesUrl("https://api.github.com/assignees_url{/id}")
                .blobsUrl("https://api.github.com/blobs_url{/id}")
                .branchesUrl("https://api.github.com/branches_url{/id}")
                .cloneUrl("https://api.github.com/clone_url")
                .collaboratorsUrl("https://api.github.com/collaborators_url{/id}")
                .commentsUrl("https://api.github.com/comments_url{/id}")
                .commitsUrl("https://api.github.com/commits_url{/id}")
                .compareUrl("https://api.github.com/compare_url{/id}")
                .contentsUrl("https://api.github.com/contents_url{/id}")
                .contributorsUrl("https://api.github.com/contributors_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .defaultBranch("default_branch")
                .deleteBranchOnMerge(true)
                .deploymentsUrl("https://api.github.com/deployments_url")
                .description("description")
                .disabled(true)
                .downloadsUrl("https://api.github.com/downloads_url")
                .eventsUrl("https://api.github.com/events_url")
                .fork(true)
                .forks(1L)
                .forksCount(1L)
                .forksUrl("https://api.github.com/forks_url")
                .fullName("full_name")
                .gitCommitsUrl("https://api.github.com/git_commits_url{/id}")
                .gitRefsUrl("https://api.github.com/git_refs_url{/id}")
                .gitTagsUrl("https://api.github.com/git_tags_url{/id}")
                .gitUrl("https://api.github.com/git_url")
                .hasDiscussions(true)
                .hasDownloads(true)
                .hasIssues(true)
                .hasPages(true)
                .hasProjects(true)
                .hasPullRequests(true)
                .hasWiki(true)
                .homepage("homepage")
                .hooksUrl("https://api.github.com/hooks_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .isTemplate(true)
                .issueCommentUrl("https://api.github.com/issue_comment_url{/id}")
                .issueEventsUrl("https://api.github.com/issue_events_url{/id}")
                .issuesUrl("https://api.github.com/issues_url{/id}")
                .keysUrl("https://api.github.com/keys_url{/id}")
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .language("language")
                .languagesUrl("https://api.github.com/languages_url")
                .license(webhookLicense())
                .masterBranch("master_branch")
                .mergeCommitMessage(GitHubWebhookRepositoryMergeCommitMessage.PR_BODY)
                .mergeCommitTitle(GitHubWebhookRepositoryMergeCommitTitle.PR_TITLE)
                .mergesUrl("https://api.github.com/merges_url")
                .milestonesUrl("https://api.github.com/milestones_url{/id}")
                .mirrorUrl("https://api.github.com/mirror_url")
                .name("name")
                .nodeId("node_id")
                .notificationsUrl("https://api.github.com/notifications_url{/id}")
                .openIssues(1L)
                .openIssuesCount(1L)
                .organization("organization")
                .owner(webhookPullRequestAutoMergeEnabledBy())
                .permissions(webhookRepositoryPermissions())
                .privateValue(true)
                .publicValue(true)
                .pullRequestCreationPolicy(GitHubWebhookRepositoryPullRequestCreationPolicy.ALL)
                .pullsUrl("https://api.github.com/pulls_url{/id}")
                .pushedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .releasesUrl("https://api.github.com/releases_url{/id}")
                .roleName("role_name")
                .size(1L)
                .squashMergeCommitMessage(GitHubWebhookRepositorySquashMergeCommitMessage.PR_BODY)
                .squashMergeCommitTitle(GitHubWebhookRepositorySquashMergeCommitTitle.PR_TITLE)
                .sshUrl("ssh_url")
                .stargazers(1L)
                .stargazersCount(1L)
                .stargazersUrl("https://api.github.com/stargazers_url")
                .statusesUrl("https://api.github.com/statuses_url{/id}")
                .subscribersUrl("https://api.github.com/subscribers_url")
                .subscriptionUrl("https://api.github.com/subscription_url")
                .svnUrl("https://api.github.com/svn_url")
                .tagsUrl("https://api.github.com/tags_url")
                .teamsUrl("https://api.github.com/teams_url")
                .topics(List.of("topics"))
                .treesUrl("https://api.github.com/trees_url{/id}")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .visibility(GitHubWebhookRepositoryVisibility.PUBLIC)
                .watchers(1L)
                .watchersCount(1L)
                .webCommitSignoffRequired(true)
                .build();
    }

    static GitHubWebhookSimplePullRequestHead webhookSimplePullRequestHead() {
        return GitHubWebhookSimplePullRequestHeadBuilder.builder()
                .label("label")
                .ref("ref")
                .repo(webhookSimplePullRequestBaseRepo())
                .sha("sha")
                .user(webhookPullRequestAutoMergeEnabledBy())
                .build();
    }

    static GitHubWebhookSimplePullRequestMilestone webhookSimplePullRequestMilestone() {
        return GitHubWebhookSimplePullRequestMilestoneBuilder.builder()
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .closedIssues(1L)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .creator(webhookPullRequestAutoMergeEnabledBy())
                .description("description")
                .dueOn(Instant.parse("2026-01-01T00:00:00Z"))
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .labelsUrl("https://api.github.com/labels_url")
                .nodeId("node_id")
                .number(1L)
                .openIssues(1L)
                .state(GitHubWebhookMilestoneState.OPEN)
                .title("title")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookSimplePullRequestRequestedTeam webhookSimplePullRequestRequestedTeam() {
        return GitHubWebhookSimplePullRequestRequestedTeamBuilder.builder()
                .deleted(true)
                .description("description")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .membersUrl("https://api.github.com/members_url{/id}")
                .name("name")
                .nodeId("node_id")
                .parent(webhookTeamParent())
                .permission("permission")
                .privacy(GitHubWebhookTeamPrivacy.OPEN)
                .repositoriesUrl("https://api.github.com/repositories_url")
                .slug("slug")
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookTeam webhookTeam() {
        return GitHubWebhookTeamBuilder.builder()
                .deleted(true)
                .description("description")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .membersUrl("https://api.github.com/members_url{/id}")
                .name("name")
                .nodeId("node_id")
                .parent(webhookTeamParent())
                .permission("permission")
                .privacy(GitHubWebhookTeamPrivacy.OPEN)
                .repositoriesUrl("https://api.github.com/repositories_url")
                .slug("slug")
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookUser webhookUser() {
        return GitHubWebhookUserBuilder.builder()
                .avatarUrl("https://api.github.com/avatar_url")
                .deleted(true)
                .email("email")
                .eventsUrl("https://api.github.com/events_url{/id}")
                .followersUrl("https://api.github.com/followers_url")
                .followingUrl("https://api.github.com/following_url{/id}")
                .gistsUrl("https://api.github.com/gists_url{/id}")
                .gravatarId("gravatar_id")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .login("login")
                .name("name")
                .nodeId("node_id")
                .organizationsUrl("https://api.github.com/organizations_url")
                .receivedEventsUrl("https://api.github.com/received_events_url")
                .reposUrl("https://api.github.com/repos_url")
                .siteAdmin(true)
                .starredUrl("https://api.github.com/starred_url{/id}")
                .subscriptionsUrl("https://api.github.com/subscriptions_url")
                .type(GitHubWebhookIssueAssigneeType.BOT)
                .url("https://api.github.com/url")
                .userViewType("user_view_type")
                .build();
    }
}
