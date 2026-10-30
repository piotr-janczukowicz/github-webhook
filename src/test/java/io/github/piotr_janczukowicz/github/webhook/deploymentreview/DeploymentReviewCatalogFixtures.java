package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookCheckRunPullRequest;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookDeploymentReviewApprovedApprover;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookDeploymentWorkflowRunReferencedWorkflow;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDeploymentWorkflowRunConclusion;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDeploymentWorkflowRunStatus;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;
import java.util.List;
import java.util.Map;

final class DeploymentReviewCatalogFixtures {

    private DeploymentReviewCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookDeploymentReviewApprovedEvent webhookDeploymentReviewApprovedEvent() {
        return GitHubWebhookDeploymentReviewApprovedEventBuilder.builder()
                .approver(webhookDeploymentReviewApprovedApprover())
                .comment("comment")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .reviewers(List.of(webhookDeploymentReviewApprovedReviewer()))
                .sender(webhookSimpleUser())
                .since("since")
                .workflowJobRun(webhookDeploymentReviewApprovedWorkflowJobRun())
                .workflowJobRuns(List.of(webhookDeploymentReviewApprovedWorkflowJobRunsItem()))
                .workflowRun(webhookDeploymentWorkflowRun())
                .build();
    }

    static GitHubWebhookDeploymentReviewApprovedReviewer webhookDeploymentReviewApprovedReviewer() {
        return GitHubWebhookDeploymentReviewApprovedReviewerBuilder.builder()
                .reviewer(webhookDeploymentReviewApprovedReviewerValue())
                .type(GitHubWebhookDeploymentReviewApprovedReviewerType.USER)
                .build();
    }

    static GitHubWebhookDeploymentReviewApprovedReviewerValue webhookDeploymentReviewApprovedReviewerValue() {
        return GitHubWebhookDeploymentReviewApprovedReviewerValueBuilder.builder()
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

    static GitHubWebhookDeploymentReviewApprovedWorkflowJobRun webhookDeploymentReviewApprovedWorkflowJobRun() {
        return GitHubWebhookDeploymentReviewApprovedWorkflowJobRunBuilder.builder()
                .createdAt("created_at")
                .environment("environment")
                .htmlUrl("html_url")
                .id(1L)
                .status("status")
                .updatedAt("updated_at")
                .build();
    }

    static GitHubWebhookDeploymentReviewApprovedWorkflowJobRunsItem
            webhookDeploymentReviewApprovedWorkflowJobRunsItem() {
        return GitHubWebhookDeploymentReviewApprovedWorkflowJobRunsItemBuilder.builder()
                .createdAt("created_at")
                .environment("environment")
                .htmlUrl("html_url")
                .id(1L)
                .name("name")
                .status("status")
                .updatedAt("updated_at")
                .build();
    }

    static GitHubWebhookDeploymentReviewRejectedEvent webhookDeploymentReviewRejectedEvent() {
        return GitHubWebhookDeploymentReviewRejectedEventBuilder.builder()
                .approver(webhookDeploymentReviewApprovedApprover())
                .comment("comment")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .reviewers(List.of(webhookDeploymentReviewApprovedReviewer()))
                .sender(webhookSimpleUser())
                .since("since")
                .workflowJobRun(webhookDeploymentReviewApprovedWorkflowJobRun())
                .workflowJobRuns(List.of(webhookDeploymentReviewRejectedWorkflowJobRun()))
                .workflowRun(webhookDeploymentReviewRejectedWorkflowRun())
                .build();
    }

    static GitHubWebhookDeploymentReviewRejectedWorkflowJobRun webhookDeploymentReviewRejectedWorkflowJobRun() {
        return GitHubWebhookDeploymentReviewRejectedWorkflowJobRunBuilder.builder()
                .conclusion("conclusion")
                .createdAt("created_at")
                .environment("environment")
                .htmlUrl("html_url")
                .id(1L)
                .name("name")
                .status("status")
                .updatedAt("updated_at")
                .build();
    }

    static GitHubWebhookDeploymentReviewRejectedWorkflowRun webhookDeploymentReviewRejectedWorkflowRun() {
        return GitHubWebhookDeploymentReviewRejectedWorkflowRunBuilder.builder()
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
                .headCommit(Map.of("key", Map.of()))
                .headRepository(webhookDeploymentWorkflowRunHeadRepository())
                .headSha("head_sha")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .jobsUrl("jobs_url")
                .logsUrl("logs_url")
                .name("name")
                .nodeId("node_id")
                .path("path")
                .previousAttemptUrl("previous_attempt_url")
                .pullRequests(List.of(webhookCheckRunPullRequest()))
                .referencedWorkflows(List.of(webhookDeploymentWorkflowRunReferencedWorkflow()))
                .repository(webhookDeploymentWorkflowRunHeadRepository())
                .rerunUrl("rerun_url")
                .runAttempt(1L)
                .runNumber(1L)
                .runStartedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .status(GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus.REQUESTED)
                .triggeringActor(webhookUser())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .workflowId(1L)
                .workflowUrl("workflow_url")
                .build();
    }

    static GitHubWebhookDeploymentReviewRequestedEvent webhookDeploymentReviewRequestedEvent() {
        return GitHubWebhookDeploymentReviewRequestedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .environment("environment")
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .requestor(webhookUser())
                .reviewers(List.of(webhookDeploymentReviewRequestedReviewer()))
                .sender(webhookSimpleUser())
                .since("since")
                .workflowJobRun(webhookDeploymentReviewRequestedWorkflowJobRun())
                .workflowRun(webhookDeploymentWorkflowRun())
                .build();
    }

    static GitHubWebhookDeploymentReviewRequestedReviewer webhookDeploymentReviewRequestedReviewer() {
        return GitHubWebhookDeploymentReviewRequestedReviewerBuilder.builder()
                .reviewer(webhookDeploymentReviewRequestedReviewerValue())
                .type(GitHubWebhookDeploymentReviewRequestedReviewerType.USER)
                .build();
    }

    static GitHubWebhookDeploymentReviewRequestedReviewerValue webhookDeploymentReviewRequestedReviewerValue() {
        return GitHubWebhookDeploymentReviewRequestedReviewerValueBuilder.builder()
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

    static GitHubWebhookDeploymentReviewRequestedWorkflowJobRun webhookDeploymentReviewRequestedWorkflowJobRun() {
        return GitHubWebhookDeploymentReviewRequestedWorkflowJobRunBuilder.builder()
                .createdAt("created_at")
                .environment("environment")
                .htmlUrl("html_url")
                .id(1L)
                .name("name")
                .status("status")
                .updatedAt("updated_at")
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
                .headCommit(Map.of("key", Map.of()))
                .headRepository(webhookDeploymentWorkflowRunHeadRepository())
                .headSha("head_sha")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .jobsUrl("jobs_url")
                .logsUrl("logs_url")
                .name("name")
                .nodeId("node_id")
                .path("path")
                .previousAttemptUrl("previous_attempt_url")
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

    static GitHubWebhookDeploymentWorkflowRunHeadRepository webhookDeploymentWorkflowRunHeadRepository() {
        return GitHubWebhookDeploymentWorkflowRunHeadRepositoryBuilder.builder()
                .archiveUrl("archive_url")
                .assigneesUrl("assignees_url")
                .blobsUrl("blobs_url")
                .branchesUrl("branches_url")
                .collaboratorsUrl("collaborators_url")
                .commentsUrl("comments_url")
                .commitsUrl("commits_url")
                .compareUrl("compare_url")
                .contentsUrl("contents_url")
                .contributorsUrl("contributors_url")
                .deploymentsUrl("deployments_url")
                .description("description")
                .downloadsUrl("downloads_url")
                .eventsUrl("events_url")
                .fork(true)
                .forksUrl("forks_url")
                .fullName("full_name")
                .gitCommitsUrl("git_commits_url")
                .gitRefsUrl("git_refs_url")
                .gitTagsUrl("git_tags_url")
                .hooksUrl("hooks_url")
                .htmlUrl("html_url")
                .id(1L)
                .issueCommentUrl("issue_comment_url")
                .issueEventsUrl("issue_events_url")
                .issuesUrl("issues_url")
                .keysUrl("keys_url")
                .labelsUrl("labels_url")
                .languagesUrl("languages_url")
                .mergesUrl("merges_url")
                .milestonesUrl("milestones_url")
                .name("name")
                .nodeId("node_id")
                .notificationsUrl("notifications_url")
                .owner(webhookDeploymentReviewApprovedApprover())
                .privateValue(true)
                .pullsUrl("pulls_url")
                .releasesUrl("releases_url")
                .stargazersUrl("stargazers_url")
                .statusesUrl("statuses_url")
                .subscribersUrl("subscribers_url")
                .subscriptionUrl("subscription_url")
                .tagsUrl("tags_url")
                .teamsUrl("teams_url")
                .treesUrl("trees_url")
                .url("url")
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
