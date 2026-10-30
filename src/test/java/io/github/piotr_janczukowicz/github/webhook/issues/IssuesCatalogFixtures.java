package io.github.piotr_janczukowicz.github.webhook.issues;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssueComment;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssueCommentEditedIssuePerformedViaGithubAppPermissions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssueDependenciesSummary;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssueFieldValue;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuePullRequest;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssueReactions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssueType;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedChanges;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedIssueAssignee;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedLabel;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesLockedIssuePerformedViaGithubAppPermissions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesReopenedIssuePerformedViaGithubAppPermissions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookLabel;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookLicense;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookReactions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookRepositoryPermissions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSubIssuesSummary;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookAppEvent;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueActiveLockReason;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAssigneeType;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppEvent;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryPullRequestCreationPolicy;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryVisibility;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;
import java.util.List;
import java.util.Map;

final class IssuesCatalogFixtures {

    private IssuesCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookApp webhookApp() {
        return GitHubWebhookAppBuilder.builder()
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

    static GitHubWebhookIssue webhookIssue() {
        return GitHubWebhookIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookIssueAssignee())
                .assignees(List.of(webhookIssueAssignee()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .comments(1L)
                .commentsUrl("https://api.github.com/comments_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .draft(true)
                .eventsUrl("https://api.github.com/events_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .issueFieldValues(List.of(webhookIssueFieldValue()))
                .labels(List.of(webhookLabel()))
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .locked(true)
                .milestone(webhookMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookApp())
                .pinnedComment(webhookIssueComment())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookReactions())
                .repositoryUrl("https://api.github.com/repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("https://api.github.com/timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
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

    static GitHubWebhookIssuesAssignedEvent webhookIssuesAssignedEvent() {
        return GitHubWebhookIssuesAssignedEventBuilder.builder()
                .assignee(webhookUser())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesClosedEvent webhookIssuesClosedEvent() {
        return GitHubWebhookIssuesClosedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssuesClosedIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesClosedIssue webhookIssuesClosedIssue() {
        return GitHubWebhookIssuesClosedIssueBuilder.builder()
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
                .issueFieldValues(List.of(webhookIssueFieldValue()))
                .labels(List.of(webhookLabel()))
                .labelsUrl("labels_url")
                .locked(true)
                .milestone(webhookMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssuesClosedIssuePerformedViaGithubApp())
                .pinnedComment(webhookIssueComment())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookIssueReactions())
                .repositoryUrl("repository_url")
                .state(GitHubWebhookIssuesClosedIssueState.CLOSED)
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

    static GitHubWebhookIssuesClosedIssuePerformedViaGithubApp webhookIssuesClosedIssuePerformedViaGithubApp() {
        return GitHubWebhookIssuesClosedIssuePerformedViaGithubAppBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(GitHubWebhookIssuesClosedIssuePerformedViaGithubAppEvent.BRANCH_PROTECTION_RULE))
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

    static GitHubWebhookIssuesDeletedEvent webhookIssuesDeletedEvent() {
        return GitHubWebhookIssuesDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssuesDeletedIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesDeletedIssue webhookIssuesDeletedIssue() {
        return GitHubWebhookIssuesDeletedIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookUser())
                .assignees(List.of(webhookUser()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .comments(1L)
                .commentsUrl("https://api.github.com/comments_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .draft(true)
                .eventsUrl("https://api.github.com/events_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .issueFieldValues(List.of(webhookIssueFieldValue()))
                .labels(List.of(webhookLabel()))
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .locked(true)
                .milestone(webhookIssuesLockedIssueMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssuesDeletedIssuePerformedViaGithubApp())
                .pinnedComment(webhookIssueComment())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookReactions())
                .repositoryUrl("https://api.github.com/repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("https://api.github.com/timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookIssuesDeletedIssuePerformedViaGithubApp webhookIssuesDeletedIssuePerformedViaGithubApp() {
        return GitHubWebhookIssuesDeletedIssuePerformedViaGithubAppBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(GitHubWebhookIssuesDeletedIssuePerformedViaGithubAppEvent.BRANCH_PROTECTION_RULE))
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

    static GitHubWebhookIssuesDemilestonedEvent webhookIssuesDemilestonedEvent() {
        return GitHubWebhookIssuesDemilestonedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssuesDemilestonedIssue())
                .milestone(webhookMilestone())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesDemilestonedIssue webhookIssuesDemilestonedIssue() {
        return GitHubWebhookIssuesDemilestonedIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookIssuesEditedIssueAssignee())
                .assignees(List.of(webhookIssuesEditedIssueAssignee()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .comments(1L)
                .commentsUrl("https://api.github.com/comments_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .draft(true)
                .eventsUrl("https://api.github.com/events_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .issueFieldValues(List.of(webhookIssueFieldValue()))
                .labels(List.of(webhookLabel()))
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .locked(true)
                .milestone(webhookMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssuesDemilestonedIssuePerformedViaGithubApp())
                .pinnedComment(webhookIssueComment())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookReactions())
                .repositoryUrl("https://api.github.com/repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("https://api.github.com/timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .user(webhookIssueAssignee())
                .build();
    }

    static GitHubWebhookIssuesDemilestonedIssuePerformedViaGithubApp
            webhookIssuesDemilestonedIssuePerformedViaGithubApp() {
        return GitHubWebhookIssuesDemilestonedIssuePerformedViaGithubAppBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(GitHubWebhookAppEvent.BRANCH_PROTECTION_RULE))
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

    static GitHubWebhookIssuesEditedEvent webhookIssuesEditedEvent() {
        return GitHubWebhookIssuesEditedEventBuilder.builder()
                .changes(webhookIssuesEditedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssuesEditedIssue())
                .label(webhookIssuesEditedLabel())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesEditedIssue webhookIssuesEditedIssue() {
        return GitHubWebhookIssuesEditedIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookIssueAssignee())
                .assignees(List.of(webhookIssuesEditedIssueAssignee()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .comments(1L)
                .commentsUrl("https://api.github.com/comments_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .draft(true)
                .eventsUrl("https://api.github.com/events_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .issueFieldValues(List.of(webhookIssueFieldValue()))
                .labels(List.of(webhookLabel()))
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .locked(true)
                .milestone(webhookMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssuesEditedIssuePerformedViaGithubApp())
                .pinnedComment(webhookIssueComment())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookReactions())
                .repositoryUrl("https://api.github.com/repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("https://api.github.com/timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .user(webhookIssueAssignee())
                .build();
    }

    static GitHubWebhookIssuesEditedIssuePerformedViaGithubApp webhookIssuesEditedIssuePerformedViaGithubApp() {
        return GitHubWebhookIssuesEditedIssuePerformedViaGithubAppBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(GitHubWebhookIssuesEditedIssuePerformedViaGithubAppEvent.BRANCH_PROTECTION_RULE))
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

    static GitHubWebhookIssuesFieldAddedChanges webhookIssuesFieldAddedChanges() {
        return GitHubWebhookIssuesFieldAddedChangesBuilder.builder()
                .issueFieldValue(webhookIssuesFieldAddedChangesIssueFieldValue())
                .build();
    }

    static GitHubWebhookIssuesFieldAddedChangesIssueFieldValue webhookIssuesFieldAddedChangesIssueFieldValue() {
        return GitHubWebhookIssuesFieldAddedChangesIssueFieldValueBuilder.builder()
                .from(webhookIssuesFieldAddedIssueFieldValue())
                .build();
    }

    static GitHubWebhookIssuesFieldAddedEvent webhookIssuesFieldAddedEvent() {
        return GitHubWebhookIssuesFieldAddedEventBuilder.builder()
                .changes(webhookIssuesFieldAddedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssue())
                .issueField(webhookIssuesFieldAddedIssueField())
                .issueFieldValue(webhookIssuesFieldAddedIssueFieldValue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesFieldAddedIssueField webhookIssuesFieldAddedIssueField() {
        return GitHubWebhookIssuesFieldAddedIssueFieldBuilder.builder()
                .fieldType(GitHubWebhookIssuesFieldAddedIssueFieldFieldType.TEXT)
                .id(1L)
                .name("name")
                .build();
    }

    static GitHubWebhookIssuesFieldAddedIssueFieldValue webhookIssuesFieldAddedIssueFieldValue() {
        return GitHubWebhookIssuesFieldAddedIssueFieldValueBuilder.builder()
                .id(1L)
                .option(webhookIssuesFieldAddedIssueFieldValueOption())
                .options(List.of(webhookIssuesFieldAddedIssueFieldValueOption()))
                .value("value")
                .valueId(1L)
                .valueIds(List.of(1L))
                .build();
    }

    static GitHubWebhookIssuesFieldAddedIssueFieldValueOption webhookIssuesFieldAddedIssueFieldValueOption() {
        return GitHubWebhookIssuesFieldAddedIssueFieldValueOptionBuilder.builder()
                .color("color")
                .description("description")
                .id(1L)
                .name("name")
                .build();
    }

    static GitHubWebhookIssuesFieldRemovedEvent webhookIssuesFieldRemovedEvent() {
        return GitHubWebhookIssuesFieldRemovedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssue())
                .issueField(webhookIssuesFieldAddedIssueField())
                .issueFieldValue(webhookIssuesFieldAddedIssueFieldValue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesLabeledEvent webhookIssuesLabeledEvent() {
        return GitHubWebhookIssuesLabeledEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssuesLabeledIssue())
                .label(webhookIssuesEditedLabel())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesLabeledIssue webhookIssuesLabeledIssue() {
        return GitHubWebhookIssuesLabeledIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookIssueAssignee())
                .assignees(List.of(webhookIssuesEditedIssueAssignee()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .comments(1L)
                .commentsUrl("https://api.github.com/comments_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .draft(true)
                .eventsUrl("https://api.github.com/events_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .issueFieldValues(List.of(webhookIssueFieldValue()))
                .labels(List.of(webhookIssuesEditedLabel()))
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .locked(true)
                .milestone(webhookMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssuesLabeledIssuePerformedViaGithubApp())
                .pinnedComment(webhookIssueComment())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookReactions())
                .repositoryUrl("https://api.github.com/repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("https://api.github.com/timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .user(webhookIssueAssignee())
                .build();
    }

    static GitHubWebhookIssuesLabeledIssuePerformedViaGithubApp webhookIssuesLabeledIssuePerformedViaGithubApp() {
        return GitHubWebhookIssuesLabeledIssuePerformedViaGithubAppBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(GitHubWebhookIssuesLabeledIssuePerformedViaGithubAppEvent.BRANCH_PROTECTION_RULE))
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

    static GitHubWebhookIssuesLockedEvent webhookIssuesLockedEvent() {
        return GitHubWebhookIssuesLockedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssuesLockedIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesLockedIssue webhookIssuesLockedIssue() {
        return GitHubWebhookIssuesLockedIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookUser())
                .assignees(List.of(webhookUser()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .comments(1L)
                .commentsUrl("https://api.github.com/comments_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .draft(true)
                .eventsUrl("https://api.github.com/events_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .issueFieldValues(List.of(webhookIssueFieldValue()))
                .labels(List.of(webhookLabel()))
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .locked(true)
                .milestone(webhookIssuesLockedIssueMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssuesLockedIssuePerformedViaGithubApp())
                .pinnedComment(webhookIssueComment())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookReactions())
                .repositoryUrl("https://api.github.com/repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("https://api.github.com/timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookIssuesLockedIssueMilestone webhookIssuesLockedIssueMilestone() {
        return GitHubWebhookIssuesLockedIssueMilestoneBuilder.builder()
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .closedIssues(1L)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .creator(webhookUser())
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

    static GitHubWebhookIssuesLockedIssuePerformedViaGithubApp webhookIssuesLockedIssuePerformedViaGithubApp() {
        return GitHubWebhookIssuesLockedIssuePerformedViaGithubAppBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(GitHubWebhookIssuesLockedIssuePerformedViaGithubAppEvent.BRANCH_PROTECTION_RULE))
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

    static GitHubWebhookIssuesMilestonedEvent webhookIssuesMilestonedEvent() {
        return GitHubWebhookIssuesMilestonedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssuesMilestonedIssue())
                .milestone(webhookMilestone())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesMilestonedIssue webhookIssuesMilestonedIssue() {
        return GitHubWebhookIssuesMilestonedIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookIssuesReopenedIssueAssignee())
                .assignees(List.of(webhookIssuesReopenedIssueAssignee()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .comments(1L)
                .commentsUrl("https://api.github.com/comments_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .draft(true)
                .eventsUrl("https://api.github.com/events_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .issueFieldValues(List.of(webhookIssueFieldValue()))
                .labels(List.of(webhookLabel()))
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .locked(true)
                .milestone(webhookMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssuesMilestonedIssuePerformedViaGithubApp())
                .pinnedComment(webhookIssueComment())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookReactions())
                .repositoryUrl("https://api.github.com/repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("https://api.github.com/timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookIssuesMilestonedIssuePerformedViaGithubApp webhookIssuesMilestonedIssuePerformedViaGithubApp() {
        return GitHubWebhookIssuesMilestonedIssuePerformedViaGithubAppBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(GitHubWebhookIssuesDeletedIssuePerformedViaGithubAppEvent.BRANCH_PROTECTION_RULE))
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

    static GitHubWebhookIssuesOpenedChanges webhookIssuesOpenedChanges() {
        return GitHubWebhookIssuesOpenedChangesBuilder.builder()
                .oldIssue(webhookIssuesOpenedChangesOldIssue())
                .oldRepository(webhookIssuesOpenedChangesOldRepository())
                .build();
    }

    static GitHubWebhookIssuesOpenedChangesOldIssue webhookIssuesOpenedChangesOldIssue() {
        return GitHubWebhookIssuesOpenedChangesOldIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookUser())
                .assignees(List.of(webhookUser()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .comments(1L)
                .commentsUrl("https://api.github.com/comments_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .draft(true)
                .eventsUrl("https://api.github.com/events_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .issueFieldValues(List.of(webhookIssueFieldValue()))
                .labels(List.of(webhookLabel()))
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .locked(true)
                .milestone(webhookIssuesLockedIssueMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssuesPinnedIssuePerformedViaGithubApp())
                .pinnedComment(webhookIssueComment())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookReactions())
                .repositoryUrl("https://api.github.com/repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("https://api.github.com/timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookIssuesOpenedChangesOldRepository webhookIssuesOpenedChangesOldRepository() {
        return GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder()
                .allowAutoMerge(true)
                .allowForking(true)
                .allowMergeCommit(true)
                .allowRebaseMerge(true)
                .allowSquashMerge(true)
                .allowUpdateBranch(true)
                .archiveUrl("https://api.github.com/archive_url{/id}")
                .archived(true)
                .assigneesUrl("https://api.github.com/assignees_url{/id}")
                .blobsUrl("https://api.github.com/blobs_url{/id}")
                .branchesUrl("https://api.github.com/branches_url{/id}")
                .cloneUrl("https://api.github.com/clone_url")
                .collaboratorsUrl("https://api.github.com/collaborators_url{/id}")
                .commentsUrl("https://api.github.com/comments_url{/id}")
                .commitsUrl("https://api.github.com/commits_url{/id}")
                .compareUrl("https://api.github.com/compare_url{/id}")
                .contentsUrl("https://api.github.com/contents_url{/id}")
                .contributorsUrl("https://api.github.com/contributors_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .customProperties(Map.of("key", Map.of()))
                .defaultBranch("default_branch")
                .deleteBranchOnMerge(true)
                .deploymentsUrl("https://api.github.com/deployments_url")
                .description("description")
                .disabled(true)
                .downloadsUrl("https://api.github.com/downloads_url")
                .eventsUrl("https://api.github.com/events_url")
                .fork(true)
                .forks(1L)
                .forksCount(1L)
                .forksUrl("https://api.github.com/forks_url")
                .fullName("full_name")
                .gitCommitsUrl("https://api.github.com/git_commits_url{/id}")
                .gitRefsUrl("https://api.github.com/git_refs_url{/id}")
                .gitTagsUrl("https://api.github.com/git_tags_url{/id}")
                .gitUrl("https://api.github.com/git_url")
                .hasDiscussions(true)
                .hasDownloads(true)
                .hasIssues(true)
                .hasPages(true)
                .hasProjects(true)
                .hasPullRequests(true)
                .hasWiki(true)
                .homepage("homepage")
                .hooksUrl("https://api.github.com/hooks_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .isTemplate(true)
                .issueCommentUrl("https://api.github.com/issue_comment_url{/id}")
                .issueEventsUrl("https://api.github.com/issue_events_url{/id}")
                .issuesUrl("https://api.github.com/issues_url{/id}")
                .keysUrl("https://api.github.com/keys_url{/id}")
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .language("language")
                .languagesUrl("https://api.github.com/languages_url")
                .license(webhookLicense())
                .masterBranch("master_branch")
                .mergesUrl("https://api.github.com/merges_url")
                .milestonesUrl("https://api.github.com/milestones_url{/id}")
                .mirrorUrl("https://api.github.com/mirror_url")
                .name("name")
                .nodeId("node_id")
                .notificationsUrl("https://api.github.com/notifications_url{/id}")
                .openIssues(1L)
                .openIssuesCount(1L)
                .organization("organization")
                .owner(webhookUser())
                .permissions(webhookRepositoryPermissions())
                .privateValue(true)
                .publicValue(true)
                .pullRequestCreationPolicy(GitHubWebhookRepositoryPullRequestCreationPolicy.ALL)
                .pullsUrl("https://api.github.com/pulls_url{/id}")
                .pushedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .releasesUrl("https://api.github.com/releases_url{/id}")
                .roleName("role_name")
                .size(1L)
                .sshUrl("ssh_url")
                .stargazers(1L)
                .stargazersCount(1L)
                .stargazersUrl("https://api.github.com/stargazers_url")
                .statusesUrl("https://api.github.com/statuses_url{/id}")
                .subscribersUrl("https://api.github.com/subscribers_url")
                .subscriptionUrl("https://api.github.com/subscription_url")
                .svnUrl("https://api.github.com/svn_url")
                .tagsUrl("https://api.github.com/tags_url")
                .teamsUrl("https://api.github.com/teams_url")
                .topics(List.of("topics"))
                .treesUrl("https://api.github.com/trees_url{/id}")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .visibility(GitHubWebhookRepositoryVisibility.PUBLIC)
                .watchers(1L)
                .watchersCount(1L)
                .webCommitSignoffRequired(true)
                .build();
    }

    static GitHubWebhookIssuesOpenedEvent webhookIssuesOpenedEvent() {
        return GitHubWebhookIssuesOpenedEventBuilder.builder()
                .changes(webhookIssuesOpenedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssuesOpenedIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesOpenedIssue webhookIssuesOpenedIssue() {
        return GitHubWebhookIssuesOpenedIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookUser())
                .assignees(List.of(webhookUser()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .comments(1L)
                .commentsUrl("https://api.github.com/comments_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .draft(true)
                .eventsUrl("https://api.github.com/events_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .issueFieldValues(List.of(webhookIssueFieldValue()))
                .labels(List.of(webhookLabel()))
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .locked(true)
                .milestone(webhookMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssuesEditedIssuePerformedViaGithubApp())
                .pinnedComment(webhookIssueComment())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookReactions())
                .repositoryUrl("https://api.github.com/repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("https://api.github.com/timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookIssuesPinnedEvent webhookIssuesPinnedEvent() {
        return GitHubWebhookIssuesPinnedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssuesPinnedIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesPinnedIssue webhookIssuesPinnedIssue() {
        return GitHubWebhookIssuesPinnedIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookUser())
                .assignees(List.of(webhookUser()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .comments(1L)
                .commentsUrl("https://api.github.com/comments_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .draft(true)
                .eventsUrl("https://api.github.com/events_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .issueFieldValues(List.of(webhookIssueFieldValue()))
                .labels(List.of(webhookLabel()))
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .locked(true)
                .milestone(webhookIssuesLockedIssueMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssuesPinnedIssuePerformedViaGithubApp())
                .pinnedComment(webhookIssueComment())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookReactions())
                .repositoryUrl("https://api.github.com/repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("https://api.github.com/timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookIssuesPinnedIssuePerformedViaGithubApp webhookIssuesPinnedIssuePerformedViaGithubApp() {
        return GitHubWebhookIssuesPinnedIssuePerformedViaGithubAppBuilder.builder()
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

    static GitHubWebhookIssuesReopenedEvent webhookIssuesReopenedEvent() {
        return GitHubWebhookIssuesReopenedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssuesReopenedIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesReopenedIssue webhookIssuesReopenedIssue() {
        return GitHubWebhookIssuesReopenedIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookIssuesReopenedIssueAssignee())
                .assignees(List.of(webhookIssuesEditedIssueAssignee()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .comments(1L)
                .commentsUrl("https://api.github.com/comments_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .draft(true)
                .eventsUrl("https://api.github.com/events_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .issueFieldValues(List.of(webhookIssueFieldValue()))
                .labels(List.of(webhookLabel()))
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .locked(true)
                .milestone(webhookMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssuesReopenedIssuePerformedViaGithubApp())
                .pinnedComment(webhookIssueComment())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookReactions())
                .repositoryUrl("https://api.github.com/repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("https://api.github.com/timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .user(webhookIssueAssignee())
                .build();
    }

    static GitHubWebhookIssuesReopenedIssueAssignee webhookIssuesReopenedIssueAssignee() {
        return GitHubWebhookIssuesReopenedIssueAssigneeBuilder.builder()
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

    static GitHubWebhookIssuesReopenedIssuePerformedViaGithubApp webhookIssuesReopenedIssuePerformedViaGithubApp() {
        return GitHubWebhookIssuesReopenedIssuePerformedViaGithubAppBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .events(List.of(GitHubWebhookIssuesLabeledIssuePerformedViaGithubAppEvent.BRANCH_PROTECTION_RULE))
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

    static GitHubWebhookIssuesTransferredChanges webhookIssuesTransferredChanges() {
        return GitHubWebhookIssuesTransferredChangesBuilder.builder()
                .newIssue(webhookIssuesPinnedIssue())
                .newRepository(webhookIssuesTransferredChangesNewRepository())
                .build();
    }

    static GitHubWebhookIssuesTransferredChangesNewRepository webhookIssuesTransferredChangesNewRepository() {
        return GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder()
                .allowAutoMerge(true)
                .allowForking(true)
                .allowMergeCommit(true)
                .allowRebaseMerge(true)
                .allowSquashMerge(true)
                .allowUpdateBranch(true)
                .archiveUrl("https://api.github.com/archive_url{/id}")
                .archived(true)
                .assigneesUrl("https://api.github.com/assignees_url{/id}")
                .blobsUrl("https://api.github.com/blobs_url{/id}")
                .branchesUrl("https://api.github.com/branches_url{/id}")
                .cloneUrl("https://api.github.com/clone_url")
                .collaboratorsUrl("https://api.github.com/collaborators_url{/id}")
                .commentsUrl("https://api.github.com/comments_url{/id}")
                .commitsUrl("https://api.github.com/commits_url{/id}")
                .compareUrl("https://api.github.com/compare_url{/id}")
                .contentsUrl("https://api.github.com/contents_url{/id}")
                .contributorsUrl("https://api.github.com/contributors_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .customProperties(Map.of("key", Map.of()))
                .defaultBranch("default_branch")
                .deleteBranchOnMerge(true)
                .deploymentsUrl("https://api.github.com/deployments_url")
                .description("description")
                .disabled(true)
                .downloadsUrl("https://api.github.com/downloads_url")
                .eventsUrl("https://api.github.com/events_url")
                .fork(true)
                .forks(1L)
                .forksCount(1L)
                .forksUrl("https://api.github.com/forks_url")
                .fullName("full_name")
                .gitCommitsUrl("https://api.github.com/git_commits_url{/id}")
                .gitRefsUrl("https://api.github.com/git_refs_url{/id}")
                .gitTagsUrl("https://api.github.com/git_tags_url{/id}")
                .gitUrl("https://api.github.com/git_url")
                .hasDiscussions(true)
                .hasDownloads(true)
                .hasIssues(true)
                .hasPages(true)
                .hasProjects(true)
                .hasPullRequests(true)
                .hasWiki(true)
                .homepage("homepage")
                .hooksUrl("https://api.github.com/hooks_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .isTemplate(true)
                .issueCommentUrl("https://api.github.com/issue_comment_url{/id}")
                .issueEventsUrl("https://api.github.com/issue_events_url{/id}")
                .issuesUrl("https://api.github.com/issues_url{/id}")
                .keysUrl("https://api.github.com/keys_url{/id}")
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .language("language")
                .languagesUrl("https://api.github.com/languages_url")
                .license(webhookLicense())
                .masterBranch("master_branch")
                .mergesUrl("https://api.github.com/merges_url")
                .milestonesUrl("https://api.github.com/milestones_url{/id}")
                .mirrorUrl("https://api.github.com/mirror_url")
                .name("name")
                .nodeId("node_id")
                .notificationsUrl("https://api.github.com/notifications_url{/id}")
                .openIssues(1L)
                .openIssuesCount(1L)
                .organization("organization")
                .owner(webhookUser())
                .permissions(webhookRepositoryPermissions())
                .privateValue(true)
                .publicValue(true)
                .pullRequestCreationPolicy(GitHubWebhookRepositoryPullRequestCreationPolicy.ALL)
                .pullsUrl("https://api.github.com/pulls_url{/id}")
                .pushedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .releasesUrl("https://api.github.com/releases_url{/id}")
                .roleName("role_name")
                .size(1L)
                .sshUrl("ssh_url")
                .stargazers(1L)
                .stargazersCount(1L)
                .stargazersUrl("https://api.github.com/stargazers_url")
                .statusesUrl("https://api.github.com/statuses_url{/id}")
                .subscribersUrl("https://api.github.com/subscribers_url")
                .subscriptionUrl("https://api.github.com/subscription_url")
                .svnUrl("https://api.github.com/svn_url")
                .tagsUrl("https://api.github.com/tags_url")
                .teamsUrl("https://api.github.com/teams_url")
                .topics(List.of("topics"))
                .treesUrl("https://api.github.com/trees_url{/id}")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .visibility(GitHubWebhookRepositoryVisibility.PUBLIC)
                .watchers(1L)
                .watchersCount(1L)
                .webCommitSignoffRequired(true)
                .build();
    }

    static GitHubWebhookIssuesTransferredEvent webhookIssuesTransferredEvent() {
        return GitHubWebhookIssuesTransferredEventBuilder.builder()
                .changes(webhookIssuesTransferredChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssuesPinnedIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesTypedEvent webhookIssuesTypedEvent() {
        return GitHubWebhookIssuesTypedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .type(webhookIssueType())
                .build();
    }

    static GitHubWebhookIssuesUnassignedEvent webhookIssuesUnassignedEvent() {
        return GitHubWebhookIssuesUnassignedEventBuilder.builder()
                .assignee(webhookIssueAssignee())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesUnlabeledEvent webhookIssuesUnlabeledEvent() {
        return GitHubWebhookIssuesUnlabeledEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssue())
                .label(webhookIssuesEditedLabel())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesUnlockedEvent webhookIssuesUnlockedEvent() {
        return GitHubWebhookIssuesUnlockedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssuesUnlockedIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesUnlockedIssue webhookIssuesUnlockedIssue() {
        return GitHubWebhookIssuesUnlockedIssueBuilder.builder()
                .activeLockReason(GitHubWebhookIssueActiveLockReason.RESOLVED)
                .assignee(webhookUser())
                .assignees(List.of(webhookUser()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .comments(1L)
                .commentsUrl("https://api.github.com/comments_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .draft(true)
                .eventsUrl("https://api.github.com/events_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .issueFieldValues(List.of(webhookIssueFieldValue()))
                .labels(List.of(webhookLabel()))
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .locked(false)
                .milestone(webhookIssuesLockedIssueMilestone())
                .nodeId("node_id")
                .number(1L)
                .performedViaGithubApp(webhookIssuesPinnedIssuePerformedViaGithubApp())
                .pinnedComment(webhookIssueComment())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookReactions())
                .repositoryUrl("https://api.github.com/repository_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .stateReason("state_reason")
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("https://api.github.com/timeline_url")
                .title("title")
                .type(webhookIssueType())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookIssuesUnpinnedEvent webhookIssuesUnpinnedEvent() {
        return GitHubWebhookIssuesUnpinnedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssuesPinnedIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssuesUntypedEvent webhookIssuesUntypedEvent() {
        return GitHubWebhookIssuesUntypedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .issue(webhookIssue())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .type(webhookIssueType())
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
