package io.github.piotr_janczukowicz.github.webhook.checksuite;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookCheckRunPullRequest;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesReopenedIssuePerformedViaGithubAppPermissions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleCommit;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookAppPermissionsActions;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookAppPermissionsOrganizationProjects;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookAppPermissionsProfile;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCheckSuiteCompletedCheckSuiteConclusion;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCheckSuiteCompletedCheckSuiteStatus;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCheckSuiteRequestedCheckSuiteConclusion;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDeploymentWorkflowRunConclusion;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;
import java.util.List;

final class CheckSuiteCatalogFixtures {

    private CheckSuiteCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookApp webhookApp() {
        return GitHubWebhookAppBuilder.builder()
                .clientId("client_id")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(GitHubWebhookAppEvent.BRANCH_PROTECTION_RULE))
                .externalUrl("https://api.github.com/external_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .owner(webhookUser())
                .permissions(webhookIssuesReopenedIssuePerformedViaGithubAppPermissions())
                .slug("slug")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookCheckSuiteCompletedCheckSuite webhookCheckSuiteCompletedCheckSuite() {
        return GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder.builder()
                .after("after")
                .app(webhookApp())
                .before("before")
                .checkRunsUrl("https://api.github.com/check_runs_url")
                .conclusion(GitHubWebhookCheckSuiteCompletedCheckSuiteConclusion.SUCCESS)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .headBranch("head_branch")
                .headCommit(webhookSimpleCommit())
                .headSha("head_sha")
                .id(1L)
                .latestCheckRunsCount(1L)
                .nodeId("node_id")
                .pullRequests(List.of(webhookCheckRunPullRequest()))
                .rerequestable(true)
                .runsRerequestable(true)
                .status(GitHubWebhookCheckSuiteCompletedCheckSuiteStatus.REQUESTED)
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookCheckSuiteCompletedEvent webhookCheckSuiteCompletedEvent() {
        return GitHubWebhookCheckSuiteCompletedEventBuilder.builder()
                .checkSuite(webhookCheckSuiteCompletedCheckSuite())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCheckSuiteRequestedCheckSuite webhookCheckSuiteRequestedCheckSuite() {
        return GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder.builder()
                .after("after")
                .app(webhookCheckSuiteRequestedCheckSuiteApp())
                .before("before")
                .checkRunsUrl("https://api.github.com/check_runs_url")
                .conclusion(GitHubWebhookCheckSuiteRequestedCheckSuiteConclusion.SUCCESS)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .headBranch("head_branch")
                .headCommit(webhookSimpleCommit())
                .headSha("head_sha")
                .id(1L)
                .latestCheckRunsCount(1L)
                .nodeId("node_id")
                .pullRequests(List.of(webhookCheckRunPullRequest()))
                .rerequestable(true)
                .runsRerequestable(true)
                .status(GitHubWebhookCheckSuiteRequestedCheckSuiteStatus.REQUESTED)
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookCheckSuiteRequestedCheckSuiteApp webhookCheckSuiteRequestedCheckSuiteApp() {
        return GitHubWebhookCheckSuiteRequestedCheckSuiteAppBuilder.builder()
                .clientId("client_id")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(GitHubWebhookCheckSuiteRequestedCheckSuiteAppEvent.BRANCH_PROTECTION_RULE))
                .externalUrl("https://api.github.com/external_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .owner(webhookUser())
                .permissions(webhookCheckSuiteRequestedCheckSuiteAppPermissions())
                .slug("slug")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookCheckSuiteRequestedCheckSuiteAppPermissions
            webhookCheckSuiteRequestedCheckSuiteAppPermissions() {
        return GitHubWebhookCheckSuiteRequestedCheckSuiteAppPermissionsBuilder.builder()
                .actions(GitHubWebhookAppPermissionsActions.READ)
                .administration(GitHubWebhookAppPermissionsActions.READ)
                .artifactMetadata(GitHubWebhookAppPermissionsActions.READ)
                .attestations(GitHubWebhookAppPermissionsActions.READ)
                .checks(GitHubWebhookAppPermissionsActions.READ)
                .codeQuality(GitHubWebhookAppPermissionsActions.READ)
                .contentReferences(GitHubWebhookAppPermissionsActions.READ)
                .contents(GitHubWebhookAppPermissionsActions.READ)
                .copilotRequests(GitHubWebhookAppPermissionsProfile.WRITE)
                .deployments(GitHubWebhookAppPermissionsActions.READ)
                .discussions(GitHubWebhookAppPermissionsActions.READ)
                .drives(GitHubWebhookAppPermissionsActions.READ)
                .emails(GitHubWebhookAppPermissionsActions.READ)
                .environments(GitHubWebhookAppPermissionsActions.READ)
                .issues(GitHubWebhookAppPermissionsActions.READ)
                .keys(GitHubWebhookAppPermissionsActions.READ)
                .members(GitHubWebhookAppPermissionsActions.READ)
                .mergeQueues(GitHubWebhookAppPermissionsActions.READ)
                .metadata(GitHubWebhookAppPermissionsActions.READ)
                .models(GitHubWebhookAppPermissionsActions.READ)
                .organizationAdministration(GitHubWebhookAppPermissionsActions.READ)
                .organizationHooks(GitHubWebhookAppPermissionsActions.READ)
                .organizationPackages(GitHubWebhookAppPermissionsActions.READ)
                .organizationPlan(GitHubWebhookAppPermissionsActions.READ)
                .organizationProjects(GitHubWebhookAppPermissionsOrganizationProjects.READ)
                .organizationSecrets(GitHubWebhookAppPermissionsActions.READ)
                .organizationSelfHostedRunners(GitHubWebhookAppPermissionsActions.READ)
                .organizationUserBlocking(GitHubWebhookAppPermissionsActions.READ)
                .packages(GitHubWebhookAppPermissionsActions.READ)
                .pages(GitHubWebhookAppPermissionsActions.READ)
                .pullRequests(GitHubWebhookAppPermissionsActions.READ)
                .repositoryHooks(GitHubWebhookAppPermissionsActions.READ)
                .repositoryProjects(GitHubWebhookAppPermissionsOrganizationProjects.READ)
                .secretScanningAlerts(GitHubWebhookAppPermissionsActions.READ)
                .secrets(GitHubWebhookAppPermissionsActions.READ)
                .securityEvents(GitHubWebhookAppPermissionsActions.READ)
                .securityScanningAlert(GitHubWebhookAppPermissionsActions.READ)
                .singleFile(GitHubWebhookAppPermissionsActions.READ)
                .statuses(GitHubWebhookAppPermissionsActions.READ)
                .vulnerabilityAlerts(GitHubWebhookAppPermissionsActions.READ)
                .workflows(GitHubWebhookAppPermissionsActions.READ)
                .build();
    }

    static GitHubWebhookCheckSuiteRequestedEvent webhookCheckSuiteRequestedEvent() {
        return GitHubWebhookCheckSuiteRequestedEventBuilder.builder()
                .checkSuite(webhookCheckSuiteRequestedCheckSuite())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCheckSuiteRerequestedCheckSuite webhookCheckSuiteRerequestedCheckSuite() {
        return GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder.builder()
                .after("after")
                .app(webhookCheckSuiteRerequestedCheckSuiteApp())
                .before("before")
                .checkRunsUrl("https://api.github.com/check_runs_url")
                .conclusion(GitHubWebhookDeploymentWorkflowRunConclusion.SUCCESS)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .headBranch("head_branch")
                .headCommit(webhookSimpleCommit())
                .headSha("head_sha")
                .id(1L)
                .latestCheckRunsCount(1L)
                .nodeId("node_id")
                .pullRequests(List.of(webhookCheckRunPullRequest()))
                .rerequestable(true)
                .runsRerequestable(true)
                .status(GitHubWebhookCheckSuiteRequestedCheckSuiteStatus.REQUESTED)
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookCheckSuiteRerequestedCheckSuiteApp webhookCheckSuiteRerequestedCheckSuiteApp() {
        return GitHubWebhookCheckSuiteRerequestedCheckSuiteAppBuilder.builder()
                .clientId("client_id")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(GitHubWebhookCheckSuiteRerequestedCheckSuiteAppEvent.BRANCH_PROTECTION_RULE))
                .externalUrl("https://api.github.com/external_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .owner(webhookUser())
                .permissions(webhookCheckSuiteRequestedCheckSuiteAppPermissions())
                .slug("slug")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookCheckSuiteRerequestedEvent webhookCheckSuiteRerequestedEvent() {
        return GitHubWebhookCheckSuiteRerequestedEventBuilder.builder()
                .checkSuite(webhookCheckSuiteRerequestedCheckSuite())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
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
                .userViewType("user_view_type")
                .build();
    }
}
