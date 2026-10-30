package io.github.piotr_janczukowicz.github.webhook.release;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedChangesBody;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookReactions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;
import java.util.List;

final class ReleaseCatalogFixtures {

    private ReleaseCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookRelease webhookRelease() {
        return GitHubWebhookReleaseBuilder.builder()
                .assets(List.of(webhookReleaseAsset()))
                .assetsUrl("https://api.github.com/assets_url")
                .author(webhookReleaseAuthor())
                .body("body")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .discussionUrl("https://api.github.com/discussion_url")
                .draft(true)
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .immutable(true)
                .name("name")
                .nodeId("node_id")
                .prerelease(true)
                .publishedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .reactions(webhookReactions())
                .tagName("tag_name")
                .tarballUrl("https://api.github.com/tarball_url")
                .targetCommitish("target_commitish")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .uploadUrl("https://api.github.com/upload_url{/id}")
                .url("https://api.github.com/url")
                .zipballUrl("https://api.github.com/zipball_url")
                .build();
    }

    static GitHubWebhookReleaseAsset webhookReleaseAsset() {
        return GitHubWebhookReleaseAssetBuilder.builder()
                .browserDownloadUrl("https://api.github.com/browser_download_url")
                .contentType("content_type")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .digest("digest")
                .downloadCount(1L)
                .id(1L)
                .label("label")
                .name("name")
                .nodeId("node_id")
                .size(1L)
                .state(GitHubWebhookReleaseAssetState.UPLOADED)
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .uploader(webhookUser())
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookReleaseAuthor webhookReleaseAuthor() {
        return GitHubWebhookReleaseAuthorBuilder.builder()
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

    static GitHubWebhookReleaseCreatedEvent webhookReleaseCreatedEvent() {
        return GitHubWebhookReleaseCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .release(webhookRelease())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookReleaseDeletedEvent webhookReleaseDeletedEvent() {
        return GitHubWebhookReleaseDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .release(webhookRelease())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookReleaseEditedChanges webhookReleaseEditedChanges() {
        return GitHubWebhookReleaseEditedChangesBuilder.builder()
                .body(webhookIssuesEditedChangesBody())
                .makeLatest(webhookReleaseEditedChangesMakeLatest())
                .name(webhookIssuesEditedChangesBody())
                .tagName(webhookIssuesEditedChangesBody())
                .build();
    }

    static GitHubWebhookReleaseEditedChangesMakeLatest webhookReleaseEditedChangesMakeLatest() {
        return GitHubWebhookReleaseEditedChangesMakeLatestBuilder.builder()
                .to(true)
                .build();
    }

    static GitHubWebhookReleaseEditedEvent webhookReleaseEditedEvent() {
        return GitHubWebhookReleaseEditedEventBuilder.builder()
                .changes(webhookReleaseEditedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .release(webhookRelease())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookReleasePrereleasedEvent webhookReleasePrereleasedEvent() {
        return GitHubWebhookReleasePrereleasedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .release(webhookRelease())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookReleasePublishedEvent webhookReleasePublishedEvent() {
        return GitHubWebhookReleasePublishedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .release(webhookRelease())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookReleaseReleasedEvent webhookReleaseReleasedEvent() {
        return GitHubWebhookReleaseReleasedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .release(webhookRelease())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookReleaseUnpublishedEvent webhookReleaseUnpublishedEvent() {
        return GitHubWebhookReleaseUnpublishedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .release(webhookRelease())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
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
                .type(GitHubWebhookUserType.BOT)
                .url("https://api.github.com/url")
                .build();
    }
}
