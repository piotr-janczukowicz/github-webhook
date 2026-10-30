package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookDeploymentReviewApprovedApprover;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookPackagePublishedPackagePackageVersionPackageFile;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookPackageUpdatedPackagePackageVersionDockerMetadata;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookPackageVersionContainerMetadata;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookRubyGemsMetadata;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.util.List;
import java.util.Map;

final class RegistryPackageCatalogFixtures {

    private RegistryPackageCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookRegistryPackagePublishedEvent webhookRegistryPackagePublishedEvent() {
        return GitHubWebhookRegistryPackagePublishedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .registryPackage(webhookRegistryPackagePublishedRegistryPackage())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRegistryPackagePublishedRegistryPackage webhookRegistryPackagePublishedRegistryPackage() {
        return GitHubWebhookRegistryPackagePublishedRegistryPackageBuilder.builder()
                .createdAt("created_at")
                .description("description")
                .ecosystem("ecosystem")
                .htmlUrl("html_url")
                .id(1L)
                .name("name")
                .namespace("namespace")
                .owner(webhookRegistryPackageUpdatedRegistryPackageOwner())
                .packageType("package_type")
                .packageVersion(webhookRegistryPackagePublishedRegistryPackagePackageVersion())
                .registry(webhookRegistryPackagePublishedRegistryPackageRegistry())
                .updatedAt("updated_at")
                .build();
    }

    static GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersion
            webhookRegistryPackagePublishedRegistryPackagePackageVersion() {
        return GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionBuilder.builder()
                .author(webhookRegistryPackageUpdatedRegistryPackageOwner())
                .body(Map.of("key", "body"))
                .bodyHtml("body_html")
                .containerMetadata(webhookPackageVersionContainerMetadata())
                .createdAt("created_at")
                .description("description")
                .dockerMetadata(List.of(webhookPackageUpdatedPackagePackageVersionDockerMetadata()))
                .draft(true)
                .htmlUrl("html_url")
                .id(1L)
                .installationCommand("installation_command")
                .manifest("manifest")
                .metadata(List.of(Map.of("key", Map.of())))
                .name("name")
                .npmMetadata(webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata())
                .nugetMetadata(List.of(webhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadata()))
                .packageFiles(List.of(webhookPackagePublishedPackagePackageVersionPackageFile()))
                .packageUrl("package_url")
                .prerelease(true)
                .release(webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease())
                .rubygemsMetadata(List.of(webhookRubyGemsMetadata()))
                .summary("summary")
                .tagName("tag_name")
                .targetCommitish("target_commitish")
                .targetOid("target_oid")
                .updatedAt("updated_at")
                .version("version")
                .build();
    }

    static GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata
            webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata() {
        return GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadataBuilder.builder()
                .author(Map.of("key", "author"))
                .bin(Map.of("key", Map.of()))
                .bugs(Map.of("key", "bugs"))
                .commitOid("commit_oid")
                .contributors(List.of("contributors"))
                .cpu(List.of("cpu"))
                .deletedById(1L)
                .dependencies(Map.of("key", Map.of()))
                .description("description")
                .devDependencies(Map.of("key", Map.of()))
                .directories(Map.of("key", "directories"))
                .dist(Map.of("key", "dist"))
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
                .maintainers(List.of("maintainers"))
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
                .repository(Map.of("key", "repository"))
                .scripts(Map.of("key", Map.of()))
                .version("version")
                .build();
    }

    static GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadata
            webhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadata() {
        return GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataBuilder.builder()
                .id(Map.of("key", "id"))
                .name("name")
                .value(Map.of("key", true))
                .build();
    }

    static GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease
            webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease() {
        return GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionReleaseBuilder.builder()
                .author(webhookDeploymentReviewApprovedApprover())
                .createdAt("created_at")
                .draft(true)
                .htmlUrl("html_url")
                .id(1L)
                .name("name")
                .prerelease(true)
                .publishedAt("published_at")
                .tagName("tag_name")
                .targetCommitish("target_commitish")
                .url("url")
                .build();
    }

    static GitHubWebhookRegistryPackagePublishedRegistryPackageRegistry
            webhookRegistryPackagePublishedRegistryPackageRegistry() {
        return GitHubWebhookRegistryPackagePublishedRegistryPackageRegistryBuilder.builder()
                .aboutUrl("about_url")
                .name("name")
                .type("type")
                .url("url")
                .vendor("vendor")
                .build();
    }

    static GitHubWebhookRegistryPackageUpdatedEvent webhookRegistryPackageUpdatedEvent() {
        return GitHubWebhookRegistryPackageUpdatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .registryPackage(webhookRegistryPackageUpdatedRegistryPackage())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRegistryPackageUpdatedRegistryPackage webhookRegistryPackageUpdatedRegistryPackage() {
        return GitHubWebhookRegistryPackageUpdatedRegistryPackageBuilder.builder()
                .createdAt("created_at")
                .ecosystem("ecosystem")
                .htmlUrl("html_url")
                .id(1L)
                .name("name")
                .namespace("namespace")
                .owner(webhookRegistryPackageUpdatedRegistryPackageOwner())
                .packageType("package_type")
                .packageVersion(webhookRegistryPackageUpdatedRegistryPackagePackageVersion())
                .registry(Map.of("key", Map.of()))
                .updatedAt("updated_at")
                .build();
    }

    static GitHubWebhookRegistryPackageUpdatedRegistryPackageOwner webhookRegistryPackageUpdatedRegistryPackageOwner() {
        return GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder()
                .avatarUrl("avatar_url")
                .eventsUrl("events_url")
                .followersUrl("followers_url")
                .followingUrl("following_url")
                .gistsUrl("gists_url")
                .gravatarId("gravatar_id")
                .htmlUrl("html_url")
                .id(1L)
                .login("login")
                .nodeId("node_id")
                .organizationsUrl("organizations_url")
                .receivedEventsUrl("received_events_url")
                .reposUrl("repos_url")
                .siteAdmin(true)
                .starredUrl("starred_url")
                .subscriptionsUrl("subscriptions_url")
                .type("type")
                .url("url")
                .userViewType("user_view_type")
                .build();
    }

    static GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersion
            webhookRegistryPackageUpdatedRegistryPackagePackageVersion() {
        return GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionBuilder.builder()
                .author(webhookRegistryPackageUpdatedRegistryPackageOwner())
                .body("body")
                .bodyHtml("body_html")
                .createdAt("created_at")
                .description("description")
                .dockerMetadata(List.of(webhookPackageUpdatedPackagePackageVersionDockerMetadata()))
                .draft(true)
                .htmlUrl("html_url")
                .id(1L)
                .installationCommand("installation_command")
                .manifest("manifest")
                .metadata(List.of(Map.of("key", Map.of())))
                .name("name")
                .packageFiles(List.of(webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFile()))
                .packageUrl("package_url")
                .prerelease(true)
                .release(webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease())
                .rubygemsMetadata(List.of(webhookRubyGemsMetadata()))
                .summary("summary")
                .tagName("tag_name")
                .targetCommitish("target_commitish")
                .targetOid("target_oid")
                .updatedAt("updated_at")
                .version("version")
                .build();
    }

    static GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFile
            webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFile() {
        return GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFileBuilder.builder()
                .contentType("content_type")
                .createdAt("created_at")
                .downloadUrl("download_url")
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

    static GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease
            webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease() {
        return GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseBuilder.builder()
                .author(webhookRegistryPackageUpdatedRegistryPackageOwner())
                .createdAt("created_at")
                .draft(true)
                .htmlUrl("html_url")
                .id(1L)
                .name("name")
                .prerelease(true)
                .publishedAt("published_at")
                .tagName("tag_name")
                .targetCommitish("target_commitish")
                .url("url")
                .build();
    }
}
