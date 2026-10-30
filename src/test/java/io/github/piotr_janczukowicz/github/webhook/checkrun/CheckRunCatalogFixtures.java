package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookCheckRunPullRequest;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookFullRepositorySecurityAndAnalysis;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookGitHubApp;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookRepositoryTemplateRepositoryPermissions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryPullRequestCreationPolicy;
import java.time.Instant;
import java.util.List;
import java.util.Map;

final class CheckRunCatalogFixtures {

    private CheckRunCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookCheckRun webhookCheckRun() {
        return GitHubWebhookCheckRunBuilder.builder()
                .app(webhookGitHubApp())
                .checkSuite(webhookCheckRunCheckSuite())
                .completedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .conclusion(GitHubWebhookCheckRunConclusion.WAITING)
                .deployment(webhookDeployment())
                .detailsUrl("https://example.com")
                .externalId("42")
                .headSha("009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d")
                .htmlUrl("https://github.com/github/hello-world/runs/4")
                .id(21L)
                .name("test-coverage")
                .nodeId("MDg6Q2hlY2tSdW40")
                .output(webhookCheckRunOutput())
                .pullRequests(List.of(webhookCheckRunPullRequest()))
                .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .status(GitHubWebhookCheckRunStatus.QUEUED)
                .url("https://api.github.com/repos/github/hello-world/check-runs/4")
                .build();
    }

    static GitHubWebhookCheckRunCheckSuite webhookCheckRunCheckSuite() {
        return GitHubWebhookCheckRunCheckSuiteBuilder.builder()
                .after("d6fde92930d4715a2b49857d24b940956b26d2d3")
                .app(webhookGitHubApp())
                .before("146e867f55c26428e5f9fade55a9bbf5e95a7912")
                .conclusion(GitHubWebhookCheckRunCheckSuiteConclusion.SUCCESS)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .headBranch("master")
                .headSha("009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d")
                .id(5L)
                .nodeId("MDEwOkNoZWNrU3VpdGU1")
                .pullRequests(List.of(webhookCheckRunPullRequest()))
                .repository(webhookMinimalRepository())
                .status(GitHubWebhookCheckRunCheckSuiteStatus.QUEUED)
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/repos/github/hello-world/check-suites/5")
                .build();
    }

    static GitHubWebhookCheckRunCompletedEvent webhookCheckRunCompletedEvent() {
        return GitHubWebhookCheckRunCompletedEventBuilder.builder()
                .checkRun(webhookCheckRun())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCheckRunCreatedEvent webhookCheckRunCreatedEvent() {
        return GitHubWebhookCheckRunCreatedEventBuilder.builder()
                .checkRun(webhookCheckRun())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCheckRunOutput webhookCheckRunOutput() {
        return GitHubWebhookCheckRunOutputBuilder.builder()
                .annotationsCount(1L)
                .annotationsUrl("https://api.github.com/annotations_url")
                .summary("summary")
                .text("text")
                .title("title")
                .build();
    }

    static GitHubWebhookCheckRunRequestedActionEvent webhookCheckRunRequestedActionEvent() {
        return GitHubWebhookCheckRunRequestedActionEventBuilder.builder()
                .checkRun(webhookCheckRun())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .requestedAction(webhookCheckRunRequestedActionValue())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCheckRunRequestedActionValue webhookCheckRunRequestedActionValue() {
        return GitHubWebhookCheckRunRequestedActionValueBuilder.builder()
                .identifier("identifier")
                .build();
    }

    static GitHubWebhookCheckRunRerequestedEvent webhookCheckRunRerequestedEvent() {
        return GitHubWebhookCheckRunRerequestedEventBuilder.builder()
                .checkRun(webhookCheckRun())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCodeOfConduct webhookCodeOfConduct() {
        return GitHubWebhookCodeOfConductBuilder.builder()
                .body(
                        "# Contributor Covenant Code of Conduct\n\n## Our Pledge\n\nIn the interest of fostering an open and welcoming environment, we as contributors and maintainers pledge to making participation in our project and our community a harassment-free experience for everyone, regardless of age, body size, disability, ethnicity, gender identity and expression, level of experience, nationality, personal appearance, race, religion, or sexual identity and orientation.\n\n## Our Standards\n\nExamples of behavior that contributes to creating a positive environment include:\n\n* Using welcoming and inclusive language\n* Being respectful of differing viewpoints and experiences\n* Gracefully accepting constructive criticism\n* Focusing on what is best for the community\n* Showing empathy towards other community members\n\nExamples of unacceptable behavior by participants include:\n\n* The use of sexualized language or imagery and unwelcome sexual attention or advances\n* Trolling, insulting/derogatory comments, and personal or political attacks\n* Public or private harassment\n* Publishing others' private information, such as a physical or electronic address, without explicit permission\n* Other conduct which could reasonably be considered inappropriate in a professional setting\n\n## Our Responsibilities\n\nProject maintainers are responsible for clarifying the standards of acceptable behavior and are expected to take appropriate and fair corrective action in response\n                  to any instances of unacceptable behavior.\n\nProject maintainers have the right and responsibility to remove, edit, or reject comments, commits, code, wiki edits, issues, and other contributions that are not aligned to this Code of Conduct, or to ban temporarily or permanently any contributor for other behaviors that they deem inappropriate, threatening, offensive, or harmful.\n\n## Scope\n\nThis Code of Conduct applies both within project spaces and in public spaces when an individual is representing the project or its community. Examples of representing a project or community include using an official project e-mail address,\n                  posting via an official social media account, or acting as an appointed representative at an online or offline event. Representation of a project may be further defined and clarified by project maintainers.\n\n## Enforcement\n\nInstances of abusive, harassing, or otherwise unacceptable behavior may be reported by contacting the project team at [EMAIL]. The project team will review and investigate all complaints, and will respond in a way that it deems appropriate to the circumstances. The project team is obligated to maintain confidentiality with regard to the reporter of an incident. Further details of specific enforcement policies may be posted separately.\n\nProject maintainers who do not follow or enforce the Code of Conduct in good faith may face temporary or permanent repercussions as determined by other members of the project's leadership.\n\n## Attribution\n\nThis Code of Conduct is adapted from the [Contributor Covenant](http://contributor-covenant.org), version 1.4, available at [http://contributor-covenant.org/version/1/4](http://contributor-covenant.org/version/1/4/).\n")
                .htmlUrl("https://api.github.com/html_url")
                .key("contributor_covenant")
                .name("Contributor Covenant")
                .url("https://api.github.com/codes_of_conduct/contributor_covenant")
                .build();
    }

    static GitHubWebhookDeployment webhookDeployment() {
        return GitHubWebhookDeploymentBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("Deploy request from hubot")
                .environment("production")
                .id(42L)
                .nodeId("MDEwOkRlcGxveW1lbnQx")
                .originalEnvironment("staging")
                .performedViaGithubApp(webhookGitHubApp())
                .productionEnvironment(true)
                .repositoryUrl("https://api.github.com/repos/octocat/example")
                .statusesUrl("https://api.github.com/repos/octocat/example/deployments/1/statuses")
                .task("deploy")
                .transientEnvironment(true)
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/repos/octocat/example/deployments/1")
                .build();
    }

    static GitHubWebhookMinimalRepository webhookMinimalRepository() {
        return GitHubWebhookMinimalRepositoryBuilder.builder()
                .allowForking(true)
                .archiveUrl("http://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}")
                .archived(true)
                .assigneesUrl("http://api.github.com/repos/octocat/Hello-World/assignees{/user}")
                .blobsUrl("http://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}")
                .branchesUrl("http://api.github.com/repos/octocat/Hello-World/branches{/branch}")
                .cloneUrl("clone_url")
                .codeOfConduct(webhookCodeOfConduct())
                .collaboratorsUrl("http://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}")
                .commentsUrl("http://api.github.com/repos/octocat/Hello-World/comments{/number}")
                .commitsUrl("http://api.github.com/repos/octocat/Hello-World/commits{/sha}")
                .compareUrl("http://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}")
                .contentsUrl("http://api.github.com/repos/octocat/Hello-World/contents/{+path}")
                .contributorsUrl("http://api.github.com/repos/octocat/Hello-World/contributors")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .customProperties(Map.of("key", Map.of()))
                .defaultBranch("default_branch")
                .deleteBranchOnMerge(true)
                .deploymentsUrl("http://api.github.com/repos/octocat/Hello-World/deployments")
                .description("This your first repo!")
                .disabled(true)
                .downloadsUrl("http://api.github.com/repos/octocat/Hello-World/downloads")
                .eventsUrl("http://api.github.com/repos/octocat/Hello-World/events")
                .fork(true)
                .forks(0L)
                .forksCount(1L)
                .forksUrl("http://api.github.com/repos/octocat/Hello-World/forks")
                .fullName("octocat/Hello-World")
                .gitCommitsUrl("http://api.github.com/repos/octocat/Hello-World/git/commits{/sha}")
                .gitRefsUrl("http://api.github.com/repos/octocat/Hello-World/git/refs{/sha}")
                .gitTagsUrl("http://api.github.com/repos/octocat/Hello-World/git/tags{/sha}")
                .gitUrl("git_url")
                .hasDiscussions(true)
                .hasIssues(true)
                .hasPages(true)
                .hasProjects(true)
                .hasPullRequests(true)
                .hasWiki(true)
                .homepage("homepage")
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
                .license(webhookMinimalRepositoryLicense())
                .mergesUrl("http://api.github.com/repos/octocat/Hello-World/merges")
                .milestonesUrl("http://api.github.com/repos/octocat/Hello-World/milestones{/number}")
                .mirrorUrl("mirror_url")
                .name("Hello-World")
                .networkCount(1L)
                .nodeId("MDEwOlJlcG9zaXRvcnkxMjk2MjY5")
                .notificationsUrl(
                        "http://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}")
                .openIssues(0L)
                .openIssuesCount(1L)
                .owner(webhookSimpleUser())
                .permissions(webhookRepositoryTemplateRepositoryPermissions())
                .privateValue(true)
                .pullRequestCreationPolicy(GitHubWebhookRepositoryPullRequestCreationPolicy.ALL)
                .pullsUrl("http://api.github.com/repos/octocat/Hello-World/pulls{/number}")
                .pushedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .releasesUrl("http://api.github.com/repos/octocat/Hello-World/releases{/id}")
                .roleName("admin")
                .securityAndAnalysis(webhookFullRepositorySecurityAndAnalysis())
                .size(1L)
                .sshUrl("ssh_url")
                .stargazersCount(1L)
                .stargazersUrl("http://api.github.com/repos/octocat/Hello-World/stargazers")
                .statusesUrl("http://api.github.com/repos/octocat/Hello-World/statuses/{sha}")
                .subscribersCount(1L)
                .subscribersUrl("http://api.github.com/repos/octocat/Hello-World/subscribers")
                .subscriptionUrl("http://api.github.com/repos/octocat/Hello-World/subscription")
                .svnUrl("svn_url")
                .tagsUrl("http://api.github.com/repos/octocat/Hello-World/tags")
                .teamsUrl("http://api.github.com/repos/octocat/Hello-World/teams")
                .tempCloneToken("temp_clone_token")
                .topics(List.of("topics"))
                .treesUrl("http://api.github.com/repos/octocat/Hello-World/git/trees{/sha}")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/repos/octocat/Hello-World")
                .visibility("visibility")
                .watchers(0L)
                .watchersCount(1L)
                .webCommitSignoffRequired(false)
                .build();
    }

    static GitHubWebhookMinimalRepositoryLicense webhookMinimalRepositoryLicense() {
        return GitHubWebhookMinimalRepositoryLicenseBuilder.builder()
                .key("key")
                .name("name")
                .nodeId("node_id")
                .spdxId("spdx_id")
                .url("url")
                .build();
    }
}
