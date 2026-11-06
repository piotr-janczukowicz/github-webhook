package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPublicMonitoringAlertWebhookValidity;
import java.time.Instant;
import java.util.Map;

final class SecretScanningPublicMonitoringAlertCatalogFixtures {

    private SecretScanningPublicMonitoringAlertCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookBaseGist webhookBaseGist() {
        return GitHubWebhookBaseGistBuilder.builder()
                .comments(1L)
                .commentsEnabled(true)
                .commentsUrl("https://api.github.com/comments_url")
                .commitsUrl("https://api.github.com/commits_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .files(Map.of("key", webhookBaseGistFiles()))
                .forksUrl("https://api.github.com/forks_url")
                .gitPullUrl("https://api.github.com/git_pull_url")
                .gitPushUrl("https://api.github.com/git_push_url")
                .htmlUrl("https://api.github.com/html_url")
                .id("id")
                .nodeId("node_id")
                .owner(webhookSimpleUser())
                .publicValue(true)
                .truncated(true)
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookBaseGistFiles webhookBaseGistFiles() {
        return GitHubWebhookBaseGistFilesBuilder.builder()
                .encoding("encoding")
                .filename("filename")
                .language("language")
                .rawUrl("raw_url")
                .size(1L)
                .type("type")
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhook webhookPublicMonitoringAlertWebhook() {
        return GitHubWebhookPublicMonitoringAlertWebhookBuilder.builder()
                .attribution(webhookPublicMonitoringAlertWebhookAttribution())
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .gist(webhookBaseGist())
                .number(1L)
                .repository(webhookPublicMonitoringAlertWebhookRepository())
                .secretType("secret_type")
                .secretTypeDisplayName("secret_type_display_name")
                .url("https://api.github.com/url")
                .validity(GitHubWebhookPublicMonitoringAlertWebhookValidity.ACTIVE)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttribution webhookPublicMonitoringAlertWebhookAttribution() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionBuilder.builder()
                .actionsLog(webhookPublicMonitoringAlertWebhookAttributionActionsLog())
                .commit(webhookPublicMonitoringAlertWebhookAttributionCommit())
                .commitComment(webhookPublicMonitoringAlertWebhookAttributionActionsLog())
                .commitMetadata(webhookPublicMonitoringAlertWebhookAttributionActionsLog())
                .committerEmail("committer_email")
                .discussionBody(webhookPublicMonitoringAlertWebhookAttributionDiscussionBody())
                .discussionComment(webhookPublicMonitoringAlertWebhookAttributionDiscussionComment())
                .discussionTitle(webhookPublicMonitoringAlertWebhookAttributionDiscussionTitle())
                .gistBlob(webhookPublicMonitoringAlertWebhookAttributionActionsLog())
                .issueBody(webhookPublicMonitoringAlertWebhookAttributionIssueBody())
                .issueComment(webhookPublicMonitoringAlertWebhookAttributionIssueComment())
                .issueTitle(webhookPublicMonitoringAlertWebhookAttributionIssueTitle())
                .method(GitHubWebhookPublicMonitoringAlertWebhookAttributionMethod.MEMBER_ACTIVITY)
                .pullRequestBody(webhookPublicMonitoringAlertWebhookAttributionPullRequestBody())
                .pullRequestComment(webhookPublicMonitoringAlertWebhookAttributionPullRequestComment())
                .pullRequestReview(webhookPublicMonitoringAlertWebhookAttributionPullRequestReview())
                .pullRequestReviewComment(webhookPublicMonitoringAlertWebhookAttributionPullRequestReviewComment())
                .pullRequestTimelineComment(webhookPublicMonitoringAlertWebhookAttributionActionsLog())
                .pullRequestTitle(webhookPublicMonitoringAlertWebhookAttributionPullRequestTitle())
                .secretAuthor(webhookPublicMonitoringAlertWebhookAttributionSecretAuthor())
                .wikiCommit(webhookPublicMonitoringAlertWebhookAttributionWikiCommit())
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionActionsLog
            webhookPublicMonitoringAlertWebhookAttributionActionsLog() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionActionsLogBuilder.builder()
                .blobSha("blob_sha")
                .commitSha("commit_sha")
                .contentId(1L)
                .contentNumber(1L)
                .endColumn(1L)
                .endLine(1L)
                .htmlUrl("https://api.github.com/html_url")
                .path("path")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionCommit
            webhookPublicMonitoringAlertWebhookAttributionCommit() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionCommitBuilder.builder()
                .blobSha("af5626b4a114abcb82d63db7c8082c3c4756e51b")
                .blobUrl("blob_url")
                .commitSha("af5626b4a114abcb82d63db7c8082c3c4756e51b")
                .commitUrl("commit_url")
                .contentId(1L)
                .contentNumber(1L)
                .endColumn(1L)
                .endLine(1L)
                .htmlUrl("https://github.com/octocat/Hello-World/blob/af5626b/example/secrets.txt#L1-L1")
                .path("/example/secrets.txt")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionDiscussionBody
            webhookPublicMonitoringAlertWebhookAttributionDiscussionBody() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionDiscussionBodyBuilder.builder()
                .blobSha("blob_sha")
                .commitSha("commit_sha")
                .contentId(1L)
                .contentNumber(1L)
                .discussionBodyUrl("https://github.com/community/community/discussions/39082#discussion-4566270")
                .endColumn(1L)
                .endLine(1L)
                .htmlUrl("https://api.github.com/html_url")
                .path("path")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionDiscussionComment
            webhookPublicMonitoringAlertWebhookAttributionDiscussionComment() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionDiscussionCommentBuilder.builder()
                .blobSha("blob_sha")
                .commitSha("commit_sha")
                .contentId(1L)
                .contentNumber(1L)
                .discussionCommentUrl(
                        "https://github.com/community/community/discussions/39082#discussioncomment-4158232")
                .endColumn(1L)
                .endLine(1L)
                .htmlUrl("https://api.github.com/html_url")
                .path("path")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionDiscussionTitle
            webhookPublicMonitoringAlertWebhookAttributionDiscussionTitle() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionDiscussionTitleBuilder.builder()
                .blobSha("blob_sha")
                .commitSha("commit_sha")
                .contentId(1L)
                .contentNumber(1L)
                .discussionTitleUrl("https://github.com/community/community/discussions/39082")
                .endColumn(1L)
                .endLine(1L)
                .htmlUrl("https://api.github.com/html_url")
                .path("path")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionIssueBody
            webhookPublicMonitoringAlertWebhookAttributionIssueBody() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionIssueBodyBuilder.builder()
                .blobSha("blob_sha")
                .commitSha("commit_sha")
                .contentId(1L)
                .contentNumber(1L)
                .endColumn(1L)
                .endLine(1L)
                .htmlUrl("https://github.com/octocat/Hello-World/issues/1")
                .issueBodyUrl("https://api.github.com/repos/octocat/Hello-World/issues/1347")
                .path("path")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionIssueComment
            webhookPublicMonitoringAlertWebhookAttributionIssueComment() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionIssueCommentBuilder.builder()
                .blobSha("blob_sha")
                .commitSha("commit_sha")
                .contentId(1L)
                .contentNumber(1L)
                .endColumn(1L)
                .endLine(1L)
                .htmlUrl("https://github.com/octocat/Hello-World/issues/1#issuecomment-1081119451")
                .issueCommentUrl("https://api.github.com/repos/octocat/Hello-World/issues/comments/1081119451")
                .path("path")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionIssueTitle
            webhookPublicMonitoringAlertWebhookAttributionIssueTitle() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionIssueTitleBuilder.builder()
                .blobSha("blob_sha")
                .commitSha("commit_sha")
                .contentId(1L)
                .contentNumber(1L)
                .endColumn(1L)
                .endLine(1L)
                .htmlUrl("https://github.com/octocat/Hello-World/issues/1")
                .issueTitleUrl("https://api.github.com/repos/octocat/Hello-World/issues/1347")
                .path("path")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestBody
            webhookPublicMonitoringAlertWebhookAttributionPullRequestBody() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestBodyBuilder.builder()
                .blobSha("blob_sha")
                .commitSha("commit_sha")
                .contentId(1L)
                .contentNumber(1L)
                .endColumn(1L)
                .endLine(1L)
                .htmlUrl("https://github.com/octocat/Hello-World/pull/2846")
                .path("path")
                .pullRequestBodyUrl("https://api.github.com/repos/octocat/Hello-World/pulls/2846")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestComment
            webhookPublicMonitoringAlertWebhookAttributionPullRequestComment() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestCommentBuilder.builder()
                .blobSha("blob_sha")
                .commitSha("commit_sha")
                .contentId(1L)
                .contentNumber(1L)
                .endColumn(1L)
                .endLine(1L)
                .htmlUrl("https://github.com/octocat/Hello-World/pull/2846#issuecomment-1081119451")
                .path("path")
                .pullRequestCommentUrl("https://api.github.com/repos/octocat/Hello-World/issues/comments/1081119451")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestReview
            webhookPublicMonitoringAlertWebhookAttributionPullRequestReview() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestReviewBuilder.builder()
                .blobSha("blob_sha")
                .commitSha("commit_sha")
                .contentId(1L)
                .contentNumber(1L)
                .endColumn(1L)
                .endLine(1L)
                .htmlUrl("https://github.com/octocat/Hello-World/pull/2846#pullrequestreview-80")
                .path("path")
                .pullRequestReviewUrl("https://api.github.com/repos/octocat/Hello-World/pulls/2846/reviews/80")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestReviewComment
            webhookPublicMonitoringAlertWebhookAttributionPullRequestReviewComment() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestReviewCommentBuilder.builder()
                .blobSha("blob_sha")
                .commitSha("commit_sha")
                .contentId(1L)
                .contentNumber(1L)
                .endColumn(1L)
                .endLine(1L)
                .htmlUrl("https://github.com/octocat/Hello-World/pull/2846#discussion_r12")
                .path("path")
                .pullRequestReviewCommentUrl("https://api.github.com/repos/octocat/Hello-World/pulls/comments/12")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestTitle
            webhookPublicMonitoringAlertWebhookAttributionPullRequestTitle() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestTitleBuilder.builder()
                .blobSha("blob_sha")
                .commitSha("commit_sha")
                .contentId(1L)
                .contentNumber(1L)
                .endColumn(1L)
                .endLine(1L)
                .htmlUrl("https://github.com/octocat/Hello-World/pull/2846")
                .path("path")
                .pullRequestTitleUrl("https://api.github.com/repos/octocat/Hello-World/pulls/2846")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionSecretAuthor
            webhookPublicMonitoringAlertWebhookAttributionSecretAuthor() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionSecretAuthorBuilder.builder()
                .avatarUrl("https://github.com/images/error/octocat_happy.gif")
                .email("email")
                .eventsUrl("https://api.github.com/users/octocat/events{/privacy}")
                .followersUrl("https://api.github.com/users/octocat/followers")
                .followingUrl("https://api.github.com/users/octocat/following{/other_user}")
                .gistsUrl("https://api.github.com/users/octocat/gists{/gist_id}")
                .gravatarId("41d064eb2195891e12d0413f63227ea7")
                .htmlUrl("https://github.com/octocat")
                .id(1L)
                .login("octocat")
                .name("name")
                .nodeId("MDQ6VXNlcjE=")
                .organizationsUrl("https://api.github.com/users/octocat/orgs")
                .receivedEventsUrl("https://api.github.com/users/octocat/received_events")
                .reposUrl("https://api.github.com/users/octocat/repos")
                .siteAdmin(true)
                .starredAt(Instant.parse("2026-01-01T00:00:00Z"))
                .starredUrl("https://api.github.com/users/octocat/starred{/owner}{/repo}")
                .subscriptionsUrl("https://api.github.com/users/octocat/subscriptions")
                .type("User")
                .url("https://api.github.com/users/octocat")
                .userViewType("public")
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookAttributionWikiCommit
            webhookPublicMonitoringAlertWebhookAttributionWikiCommit() {
        return GitHubWebhookPublicMonitoringAlertWebhookAttributionWikiCommitBuilder.builder()
                .blobSha("af5626b4a114abcb82d63db7c8082c3c4756e51b")
                .commitSha("302c0b7e200761c9dd9b57e57db540ee0b4293a5")
                .commitUrl(
                        "https://github.com/octocat/Hello-World/wiki/_compare/302c0b7e200761c9dd9b57e57db540ee0b4293a5")
                .contentId(1L)
                .contentNumber(1L)
                .endColumn(1L)
                .endLine(1L)
                .htmlUrl("https://api.github.com/html_url")
                .pageUrl("https://github.com/octocat/Hello-World/wiki/Home/302c0b7e200761c9dd9b57e57db540ee0b4293a5")
                .path("/example/Home.md")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookPublicMonitoringAlertWebhookRepository webhookPublicMonitoringAlertWebhookRepository() {
        return GitHubWebhookPublicMonitoringAlertWebhookRepositoryBuilder.builder()
                .archiveUrl("https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}")
                .assigneesUrl("https://api.github.com/repos/octocat/Hello-World/assignees{/user}")
                .blobsUrl("https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}")
                .branchesUrl("https://api.github.com/repos/octocat/Hello-World/branches{/branch}")
                .collaboratorsUrl("https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}")
                .commentsUrl("https://api.github.com/repos/octocat/Hello-World/comments{/number}")
                .commitsUrl("https://api.github.com/repos/octocat/Hello-World/commits{/sha}")
                .compareUrl("https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}")
                .contentsUrl("https://api.github.com/repos/octocat/Hello-World/contents/{+path}")
                .contributorsUrl("https://api.github.com/repos/octocat/Hello-World/contributors")
                .deploymentsUrl("https://api.github.com/repos/octocat/Hello-World/deployments")
                .description("This your first repo!")
                .downloadsUrl("https://api.github.com/repos/octocat/Hello-World/downloads")
                .eventsUrl("https://api.github.com/repos/octocat/Hello-World/events")
                .fork(true)
                .forksUrl("https://api.github.com/repos/octocat/Hello-World/forks")
                .fullName("octocat/Hello-World")
                .gitCommitsUrl("https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}")
                .gitRefsUrl("https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}")
                .gitTagsUrl("https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}")
                .hooksUrl("https://api.github.com/repos/octocat/Hello-World/hooks")
                .htmlUrl("https://github.com/octocat/Hello-World")
                .id(1_296_269L)
                .issueCommentUrl("https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}")
                .issueEventsUrl("https://api.github.com/repos/octocat/Hello-World/issues/events{/number}")
                .issuesUrl("https://api.github.com/repos/octocat/Hello-World/issues{/number}")
                .keysUrl("https://api.github.com/repos/octocat/Hello-World/keys{/key_id}")
                .labelsUrl("https://api.github.com/repos/octocat/Hello-World/labels{/name}")
                .languagesUrl("https://api.github.com/repos/octocat/Hello-World/languages")
                .mergesUrl("https://api.github.com/repos/octocat/Hello-World/merges")
                .milestonesUrl("https://api.github.com/repos/octocat/Hello-World/milestones{/number}")
                .name("Hello-World")
                .nodeId("MDEwOlJlcG9zaXRvcnkxMjk2MjY5")
                .notificationsUrl(
                        "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}")
                .owner(webhookSimpleUser())
                .privateValue(true)
                .pullsUrl("https://api.github.com/repos/octocat/Hello-World/pulls{/number}")
                .releasesUrl("https://api.github.com/repos/octocat/Hello-World/releases{/id}")
                .stargazersUrl("https://api.github.com/repos/octocat/Hello-World/stargazers")
                .statusesUrl("https://api.github.com/repos/octocat/Hello-World/statuses/{sha}")
                .subscribersUrl("https://api.github.com/repos/octocat/Hello-World/subscribers")
                .subscriptionUrl("https://api.github.com/repos/octocat/Hello-World/subscription")
                .tagsUrl("https://api.github.com/repos/octocat/Hello-World/tags")
                .teamsUrl("https://api.github.com/repos/octocat/Hello-World/teams")
                .treesUrl("https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}")
                .url("https://api.github.com/repos/octocat/Hello-World")
                .build();
    }

    static GitHubWebhookSecretScanningPublicMonitoringAlertCreatedEvent
            webhookSecretScanningPublicMonitoringAlertCreatedEvent() {
        return GitHubWebhookSecretScanningPublicMonitoringAlertCreatedEventBuilder.builder()
                .alert(webhookPublicMonitoringAlertWebhook())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .build();
    }

    static GitHubWebhookSecretScanningPublicMonitoringAlertDismissedEvent
            webhookSecretScanningPublicMonitoringAlertDismissedEvent() {
        return GitHubWebhookSecretScanningPublicMonitoringAlertDismissedEventBuilder.builder()
                .alert(webhookPublicMonitoringAlertWebhook())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSecretScanningPublicMonitoringAlertReopenedEvent
            webhookSecretScanningPublicMonitoringAlertReopenedEvent() {
        return GitHubWebhookSecretScanningPublicMonitoringAlertReopenedEventBuilder.builder()
                .alert(webhookPublicMonitoringAlertWebhook())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSecretScanningPublicMonitoringAlertValidatedEvent
            webhookSecretScanningPublicMonitoringAlertValidatedEvent() {
        return GitHubWebhookSecretScanningPublicMonitoringAlertValidatedEventBuilder.builder()
                .alert(webhookPublicMonitoringAlertWebhook())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .build();
    }
}
