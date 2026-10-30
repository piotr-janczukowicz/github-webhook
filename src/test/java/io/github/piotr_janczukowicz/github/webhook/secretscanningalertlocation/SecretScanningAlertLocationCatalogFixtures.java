package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSecretScanningAlertCreatedAlert;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class SecretScanningAlertLocationCatalogFixtures {

    private SecretScanningAlertLocationCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookCreatedLocationDetailsDiscussionCommentUrl webhookCreatedLocationDetailsDiscussionCommentUrl() {
        return GitHubWebhookCreatedLocationDetailsDiscussionCommentUrlBuilder.builder()
                .discussionCommentUrl(
                        "https://github.com/community/community/discussions/39082#discussioncomment-4158232")
                .build();
    }

    static GitHubWebhookCreatedLocationDetailsPullRequestCommentUrl
            webhookCreatedLocationDetailsPullRequestCommentUrl() {
        return GitHubWebhookCreatedLocationDetailsPullRequestCommentUrlBuilder.builder()
                .htmlUrl("https://github.com/octocat/Hello-World/pull/2846#issuecomment-1081119451")
                .pullRequestCommentUrl("https://api.github.com/repos/octocat/Hello-World/issues/comments/1081119451")
                .build();
    }

    static GitHubWebhookCreatedLocationDetailsPullRequestReviewCommentUrl
            webhookCreatedLocationDetailsPullRequestReviewCommentUrl() {
        return GitHubWebhookCreatedLocationDetailsPullRequestReviewCommentUrlBuilder.builder()
                .htmlUrl("https://github.com/octocat/Hello-World/pull/2846#discussion_r12")
                .pullRequestReviewCommentUrl("https://api.github.com/repos/octocat/Hello-World/pulls/comments/12")
                .build();
    }

    static GitHubWebhookCreatedLocationDetailsPullRequestReviewUrl webhookCreatedLocationDetailsPullRequestReviewUrl() {
        return GitHubWebhookCreatedLocationDetailsPullRequestReviewUrlBuilder.builder()
                .htmlUrl("https://github.com/octocat/Hello-World/pull/2846#pullrequestreview-80")
                .pullRequestReviewUrl("https://api.github.com/repos/octocat/Hello-World/pulls/2846/reviews/80")
                .build();
    }

    static GitHubWebhookCreatedLocationDetailsPullRequestTitleUrl webhookCreatedLocationDetailsPullRequestTitleUrl() {
        return GitHubWebhookCreatedLocationDetailsPullRequestTitleUrlBuilder.builder()
                .htmlUrl("https://github.com/octocat/Hello-World/pull/2846")
                .pullRequestTitleUrl("https://api.github.com/repos/octocat/Hello-World/pulls/2846")
                .build();
    }

    static GitHubWebhookSecretScanningAlertLocationCreatedEvent webhookSecretScanningAlertLocationCreatedEvent() {
        return GitHubWebhookSecretScanningAlertLocationCreatedEventBuilder.builder()
                .alert(webhookSecretScanningAlertCreatedAlert())
                .installation(webhookSimpleInstallation())
                .location(webhookSecretScanningAlertLocationCreatedLocation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSecretScanningAlertLocationCreatedLocation webhookSecretScanningAlertLocationCreatedLocation() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationBuilder.builder()
                .details(webhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrl())
                .type(GitHubWebhookSecretScanningAlertLocationCreatedLocationType.COMMIT)
                .build();
    }

    static GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrl
            webhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrl() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrlBuilder.builder()
                .blobSha("af5626b4a114abcb82d63db7c8082c3c4756e51b")
                .blobUrl("blob_url")
                .commitSha("af5626b4a114abcb82d63db7c8082c3c4756e51b")
                .commitUrl("commit_url")
                .endColumn(1.5)
                .endLine(1.5)
                .htmlUrl("https://github.com/octocat/Hello-World/blob/af5626b/example/secrets.txt#L1-L1")
                .path("/example/secrets.txt")
                .startColumn(1.5)
                .startLine(1.5)
                .build();
    }

    static GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionBodyUrl
            webhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionBodyUrl() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionBodyUrlBuilder.builder()
                .discussionBodyUrl("https://github.com/community/community/discussions/39082#discussion-4566270")
                .build();
    }

    static GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionTitleUrl
            webhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionTitleUrl() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionTitleUrlBuilder.builder()
                .discussionTitleUrl("https://github.com/community/community/discussions/39082")
                .build();
    }

    static GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueBodyUrl
            webhookSecretScanningAlertLocationCreatedLocationDetailsIssueBodyUrl() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueBodyUrlBuilder.builder()
                .htmlUrl("https://github.com/octocat/Hello-World/issues/1")
                .issueBodyUrl("https://api.github.com/repos/octocat/Hello-World/issues/1347")
                .build();
    }

    static GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueCommentUrl
            webhookSecretScanningAlertLocationCreatedLocationDetailsIssueCommentUrl() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueCommentUrlBuilder.builder()
                .htmlUrl("https://github.com/octocat/Hello-World/issues/1#issuecomment-1081119451")
                .issueCommentUrl("https://api.github.com/repos/octocat/Hello-World/issues/comments/1081119451")
                .build();
    }

    static GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueTitleUrl
            webhookSecretScanningAlertLocationCreatedLocationDetailsIssueTitleUrl() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueTitleUrlBuilder.builder()
                .htmlUrl("https://github.com/octocat/Hello-World/issues/1")
                .issueTitleUrl("https://api.github.com/repos/octocat/Hello-World/issues/1347")
                .build();
    }

    static GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrl
            webhookSecretScanningAlertLocationCreatedLocationDetailsPageUrl() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrlBuilder.builder()
                .blobSha("af5626b4a114abcb82d63db7c8082c3c4756e51b")
                .commitSha("302c0b7e200761c9dd9b57e57db540ee0b4293a5")
                .commitUrl(
                        "https://github.com/octocat/Hello-World/wiki/_compare/302c0b7e200761c9dd9b57e57db540ee0b4293a5")
                .endColumn(1.5)
                .endLine(1.5)
                .pageUrl("https://github.com/octocat/Hello-World/wiki/Home/302c0b7e200761c9dd9b57e57db540ee0b4293a5")
                .path("/example/Home.md")
                .startColumn(1.5)
                .startLine(1.5)
                .build();
    }

    static GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPullRequestBodyUrl
            webhookSecretScanningAlertLocationCreatedLocationDetailsPullRequestBodyUrl() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPullRequestBodyUrlBuilder.builder()
                .htmlUrl("https://github.com/octocat/Hello-World/pull/2846")
                .pullRequestBodyUrl("https://api.github.com/repos/octocat/Hello-World/pulls/2846")
                .build();
    }
}
