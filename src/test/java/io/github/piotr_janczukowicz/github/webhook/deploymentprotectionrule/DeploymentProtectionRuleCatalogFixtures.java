package io.github.piotr_janczukowicz.github.webhook.deploymentprotectionrule;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookAutoMerge;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookDeployment;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookPullRequestBase;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookPullRequestLabel;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookPullRequestLinks;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookPullRequestMilestone;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookPullRequestStack;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookTeamSimple;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import java.time.Instant;
import java.util.List;

final class DeploymentProtectionRuleCatalogFixtures {

    private DeploymentProtectionRuleCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookDeploymentProtectionRuleRequestedEvent webhookDeploymentProtectionRuleRequestedEvent() {
        return GitHubWebhookDeploymentProtectionRuleRequestedEventBuilder.builder()
                .deployment(webhookDeployment())
                .deploymentCallbackUrl("https://api.github.com/deployment_callback_url")
                .environment("environment")
                .event("event")
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .pullRequests(List.of(webhookPullRequest()))
                .ref("ref")
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .sha("sha")
                .build();
    }

    static GitHubWebhookPullRequest webhookPullRequest() {
        return GitHubWebhookPullRequestBuilder.builder()
                .links(webhookPullRequestLinks())
                .activeLockReason("too heated")
                .additions(100L)
                .assignees(List.of(webhookSimpleUser()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .autoMerge(webhookAutoMerge())
                .base(webhookPullRequestBase())
                .body("Please pull these awesome changes")
                .changedFiles(5L)
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .comments(10L)
                .commentsUrl("https://api.github.com/repos/octocat/Hello-World/issues/1347/comments")
                .commits(3L)
                .commitsUrl("https://api.github.com/repos/octocat/Hello-World/pulls/1347/commits")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .deletions(3L)
                .diffUrl("https://github.com/octocat/Hello-World/pull/1347.diff")
                .draft(false)
                .head(webhookPullRequestBase())
                .htmlUrl("https://github.com/octocat/Hello-World/pull/1347")
                .id(1L)
                .issueUrl("https://api.github.com/repos/octocat/Hello-World/issues/1347")
                .labels(List.of(webhookPullRequestLabel()))
                .locked(true)
                .maintainerCanModify(true)
                .mergeable(true)
                .mergeableState("clean")
                .merged(true)
                .mergedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .mergedBy(webhookSimpleUser())
                .milestone(webhookPullRequestMilestone())
                .nodeId("MDExOlB1bGxSZXF1ZXN0MQ==")
                .number(42L)
                .patchUrl("https://github.com/octocat/Hello-World/pull/1347.patch")
                .rebaseable(true)
                .requestedReviewers(List.of(webhookSimpleUser()))
                .requestedTeams(List.of(webhookTeamSimple()))
                .reviewCommentUrl("https://api.github.com/repos/octocat/Hello-World/pulls/comments{/number}")
                .reviewComments(0L)
                .reviewCommentsUrl("https://api.github.com/repos/octocat/Hello-World/pulls/1347/comments")
                .stack(webhookPullRequestStack())
                .state(GitHubWebhookMilestoneState.OPEN)
                .statusesUrl(
                        "https://api.github.com/repos/octocat/Hello-World/statuses/6dcb09b5b57875f334f61aebed695e2e4193db5e")
                .title("Amazing new feature")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/repos/octocat/Hello-World/pulls/1347")
                .user(webhookSimpleUser())
                .build();
    }
}
