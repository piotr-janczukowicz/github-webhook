package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookProjectCardEditedChangesNote;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookRepositoryEditedChangesTopics;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestAutoMergeMergeMethod;
import java.time.Instant;
import java.util.List;

final class RepositoryRulesetCatalogFixtures {

    private RepositoryRulesetCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookActor webhookActor() {
        return GitHubWebhookActorBuilder.builder()
                .id(1L)
                .type(GitHubWebhookActorType.USER)
                .build();
    }

    static GitHubWebhookBranchNamePattern webhookBranchNamePattern() {
        return GitHubWebhookBranchNamePatternBuilder.builder()
                .parameters(webhookTagNamePatternParameters())
                .type(GitHubWebhookBranchNamePatternType.BRANCH_NAME_PATTERN)
                .build();
    }

    static GitHubWebhookCodeCoverage webhookCodeCoverage() {
        return GitHubWebhookCodeCoverageBuilder.builder()
                .parameters(webhookCodeCoverageParameters())
                .type(GitHubWebhookCodeCoverageType.CODE_COVERAGE)
                .build();
    }

    static GitHubWebhookCodeCoverageParameters webhookCodeCoverageParameters() {
        return GitHubWebhookCodeCoverageParametersBuilder.builder()
                .maxCoverageDrop(1.5)
                .minimumCoverage(1.5)
                .build();
    }

    static GitHubWebhookCodeQuality webhookCodeQuality() {
        return GitHubWebhookCodeQualityBuilder.builder()
                .parameters(webhookCodeQualityParameters())
                .type(GitHubWebhookCodeQualityType.CODE_QUALITY)
                .build();
    }

    static GitHubWebhookCodeQualityParameters webhookCodeQualityParameters() {
        return GitHubWebhookCodeQualityParametersBuilder.builder()
                .severity(GitHubWebhookCodeQualityParametersSeverity.ERRORS)
                .build();
    }

    static GitHubWebhookCodeScanning webhookCodeScanning() {
        return GitHubWebhookCodeScanningBuilder.builder()
                .parameters(webhookCodeScanningParameters())
                .type(GitHubWebhookCodeScanningType.CODE_SCANNING)
                .build();
    }

    static GitHubWebhookCodeScanningParameters webhookCodeScanningParameters() {
        return GitHubWebhookCodeScanningParametersBuilder.builder()
                .codeScanningTools(List.of(webhookCodeScanningTool()))
                .build();
    }

    static GitHubWebhookCodeScanningTool webhookCodeScanningTool() {
        return GitHubWebhookCodeScanningToolBuilder.builder()
                .alertsThreshold(GitHubWebhookCodeScanningToolAlertsThreshold.NONE)
                .securityAlertsThreshold(GitHubWebhookCodeScanningToolSecurityAlertsThreshold.NONE)
                .tool("tool")
                .build();
    }

    static GitHubWebhookCommitAuthorEmailPattern webhookCommitAuthorEmailPattern() {
        return GitHubWebhookCommitAuthorEmailPatternBuilder.builder()
                .parameters(webhookTagNamePatternParameters())
                .type(GitHubWebhookCommitAuthorEmailPatternType.COMMIT_AUTHOR_EMAIL_PATTERN)
                .build();
    }

    static GitHubWebhookCommitMessagePattern webhookCommitMessagePattern() {
        return GitHubWebhookCommitMessagePatternBuilder.builder()
                .parameters(webhookTagNamePatternParameters())
                .type(GitHubWebhookCommitMessagePatternType.COMMIT_MESSAGE_PATTERN)
                .build();
    }

    static GitHubWebhookCommitterEmailPattern webhookCommitterEmailPattern() {
        return GitHubWebhookCommitterEmailPatternBuilder.builder()
                .parameters(webhookTagNamePatternParameters())
                .type(GitHubWebhookCommitterEmailPatternType.COMMITTER_EMAIL_PATTERN)
                .build();
    }

    static GitHubWebhookCopilotCodeReview webhookCopilotCodeReview() {
        return GitHubWebhookCopilotCodeReviewBuilder.builder()
                .parameters(webhookCopilotCodeReviewParameters())
                .type(GitHubWebhookCopilotCodeReviewType.COPILOT_CODE_REVIEW)
                .build();
    }

    static GitHubWebhookCopilotCodeReviewParameters webhookCopilotCodeReviewParameters() {
        return GitHubWebhookCopilotCodeReviewParametersBuilder.builder()
                .reviewDraftPullRequests(true)
                .reviewOnPush(true)
                .build();
    }

    static GitHubWebhookCreation webhookCreation() {
        return GitHubWebhookCreationBuilder.builder()
                .type(GitHubWebhookCreationType.CREATION)
                .build();
    }

    static GitHubWebhookDeletion webhookDeletion() {
        return GitHubWebhookDeletionBuilder.builder()
                .type(GitHubWebhookDeletionType.DELETION)
                .build();
    }

    static GitHubWebhookDismissalRestriction webhookDismissalRestriction() {
        return GitHubWebhookDismissalRestrictionBuilder.builder()
                .allowedActors(List.of(webhookActor()))
                .enabled(true)
                .build();
    }

    static GitHubWebhookFileExtensionRestriction webhookFileExtensionRestriction() {
        return GitHubWebhookFileExtensionRestrictionBuilder.builder()
                .parameters(webhookFileExtensionRestrictionParameters())
                .type(GitHubWebhookFileExtensionRestrictionType.FILE_EXTENSION_RESTRICTION)
                .build();
    }

    static GitHubWebhookFileExtensionRestrictionParameters webhookFileExtensionRestrictionParameters() {
        return GitHubWebhookFileExtensionRestrictionParametersBuilder.builder()
                .restrictedFileExtensions(List.of("restricted_file_extensions"))
                .build();
    }

    static GitHubWebhookFilePathRestriction webhookFilePathRestriction() {
        return GitHubWebhookFilePathRestrictionBuilder.builder()
                .parameters(webhookFilePathRestrictionParameters())
                .type(GitHubWebhookFilePathRestrictionType.FILE_PATH_RESTRICTION)
                .build();
    }

    static GitHubWebhookFilePathRestrictionParameters webhookFilePathRestrictionParameters() {
        return GitHubWebhookFilePathRestrictionParametersBuilder.builder()
                .restrictedFilePaths(List.of("restricted_file_paths"))
                .build();
    }

    static GitHubWebhookLicenseComplianceScanning webhookLicenseComplianceScanning() {
        return GitHubWebhookLicenseComplianceScanningBuilder.builder()
                .type(GitHubWebhookLicenseComplianceScanningType.LICENSE_COMPLIANCE_SCANNING)
                .build();
    }

    static GitHubWebhookMaxFilePathLength webhookMaxFilePathLength() {
        return GitHubWebhookMaxFilePathLengthBuilder.builder()
                .parameters(webhookMaxFilePathLengthParameters())
                .type(GitHubWebhookMaxFilePathLengthType.MAX_FILE_PATH_LENGTH)
                .build();
    }

    static GitHubWebhookMaxFilePathLengthParameters webhookMaxFilePathLengthParameters() {
        return GitHubWebhookMaxFilePathLengthParametersBuilder.builder()
                .maxFilePathLength(1L)
                .build();
    }

    static GitHubWebhookMaxFileSize webhookMaxFileSize() {
        return GitHubWebhookMaxFileSizeBuilder.builder()
                .parameters(webhookMaxFileSizeParameters())
                .type(GitHubWebhookMaxFileSizeType.MAX_FILE_SIZE)
                .build();
    }

    static GitHubWebhookMaxFileSizeParameters webhookMaxFileSizeParameters() {
        return GitHubWebhookMaxFileSizeParametersBuilder.builder()
                .maxFileSize(1L)
                .build();
    }

    static GitHubWebhookMergeQueue webhookMergeQueue() {
        return GitHubWebhookMergeQueueBuilder.builder()
                .parameters(webhookMergeQueueParameters())
                .type(GitHubWebhookMergeQueueType.MERGE_QUEUE)
                .build();
    }

    static GitHubWebhookMergeQueueParameters webhookMergeQueueParameters() {
        return GitHubWebhookMergeQueueParametersBuilder.builder()
                .checkResponseTimeoutMinutes(1L)
                .groupingStrategy(GitHubWebhookMergeQueueParametersGroupingStrategy.ALLGREEN)
                .maxEntriesToBuild(0L)
                .maxEntriesToMerge(0L)
                .mergeMethod(GitHubWebhookMergeQueueParametersMergeMethod.MERGE)
                .minEntriesToMerge(0L)
                .minEntriesToMergeWaitMinutes(0L)
                .build();
    }

    static GitHubWebhookNonFastForward webhookNonFastForward() {
        return GitHubWebhookNonFastForwardBuilder.builder()
                .type(GitHubWebhookNonFastForwardType.NON_FAST_FORWARD)
                .build();
    }

    static GitHubWebhookPullRequest webhookPullRequest() {
        return GitHubWebhookPullRequestBuilder.builder()
                .parameters(webhookPullRequestParameters())
                .type(GitHubWebhookPullRequestType.PULL_REQUEST)
                .build();
    }

    static GitHubWebhookPullRequestParameters webhookPullRequestParameters() {
        return GitHubWebhookPullRequestParametersBuilder.builder()
                .allowedMergeMethods(List.of(GitHubWebhookPullRequestAutoMergeMergeMethod.MERGE))
                .dismissStaleReviewsOnPush(true)
                .dismissalRestriction(webhookDismissalRestriction())
                .requireCodeOwnerReview(true)
                .requireLastPushApproval(true)
                .requiredApprovingReviewCount(0L)
                .requiredReviewThreadResolution(true)
                .requiredReviewers(List.of(webhookRequiredReviewerConfiguration()))
                .build();
    }

    static GitHubWebhookRepositoryRuleset webhookRepositoryRuleset() {
        return GitHubWebhookRepositoryRulesetBuilder.builder()
                .links(webhookRepositoryRulesetLinks())
                .bypassActors(List.of(webhookRepositoryRulesetBypassActor()))
                .conditions(webhookRepositoryRulesetConditions())
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .currentUserCanBypass(GitHubWebhookRepositoryRulesetCurrentUserCanBypass.ALWAYS)
                .enforcement(GitHubWebhookRepositoryRulesetEnforcement.DISABLED)
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .rules(List.of(webhookCreation()))
                .source("source")
                .sourceType(GitHubWebhookRepositoryRulesetSourceType.REPOSITORY)
                .target(GitHubWebhookRepositoryRulesetTarget.BRANCH)
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookRepositoryRulesetBypassActor webhookRepositoryRulesetBypassActor() {
        return GitHubWebhookRepositoryRulesetBypassActorBuilder.builder()
                .actorId(1L)
                .actorType(GitHubWebhookRepositoryRulesetBypassActorActorType.INTEGRATION)
                .bypassMode(GitHubWebhookRepositoryRulesetBypassActorBypassMode.ALWAYS)
                .build();
    }

    static GitHubWebhookRepositoryRulesetConditions webhookRepositoryRulesetConditions() {
        return GitHubWebhookRepositoryRulesetConditionsBuilder.builder()
                .refName(webhookRepositoryRulesetConditionsRefName())
                .repositoryId(webhookRepositoryRulesetConditionsRepositoryId())
                .repositoryName(webhookRepositoryRulesetConditionsRepositoryName())
                .repositoryProperty(webhookRepositoryRulesetConditionsRepositoryProperty())
                .build();
    }

    static GitHubWebhookRepositoryRulesetConditionsForRefNames webhookRepositoryRulesetConditionsForRefNames() {
        return GitHubWebhookRepositoryRulesetConditionsForRefNamesBuilder.builder()
                .refName(webhookRepositoryRulesetConditionsRefName())
                .build();
    }

    static GitHubWebhookRepositoryRulesetConditionsRefName webhookRepositoryRulesetConditionsRefName() {
        return GitHubWebhookRepositoryRulesetConditionsRefNameBuilder.builder()
                .exclude(List.of("exclude"))
                .include(List.of("include"))
                .build();
    }

    static GitHubWebhookRepositoryRulesetConditionsRepositoryId webhookRepositoryRulesetConditionsRepositoryId() {
        return GitHubWebhookRepositoryRulesetConditionsRepositoryIdBuilder.builder()
                .repositoryIds(List.of(1L))
                .build();
    }

    static GitHubWebhookRepositoryRulesetConditionsRepositoryName webhookRepositoryRulesetConditionsRepositoryName() {
        return GitHubWebhookRepositoryRulesetConditionsRepositoryNameBuilder.builder()
                .exclude(List.of("exclude"))
                .include(List.of("include"))
                .protectedValue(true)
                .build();
    }

    static GitHubWebhookRepositoryRulesetConditionsRepositoryProperty
            webhookRepositoryRulesetConditionsRepositoryProperty() {
        return GitHubWebhookRepositoryRulesetConditionsRepositoryPropertyBuilder.builder()
                .exclude(List.of(webhookRepositoryRulesetPropertyTargetingDefinition()))
                .include(List.of(webhookRepositoryRulesetPropertyTargetingDefinition()))
                .build();
    }

    static GitHubWebhookRepositoryRulesetCreatedEvent webhookRepositoryRulesetCreatedEvent() {
        return GitHubWebhookRepositoryRulesetCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .repositoryRuleset(webhookRepositoryRuleset())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryRulesetDeletedEvent webhookRepositoryRulesetDeletedEvent() {
        return GitHubWebhookRepositoryRulesetDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .repositoryRuleset(webhookRepositoryRuleset())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryRulesetEditedChanges webhookRepositoryRulesetEditedChanges() {
        return GitHubWebhookRepositoryRulesetEditedChangesBuilder.builder()
                .conditions(webhookRepositoryRulesetEditedChangesConditions())
                .enforcement(webhookProjectCardEditedChangesNote())
                .name(webhookProjectCardEditedChangesNote())
                .rules(webhookRepositoryRulesetEditedChangesRules())
                .build();
    }

    static GitHubWebhookRepositoryRulesetEditedChangesConditions webhookRepositoryRulesetEditedChangesConditions() {
        return GitHubWebhookRepositoryRulesetEditedChangesConditionsBuilder.builder()
                .added(List.of(webhookRepositoryRulesetConditionsForRefNames()))
                .deleted(List.of(webhookRepositoryRulesetConditionsForRefNames()))
                .updated(List.of(webhookRepositoryRulesetEditedChangesConditionsUpdated()))
                .build();
    }

    static GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdated
            webhookRepositoryRulesetEditedChangesConditionsUpdated() {
        return GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdatedBuilder.builder()
                .changes(webhookRepositoryRulesetEditedChangesConditionsUpdatedChanges())
                .condition(webhookRepositoryRulesetConditionsForRefNames())
                .build();
    }

    static GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdatedChanges
            webhookRepositoryRulesetEditedChangesConditionsUpdatedChanges() {
        return GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdatedChangesBuilder.builder()
                .conditionType(webhookProjectCardEditedChangesNote())
                .exclude(webhookRepositoryEditedChangesTopics())
                .include(webhookRepositoryEditedChangesTopics())
                .target(webhookProjectCardEditedChangesNote())
                .build();
    }

    static GitHubWebhookRepositoryRulesetEditedChangesRules webhookRepositoryRulesetEditedChangesRules() {
        return GitHubWebhookRepositoryRulesetEditedChangesRulesBuilder.builder()
                .added(List.of(webhookCreation()))
                .deleted(List.of(webhookCreation()))
                .updated(List.of(webhookRepositoryRulesetEditedChangesRulesUpdated()))
                .build();
    }

    static GitHubWebhookRepositoryRulesetEditedChangesRulesUpdated webhookRepositoryRulesetEditedChangesRulesUpdated() {
        return GitHubWebhookRepositoryRulesetEditedChangesRulesUpdatedBuilder.builder()
                .changes(webhookRepositoryRulesetEditedChangesRulesUpdatedChanges())
                .rule(webhookCreation())
                .build();
    }

    static GitHubWebhookRepositoryRulesetEditedChangesRulesUpdatedChanges
            webhookRepositoryRulesetEditedChangesRulesUpdatedChanges() {
        return GitHubWebhookRepositoryRulesetEditedChangesRulesUpdatedChangesBuilder.builder()
                .configuration(webhookProjectCardEditedChangesNote())
                .pattern(webhookProjectCardEditedChangesNote())
                .ruleType(webhookProjectCardEditedChangesNote())
                .build();
    }

    static GitHubWebhookRepositoryRulesetEditedEvent webhookRepositoryRulesetEditedEvent() {
        return GitHubWebhookRepositoryRulesetEditedEventBuilder.builder()
                .changes(webhookRepositoryRulesetEditedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .repositoryRuleset(webhookRepositoryRuleset())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryRulesetLinks webhookRepositoryRulesetLinks() {
        return GitHubWebhookRepositoryRulesetLinksBuilder.builder()
                .html(webhookRepositoryRulesetLinksHtml())
                .self(webhookRepositoryRulesetLinksHtml())
                .build();
    }

    static GitHubWebhookRepositoryRulesetLinksHtml webhookRepositoryRulesetLinksHtml() {
        return GitHubWebhookRepositoryRulesetLinksHtmlBuilder.builder()
                .href("href")
                .build();
    }

    static GitHubWebhookRepositoryRulesetPropertyTargetingDefinition
            webhookRepositoryRulesetPropertyTargetingDefinition() {
        return GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionBuilder.builder()
                .name("name")
                .propertyValues(List.of("property_values"))
                .source(GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionSource.CUSTOM)
                .build();
    }

    static GitHubWebhookRequiredDeployments webhookRequiredDeployments() {
        return GitHubWebhookRequiredDeploymentsBuilder.builder()
                .parameters(webhookRequiredDeploymentsParameters())
                .type(GitHubWebhookRequiredDeploymentsType.REQUIRED_DEPLOYMENTS)
                .build();
    }

    static GitHubWebhookRequiredDeploymentsParameters webhookRequiredDeploymentsParameters() {
        return GitHubWebhookRequiredDeploymentsParametersBuilder.builder()
                .requiredDeploymentEnvironments(List.of("required_deployment_environments"))
                .build();
    }

    static GitHubWebhookRequiredLinearHistory webhookRequiredLinearHistory() {
        return GitHubWebhookRequiredLinearHistoryBuilder.builder()
                .type(GitHubWebhookRequiredLinearHistoryType.REQUIRED_LINEAR_HISTORY)
                .build();
    }

    static GitHubWebhookRequiredReviewerConfiguration webhookRequiredReviewerConfiguration() {
        return GitHubWebhookRequiredReviewerConfigurationBuilder.builder()
                .filePatterns(List.of("file_patterns"))
                .minimumApprovals(1L)
                .reviewer(webhookReviewer())
                .build();
    }

    static GitHubWebhookRequiredSignatures webhookRequiredSignatures() {
        return GitHubWebhookRequiredSignaturesBuilder.builder()
                .type(GitHubWebhookRequiredSignaturesType.REQUIRED_SIGNATURES)
                .build();
    }

    static GitHubWebhookRequiredStatusChecks webhookRequiredStatusChecks() {
        return GitHubWebhookRequiredStatusChecksBuilder.builder()
                .parameters(webhookRequiredStatusChecksParameters())
                .type(GitHubWebhookRequiredStatusChecksType.REQUIRED_STATUS_CHECKS)
                .build();
    }

    static GitHubWebhookRequiredStatusChecksParameters webhookRequiredStatusChecksParameters() {
        return GitHubWebhookRequiredStatusChecksParametersBuilder.builder()
                .doNotEnforceOnCreate(true)
                .requiredStatusChecks(List.of(webhookStatusCheckConfiguration()))
                .strictRequiredStatusChecksPolicy(true)
                .build();
    }

    static GitHubWebhookReviewer webhookReviewer() {
        return GitHubWebhookReviewerBuilder.builder()
                .id(1L)
                .type(GitHubWebhookReviewerType.TEAM)
                .build();
    }

    static GitHubWebhookStatusCheckConfiguration webhookStatusCheckConfiguration() {
        return GitHubWebhookStatusCheckConfigurationBuilder.builder()
                .context("context")
                .integrationId(1L)
                .build();
    }

    static GitHubWebhookTagNamePattern webhookTagNamePattern() {
        return GitHubWebhookTagNamePatternBuilder.builder()
                .parameters(webhookTagNamePatternParameters())
                .type(GitHubWebhookTagNamePatternType.TAG_NAME_PATTERN)
                .build();
    }

    static GitHubWebhookTagNamePatternParameters webhookTagNamePatternParameters() {
        return GitHubWebhookTagNamePatternParametersBuilder.builder()
                .name("name")
                .negate(true)
                .operator(GitHubWebhookTagNamePatternParametersOperator.STARTS_WITH)
                .pattern("pattern")
                .build();
    }

    static GitHubWebhookUpdate webhookUpdate() {
        return GitHubWebhookUpdateBuilder.builder()
                .parameters(webhookUpdateParameters())
                .type(GitHubWebhookUpdateType.UPDATE)
                .build();
    }

    static GitHubWebhookUpdateParameters webhookUpdateParameters() {
        return GitHubWebhookUpdateParametersBuilder.builder()
                .updateAllowsFetchAndMerge(true)
                .build();
    }

    static GitHubWebhookWorkflowFileReference webhookWorkflowFileReference() {
        return GitHubWebhookWorkflowFileReferenceBuilder.builder()
                .path("path")
                .ref("ref")
                .repositoryId(1L)
                .sha("sha")
                .build();
    }

    static GitHubWebhookWorkflows webhookWorkflows() {
        return GitHubWebhookWorkflowsBuilder.builder()
                .parameters(webhookWorkflowsParameters())
                .type(GitHubWebhookWorkflowsType.WORKFLOWS)
                .build();
    }

    static GitHubWebhookWorkflowsParameters webhookWorkflowsParameters() {
        return GitHubWebhookWorkflowsParametersBuilder.builder()
                .doNotEnforceOnCreate(true)
                .workflows(List.of(webhookWorkflowFileReference()))
                .build();
    }
}
