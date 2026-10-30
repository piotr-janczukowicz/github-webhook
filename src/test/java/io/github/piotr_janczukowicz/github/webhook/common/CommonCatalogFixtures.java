package io.github.piotr_janczukowicz.github.webhook.common;

import java.time.Instant;
import java.util.List;
import java.util.Map;

public final class CommonCatalogFixtures {

    private CommonCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static GitHubWebhookAdvisoryVulnerabilityFirstPatchedVersion
            webhookAdvisoryVulnerabilityFirstPatchedVersion() {
        return GitHubWebhookAdvisoryVulnerabilityFirstPatchedVersionBuilder.builder()
                .identifier("identifier")
                .build();
    }

    public static GitHubWebhookAppPermissions webhookAppPermissions() {
        return GitHubWebhookAppPermissionsBuilder.builder()
                .actions(GitHubWebhookAppPermissionsActions.READ)
                .administration(GitHubWebhookAppPermissionsActions.READ)
                .artifactMetadata(GitHubWebhookAppPermissionsActions.READ)
                .attestations(GitHubWebhookAppPermissionsActions.READ)
                .checks(GitHubWebhookAppPermissionsActions.READ)
                .codeQuality(GitHubWebhookAppPermissionsActions.READ)
                .codespaces(GitHubWebhookAppPermissionsActions.READ)
                .contents(GitHubWebhookAppPermissionsActions.READ)
                .customPropertiesForOrganizations(GitHubWebhookAppPermissionsActions.READ)
                .dependabotSecrets(GitHubWebhookAppPermissionsActions.READ)
                .deployments(GitHubWebhookAppPermissionsActions.READ)
                .discussions(GitHubWebhookAppPermissionsActions.READ)
                .emailAddresses(GitHubWebhookAppPermissionsActions.READ)
                .enterpriseAdministration(GitHubWebhookAppPermissionsActions.READ)
                .enterpriseCustomProperties(GitHubWebhookAppPermissionsActions.READ)
                .enterpriseCustomPropertiesForOrganizations(GitHubWebhookAppPermissionsOrganizationProjects.READ)
                .enterpriseOrganizationInstallationRepositories(GitHubWebhookAppPermissionsActions.READ)
                .enterpriseOrganizationInstallations(GitHubWebhookAppPermissionsActions.READ)
                .environments(GitHubWebhookAppPermissionsActions.READ)
                .followers(GitHubWebhookAppPermissionsActions.READ)
                .gitSshKeys(GitHubWebhookAppPermissionsActions.READ)
                .gpgKeys(GitHubWebhookAppPermissionsActions.READ)
                .interactionLimits(GitHubWebhookAppPermissionsActions.READ)
                .issues(GitHubWebhookAppPermissionsActions.READ)
                .members(GitHubWebhookAppPermissionsActions.READ)
                .mergeQueues(GitHubWebhookAppPermissionsActions.READ)
                .metadata(GitHubWebhookAppPermissionsActions.READ)
                .organizationAdministration(GitHubWebhookAppPermissionsActions.READ)
                .organizationAnnouncementBanners(GitHubWebhookAppPermissionsActions.READ)
                .organizationCopilotAgentSettings(GitHubWebhookAppPermissionsActions.READ)
                .organizationCopilotRequests(GitHubWebhookAppPermissionsOrganizationCopilotRequests.READ)
                .organizationCopilotSeatManagement(GitHubWebhookAppPermissionsActions.READ)
                .organizationCustomOrgRoles(GitHubWebhookAppPermissionsActions.READ)
                .organizationCustomProperties(GitHubWebhookAppPermissionsOrganizationProjects.READ)
                .organizationCustomRoles(GitHubWebhookAppPermissionsActions.READ)
                .organizationEvents(GitHubWebhookAppPermissionsOrganizationCopilotRequests.READ)
                .organizationExternalPropertiesForRepos(GitHubWebhookAppPermissionsOrganizationProjects.READ)
                .organizationHooks(GitHubWebhookAppPermissionsActions.READ)
                .organizationPackages(GitHubWebhookAppPermissionsActions.READ)
                .organizationPersonalAccessTokenRequests(GitHubWebhookAppPermissionsActions.READ)
                .organizationPersonalAccessTokens(GitHubWebhookAppPermissionsActions.READ)
                .organizationPlan(GitHubWebhookAppPermissionsOrganizationCopilotRequests.READ)
                .organizationProjects(GitHubWebhookAppPermissionsOrganizationProjects.READ)
                .organizationSecrets(GitHubWebhookAppPermissionsActions.READ)
                .organizationSelfHostedRunners(GitHubWebhookAppPermissionsActions.READ)
                .organizationUserBlocking(GitHubWebhookAppPermissionsActions.READ)
                .packages(GitHubWebhookAppPermissionsActions.READ)
                .pages(GitHubWebhookAppPermissionsActions.READ)
                .profile(GitHubWebhookAppPermissionsProfile.WRITE)
                .pullRequests(GitHubWebhookAppPermissionsActions.READ)
                .repositoryCustomProperties(GitHubWebhookAppPermissionsActions.READ)
                .repositoryHooks(GitHubWebhookAppPermissionsActions.READ)
                .repositoryProjects(GitHubWebhookAppPermissionsOrganizationProjects.READ)
                .secretScanningAlerts(GitHubWebhookAppPermissionsActions.READ)
                .secrets(GitHubWebhookAppPermissionsActions.READ)
                .securityEvents(GitHubWebhookAppPermissionsActions.READ)
                .singleFile(GitHubWebhookAppPermissionsActions.READ)
                .starring(GitHubWebhookAppPermissionsActions.READ)
                .statuses(GitHubWebhookAppPermissionsActions.READ)
                .vulnerabilityAlerts(GitHubWebhookAppPermissionsActions.READ)
                .workflows(GitHubWebhookAppPermissionsProfile.WRITE)
                .build();
    }

    public static GitHubWebhookAutoMerge webhookAutoMerge() {
        return GitHubWebhookAutoMergeBuilder.builder()
                .commitMessage("commit_message")
                .commitTitle("commit_title")
                .enabledBy(webhookSimpleUser())
                .mergeMethod(GitHubWebhookPullRequestAutoMergeMergeMethod.MERGE)
                .build();
    }

    public static GitHubWebhookCheckRunPullRequest webhookCheckRunPullRequest() {
        return GitHubWebhookCheckRunPullRequestBuilder.builder()
                .base(webhookCheckRunPullRequestBase())
                .head(webhookCheckRunPullRequestBase())
                .id(1L)
                .number(1L)
                .url("https://api.github.com/url")
                .build();
    }

    public static GitHubWebhookCheckRunPullRequestBase webhookCheckRunPullRequestBase() {
        return GitHubWebhookCheckRunPullRequestBaseBuilder.builder()
                .ref("ref")
                .repo(webhookRepoRef())
                .sha("sha")
                .build();
    }

    public static GitHubWebhookCodeScanningAlertDismissalRequestData webhookCodeScanningAlertDismissalRequestData() {
        return GitHubWebhookCodeScanningAlertDismissalRequestDataBuilder.builder()
                .data(List.of(webhookDependabotAlertDismissalRequestDataItem()))
                .type(GitHubWebhookCodeScanningAlertDismissalRequestDataType.CODE_SCANNING_ALERT_DISMISSAL)
                .build();
    }

    public static GitHubWebhookCommitter webhookCommitter() {
        return GitHubWebhookCommitterBuilder.builder()
                .date(Instant.parse("2026-01-01T00:00:00Z"))
                .email("octocat@github.com")
                .name("name")
                .username("username")
                .build();
    }

    public static GitHubWebhookCustomPropertyDeletedDefinition webhookCustomPropertyDeletedDefinition() {
        return GitHubWebhookCustomPropertyDeletedDefinitionBuilder.builder()
                .propertyName("property_name")
                .build();
    }

    public static GitHubWebhookCustomPropertyValue webhookCustomPropertyValue() {
        return GitHubWebhookCustomPropertyValueBuilder.builder()
                .propertyName("property_name")
                .value(List.of("value"))
                .build();
    }

    public static GitHubWebhookDependabotAlertDismissalRequestData webhookDependabotAlertDismissalRequestData() {
        return GitHubWebhookDependabotAlertDismissalRequestDataBuilder.builder()
                .data(List.of(webhookDependabotAlertDismissalRequestDataItem()))
                .type(GitHubWebhookDependabotAlertDismissalRequestDataType.DEPENDABOT_ALERT_DISMISSAL)
                .build();
    }

    public static GitHubWebhookDependabotAlertDismissalRequestDataItem
            webhookDependabotAlertDismissalRequestDataItem() {
        return GitHubWebhookDependabotAlertDismissalRequestDataItemBuilder.builder()
                .alertNumber("alert_number")
                .build();
    }

    public static GitHubWebhookDependabotAlertFixedAlertDependencyPackage
            webhookDependabotAlertFixedAlertDependencyPackage() {
        return GitHubWebhookDependabotAlertFixedAlertDependencyPackageBuilder.builder()
                .ecosystem("ecosystem")
                .name("name")
                .build();
    }

    public static GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier
            webhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier() {
        return GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierBuilder.builder()
                .type(GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierType.CVE)
                .value("value")
                .build();
    }

    public static GitHubWebhookDeployment webhookDeployment() {
        return GitHubWebhookDeploymentBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .creator(webhookSimpleUser())
                .description("Deploy request from hubot")
                .environment("production")
                .id(42L)
                .nodeId("MDEwOkRlcGxveW1lbnQx")
                .originalEnvironment("staging")
                .payload(Map.of("key", Map.of()))
                .performedViaGithubApp(webhookGitHubApp())
                .productionEnvironment(true)
                .ref("topic-branch")
                .repositoryUrl("https://api.github.com/repos/octocat/example")
                .sha("a84d88e7554fc1fa21bcbc4efae3c782a70d2b9d")
                .statusesUrl("https://api.github.com/repos/octocat/example/deployments/1/statuses")
                .task("deploy")
                .transientEnvironment(true)
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/repos/octocat/example/deployments/1")
                .build();
    }

    public static GitHubWebhookDeploymentReviewApprovedApprover webhookDeploymentReviewApprovedApprover() {
        return GitHubWebhookDeploymentReviewApprovedApproverBuilder.builder()
                .avatarUrl("avatar_url")
                .eventsUrl("events_url")
                .followersUrl("followers_url")
                .followingUrl("following_url")
                .gistsUrl("gists_url")
                .gravatarId("gravatar_id")
                .htmlUrl("html_url")
                .id(1L)
                .login("login")
                .nodeId("node_id")
                .organizationsUrl("organizations_url")
                .receivedEventsUrl("received_events_url")
                .reposUrl("repos_url")
                .siteAdmin(true)
                .starredUrl("starred_url")
                .subscriptionsUrl("subscriptions_url")
                .type("type")
                .url("url")
                .userViewType("user_view_type")
                .build();
    }

    public static GitHubWebhookDeploymentWorkflowRunHeadRepository webhookDeploymentWorkflowRunHeadRepository() {
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
                .owner(webhookRepositoryTemplateRepositoryOwner())
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

    public static GitHubWebhookDeploymentWorkflowRunReferencedWorkflow
            webhookDeploymentWorkflowRunReferencedWorkflow() {
        return GitHubWebhookDeploymentWorkflowRunReferencedWorkflowBuilder.builder()
                .path("path")
                .ref("ref")
                .sha("sha")
                .build();
    }

    public static GitHubWebhookDiscussionCategory webhookDiscussionCategory() {
        return GitHubWebhookDiscussionCategoryBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .emoji("emoji")
                .id(1L)
                .isAnswerable(true)
                .name("name")
                .nodeId("node_id")
                .repositoryId(1L)
                .slug("slug")
                .updatedAt("updated_at")
                .build();
    }

    public static GitHubWebhookEnterprise webhookEnterprise() {
        return GitHubWebhookEnterpriseBuilder.builder()
                .avatarUrl("https://api.github.com/avatar_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .htmlUrl("https://github.com/enterprises/octo-business")
                .id(42L)
                .name("Octo Business")
                .nodeId("MDEwOlJlcG9zaXRvcnkxMjk2MjY5")
                .slug("octo-business")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .websiteUrl("https://api.github.com/website_url")
                .build();
    }

    public static GitHubWebhookExemptionRequest webhookExemptionRequest() {
        return GitHubWebhookExemptionRequestBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .exemptionRequestData(webhookPushRulesetBypassExemptionRequestData())
                .expiresAt(Instant.parse("2026-01-01T00:00:00Z"))
                .htmlUrl("https://github.com/monalisa/smile/exemptions/1")
                .id(1L)
                .metadata(webhookSecretScanningPushProtectionExemptionRequestMetadata())
                .number(1L)
                .repositoryId(1L)
                .requestType(GitHubWebhookExemptionRequestRequestType.PUSH_RULESET_BYPASS)
                .requesterComment("requester_comment")
                .requesterId(1L)
                .requesterLogin("requester_login")
                .resourceIdentifier("827efc6d56897b048c772eb4087f854f46256132")
                .responses(List.of(webhookExemptionResponse()))
                .status(GitHubWebhookExemptionRequestStatus.PENDING)
                .build();
    }

    public static GitHubWebhookExemptionResponse webhookExemptionResponse() {
        return GitHubWebhookExemptionResponseBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .id(1L)
                .reviewerComment("reviewer_comment")
                .reviewerId(1L)
                .reviewerLogin("reviewer_login")
                .status(GitHubWebhookExemptionResponseStatus.APPROVED)
                .build();
    }

    public static GitHubWebhookForkRepository webhookForkRepository() {
        return GitHubWebhookForkRepositoryBuilder.builder()
                .allowAutoMerge(false)
                .allowForking(true)
                .allowMergeCommit(true)
                .allowRebaseMerge(true)
                .allowSquashMerge(true)
                .allowUpdateBranch(false)
                .anonymousAccessEnabled(true)
                .archiveUrl("http://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}")
                .archived(true)
                .assigneesUrl("http://api.github.com/repos/octocat/Hello-World/assignees{/user}")
                .blobsUrl("http://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}")
                .branchesUrl("http://api.github.com/repos/octocat/Hello-World/branches{/branch}")
                .cloneUrl("https://github.com/octocat/Hello-World.git")
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
                .hasDownloads(true)
                .hasIssues(true)
                .hasPages(true)
                .hasProjects(true)
                .hasPullRequests(true)
                .hasWiki(true)
                .homepage("https://github.com")
                .hooksUrl("http://api.github.com/repos/octocat/Hello-World/hooks")
                .htmlUrl("https://github.com/octocat/Hello-World")
                .id(42L)
                .isTemplate(true)
                .issueCommentUrl("http://api.github.com/repos/octocat/Hello-World/issues/comments{/number}")
                .issueEventsUrl("http://api.github.com/repos/octocat/Hello-World/issues/events{/number}")
                .issuesUrl("http://api.github.com/repos/octocat/Hello-World/issues{/number}")
                .keysUrl("http://api.github.com/repos/octocat/Hello-World/keys{/key_id}")
                .labelsUrl("http://api.github.com/repos/octocat/Hello-World/labels{/name}")
                .language("language")
                .languagesUrl("http://api.github.com/repos/octocat/Hello-World/languages")
                .license(webhookLicenseSimple())
                .mergeCommitMessage(GitHubWebhookRepositoryMergeCommitMessage.PR_BODY)
                .mergeCommitTitle(GitHubWebhookRepositoryMergeCommitTitle.PR_TITLE)
                .mergesUrl("http://api.github.com/repos/octocat/Hello-World/merges")
                .milestonesUrl("http://api.github.com/repos/octocat/Hello-World/milestones{/number}")
                .mirrorUrl("git:git.example.com/octocat/Hello-World")
                .name("Team Environment")
                .networkCount(1L)
                .nodeId("MDEwOlJlcG9zaXRvcnkxMjk2MjY5")
                .notificationsUrl(
                        "http://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}")
                .openIssues(1L)
                .openIssuesCount(0L)
                .organization(webhookSimpleUser())
                .owner(webhookSimpleUser())
                .permissions(webhookRepositoryPermissions())
                .privateValue(true)
                .pullRequestCreationPolicy(GitHubWebhookRepositoryPullRequestCreationPolicy.ALL)
                .pullsUrl("http://api.github.com/repos/octocat/Hello-World/pulls{/number}")
                .pushedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .releasesUrl("http://api.github.com/repos/octocat/Hello-World/releases{/id}")
                .size(108L)
                .squashMergeCommitMessage(GitHubWebhookRepositorySquashMergeCommitMessage.PR_BODY)
                .squashMergeCommitTitle(GitHubWebhookRepositorySquashMergeCommitTitle.PR_TITLE)
                .sshUrl("git@github.com:octocat/Hello-World.git")
                .stargazersCount(80L)
                .stargazersUrl("http://api.github.com/repos/octocat/Hello-World/stargazers")
                .starredAt("\"2020-07-09T00:17:42Z\"")
                .statusesUrl("http://api.github.com/repos/octocat/Hello-World/statuses/{sha}")
                .subscribersCount(1L)
                .subscribersUrl("http://api.github.com/repos/octocat/Hello-World/subscribers")
                .subscriptionUrl("http://api.github.com/repos/octocat/Hello-World/subscription")
                .svnUrl("https://svn.github.com/octocat/Hello-World")
                .tagsUrl("http://api.github.com/repos/octocat/Hello-World/tags")
                .teamsUrl("http://api.github.com/repos/octocat/Hello-World/teams")
                .tempCloneToken("temp_clone_token")
                .templateRepository(webhookRepositoryTemplateRepository())
                .topics(List.of("topics"))
                .treesUrl("http://api.github.com/repos/octocat/Hello-World/git/trees{/sha}")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/repos/octocat/Hello-World")
                .visibility("visibility")
                .watchers(1L)
                .watchersCount(80L)
                .webCommitSignoffRequired(true)
                .build();
    }

    public static GitHubWebhookFullRepositorySecurityAndAnalysis webhookFullRepositorySecurityAndAnalysis() {
        return GitHubWebhookFullRepositorySecurityAndAnalysisBuilder.builder()
                .advancedSecurity(webhookFullRepositorySecurityAndAnalysisAdvancedSecurity())
                .codeSecurity(webhookFullRepositorySecurityAndAnalysisAdvancedSecurity())
                .dependabotSecurityUpdates(webhookFullRepositorySecurityAndAnalysisAdvancedSecurity())
                .secretScanning(webhookFullRepositorySecurityAndAnalysisAdvancedSecurity())
                .secretScanningAiDetection(webhookFullRepositorySecurityAndAnalysisAdvancedSecurity())
                .secretScanningDelegatedAlertDismissal(webhookFullRepositorySecurityAndAnalysisAdvancedSecurity())
                .secretScanningDelegatedBypass(webhookFullRepositorySecurityAndAnalysisAdvancedSecurity())
                .secretScanningDelegatedBypassOptions(webhookSecurityAndAnalysisSecretScanningDelegatedBypassOptions())
                .secretScanningNonProviderPatterns(webhookFullRepositorySecurityAndAnalysisAdvancedSecurity())
                .secretScanningPushProtection(webhookFullRepositorySecurityAndAnalysisAdvancedSecurity())
                .secretScanningValidityChecks(webhookFullRepositorySecurityAndAnalysisAdvancedSecurity())
                .build();
    }

    public static GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity
            webhookFullRepositorySecurityAndAnalysisAdvancedSecurity() {
        return GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurityBuilder.builder()
                .status(GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurityStatus.ENABLED)
                .build();
    }

    public static GitHubWebhookGitHubApp webhookGitHubApp() {
        return GitHubWebhookGitHubAppBuilder.builder()
                .clientId("\"Iv1.25b5d1e65ffc4022\"")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("The description of the app.")
                .events(List.of("events"))
                .externalUrl("https://example.com")
                .htmlUrl("https://github.com/apps/super-ci")
                .id(37L)
                .installationsCount(5L)
                .name("Probot Owners")
                .nodeId("MDExOkludGVncmF0aW9uMQ==")
                .owner(webhookSimpleUser())
                .permissions(webhookGitHubAppPermissions())
                .slug("probot-owners")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    public static GitHubWebhookGitHubAppPermissions webhookGitHubAppPermissions() {
        return GitHubWebhookGitHubAppPermissionsBuilder.builder()
                .checks("checks")
                .contents("contents")
                .deployments("deployments")
                .issues("issues")
                .metadata("metadata")
                .build();
    }

    public static GitHubWebhookInstallation webhookInstallation() {
        return GitHubWebhookInstallationBuilder.builder()
                .accessTokensUrl("https://api.github.com/app/installations/1/access_tokens")
                .account(webhookSimpleUser())
                .appId(1L)
                .appSlug("github-actions")
                .clientId("Iv1.ab1112223334445c")
                .contactEmail("\"test_13f1e99741e3e004@d7e1eb0bc0a1ba12.com\"")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .events(List.of("events"))
                .hasMultipleSingleFiles(true)
                .htmlUrl("https://github.com/organizations/github/settings/installations/1")
                .id(1L)
                .permissions(webhookAppPermissions())
                .repositoriesUrl("https://api.github.com/installation/repositories")
                .repositorySelection(GitHubWebhookInstallationRepositorySelection.ALL)
                .singleFileName("config.yaml")
                .singleFilePaths(List.of("single_file_paths"))
                .suspendedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .suspendedBy(webhookSimpleUser())
                .targetId(1L)
                .targetType("Organization")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    public static GitHubWebhookInstallationCreatedRepository webhookInstallationCreatedRepository() {
        return GitHubWebhookInstallationCreatedRepositoryBuilder.builder()
                .fullName("full_name")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .privateValue(true)
                .build();
    }

    public static GitHubWebhookIssue webhookIssue() {
        return GitHubWebhookIssueBuilder.builder()
                .activeLockReason("active_lock_reason")
                .assignees(List.of(webhookSimpleUser()))
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body(
                        "It looks like the new widget form is broken on Safari. When I try and create the widget, Safari crashes. This is reproducible on 10.8, but not 10.9. Maybe a browser bug?")
                .bodyHtml("body_html")
                .bodyText("body_text")
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .closedBy(webhookSimpleUser())
                .comments(1L)
                .commentsUrl("https://api.github.com/comments_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .draft(true)
                .eventsUrl("https://api.github.com/events_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issueDependenciesSummary(webhookIssueDependenciesSummary())
                .issueFieldValues(List.of(webhookIssueFieldValue()))
                .labels(List.of(webhookIssueLabel()))
                .labelsUrl("labels_url")
                .locked(true)
                .milestone(webhookPullRequestMilestone())
                .nodeId("node_id")
                .number(42L)
                .parentIssueUrl("https://api.github.com/parent_issue_url")
                .performedViaGithubApp(webhookGitHubApp())
                .pinnedComment(webhookIssueComment())
                .pullRequest(webhookIssuePullRequest())
                .reactions(webhookReactions())
                .repository(webhookRepository())
                .repositoryUrl("https://api.github.com/repository_url")
                .state("open")
                .stateReason(GitHubWebhookIssueStateReason.COMPLETED)
                .subIssuesSummary(webhookSubIssuesSummary())
                .timelineUrl("https://api.github.com/timeline_url")
                .title("Widget creation fails in Safari on OS X 10.8")
                .type(webhookIssueType())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/repositories/42/issues/1")
                .user(webhookSimpleUser())
                .build();
    }

    public static GitHubWebhookIssueComment webhookIssueComment() {
        return GitHubWebhookIssueCommentBuilder.builder()
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("What version of Safari were you using when you observed this bug?")
                .bodyHtml("body_html")
                .bodyText("body_text")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .htmlUrl("https://api.github.com/html_url")
                .id(42L)
                .issueUrl("https://api.github.com/issue_url")
                .minimized(webhookMinimizedIssueComment())
                .nodeId("node_id")
                .performedViaGithubApp(webhookGitHubApp())
                .pin(webhookPinnedIssueComment())
                .reactions(webhookReactions())
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/repositories/42/issues/comments/1")
                .user(webhookSimpleUser())
                .build();
    }

    public static GitHubWebhookIssueCommentEditedChanges webhookIssueCommentEditedChanges() {
        return GitHubWebhookIssueCommentEditedChangesBuilder.builder()
                .body(webhookIssuesEditedChangesBody())
                .build();
    }

    public static GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppPermissions
            webhookIssueCommentEditedIssuePerformedViaGithubAppPermissions() {
        return GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppPermissionsBuilder.builder()
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
                .organizationProjects(GitHubWebhookAppPermissionsOrganizationProjects.READ)
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
                .vulnerabilityAlerts(GitHubWebhookAppPermissionsActions.READ)
                .workflows(GitHubWebhookAppPermissionsActions.READ)
                .build();
    }

    public static GitHubWebhookIssueDependenciesSummary webhookIssueDependenciesSummary() {
        return GitHubWebhookIssueDependenciesSummaryBuilder.builder()
                .blockedBy(1L)
                .blocking(1L)
                .totalBlockedBy(1L)
                .totalBlocking(1L)
                .build();
    }

    public static GitHubWebhookIssueFieldValue webhookIssueFieldValue() {
        return GitHubWebhookIssueFieldValueBuilder.builder()
                .dataType(GitHubWebhookIssueFieldValueDataType.TEXT)
                .issueFieldId(1L)
                .issueFieldName("Priority")
                .multiSelectOptions(List.of(webhookIssueFieldValueMultiSelectOption()))
                .nodeId("IFT_GDKND")
                .singleSelectOption(webhookIssueFieldValueMultiSelectOption())
                .value("Sample text")
                .build();
    }

    public static GitHubWebhookIssueFieldValueMultiSelectOption webhookIssueFieldValueMultiSelectOption() {
        return GitHubWebhookIssueFieldValueMultiSelectOptionBuilder.builder()
                .color("red")
                .id(1L)
                .name("High")
                .build();
    }

    public static GitHubWebhookIssueLabel webhookIssueLabel() {
        return GitHubWebhookIssueLabelBuilder.builder()
                .archivedBy(webhookSimpleUser())
                .color("color")
                .defaultValue(true)
                .description("description")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .url("https://api.github.com/url")
                .build();
    }

    public static GitHubWebhookIssuePullRequest webhookIssuePullRequest() {
        return GitHubWebhookIssuePullRequestBuilder.builder()
                .diffUrl("https://api.github.com/diff_url")
                .htmlUrl("https://api.github.com/html_url")
                .mergedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .patchUrl("https://api.github.com/patch_url")
                .url("https://api.github.com/url")
                .build();
    }

    public static GitHubWebhookIssueReactions webhookIssueReactions() {
        return GitHubWebhookIssueReactionsBuilder.builder()
                .plusOne(1L)
                .minusOne(1L)
                .confused(1L)
                .eyes(1L)
                .heart(1L)
                .hooray(1L)
                .laugh(1L)
                .rocket(1L)
                .totalCount(1L)
                .url("url")
                .build();
    }

    public static GitHubWebhookIssueType webhookIssueType() {
        return GitHubWebhookIssueTypeBuilder.builder()
                .color(GitHubWebhookIssueTypeColor.GRAY)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .description("description")
                .id(1L)
                .isEnabled(true)
                .name("name")
                .nodeId("node_id")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    public static GitHubWebhookIssuesEditedChanges webhookIssuesEditedChanges() {
        return GitHubWebhookIssuesEditedChangesBuilder.builder()
                .body(webhookIssuesEditedChangesBody())
                .title(webhookIssuesEditedChangesBody())
                .build();
    }

    public static GitHubWebhookIssuesEditedChangesBody webhookIssuesEditedChangesBody() {
        return GitHubWebhookIssuesEditedChangesBodyBuilder.builder()
                .from("from")
                .build();
    }

    public static GitHubWebhookIssuesEditedIssueAssignee webhookIssuesEditedIssueAssignee() {
        return GitHubWebhookIssuesEditedIssueAssigneeBuilder.builder()
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
                .build();
    }

    public static GitHubWebhookIssuesEditedLabel webhookIssuesEditedLabel() {
        return GitHubWebhookIssuesEditedLabelBuilder.builder()
                .archivedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .archivedBy(webhookSimpleUser())
                .color("color")
                .defaultValue(true)
                .description("description")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .url("https://api.github.com/url")
                .build();
    }

    public static GitHubWebhookIssuesLockedIssuePerformedViaGithubAppPermissions
            webhookIssuesLockedIssuePerformedViaGithubAppPermissions() {
        return GitHubWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsBuilder.builder()
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
                .vulnerabilityAlerts(GitHubWebhookAppPermissionsActions.READ)
                .workflows(GitHubWebhookAppPermissionsActions.READ)
                .build();
    }

    public static GitHubWebhookIssuesReopenedIssuePerformedViaGithubAppPermissions
            webhookIssuesReopenedIssuePerformedViaGithubAppPermissions() {
        return GitHubWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsBuilder.builder()
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

    public static GitHubWebhookLabel webhookLabel() {
        return GitHubWebhookLabelBuilder.builder()
                .color("color")
                .defaultValue(true)
                .description("description")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .url("https://api.github.com/url")
                .build();
    }

    public static GitHubWebhookLicense webhookLicense() {
        return GitHubWebhookLicenseBuilder.builder()
                .key("key")
                .name("name")
                .nodeId("node_id")
                .spdxId("spdx_id")
                .url("https://api.github.com/url")
                .build();
    }

    public static GitHubWebhookLicenseComplianceAlertClosureRequestData
            webhookLicenseComplianceAlertClosureRequestData() {
        return GitHubWebhookLicenseComplianceAlertClosureRequestDataBuilder.builder()
                .data(List.of(webhookDependabotAlertDismissalRequestDataItem()))
                .type(GitHubWebhookLicenseComplianceAlertClosureRequestDataType.LICENSE_COMPLIANCE_DISMISSAL)
                .build();
    }

    public static GitHubWebhookLicenseSimple webhookLicenseSimple() {
        return GitHubWebhookLicenseSimpleBuilder.builder()
                .htmlUrl("https://api.github.com/html_url")
                .key("mit")
                .name("MIT License")
                .nodeId("MDc6TGljZW5zZW1pdA==")
                .spdxId("MIT")
                .url("https://api.github.com/licenses/mit")
                .build();
    }

    public static GitHubWebhookLink webhookLink() {
        return GitHubWebhookLinkBuilder.builder()
                .href("https://api.github.com/href{/id}")
                .build();
    }

    public static GitHubWebhookMemberEditedChangesPermission webhookMemberEditedChangesPermission() {
        return GitHubWebhookMemberEditedChangesPermissionBuilder.builder()
                .from("from")
                .to("to")
                .build();
    }

    public static GitHubWebhookMinimizedIssueComment webhookMinimizedIssueComment() {
        return GitHubWebhookMinimizedIssueCommentBuilder.builder()
                .reason("low-quality")
                .build();
    }

    public static GitHubWebhookOrganizationSimple webhookOrganizationSimple() {
        return GitHubWebhookOrganizationSimpleBuilder.builder()
                .avatarUrl("https://github.com/images/error/octocat_happy.gif")
                .description("A great organization")
                .eventsUrl("https://api.github.com/orgs/github/events")
                .hooksUrl("https://api.github.com/orgs/github/hooks")
                .id(1L)
                .issuesUrl("https://api.github.com/orgs/github/issues")
                .login("github")
                .membersUrl("https://api.github.com/orgs/github/members{/member}")
                .nodeId("MDEyOk9yZ2FuaXphdGlvbjE=")
                .publicMembersUrl("https://api.github.com/orgs/github/public_members{/member}")
                .reposUrl("https://api.github.com/orgs/github/repos")
                .url("https://api.github.com/orgs/github")
                .build();
    }

    public static GitHubWebhookPackagePublishedPackagePackageVersionPackageFile
            webhookPackagePublishedPackagePackageVersionPackageFile() {
        return GitHubWebhookPackagePublishedPackagePackageVersionPackageFileBuilder.builder()
                .contentType("content_type")
                .createdAt("created_at")
                .downloadUrl("https://api.github.com/download_url")
                .id(1L)
                .md5("md5")
                .name("name")
                .sha1("sha1")
                .sha256("sha256")
                .size(1L)
                .state("state")
                .updatedAt("updated_at")
                .build();
    }

    public static GitHubWebhookPackageUpdatedPackagePackageVersionDockerMetadata
            webhookPackageUpdatedPackagePackageVersionDockerMetadata() {
        return GitHubWebhookPackageUpdatedPackagePackageVersionDockerMetadataBuilder.builder()
                .tags(List.of("tags"))
                .build();
    }

    public static GitHubWebhookPackageVersionContainerMetadata webhookPackageVersionContainerMetadata() {
        return GitHubWebhookPackageVersionContainerMetadataBuilder.builder()
                .labels(Map.of("key", Map.of()))
                .manifest(Map.of("key", Map.of()))
                .tag(webhookPackageVersionContainerMetadataTag())
                .build();
    }

    public static GitHubWebhookPackageVersionContainerMetadataTag webhookPackageVersionContainerMetadataTag() {
        return GitHubWebhookPackageVersionContainerMetadataTagBuilder.builder()
                .digest("digest")
                .name("name")
                .build();
    }

    public static GitHubWebhookPinnedIssueComment webhookPinnedIssueComment() {
        return GitHubWebhookPinnedIssueCommentBuilder.builder()
                .pinnedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .pinnedBy(webhookSimpleUser())
                .build();
    }

    public static GitHubWebhookProjectCardEditedChangesNote webhookProjectCardEditedChangesNote() {
        return GitHubWebhookProjectCardEditedChangesNoteBuilder.builder()
                .from("from")
                .build();
    }

    public static GitHubWebhookProjectsV2StatusUpdate webhookProjectsV2StatusUpdate() {
        return GitHubWebhookProjectsV2StatusUpdateBuilder.builder()
                .body("The project is off to a great start!")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .creator(webhookSimpleUser())
                .id(1.5)
                .nodeId("node_id")
                .projectNodeId("project_node_id")
                .startDate("2022-04-28")
                .status(GitHubWebhookProjectsV2StatusUpdateStatus.INACTIVE)
                .targetDate("2022-04-28")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    public static GitHubWebhookPullRequestBase webhookPullRequestBase() {
        return GitHubWebhookPullRequestBaseBuilder.builder()
                .label("label")
                .ref("ref")
                .repo(webhookRepository())
                .sha("sha")
                .user(webhookSimpleUser())
                .build();
    }

    public static GitHubWebhookPullRequestLabel webhookPullRequestLabel() {
        return GitHubWebhookPullRequestLabelBuilder.builder()
                .archivedBy(webhookSimpleUser())
                .color("color")
                .defaultValue(true)
                .description("description")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .url("url")
                .build();
    }

    public static GitHubWebhookPullRequestLinks webhookPullRequestLinks() {
        return GitHubWebhookPullRequestLinksBuilder.builder()
                .comments(webhookLink())
                .commits(webhookLink())
                .html(webhookLink())
                .issue(webhookLink())
                .reviewComment(webhookLink())
                .reviewComments(webhookLink())
                .self(webhookLink())
                .statuses(webhookLink())
                .build();
    }

    public static GitHubWebhookPullRequestMilestone webhookPullRequestMilestone() {
        return GitHubWebhookPullRequestMilestoneBuilder.builder()
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .closedIssues(8L)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .creator(webhookSimpleUser())
                .description("Tracking milestone for version 1.0")
                .dueOn(Instant.parse("2026-01-01T00:00:00Z"))
                .htmlUrl("https://github.com/octocat/Hello-World/milestones/v1.0")
                .id(1_002_604L)
                .labelsUrl("https://api.github.com/repos/octocat/Hello-World/milestones/1/labels")
                .nodeId("MDk6TWlsZXN0b25lMTAwMjYwNA==")
                .number(42L)
                .openIssues(4L)
                .state(GitHubWebhookMilestoneState.OPEN)
                .title("v1.0")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/repos/octocat/Hello-World/milestones/1")
                .build();
    }

    public static GitHubWebhookPullRequestReviewCommentLinks webhookPullRequestReviewCommentLinks() {
        return GitHubWebhookPullRequestReviewCommentLinksBuilder.builder()
                .html(webhookLink())
                .pullRequest(webhookLink())
                .self(webhookLink())
                .build();
    }

    public static GitHubWebhookPullRequestStack webhookPullRequestStack() {
        return GitHubWebhookPullRequestStackBuilder.builder()
                .base(webhookPullRequestStackBase())
                .id(1L)
                .number(1L)
                .position(1L)
                .size(1L)
                .build();
    }

    public static GitHubWebhookPullRequestStackBase webhookPullRequestStackBase() {
        return GitHubWebhookPullRequestStackBaseBuilder.builder()
                .ref("ref")
                .sha("sha")
                .build();
    }

    public static GitHubWebhookPushRulesetBypassExemptionRequestData webhookPushRulesetBypassExemptionRequestData() {
        return GitHubWebhookPushRulesetBypassExemptionRequestDataBuilder.builder()
                .data(List.of(webhookPushRulesetBypassExemptionRequestDataItem()))
                .type(GitHubWebhookPushRulesetBypassExemptionRequestDataType.PUSH_RULESET_BYPASS)
                .build();
    }

    public static GitHubWebhookPushRulesetBypassExemptionRequestDataItem
            webhookPushRulesetBypassExemptionRequestDataItem() {
        return GitHubWebhookPushRulesetBypassExemptionRequestDataItemBuilder.builder()
                .ruleType("rule_type")
                .rulesetId(1L)
                .rulesetName("ruleset_name")
                .totalViolations(1L)
                .build();
    }

    public static GitHubWebhookReactions webhookReactions() {
        return GitHubWebhookReactionsBuilder.builder()
                .plusOne(1L)
                .minusOne(1L)
                .confused(1L)
                .eyes(1L)
                .heart(1L)
                .hooray(1L)
                .laugh(1L)
                .rocket(1L)
                .totalCount(1L)
                .url("https://api.github.com/url")
                .build();
    }

    public static GitHubWebhookRepoRef webhookRepoRef() {
        return GitHubWebhookRepoRefBuilder.builder()
                .id(1L)
                .name("name")
                .url("https://api.github.com/url")
                .build();
    }

    public static GitHubWebhookRepository webhookRepository() {
        return GitHubWebhookRepositoryBuilder.builder()
                .allowAutoMerge(false)
                .allowForking(true)
                .allowMergeCommit(true)
                .allowRebaseMerge(true)
                .allowSquashMerge(true)
                .allowUpdateBranch(false)
                .anonymousAccessEnabled(true)
                .archiveUrl("http://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}")
                .archived(true)
                .assigneesUrl("http://api.github.com/repos/octocat/Hello-World/assignees{/user}")
                .blobsUrl("http://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}")
                .branchesUrl("http://api.github.com/repos/octocat/Hello-World/branches{/branch}")
                .cloneUrl("https://github.com/octocat/Hello-World.git")
                .codeSearchIndexStatus(webhookRepositoryCodeSearchIndexStatus())
                .collaboratorsUrl("http://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}")
                .commentsUrl("http://api.github.com/repos/octocat/Hello-World/comments{/number}")
                .commitsUrl("http://api.github.com/repos/octocat/Hello-World/commits{/sha}")
                .compareUrl("http://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}")
                .contentsUrl("http://api.github.com/repos/octocat/Hello-World/contents/{+path}")
                .contributorsUrl("http://api.github.com/repos/octocat/Hello-World/contributors")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
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
                .id(42L)
                .isTemplate(true)
                .issueCommentUrl("http://api.github.com/repos/octocat/Hello-World/issues/comments{/number}")
                .issueEventsUrl("http://api.github.com/repos/octocat/Hello-World/issues/events{/number}")
                .issuesUrl("http://api.github.com/repos/octocat/Hello-World/issues{/number}")
                .keysUrl("http://api.github.com/repos/octocat/Hello-World/keys{/key_id}")
                .labelsUrl("http://api.github.com/repos/octocat/Hello-World/labels{/name}")
                .language("language")
                .languagesUrl("http://api.github.com/repos/octocat/Hello-World/languages")
                .license(webhookLicenseSimple())
                .mergeCommitMessage(GitHubWebhookRepositoryMergeCommitMessage.PR_BODY)
                .mergeCommitTitle(GitHubWebhookRepositoryMergeCommitTitle.PR_TITLE)
                .mergesUrl("http://api.github.com/repos/octocat/Hello-World/merges")
                .milestonesUrl("http://api.github.com/repos/octocat/Hello-World/milestones{/number}")
                .mirrorUrl("git:git.example.com/octocat/Hello-World")
                .name("Team Environment")
                .nodeId("MDEwOlJlcG9zaXRvcnkxMjk2MjY5")
                .notificationsUrl(
                        "http://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}")
                .openIssues(1L)
                .openIssuesCount(0L)
                .owner(webhookSimpleUser())
                .permissions(webhookRepositoryPermissions())
                .privateValue(true)
                .pullRequestCreationPolicy(GitHubWebhookRepositoryPullRequestCreationPolicy.ALL)
                .pullsUrl("http://api.github.com/repos/octocat/Hello-World/pulls{/number}")
                .pushedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .releasesUrl("http://api.github.com/repos/octocat/Hello-World/releases{/id}")
                .size(108L)
                .squashMergeCommitMessage(GitHubWebhookRepositorySquashMergeCommitMessage.PR_BODY)
                .squashMergeCommitTitle(GitHubWebhookRepositorySquashMergeCommitTitle.PR_TITLE)
                .sshUrl("git@github.com:octocat/Hello-World.git")
                .stargazersCount(80L)
                .stargazersUrl("http://api.github.com/repos/octocat/Hello-World/stargazers")
                .starredAt("\"2020-07-09T00:17:42Z\"")
                .statusesUrl("http://api.github.com/repos/octocat/Hello-World/statuses/{sha}")
                .subscribersUrl("http://api.github.com/repos/octocat/Hello-World/subscribers")
                .subscriptionUrl("http://api.github.com/repos/octocat/Hello-World/subscription")
                .svnUrl("https://svn.github.com/octocat/Hello-World")
                .tagsUrl("http://api.github.com/repos/octocat/Hello-World/tags")
                .teamsUrl("http://api.github.com/repos/octocat/Hello-World/teams")
                .tempCloneToken("temp_clone_token")
                .topics(List.of("topics"))
                .treesUrl("http://api.github.com/repos/octocat/Hello-World/git/trees{/sha}")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/repos/octocat/Hello-World")
                .visibility("visibility")
                .watchers(1L)
                .watchersCount(80L)
                .webCommitSignoffRequired(true)
                .build();
    }

    public static GitHubWebhookRepositoryCodeSearchIndexStatus webhookRepositoryCodeSearchIndexStatus() {
        return GitHubWebhookRepositoryCodeSearchIndexStatusBuilder.builder()
                .lexicalCommitSha("lexical_commit_sha")
                .lexicalSearchOk(true)
                .build();
    }

    public static GitHubWebhookRepositoryEditedChangesTopics webhookRepositoryEditedChangesTopics() {
        return GitHubWebhookRepositoryEditedChangesTopicsBuilder.builder()
                .from(List.of("from"))
                .build();
    }

    public static GitHubWebhookRepositoryPermissions webhookRepositoryPermissions() {
        return GitHubWebhookRepositoryPermissionsBuilder.builder()
                .admin(true)
                .maintain(true)
                .pull(true)
                .push(true)
                .triage(true)
                .build();
    }

    public static GitHubWebhookRepositoryTemplateRepository webhookRepositoryTemplateRepository() {
        return GitHubWebhookRepositoryTemplateRepositoryBuilder.builder()
                .allowAutoMerge(true)
                .allowMergeCommit(true)
                .allowRebaseMerge(true)
                .allowSquashMerge(true)
                .allowUpdateBranch(true)
                .archiveUrl("archive_url")
                .archived(true)
                .assigneesUrl("assignees_url")
                .blobsUrl("blobs_url")
                .branchesUrl("branches_url")
                .cloneUrl("clone_url")
                .collaboratorsUrl("collaborators_url")
                .commentsUrl("comments_url")
                .commitsUrl("commits_url")
                .compareUrl("compare_url")
                .contentsUrl("contents_url")
                .contributorsUrl("contributors_url")
                .createdAt("created_at")
                .defaultBranch("default_branch")
                .deleteBranchOnMerge(true)
                .deploymentsUrl("deployments_url")
                .description("description")
                .disabled(true)
                .downloadsUrl("downloads_url")
                .eventsUrl("events_url")
                .fork(true)
                .forksCount(1L)
                .forksUrl("forks_url")
                .fullName("full_name")
                .gitCommitsUrl("git_commits_url")
                .gitRefsUrl("git_refs_url")
                .gitTagsUrl("git_tags_url")
                .gitUrl("git_url")
                .hasDownloads(true)
                .hasIssues(true)
                .hasPages(true)
                .hasProjects(true)
                .hasWiki(true)
                .homepage("homepage")
                .hooksUrl("hooks_url")
                .htmlUrl("html_url")
                .id(1L)
                .isTemplate(true)
                .issueCommentUrl("issue_comment_url")
                .issueEventsUrl("issue_events_url")
                .issuesUrl("issues_url")
                .keysUrl("keys_url")
                .labelsUrl("labels_url")
                .language("language")
                .languagesUrl("languages_url")
                .mergeCommitMessage(GitHubWebhookRepositoryMergeCommitMessage.PR_BODY)
                .mergeCommitTitle(GitHubWebhookRepositoryMergeCommitTitle.PR_TITLE)
                .mergesUrl("merges_url")
                .milestonesUrl("milestones_url")
                .mirrorUrl("mirror_url")
                .name("name")
                .networkCount(1L)
                .nodeId("node_id")
                .notificationsUrl("notifications_url")
                .openIssuesCount(1L)
                .owner(webhookRepositoryTemplateRepositoryOwner())
                .permissions(webhookRepositoryTemplateRepositoryPermissions())
                .privateValue(true)
                .pullsUrl("pulls_url")
                .pushedAt("pushed_at")
                .releasesUrl("releases_url")
                .size(1L)
                .squashMergeCommitMessage(GitHubWebhookRepositorySquashMergeCommitMessage.PR_BODY)
                .squashMergeCommitTitle(GitHubWebhookRepositorySquashMergeCommitTitle.PR_TITLE)
                .sshUrl("ssh_url")
                .stargazersCount(1L)
                .stargazersUrl("stargazers_url")
                .statusesUrl("statuses_url")
                .subscribersCount(1L)
                .subscribersUrl("subscribers_url")
                .subscriptionUrl("subscription_url")
                .svnUrl("svn_url")
                .tagsUrl("tags_url")
                .teamsUrl("teams_url")
                .tempCloneToken("temp_clone_token")
                .topics(List.of("topics"))
                .treesUrl("trees_url")
                .updatedAt("updated_at")
                .url("url")
                .visibility("visibility")
                .watchersCount(1L)
                .build();
    }

    public static GitHubWebhookRepositoryTemplateRepositoryOwner webhookRepositoryTemplateRepositoryOwner() {
        return GitHubWebhookRepositoryTemplateRepositoryOwnerBuilder.builder()
                .avatarUrl("avatar_url")
                .eventsUrl("events_url")
                .followersUrl("followers_url")
                .followingUrl("following_url")
                .gistsUrl("gists_url")
                .gravatarId("gravatar_id")
                .htmlUrl("html_url")
                .id(1L)
                .login("login")
                .nodeId("node_id")
                .organizationsUrl("organizations_url")
                .receivedEventsUrl("received_events_url")
                .reposUrl("repos_url")
                .siteAdmin(true)
                .starredUrl("starred_url")
                .subscriptionsUrl("subscriptions_url")
                .type("type")
                .url("url")
                .build();
    }

    public static GitHubWebhookRepositoryTemplateRepositoryPermissions
            webhookRepositoryTemplateRepositoryPermissions() {
        return GitHubWebhookRepositoryTemplateRepositoryPermissionsBuilder.builder()
                .admin(true)
                .maintain(true)
                .pull(true)
                .push(true)
                .triage(true)
                .build();
    }

    public static GitHubWebhookRubyGemsMetadata webhookRubyGemsMetadata() {
        return GitHubWebhookRubyGemsMetadataBuilder.builder()
                .commitOid("commit_oid")
                .dependencies(List.of(Map.of("key", "dependencies")))
                .description("description")
                .homepage("homepage")
                .metadata(Map.of("key", "metadata"))
                .name("name")
                .platform("platform")
                .readme("readme")
                .repo("repo")
                .versionInfo(webhookRubyGemsMetadataVersionInfo())
                .build();
    }

    public static GitHubWebhookRubyGemsMetadataVersionInfo webhookRubyGemsMetadataVersionInfo() {
        return GitHubWebhookRubyGemsMetadataVersionInfoBuilder.builder()
                .version("version")
                .build();
    }

    public static GitHubWebhookSecretScanningAlertCreatedAlert webhookSecretScanningAlertCreatedAlert() {
        return GitHubWebhookSecretScanningAlertCreatedAlertBuilder.builder()
                .assignedTo(webhookSimpleUser())
                .closureRequestComment("closure_request_comment")
                .closureRequestReviewer(webhookSimpleUser())
                .closureRequestReviewerComment("closure_request_reviewer_comment")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .htmlUrl("https://api.github.com/html_url")
                .locationsUrl("https://api.github.com/locations_url")
                .metadata(List.of(webhookSecretScanningAlertCreatedAlertMetadata()))
                .multiRepo(true)
                .number(1L)
                .provider("provider")
                .providerSlug("provider_slug")
                .publiclyLeaked(true)
                .pushProtectionBypassRequestComment("push_protection_bypass_request_comment")
                .pushProtectionBypassRequestHtmlUrl("https://api.github.com/push_protection_bypass_request_html_url")
                .pushProtectionBypassRequestReviewer(webhookSimpleUser())
                .pushProtectionBypassRequestReviewerComment("push_protection_bypass_request_reviewer_comment")
                .pushProtectionBypassed(true)
                .pushProtectionBypassedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .pushProtectionBypassedBy(webhookSimpleUser())
                .resolution(GitHubWebhookSecretScanningAlertCreatedAlertResolution.FALSE_POSITIVE)
                .resolutionComment("resolution_comment")
                .resolvedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .resolvedBy(webhookSimpleUser())
                .secretCategory(GitHubWebhookSecretScanningAlertCreatedAlertSecretCategory.DEFAULT)
                .secretType("secret_type")
                .secretTypeDisplayName("secret_type_display_name")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .validity(GitHubWebhookSecretScanningAlertCreatedAlertValidity.ACTIVE)
                .build();
    }

    public static GitHubWebhookSecretScanningAlertCreatedAlertMetadata
            webhookSecretScanningAlertCreatedAlertMetadata() {
        return GitHubWebhookSecretScanningAlertCreatedAlertMetadataBuilder.builder()
                .key("key")
                .value("value")
                .build();
    }

    public static GitHubWebhookSecretScanningAlertDismissalRequestData
            webhookSecretScanningAlertDismissalRequestData() {
        return GitHubWebhookSecretScanningAlertDismissalRequestDataBuilder.builder()
                .data(List.of(webhookSecretScanningAlertDismissalRequestDataItem()))
                .type(GitHubWebhookSecretScanningAlertDismissalRequestDataType.SECRET_SCANNING_CLOSURE)
                .build();
    }

    public static GitHubWebhookSecretScanningAlertDismissalRequestDataItem
            webhookSecretScanningAlertDismissalRequestDataItem() {
        return GitHubWebhookSecretScanningAlertDismissalRequestDataItemBuilder.builder()
                .alertNumber("alert_number")
                .reason(GitHubWebhookSecretScanningAlertDismissalRequestDataItemReason.FIXED_LATER)
                .secretType("secret_type")
                .build();
    }

    public static GitHubWebhookSecretScanningPushProtectionExemptionRequestData
            webhookSecretScanningPushProtectionExemptionRequestData() {
        return GitHubWebhookSecretScanningPushProtectionExemptionRequestDataBuilder.builder()
                .data(List.of(webhookSecretScanningPushProtectionExemptionRequestDataItem()))
                .type(GitHubWebhookSecretScanningPushProtectionExemptionRequestDataType.SECRET_SCANNING)
                .build();
    }

    public static GitHubWebhookSecretScanningPushProtectionExemptionRequestDataItem
            webhookSecretScanningPushProtectionExemptionRequestDataItem() {
        return GitHubWebhookSecretScanningPushProtectionExemptionRequestDataItemBuilder.builder()
                .locations(List.of(webhookSecretScanningPushProtectionExemptionRequestDataItemLocation()))
                .secretType("secret_type")
                .build();
    }

    public static GitHubWebhookSecretScanningPushProtectionExemptionRequestDataItemLocation
            webhookSecretScanningPushProtectionExemptionRequestDataItemLocation() {
        return GitHubWebhookSecretScanningPushProtectionExemptionRequestDataItemLocationBuilder.builder()
                .branch("branch")
                .commit("commit")
                .path("path")
                .build();
    }

    public static GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadata
            webhookSecretScanningPushProtectionExemptionRequestMetadata() {
        return GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadataBuilder.builder()
                .alertTitle("alert_title")
                .label("label")
                .reason(GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadataReason.FIXED_LATER)
                .build();
    }

    public static GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities
            webhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities() {
        return GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesBuilder.builder()
                .cvssV3(webhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3())
                .cvssV4(webhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3())
                .build();
    }

    public static GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3
            webhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3() {
        return GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3Builder.builder()
                .score(1.5)
                .vectorString("vector_string")
                .build();
    }

    public static GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe
            webhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe() {
        return GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCweBuilder.builder()
                .cweId("cwe_id")
                .name("name")
                .build();
    }

    public static GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryReference
            webhookSecurityAdvisoryUpdatedSecurityAdvisoryReference() {
        return GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryReferenceBuilder.builder()
                .url("https://api.github.com/url")
                .build();
    }

    public static GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptions
            webhookSecurityAndAnalysisSecretScanningDelegatedBypassOptions() {
        return GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsBuilder.builder()
                .reviewers(List.of(webhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewer()))
                .build();
    }

    public static GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewer
            webhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewer() {
        return GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewerBuilder.builder()
                .mode(GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewerMode.ALWAYS)
                .reviewerId(1L)
                .reviewerType(GitHubWebhookOptionsReviewerReviewerType.TEAM)
                .build();
    }

    public static GitHubWebhookSimpleCommit webhookSimpleCommit() {
        return GitHubWebhookSimpleCommitBuilder.builder()
                .author(webhookCommitter())
                .committer(webhookCommitter())
                .id("id")
                .message("message")
                .timestamp("timestamp")
                .treeId("tree_id")
                .build();
    }

    public static GitHubWebhookSimpleInstallation webhookSimpleInstallation() {
        return GitHubWebhookSimpleInstallationBuilder.builder()
                .id(1L)
                .nodeId("MDQ6VXNlcjU4MzIzMQ==")
                .build();
    }

    public static GitHubWebhookSimpleUser webhookSimpleUser() {
        return GitHubWebhookSimpleUserBuilder.builder()
                .avatarUrl("https://github.com/images/error/octocat_happy.gif")
                .email("email")
                .eventsUrl("https://api.github.com/users/octocat/events{/privacy}")
                .followersUrl("https://api.github.com/users/octocat/followers")
                .followingUrl("https://api.github.com/users/octocat/following{/other_user}")
                .gistsUrl("https://api.github.com/users/octocat/gists{/gist_id}")
                .gravatarId("41d064eb2195891e12d0413f63227ea7")
                .htmlUrl("https://github.com/octocat")
                .id(1L)
                .login("octocat")
                .name("name")
                .nodeId("MDQ6VXNlcjE=")
                .organizationsUrl("https://api.github.com/users/octocat/orgs")
                .receivedEventsUrl("https://api.github.com/users/octocat/received_events")
                .reposUrl("https://api.github.com/users/octocat/repos")
                .siteAdmin(true)
                .starredAt("\"2020-07-09T00:17:55Z\"")
                .starredUrl("https://api.github.com/users/octocat/starred{/owner}{/repo}")
                .subscriptionsUrl("https://api.github.com/users/octocat/subscriptions")
                .type("User")
                .url("https://api.github.com/users/octocat")
                .userViewType("public")
                .build();
    }

    public static GitHubWebhookSubIssuesSummary webhookSubIssuesSummary() {
        return GitHubWebhookSubIssuesSummaryBuilder.builder()
                .completed(1L)
                .percentCompleted(1L)
                .total(1L)
                .build();
    }

    public static GitHubWebhookTeamParent webhookTeamParent() {
        return GitHubWebhookTeamParentBuilder.builder()
                .description("description")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .membersUrl("https://api.github.com/members_url{/id}")
                .name("name")
                .nodeId("node_id")
                .permission("permission")
                .privacy(GitHubWebhookTeamPrivacy.OPEN)
                .repositoriesUrl("https://api.github.com/repositories_url")
                .slug("slug")
                .url("https://api.github.com/url")
                .build();
    }

    public static GitHubWebhookTeamSimple webhookTeamSimple() {
        return GitHubWebhookTeamSimpleBuilder.builder()
                .description("A great team.")
                .enterpriseId(42L)
                .htmlUrl("https://github.com/orgs/rails/teams/core")
                .id(1L)
                .ldapDn("uid=example,ou=users,dc=github,dc=com")
                .membersUrl("https://api.github.com/organizations/1/team/1/members{/member}")
                .name("Justice League")
                .nodeId("MDQ6VGVhbTE=")
                .notificationSetting("notifications_enabled")
                .organizationId(37L)
                .permission("admin")
                .privacy("closed")
                .repositoriesUrl("https://api.github.com/organizations/1/team/1/repos")
                .slug("justice-league")
                .type(GitHubWebhookTeamType.ENTERPRISE)
                .url("https://api.github.com/organizations/1/team/1")
                .build();
    }

    public static GitHubWebhookWorkflow webhookWorkflow() {
        return GitHubWebhookWorkflowBuilder.builder()
                .badgeUrl("https://api.github.com/badge_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .path("path")
                .state("state")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }
}
