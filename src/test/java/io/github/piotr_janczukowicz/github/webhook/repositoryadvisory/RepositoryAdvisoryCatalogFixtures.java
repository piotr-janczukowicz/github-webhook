package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookTeamSimple;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamType;
import java.time.Instant;
import java.util.List;

final class RepositoryAdvisoryCatalogFixtures {

    private RepositoryAdvisoryCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookRepositoryAdvisoryPublishedEvent webhookRepositoryAdvisoryPublishedEvent() {
        return GitHubWebhookRepositoryAdvisoryPublishedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .repositoryAdvisory(webhookRepositoryAdvisoryReportedRepositoryAdvisory())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryAdvisoryReportedEvent webhookRepositoryAdvisoryReportedEvent() {
        return GitHubWebhookRepositoryAdvisoryReportedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .repositoryAdvisory(webhookRepositoryAdvisoryReportedRepositoryAdvisory())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisory
            webhookRepositoryAdvisoryReportedRepositoryAdvisory() {
        return GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryBuilder.builder()
                .author(webhookSimpleUser())
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .collaboratingTeams(List.of(webhookTeam()))
                .collaboratingUsers(List.of(webhookSimpleUser()))
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .credits(List.of(webhookRepositoryAdvisoryReportedRepositoryAdvisoryCredit()))
                .creditsDetailed(List.of(webhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailed()))
                .cveId("cve_id")
                .cvssSeverities(webhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities())
                .cweIds(List.of("cwe_ids"))
                .cwes(List.of(webhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe()))
                .description("description")
                .ghsaId("ghsa_id")
                .htmlUrl("https://api.github.com/html_url")
                .identifiers(List.of(webhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier()))
                .privateFork(webhookSimpleRepository())
                .publishedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .publisher(webhookSimpleUser())
                .severity(GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySeverity.CRITICAL)
                .state(GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryState.PUBLISHED)
                .submission(webhookRepositoryAdvisoryReportedRepositoryAdvisorySubmission())
                .summary("summary")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .vulnerabilities(List.of(webhookRepositoryAdvisoryReportedRepositoryAdvisoryVulnerability()))
                .withdrawnAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCredit
            webhookRepositoryAdvisoryReportedRepositoryAdvisoryCredit() {
        return GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditBuilder.builder()
                .login("login")
                .type(GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType.ANALYST)
                .build();
    }

    static GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailed
            webhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailed() {
        return GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailedBuilder.builder()
                .state(GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailedState.ACCEPTED)
                .type(GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType.ANALYST)
                .user(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySubmission
            webhookRepositoryAdvisoryReportedRepositoryAdvisorySubmission() {
        return GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySubmissionBuilder.builder()
                .accepted(true)
                .build();
    }

    static GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryVulnerability
            webhookRepositoryAdvisoryReportedRepositoryAdvisoryVulnerability() {
        return GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryVulnerabilityBuilder.builder()
                .packageValue(webhookRepositoryAdvisoryReportedRepositoryAdvisoryVulnerabilityPackage())
                .patchedVersions("patched_versions")
                .vulnerableFunctions(List.of("vulnerable_functions"))
                .vulnerableVersionRange("vulnerable_version_range")
                .build();
    }

    static GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryVulnerabilityPackage
            webhookRepositoryAdvisoryReportedRepositoryAdvisoryVulnerabilityPackage() {
        return GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryVulnerabilityPackageBuilder.builder()
                .ecosystem(GitHubWebhookVulnerabilityPackageEcosystem.RUBYGEMS)
                .name("name")
                .build();
    }

    static GitHubWebhookSimpleRepository webhookSimpleRepository() {
        return GitHubWebhookSimpleRepositoryBuilder.builder()
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

    static GitHubWebhookTeam webhookTeam() {
        return GitHubWebhookTeamBuilder.builder()
                .accessSource(GitHubWebhookTeamAccessSource.DIRECT)
                .description("description")
                .enterpriseId(42L)
                .htmlUrl("https://github.com/orgs/rails/teams/core")
                .id(1L)
                .membersUrl("members_url")
                .name("name")
                .nodeId("node_id")
                .notificationSetting("notification_setting")
                .organizationId(37L)
                .parent(webhookTeamSimple())
                .permission("permission")
                .permissions(webhookTeamPermissions())
                .privacy("privacy")
                .repositoriesUrl("https://api.github.com/repositories_url")
                .slug("slug")
                .type(GitHubWebhookTeamType.ENTERPRISE)
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookTeamPermissions webhookTeamPermissions() {
        return GitHubWebhookTeamPermissionsBuilder.builder()
                .admin(true)
                .maintain(true)
                .pull(true)
                .push(true)
                .triage(true)
                .build();
    }
}
