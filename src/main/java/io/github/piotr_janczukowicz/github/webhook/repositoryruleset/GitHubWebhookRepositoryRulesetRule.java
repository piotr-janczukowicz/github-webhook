package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/** A repository rule. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = GitHubWebhookCreation.class, name = "creation"),
    @JsonSubTypes.Type(value = GitHubWebhookUpdate.class, name = "update"),
    @JsonSubTypes.Type(value = GitHubWebhookDeletion.class, name = "deletion"),
    @JsonSubTypes.Type(value = GitHubWebhookRequiredLinearHistory.class, name = "required_linear_history"),
    @JsonSubTypes.Type(value = GitHubWebhookMergeQueue.class, name = "merge_queue"),
    @JsonSubTypes.Type(value = GitHubWebhookRequiredDeployments.class, name = "required_deployments"),
    @JsonSubTypes.Type(value = GitHubWebhookRequiredSignatures.class, name = "required_signatures"),
    @JsonSubTypes.Type(value = GitHubWebhookPullRequest.class, name = "pull_request"),
    @JsonSubTypes.Type(value = GitHubWebhookRequiredStatusChecks.class, name = "required_status_checks"),
    @JsonSubTypes.Type(value = GitHubWebhookNonFastForward.class, name = "non_fast_forward"),
    @JsonSubTypes.Type(value = GitHubWebhookCommitMessagePattern.class, name = "commit_message_pattern"),
    @JsonSubTypes.Type(value = GitHubWebhookCommitAuthorEmailPattern.class, name = "commit_author_email_pattern"),
    @JsonSubTypes.Type(value = GitHubWebhookCommitterEmailPattern.class, name = "committer_email_pattern"),
    @JsonSubTypes.Type(value = GitHubWebhookBranchNamePattern.class, name = "branch_name_pattern"),
    @JsonSubTypes.Type(value = GitHubWebhookTagNamePattern.class, name = "tag_name_pattern"),
    @JsonSubTypes.Type(value = GitHubWebhookWorkflows.class, name = "workflows"),
    @JsonSubTypes.Type(value = GitHubWebhookCodeScanning.class, name = "code_scanning"),
    @JsonSubTypes.Type(value = GitHubWebhookCodeQuality.class, name = "code_quality"),
    @JsonSubTypes.Type(value = GitHubWebhookCodeCoverage.class, name = "code_coverage"),
    @JsonSubTypes.Type(value = GitHubWebhookCopilotCodeReview.class, name = "copilot_code_review"),
    @JsonSubTypes.Type(value = GitHubWebhookLicenseComplianceScanning.class, name = "license_compliance_scanning"),
    @JsonSubTypes.Type(value = GitHubWebhookFilePathRestriction.class, name = "file_path_restriction"),
    @JsonSubTypes.Type(value = GitHubWebhookMaxFilePathLength.class, name = "max_file_path_length"),
    @JsonSubTypes.Type(value = GitHubWebhookFileExtensionRestriction.class, name = "file_extension_restriction"),
    @JsonSubTypes.Type(value = GitHubWebhookMaxFileSize.class, name = "max_file_size")
})
public sealed interface GitHubWebhookRepositoryRulesetRule
        permits GitHubWebhookCreation,
                GitHubWebhookUpdate,
                GitHubWebhookDeletion,
                GitHubWebhookRequiredLinearHistory,
                GitHubWebhookMergeQueue,
                GitHubWebhookRequiredDeployments,
                GitHubWebhookRequiredSignatures,
                GitHubWebhookPullRequest,
                GitHubWebhookRequiredStatusChecks,
                GitHubWebhookNonFastForward,
                GitHubWebhookCommitMessagePattern,
                GitHubWebhookCommitAuthorEmailPattern,
                GitHubWebhookCommitterEmailPattern,
                GitHubWebhookBranchNamePattern,
                GitHubWebhookTagNamePattern,
                GitHubWebhookWorkflows,
                GitHubWebhookCodeScanning,
                GitHubWebhookCodeQuality,
                GitHubWebhookCodeCoverage,
                GitHubWebhookCopilotCodeReview,
                GitHubWebhookLicenseComplianceScanning,
                GitHubWebhookFilePathRestriction,
                GitHubWebhookMaxFilePathLength,
                GitHubWebhookFileExtensionRestriction,
                GitHubWebhookMaxFileSize {}
