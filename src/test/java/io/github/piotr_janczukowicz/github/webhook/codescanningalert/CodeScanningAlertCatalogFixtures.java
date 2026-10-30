package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;
import java.util.List;
import java.util.Map;

final class CodeScanningAlertCatalogFixtures {

    private CodeScanningAlertCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookAlertInstance webhookAlertInstance() {
        return GitHubWebhookAlertInstanceBuilder.builder()
                .analysisKey("analysis_key")
                .category("category")
                .classifications(List.of("classifications"))
                .commitSha("commit_sha")
                .environment("environment")
                .location(webhookAlertInstanceLocation())
                .message(webhookAlertInstanceMessage())
                .ref("ref")
                .state(GitHubWebhookAlertInstanceState.OPEN)
                .build();
    }

    static GitHubWebhookAlertInstanceLocation webhookAlertInstanceLocation() {
        return GitHubWebhookAlertInstanceLocationBuilder.builder()
                .endColumn(1L)
                .endLine(1L)
                .path("path")
                .startColumn(1L)
                .startLine(1L)
                .build();
    }

    static GitHubWebhookAlertInstanceMessage webhookAlertInstanceMessage() {
        return GitHubWebhookAlertInstanceMessageBuilder.builder().text("text").build();
    }

    static GitHubWebhookCodeScanningAlertAppearedInBranchAlert webhookCodeScanningAlertAppearedInBranchAlert() {
        return GitHubWebhookCodeScanningAlertAppearedInBranchAlertBuilder.builder()
                .assignees(List.of(webhookSimpleUser()))
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .dismissedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .dismissedBy(webhookUser())
                .dismissedComment("dismissed_comment")
                .dismissedReason(GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason.FALSE_POSITIVE)
                .htmlUrl("https://api.github.com/html_url")
                .mostRecentInstance(webhookAlertInstance())
                .number(1L)
                .rule(webhookCodeScanningAlertReopenedByUserAlertRule())
                .state(GitHubWebhookAlertInstanceState.OPEN)
                .tool(webhookCodeScanningAlertReopenedByUserAlertTool())
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookCodeScanningAlertAppearedInBranchEvent webhookCodeScanningAlertAppearedInBranchEvent() {
        return GitHubWebhookCodeScanningAlertAppearedInBranchEventBuilder.builder()
                .alert(webhookCodeScanningAlertAppearedInBranchAlert())
                .commitOid("commit_oid")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .ref("ref")
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCodeScanningAlertClosedByUserAlert webhookCodeScanningAlertClosedByUserAlert() {
        return GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder.builder()
                .assignees(List.of(webhookSimpleUser()))
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .dismissalApprovedBy(webhookUser())
                .dismissedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .dismissedBy(webhookUser())
                .dismissedComment("dismissed_comment")
                .dismissedReason(GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason.FALSE_POSITIVE)
                .htmlUrl("https://api.github.com/html_url")
                .mostRecentInstance(webhookAlertInstance())
                .number(1L)
                .rule(webhookCodeScanningAlertFixedAlertRule())
                .state(GitHubWebhookCodeScanningAlertClosedByUserAlertState.DISMISSED)
                .tool(webhookCodeScanningAlertFixedAlertTool())
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookCodeScanningAlertClosedByUserEvent webhookCodeScanningAlertClosedByUserEvent() {
        return GitHubWebhookCodeScanningAlertClosedByUserEventBuilder.builder()
                .alert(webhookCodeScanningAlertClosedByUserAlert())
                .commitOid("commit_oid")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .ref("ref")
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCodeScanningAlertCreatedAlert webhookCodeScanningAlertCreatedAlert() {
        return GitHubWebhookCodeScanningAlertCreatedAlertBuilder.builder()
                .assignees(List.of(webhookSimpleUser()))
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .dismissedComment("dismissed_comment")
                .htmlUrl("https://api.github.com/html_url")
                .instancesUrl("instances_url")
                .mostRecentInstance(webhookAlertInstance())
                .number(1L)
                .rule(webhookCodeScanningAlertFixedAlertRule())
                .state(GitHubWebhookCodeScanningAlertCreatedAlertState.OPEN)
                .tool(webhookCodeScanningAlertFixedAlertTool())
                .updatedAt("updated_at")
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookCodeScanningAlertCreatedEvent webhookCodeScanningAlertCreatedEvent() {
        return GitHubWebhookCodeScanningAlertCreatedEventBuilder.builder()
                .alert(webhookCodeScanningAlertCreatedAlert())
                .commitOid("commit_oid")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .ref("ref")
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCodeScanningAlertFixedAlert webhookCodeScanningAlertFixedAlert() {
        return GitHubWebhookCodeScanningAlertFixedAlertBuilder.builder()
                .assignees(List.of(webhookSimpleUser()))
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .dismissedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .dismissedBy(webhookUser())
                .dismissedComment("dismissed_comment")
                .dismissedReason(GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason.FALSE_POSITIVE)
                .htmlUrl("https://api.github.com/html_url")
                .instancesUrl("https://api.github.com/instances_url")
                .mostRecentInstance(webhookAlertInstance())
                .number(1L)
                .rule(webhookCodeScanningAlertFixedAlertRule())
                .state(GitHubWebhookCodeScanningAlertFixedAlertState.FIXED)
                .tool(webhookCodeScanningAlertFixedAlertTool())
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookCodeScanningAlertFixedAlertRule webhookCodeScanningAlertFixedAlertRule() {
        return GitHubWebhookCodeScanningAlertFixedAlertRuleBuilder.builder()
                .description("description")
                .fullDescription("full_description")
                .help("help")
                .helpUri("help_uri")
                .id("id")
                .name("name")
                .severity(GitHubWebhookCodeScanningAlertFixedAlertRuleSeverity.NONE)
                .tags(List.of("tags"))
                .build();
    }

    static GitHubWebhookCodeScanningAlertFixedAlertTool webhookCodeScanningAlertFixedAlertTool() {
        return GitHubWebhookCodeScanningAlertFixedAlertToolBuilder.builder()
                .guid("guid")
                .name("name")
                .version("version")
                .build();
    }

    static GitHubWebhookCodeScanningAlertFixedEvent webhookCodeScanningAlertFixedEvent() {
        return GitHubWebhookCodeScanningAlertFixedEventBuilder.builder()
                .alert(webhookCodeScanningAlertFixedAlert())
                .commitOid("commit_oid")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .ref("ref")
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCodeScanningAlertReopenedAlert webhookCodeScanningAlertReopenedAlert() {
        return GitHubWebhookCodeScanningAlertReopenedAlertBuilder.builder()
                .assignees(List.of(webhookSimpleUser()))
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .dismissedAt("dismissed_at")
                .dismissedBy(Map.of("key", Map.of()))
                .dismissedComment("dismissed_comment")
                .dismissedReason("dismissed_reason")
                .htmlUrl("https://api.github.com/html_url")
                .instancesUrl("instances_url")
                .mostRecentInstance(webhookAlertInstance())
                .number(1L)
                .rule(webhookCodeScanningAlertFixedAlertRule())
                .state(GitHubWebhookAlertInstanceState.OPEN)
                .tool(webhookCodeScanningAlertFixedAlertTool())
                .updatedAt("updated_at")
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookCodeScanningAlertReopenedByUserAlert webhookCodeScanningAlertReopenedByUserAlert() {
        return GitHubWebhookCodeScanningAlertReopenedByUserAlertBuilder.builder()
                .assignees(List.of(webhookSimpleUser()))
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .dismissedComment("dismissed_comment")
                .htmlUrl("https://api.github.com/html_url")
                .mostRecentInstance(webhookAlertInstance())
                .number(1L)
                .rule(webhookCodeScanningAlertReopenedByUserAlertRule())
                .state(GitHubWebhookCodeScanningAlertReopenedByUserAlertState.OPEN)
                .tool(webhookCodeScanningAlertReopenedByUserAlertTool())
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookCodeScanningAlertReopenedByUserAlertRule webhookCodeScanningAlertReopenedByUserAlertRule() {
        return GitHubWebhookCodeScanningAlertReopenedByUserAlertRuleBuilder.builder()
                .description("description")
                .id("id")
                .severity(GitHubWebhookCodeScanningAlertFixedAlertRuleSeverity.NONE)
                .build();
    }

    static GitHubWebhookCodeScanningAlertReopenedByUserAlertTool webhookCodeScanningAlertReopenedByUserAlertTool() {
        return GitHubWebhookCodeScanningAlertReopenedByUserAlertToolBuilder.builder()
                .name("name")
                .version("version")
                .build();
    }

    static GitHubWebhookCodeScanningAlertReopenedByUserEvent webhookCodeScanningAlertReopenedByUserEvent() {
        return GitHubWebhookCodeScanningAlertReopenedByUserEventBuilder.builder()
                .alert(webhookCodeScanningAlertReopenedByUserAlert())
                .commitOid("commit_oid")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .ref("ref")
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCodeScanningAlertReopenedEvent webhookCodeScanningAlertReopenedEvent() {
        return GitHubWebhookCodeScanningAlertReopenedEventBuilder.builder()
                .alert(webhookCodeScanningAlertReopenedAlert())
                .commitOid("commit_oid")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .ref("ref")
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCodeScanningAlertUpdatedAssignmentEvent webhookCodeScanningAlertUpdatedAssignmentEvent() {
        return GitHubWebhookCodeScanningAlertUpdatedAssignmentEventBuilder.builder()
                .alert(webhookCodeScanningAlertAppearedInBranchAlert())
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
