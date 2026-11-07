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
                .details(webhookSecretScanningAlertLocationCreatedLocationDetails())
                .type(GitHubWebhookSecretScanningAlertLocationCreatedLocationType.COMMIT)
                .build();
    }

    static GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails
            webhookSecretScanningAlertLocationCreatedLocationDetails() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBuilder.builder()
                .blobSha("af5626b4a114abcb82d63db7c8082c3c4756e51b")
                .blobUrl("blob_url")
                .commitSha("af5626b4a114abcb82d63db7c8082c3c4756e51b")
                .commitUrl("commit_url")
                .discussionBodyUrl("https://github.com/community/community/discussions/39082#discussion-4566270")
                .discussionCommentUrl(
                        "https://github.com/community/community/discussions/39082#discussioncomment-4158232")
                .discussionTitleUrl("https://github.com/community/community/discussions/39082")
                .endColumn(1)
                .endLine(1)
                .htmlUrl("https://github.com/octocat/Hello-World/blob/af5626b/example/secrets.txt#L1-L1")
                .issueBodyUrl("https://api.github.com/repos/octocat/Hello-World/issues/1347")
                .issueCommentUrl("https://api.github.com/repos/octocat/Hello-World/issues/comments/1081119451")
                .issueTitleUrl("https://api.github.com/repos/octocat/Hello-World/issues/1347")
                .pageUrl("https://github.com/octocat/Hello-World/wiki/Home/302c0b7e200761c9dd9b57e57db540ee0b4293a5")
                .path("/example/secrets.txt")
                .pullRequestBodyUrl("https://api.github.com/repos/octocat/Hello-World/pulls/2846")
                .pullRequestCommentUrl("https://api.github.com/repos/octocat/Hello-World/issues/comments/1081119451")
                .pullRequestReviewCommentUrl("https://api.github.com/repos/octocat/Hello-World/pulls/comments/12")
                .pullRequestReviewUrl("https://api.github.com/repos/octocat/Hello-World/pulls/2846/reviews/80")
                .pullRequestTitleUrl("https://api.github.com/repos/octocat/Hello-World/pulls/2846")
                .startColumn(1)
                .startLine(1)
                .build();
    }
}
