package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookGitHubApp;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssueCommentEditedChanges;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssueCommentEditedIssuePerformedViaGithubAppPermissions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssueDependenciesSummary;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuePullRequest;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssueReactions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssueType;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesLockedIssuePerformedViaGithubAppPermissions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesReopenedIssuePerformedViaGithubAppPermissions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookLabel;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookMinimizedIssueComment;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookPinnedIssueComment;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookReactions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSubIssuesSummary;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookAppEvent;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookAppPermissionsActions;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueActiveLockReason;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAssigneeType;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppEvent;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;
import java.util.List;

final class IssueCommentCatalogFixtures {

    private IssueCommentCatalogFixtures() {
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
                .permissions(webhookAppPermissions())
                .slug("slug")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookAppPermissions webhookAppPermissions() {
        return GitHubWebhookAppPermissionsBuilder.builder()
                .actions(GitHubWebhookAppPermissionsActions.READ)
                .administration(GitHubWebhookAppPermissionsActions.READ)
                .checks(GitHubWebhookAppPermissionsActions.READ)
                .contentReferences(GitHubWebhookAppPermissionsActions.READ)
                .contents(GitHubWebhookAppPermissionsActions.READ)
                .deployments(GitHubWebhookAppPermissionsActions.READ)
                .discussions(GitHubWebhookAppPermissionsActions.READ)
                .emails(GitHubWebhookAppPermissionsActions.READ)
                .environments(GitHubWebhookAppPermissionsActions.READ)
                .issues(GitHubWebhookAppPermissionsActions.READ)
                .keys(GitHubWebhookAppPermissionsActions.READ)
                .members(GitHubWebhookAppPermissionsActions.READ)
                .metadata(GitHubWebhookAppPermissionsActions.READ)
                .organizationAdministration(GitHubWebhookAppPermissionsActions.READ)
                .organizationHooks(GitHubWebhookAppPermissionsActions.READ)
                .organizationPackages(GitHubWebhookAppPermissionsActions.READ)
                .organizationPlan(GitHubWebhookAppPermissionsActions.READ)
                .organizationProjects(GitHubWebhookAppPermissionsActions.READ)
                .organizationSecrets(GitHubWebhookAppPermissionsActions.READ)
                .organizationSelfHostedRunners(GitHubWebhookAppPermissionsActions.READ)
                .organizationUserBlocking(GitHubWebhookAppPermissionsActions.READ)
                .packages(GitHubWebhookAppPermissionsActions.READ)
                .pages(GitHubWebhookAppPermissionsActions.READ)
                .pullRequests(GitHubWebhookAppPermissionsActions.READ)
                .repositoryHooks(GitHubWebhookAppPermissionsActions.READ)
                .repositoryProjects(GitHubWebhookAppPermissionsActions.READ)
                .secretScanningAlerts(GitHubWebhookAppPermissionsActions.READ)
                .secrets(GitHubWebhookAppPermissionsActions.READ)
                .securityEvents(GitHubWebhookAppPermissionsActions.READ)
                .securityScanningAlert(GitHubWebhookAppPermissionsActions.READ)
                .singleFile(GitHubWebhookAppPermissionsActions.READ)
                .statuses(GitHubWebhookAppPermissionsActions.READ)
                .teamDiscussions(GitHubWebhookAppPermissionsActions.READ)
                .vulnerabilityAlerts(GitHubWebhookAppPermissionsActions.READ)
                .workflows(GitHubWebhookAppPermissionsActions.READ)
                .build();
    }

    static GitHubWebhookIssue webhookIssue() {
        return GitHubWebhookIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookIssueAssignee())
                .assignees(List.of(webhookIssueAssignee()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt("closed_at")
                .comments(1L)
                .commentsUrl("comments_url")
                .createdAt("created_at")
                .draft(true)
                .eventsUrl("events_url")
                .htmlUrl("html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .labels(List.of(webhookLabel()))
                .labelsUrl("labels_url")
                .locked(true)
                .milestone(webhookMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookApp())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookIssueReactions())
                .repositoryUrl("repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt("updated_at")
                .url("url")
                .user(webhookIssueAssignee())
                .build();
    }

    static GitHubWebhookIssueAssignee webhookIssueAssignee() {
        return GitHubWebhookIssueAssigneeBuilder.builder()
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
                .type(GitHubWebhookIssueAssigneeType.BOT)
                .url("https://api.github.com/url")
                .userViewType("user_view_type")
                .build();
    }

    static GitHubWebhookIssueComment webhookIssueComment() {
        return GitHubWebhookIssueCommentBuilder.builder()
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueUrl("https://api.github.com/issue_url")
                .minimized(webhookMinimizedIssueComment())
                .nodeId("node_id")
                .performedViaGithubApp(webhookGitHubApp())
                .pin(webhookPinnedIssueComment())
                .reactions(webhookReactions())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .user(webhookIssueAssignee())
                .build();
    }

    static GitHubWebhookIssueCommentCreatedComment webhookIssueCommentCreatedComment() {
        return GitHubWebhookIssueCommentCreatedCommentBuilder.builder()
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueUrl("https://api.github.com/issue_url")
                .minimized(webhookMinimizedIssueComment())
                .nodeId("node_id")
                .performedViaGithubApp(webhookGitHubApp())
                .pin(webhookPinnedIssueComment())
                .reactions(webhookReactions())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookIssueCommentCreatedEvent webhookIssueCommentCreatedEvent() {
        return GitHubWebhookIssueCommentCreatedEventBuilder.builder()
                .comment(webhookIssueCommentCreatedComment())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssueCommentCreatedIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssueCommentCreatedIssue webhookIssueCommentCreatedIssue() {
        return GitHubWebhookIssueCommentCreatedIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookIssueAssignee())
                .assignees(List.of(webhookIssueAssignee()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt("closed_at")
                .comments(1L)
                .commentsUrl("comments_url")
                .createdAt("created_at")
                .draft(true)
                .eventsUrl("events_url")
                .htmlUrl("html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .labels(List.of(webhookLabel()))
                .labelsUrl("labels_url")
                .locked(true)
                .milestone(webhookMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssueCommentCreatedIssuePerformedViaGithubApp())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookIssueReactions())
                .repositoryUrl("repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt("updated_at")
                .url("url")
                .user(webhookIssueAssignee())
                .build();
    }

    static GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubApp
            webhookIssueCommentCreatedIssuePerformedViaGithubApp() {
        return GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppEvent.BRANCH_PROTECTION_RULE))
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

    static GitHubWebhookIssueCommentDeletedEvent webhookIssueCommentDeletedEvent() {
        return GitHubWebhookIssueCommentDeletedEventBuilder.builder()
                .comment(webhookIssueComment())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssueCommentDeletedIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssueCommentDeletedIssue webhookIssueCommentDeletedIssue() {
        return GitHubWebhookIssueCommentDeletedIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookIssueAssignee())
                .assignees(List.of(webhookIssueAssignee()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt("closed_at")
                .comments(1L)
                .commentsUrl("comments_url")
                .createdAt("created_at")
                .draft(true)
                .eventsUrl("events_url")
                .htmlUrl("html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .labels(List.of(webhookLabel()))
                .labelsUrl("labels_url")
                .locked(true)
                .milestone(webhookMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssueCommentDeletedIssuePerformedViaGithubApp())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookIssueReactions())
                .repositoryUrl("repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt("updated_at")
                .url("url")
                .user(webhookIssueAssignee())
                .build();
    }

    static GitHubWebhookIssueCommentDeletedIssuePerformedViaGithubApp
            webhookIssueCommentDeletedIssuePerformedViaGithubApp() {
        return GitHubWebhookIssueCommentDeletedIssuePerformedViaGithubAppBuilder.builder()
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

    static GitHubWebhookIssueCommentEditedEvent webhookIssueCommentEditedEvent() {
        return GitHubWebhookIssueCommentEditedEventBuilder.builder()
                .changes(webhookIssueCommentEditedChanges())
                .comment(webhookIssueComment())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssueCommentEditedIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssueCommentEditedIssue webhookIssueCommentEditedIssue() {
        return GitHubWebhookIssueCommentEditedIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookIssueAssignee())
                .assignees(List.of(webhookIssueAssignee()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt("closed_at")
                .comments(1L)
                .commentsUrl("comments_url")
                .createdAt("created_at")
                .draft(true)
                .eventsUrl("events_url")
                .htmlUrl("html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .labels(List.of(webhookLabel()))
                .labelsUrl("labels_url")
                .locked(true)
                .milestone(webhookMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssueCommentEditedIssuePerformedViaGithubApp())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookIssueReactions())
                .repositoryUrl("repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt("updated_at")
                .url("url")
                .user(webhookIssueAssignee())
                .build();
    }

    static GitHubWebhookIssueCommentEditedIssuePerformedViaGithubApp
            webhookIssueCommentEditedIssuePerformedViaGithubApp() {
        return GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppEvent.BRANCH_PROTECTION_RULE))
                .externalUrl("https://api.github.com/external_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .owner(webhookUser())
                .permissions(webhookIssueCommentEditedIssuePerformedViaGithubAppPermissions())
                .slug("slug")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookIssueCommentPinnedEvent webhookIssueCommentPinnedEvent() {
        return GitHubWebhookIssueCommentPinnedEventBuilder.builder()
                .comment(webhookIssueComment())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssueCommentUnpinnedEvent webhookIssueCommentUnpinnedEvent() {
        return GitHubWebhookIssueCommentUnpinnedEventBuilder.builder()
                .comment(webhookIssueComment())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookMilestone webhookMilestone() {
        return GitHubWebhookMilestoneBuilder.builder()
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .closedIssues(1L)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .creator(webhookIssueAssignee())
                .description("description")
                .dueOn(Instant.parse("2026-01-01T00:00:00Z"))
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .labelsUrl("https://api.github.com/labels_url")
                .nodeId("node_id")
                .number(1L)
                .openIssues(1L)
                .state(GitHubWebhookMilestoneState.OPEN)
                .title("title")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
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
