package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookPackagePublishedPackagePackageVersionPackageFile;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookPackageUpdatedPackagePackageVersionDockerMetadata;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookPackageVersionContainerMetadata;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookRubyGemsMetadata;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.util.List;
import java.util.Map;

final class PackageCatalogFixtures {

    private PackageCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookPackagePublishedEvent webhookPackagePublishedEvent() {
        return GitHubWebhookPackagePublishedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .packageValue(webhookPackagePublishedPackage())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookPackagePublishedPackage webhookPackagePublishedPackage() {
        return GitHubWebhookPackagePublishedPackageBuilder.builder()
                .createdAt("created_at")
                .description("description")
                .ecosystem("ecosystem")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .name("name")
                .namespace("namespace")
                .owner(webhookUser())
                .packageType("package_type")
                .packageVersion(webhookPackagePublishedPackagePackageVersion())
                .registry(webhookPackageUpdatedPackageRegistry())
                .updatedAt("updated_at")
                .build();
    }

    static GitHubWebhookPackagePublishedPackagePackageVersion webhookPackagePublishedPackagePackageVersion() {
        return GitHubWebhookPackagePublishedPackagePackageVersionBuilder.builder()
                .author(webhookUser())
                .body(Map.of("key", "body"))
                .bodyHtml("body_html")
                .containerMetadata(webhookPackageVersionContainerMetadata())
                .createdAt("created_at")
                .description("description")
                .dockerMetadata(List.of(webhookPackageUpdatedPackagePackageVersionDockerMetadata()))
                .draft(true)
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .installationCommand("installation_command")
                .manifest("manifest")
                .metadata(List.of(Map.of("key", Map.of())))
                .name("name")
                .npmMetadata(webhookPackagePublishedPackagePackageVersionNpmMetadata())
                .nugetMetadata(List.of(webhookPackagePublishedPackagePackageVersionNugetMetadata()))
                .packageFiles(List.of(webhookPackagePublishedPackagePackageVersionPackageFile()))
                .packageUrl("package_url")
                .prerelease(true)
                .release(webhookPackagePublishedPackagePackageVersionRelease())
                .rubygemsMetadata(List.of(webhookRubyGemsMetadata()))
                .sourceUrl("source_url")
                .summary("summary")
                .tagName("tag_name")
                .targetCommitish("target_commitish")
                .targetOid("target_oid")
                .updatedAt("updated_at")
                .version("version")
                .build();
    }

    static GitHubWebhookPackagePublishedPackagePackageVersionNpmMetadata
            webhookPackagePublishedPackagePackageVersionNpmMetadata() {
        return GitHubWebhookPackagePublishedPackagePackageVersionNpmMetadataBuilder.builder()
                .author(Map.of("key", Map.of()))
                .bin(Map.of("key", Map.of()))
                .bugs(Map.of("key", Map.of()))
                .commitOid("commit_oid")
                .contributors(List.of(Map.of("key", Map.of())))
                .cpu(List.of("cpu"))
                .deletedById(1L)
                .dependencies(Map.of("key", Map.of()))
                .description("description")
                .devDependencies(Map.of("key", Map.of()))
                .directories(Map.of("key", Map.of()))
                .dist(Map.of("key", Map.of()))
                .engines(Map.of("key", Map.of()))
                .files(List.of("files"))
                .gitHead("git_head")
                .hasShrinkwrap(true)
                .homepage("homepage")
                .id("id")
                .installationCommand("installation_command")
                .keywords(List.of("keywords"))
                .license("license")
                .main("main")
                .maintainers(List.of(Map.of("key", Map.of())))
                .man(Map.of("key", Map.of()))
                .name("name")
                .nodeVersion("node_version")
                .npmUser("npm_user")
                .npmVersion("npm_version")
                .optionalDependencies(Map.of("key", Map.of()))
                .os(List.of("os"))
                .peerDependencies(Map.of("key", Map.of()))
                .publishedViaActions(true)
                .readme("readme")
                .releaseId(1L)
                .repository(Map.of("key", Map.of()))
                .scripts(Map.of("key", Map.of()))
                .version("version")
                .build();
    }

    static GitHubWebhookPackagePublishedPackagePackageVersionNugetMetadata
            webhookPackagePublishedPackagePackageVersionNugetMetadata() {
        return GitHubWebhookPackagePublishedPackagePackageVersionNugetMetadataBuilder.builder()
                .id("1")
                .name("name")
                .value(Map.of("key", true))
                .build();
    }

    static GitHubWebhookPackagePublishedPackagePackageVersionRelease
            webhookPackagePublishedPackagePackageVersionRelease() {
        return GitHubWebhookPackagePublishedPackagePackageVersionReleaseBuilder.builder()
                .author(webhookUser())
                .createdAt("created_at")
                .draft(true)
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .name("name")
                .prerelease(true)
                .publishedAt("published_at")
                .tagName("tag_name")
                .targetCommitish("target_commitish")
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookPackageUpdatedEvent webhookPackageUpdatedEvent() {
        return GitHubWebhookPackageUpdatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .packageValue(webhookPackageUpdatedPackage())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookPackageUpdatedPackage webhookPackageUpdatedPackage() {
        return GitHubWebhookPackageUpdatedPackageBuilder.builder()
                .createdAt("created_at")
                .description("description")
                .ecosystem("ecosystem")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .name("name")
                .namespace("namespace")
                .owner(webhookUser())
                .packageType("package_type")
                .packageVersion(webhookPackageUpdatedPackagePackageVersion())
                .registry(webhookPackageUpdatedPackageRegistry())
                .updatedAt("updated_at")
                .build();
    }

    static GitHubWebhookPackageUpdatedPackagePackageVersion webhookPackageUpdatedPackagePackageVersion() {
        return GitHubWebhookPackageUpdatedPackagePackageVersionBuilder.builder()
                .author(webhookUser())
                .body("body")
                .bodyHtml("body_html")
                .createdAt("created_at")
                .description("description")
                .dockerMetadata(List.of(webhookPackageUpdatedPackagePackageVersionDockerMetadata()))
                .draft(true)
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .installationCommand("installation_command")
                .manifest("manifest")
                .metadata(List.of(Map.of("key", Map.of())))
                .name("name")
                .packageFiles(List.of(webhookPackageUpdatedPackagePackageVersionPackageFile()))
                .packageUrl("package_url")
                .prerelease(true)
                .release(webhookPackageUpdatedPackagePackageVersionRelease())
                .rubygemsMetadata(List.of(webhookRubyGemsMetadata()))
                .sourceUrl("https://api.github.com/source_url")
                .summary("summary")
                .tagName("tag_name")
                .targetCommitish("target_commitish")
                .targetOid("target_oid")
                .updatedAt("updated_at")
                .version("version")
                .build();
    }

    static GitHubWebhookPackageUpdatedPackagePackageVersionPackageFile
            webhookPackageUpdatedPackagePackageVersionPackageFile() {
        return GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileBuilder.builder()
                .contentType("content_type")
                .createdAt("created_at")
                .downloadUrl("https://api.github.com/download_url")
                .id(1L)
                .md5("md5")
                .name("name")
                .sha1("sha1")
                .sha256("sha256")
                .size(1L)
                .state("state")
                .updatedAt("updated_at")
                .build();
    }

    static GitHubWebhookPackageUpdatedPackagePackageVersionRelease webhookPackageUpdatedPackagePackageVersionRelease() {
        return GitHubWebhookPackageUpdatedPackagePackageVersionReleaseBuilder.builder()
                .author(webhookUser())
                .createdAt("created_at")
                .draft(true)
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .name("name")
                .prerelease(true)
                .publishedAt("published_at")
                .tagName("tag_name")
                .targetCommitish("target_commitish")
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookPackageUpdatedPackageRegistry webhookPackageUpdatedPackageRegistry() {
        return GitHubWebhookPackageUpdatedPackageRegistryBuilder.builder()
                .aboutUrl("https://api.github.com/about_url")
                .name("name")
                .type("type")
                .url("https://api.github.com/url")
                .vendor("vendor")
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
                .userViewType("user_view_type")
                .build();
    }
}
