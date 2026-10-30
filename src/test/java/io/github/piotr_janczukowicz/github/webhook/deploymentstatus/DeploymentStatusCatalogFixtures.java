package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookCheckRunPullRequest;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookDeploymentWorkflowRunHeadRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookDeploymentWorkflowRunReferencedWorkflow;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesLockedIssuePerformedViaGithubAppPermissions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookWorkflow;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCheckSuiteRequestedCheckSuiteConclusion;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDeploymentWorkflowRunStatus;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;
import java.util.List;
import java.util.Map;

final class DeploymentStatusCatalogFixtures {

    private DeploymentStatusCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookApp webhookApp() {
        return GitHubWebhookAppBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(GitHubWebhookAppEvent.BRANCH_PROTECTION_RULE))
                .externalUrl("https://api.github.com/external_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .owner(webhookUser())
                .permissions(webhookIssuesLockedIssuePerformedViaGithubAppPermissions())
                .slug("slug")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookDeployment webhookDeployment() {
        return GitHubWebhookDeploymentBuilder.builder()
                .createdAt("created_at")
                .creator(webhookUser())
                .description("description")
                .environment("environment")
                .id(1L)
                .nodeId("node_id")
                .originalEnvironment("original_environment")
                .payload(Map.of("key", "payload"))
                .performedViaGithubApp(webhookApp())
                .productionEnvironment(true)
                .ref("ref")
                .repositoryUrl("https://api.github.com/repository_url")
                .sha("sha")
                .statusesUrl("https://api.github.com/statuses_url")
                .task("task")
                .transientEnvironment(true)
                .updatedAt("updated_at")
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookDeploymentStatusCreatedCheckRun webhookDeploymentStatusCreatedCheckRun() {
        return GitHubWebhookDeploymentStatusCreatedCheckRunBuilder.builder()
                .completedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .conclusion(GitHubWebhookCheckSuiteRequestedCheckSuiteConclusion.SUCCESS)
                .detailsUrl("https://api.github.com/details_url")
                .externalId("external_id")
                .headSha("head_sha")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .status(GitHubWebhookDeploymentStatusCreatedCheckRunStatus.QUEUED)
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookDeploymentStatusCreatedDeploymentStatus webhookDeploymentStatusCreatedDeploymentStatus() {
        return GitHubWebhookDeploymentStatusCreatedDeploymentStatusBuilder.builder()
                .createdAt("created_at")
                .creator(webhookUser())
                .deploymentUrl("https://api.github.com/deployment_url")
                .description("description")
                .environment("environment")
                .environmentUrl("https://api.github.com/environment_url")
                .id(1L)
                .logUrl("https://api.github.com/log_url")
                .nodeId("node_id")
                .performedViaGithubApp(webhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubApp())
                .repositoryUrl("https://api.github.com/repository_url")
                .state("state")
                .targetUrl("target_url")
                .updatedAt("updated_at")
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubApp
            webhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubApp() {
        return GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubAppBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(
                        GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubAppEvent
                                .BRANCH_PROTECTION_RULE))
                .externalUrl("https://api.github.com/external_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .owner(webhookUser())
                .permissions(webhookIssuesLockedIssuePerformedViaGithubAppPermissions())
                .slug("slug")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookDeploymentStatusCreatedEvent webhookDeploymentStatusCreatedEvent() {
        return GitHubWebhookDeploymentStatusCreatedEventBuilder.builder()
                .checkRun(webhookDeploymentStatusCreatedCheckRun())
                .deployment(webhookDeployment())
                .deploymentStatus(webhookDeploymentStatusCreatedDeploymentStatus())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .workflow(webhookWorkflow())
                .workflowRun(webhookDeploymentWorkflowRun())
                .build();
    }

    static GitHubWebhookDeploymentWorkflowRun webhookDeploymentWorkflowRun() {
        return GitHubWebhookDeploymentWorkflowRunBuilder.builder()
                .actor(webhookUser())
                .artifactsUrl("artifacts_url")
                .cancelUrl("cancel_url")
                .checkSuiteId(1L)
                .checkSuiteNodeId("check_suite_node_id")
                .checkSuiteUrl("check_suite_url")
                .conclusion(GitHubWebhookDeploymentWorkflowRunConclusion.SUCCESS)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .displayTitle("display_title")
                .event("event")
                .headBranch("head_branch")
                .headRepository(webhookDeploymentWorkflowRunHeadRepository())
                .headSha("head_sha")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .jobsUrl("jobs_url")
                .logsUrl("logs_url")
                .name("name")
                .nodeId("node_id")
                .path("path")
                .pullRequests(List.of(webhookCheckRunPullRequest()))
                .referencedWorkflows(List.of(webhookDeploymentWorkflowRunReferencedWorkflow()))
                .repository(webhookDeploymentWorkflowRunHeadRepository())
                .rerunUrl("rerun_url")
                .runAttempt(1L)
                .runNumber(1L)
                .runStartedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .status(GitHubWebhookDeploymentWorkflowRunStatus.REQUESTED)
                .triggeringActor(webhookUser())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .workflowId(1L)
                .workflowUrl("workflow_url")
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
