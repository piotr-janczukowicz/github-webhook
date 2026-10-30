package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookFullRepositorySecurityAndAnalysis;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookLicenseSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookRepositoryPermissions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryMergeCommitMessage;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryMergeCommitTitle;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryPullRequestCreationPolicy;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositorySquashMergeCommitMessage;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositorySquashMergeCommitTitle;
import java.time.Instant;
import java.util.List;
import java.util.Map;

final class SecurityAndAnalysisCatalogFixtures {

    private SecurityAndAnalysisCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookCodeOfConductSimple webhookCodeOfConductSimple() {
        return GitHubWebhookCodeOfConductSimpleBuilder.builder()
                .htmlUrl("https://github.com/github/docs/blob/main/CODE_OF_CONDUCT.md")
                .key("citizen_code_of_conduct")
                .name("Citizen Code of Conduct")
                .url("https://api.github.com/repos/github/docs/community/code_of_conduct")
                .build();
    }

    static GitHubWebhookFullRepository webhookFullRepository() {
        return GitHubWebhookFullRepositoryBuilder.builder()
                .allowAutoMerge(false)
                .allowForking(true)
                .allowMergeCommit(true)
                .allowRebaseMerge(true)
                .allowSquashMerge(true)
                .allowUpdateBranch(true)
                .anonymousAccessEnabled(true)
                .archiveUrl("http://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}")
                .archived(true)
                .assigneesUrl("http://api.github.com/repos/octocat/Hello-World/assignees{/user}")
                .blobsUrl("http://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}")
                .branchesUrl("http://api.github.com/repos/octocat/Hello-World/branches{/branch}")
                .cloneUrl("https://github.com/octocat/Hello-World.git")
                .codeOfConduct(webhookCodeOfConductSimple())
                .collaboratorsUrl("http://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}")
                .commentsUrl("http://api.github.com/repos/octocat/Hello-World/comments{/number}")
                .commitsUrl("http://api.github.com/repos/octocat/Hello-World/commits{/sha}")
                .compareUrl("http://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}")
                .contentsUrl("http://api.github.com/repos/octocat/Hello-World/contents/{+path}")
                .contributorsUrl("http://api.github.com/repos/octocat/Hello-World/contributors")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .customProperties(Map.of("key", Map.of()))
                .defaultBranch("master")
                .deleteBranchOnMerge(false)
                .deploymentsUrl("http://api.github.com/repos/octocat/Hello-World/deployments")
                .description("This your first repo!")
                .disabled(true)
                .downloadsUrl("http://api.github.com/repos/octocat/Hello-World/downloads")
                .eventsUrl("http://api.github.com/repos/octocat/Hello-World/events")
                .fork(true)
                .forks(1L)
                .forksCount(9L)
                .forksUrl("http://api.github.com/repos/octocat/Hello-World/forks")
                .fullName("octocat/Hello-World")
                .gitCommitsUrl("http://api.github.com/repos/octocat/Hello-World/git/commits{/sha}")
                .gitRefsUrl("http://api.github.com/repos/octocat/Hello-World/git/refs{/sha}")
                .gitTagsUrl("http://api.github.com/repos/octocat/Hello-World/git/tags{/sha}")
                .gitUrl("git:github.com/octocat/Hello-World.git")
                .hasDiscussions(true)
                .hasIssues(true)
                .hasPages(true)
                .hasProjects(true)
                .hasPullRequests(true)
                .hasWiki(true)
                .homepage("https://github.com")
                .hooksUrl("http://api.github.com/repos/octocat/Hello-World/hooks")
                .htmlUrl("https://github.com/octocat/Hello-World")
                .id(1_296_269L)
                .isTemplate(true)
                .issueCommentUrl("http://api.github.com/repos/octocat/Hello-World/issues/comments{/number}")
                .issueEventsUrl("http://api.github.com/repos/octocat/Hello-World/issues/events{/number}")
                .issuesUrl("http://api.github.com/repos/octocat/Hello-World/issues{/number}")
                .keysUrl("http://api.github.com/repos/octocat/Hello-World/keys{/key_id}")
                .labelsUrl("http://api.github.com/repos/octocat/Hello-World/labels{/name}")
                .language("language")
                .languagesUrl("http://api.github.com/repos/octocat/Hello-World/languages")
                .license(webhookLicenseSimple())
                .masterBranch("master_branch")
                .mergeCommitMessage(GitHubWebhookRepositoryMergeCommitMessage.PR_BODY)
                .mergeCommitTitle(GitHubWebhookRepositoryMergeCommitTitle.PR_TITLE)
                .mergesUrl("http://api.github.com/repos/octocat/Hello-World/merges")
                .milestonesUrl("http://api.github.com/repos/octocat/Hello-World/milestones{/number}")
                .mirrorUrl("git:git.example.com/octocat/Hello-World")
                .name("Hello-World")
                .networkCount(0L)
                .nodeId("MDEwOlJlcG9zaXRvcnkxMjk2MjY5")
                .notificationsUrl(
                        "http://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}")
                .openIssues(1L)
                .openIssuesCount(0L)
                .organization(webhookSimpleUser())
                .owner(webhookSimpleUser())
                .parent(webhookRepository())
                .permissions(webhookRepositoryPermissions())
                .privateValue(true)
                .pullRequestCreationPolicy(GitHubWebhookRepositoryPullRequestCreationPolicy.ALL)
                .pullsUrl("http://api.github.com/repos/octocat/Hello-World/pulls{/number}")
                .pushedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .releasesUrl("http://api.github.com/repos/octocat/Hello-World/releases{/id}")
                .securityAndAnalysis(webhookFullRepositorySecurityAndAnalysis())
                .size(108L)
                .source(webhookRepository())
                .squashMergeCommitMessage(GitHubWebhookRepositorySquashMergeCommitMessage.PR_BODY)
                .squashMergeCommitTitle(GitHubWebhookRepositorySquashMergeCommitTitle.PR_TITLE)
                .sshUrl("git@github.com:octocat/Hello-World.git")
                .stargazersCount(80L)
                .stargazersUrl("http://api.github.com/repos/octocat/Hello-World/stargazers")
                .statusesUrl("http://api.github.com/repos/octocat/Hello-World/statuses/{sha}")
                .subscribersCount(42L)
                .subscribersUrl("http://api.github.com/repos/octocat/Hello-World/subscribers")
                .subscriptionUrl("http://api.github.com/repos/octocat/Hello-World/subscription")
                .svnUrl("https://svn.github.com/octocat/Hello-World")
                .tagsUrl("http://api.github.com/repos/octocat/Hello-World/tags")
                .teamsUrl("http://api.github.com/repos/octocat/Hello-World/teams")
                .tempCloneToken("temp_clone_token")
                .templateRepository(webhookRepository())
                .topics(List.of("topics"))
                .treesUrl("http://api.github.com/repos/octocat/Hello-World/git/trees{/sha}")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/repos/octocat/Hello-World")
                .visibility("public")
                .watchers(1L)
                .watchersCount(80L)
                .webCommitSignoffRequired(false)
                .build();
    }

    static GitHubWebhookSecurityAndAnalysisChanges webhookSecurityAndAnalysisChanges() {
        return GitHubWebhookSecurityAndAnalysisChangesBuilder.builder()
                .from(webhookSecurityAndAnalysisChangesFrom())
                .build();
    }

    static GitHubWebhookSecurityAndAnalysisChangesFrom webhookSecurityAndAnalysisChangesFrom() {
        return GitHubWebhookSecurityAndAnalysisChangesFromBuilder.builder()
                .securityAndAnalysis(webhookFullRepositorySecurityAndAnalysis())
                .build();
    }

    static GitHubWebhookSecurityAndAnalysisEvent webhookSecurityAndAnalysisEvent() {
        return GitHubWebhookSecurityAndAnalysisEventBuilder.builder()
                .changes(webhookSecurityAndAnalysisChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookFullRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
