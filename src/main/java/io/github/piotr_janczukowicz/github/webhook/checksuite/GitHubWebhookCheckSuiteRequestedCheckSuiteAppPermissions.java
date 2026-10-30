package io.github.piotr_janczukowicz.github.webhook.checksuite;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookAppPermissionsActions;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookAppPermissionsOrganizationProjects;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookAppPermissionsProfile;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The set of permissions for the GitHub app
 *
 * @param actions actions
 * @param administration administration
 * @param artifactMetadata artifact_metadata
 * @param attestations attestations
 * @param checks checks
 * @param codeQuality code_quality
 * @param contentReferences content_references
 * @param contents contents
 * @param copilotRequests copilot_requests
 * @param deployments deployments
 * @param discussions discussions
 * @param drives drives
 * @param emails emails
 * @param environments environments
 * @param issues issues
 * @param keys keys
 * @param members members
 * @param mergeQueues merge_queues
 * @param metadata metadata
 * @param models models
 * @param organizationAdministration organization_administration
 * @param organizationHooks organization_hooks
 * @param organizationPackages organization_packages
 * @param organizationPlan organization_plan
 * @param organizationProjects organization_projects
 * @param organizationSecrets organization_secrets
 * @param organizationSelfHostedRunners organization_self_hosted_runners
 * @param organizationUserBlocking organization_user_blocking
 * @param packages packages
 * @param pages pages
 * @param pullRequests pull_requests
 * @param repositoryHooks repository_hooks
 * @param repositoryProjects repository_projects
 * @param secretScanningAlerts secret_scanning_alerts
 * @param secrets secrets
 * @param securityEvents security_events
 * @param securityScanningAlert security_scanning_alert
 * @param singleFile single_file
 * @param statuses statuses
 * @param vulnerabilityAlerts vulnerability_alerts
 * @param workflows workflows
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/check-suite-requested/requestBody/properties/check_suite/properties/app/properties/permissions")
public record GitHubWebhookCheckSuiteRequestedCheckSuiteAppPermissions(
        @Nullable GitHubWebhookAppPermissionsActions actions,
        @Nullable GitHubWebhookAppPermissionsActions administration,
        @Nullable GitHubWebhookAppPermissionsActions artifactMetadata,
        @Nullable GitHubWebhookAppPermissionsActions attestations,
        @Nullable GitHubWebhookAppPermissionsActions checks,
        @Nullable GitHubWebhookAppPermissionsActions codeQuality,
        @Nullable GitHubWebhookAppPermissionsActions contentReferences,
        @Nullable GitHubWebhookAppPermissionsActions contents,
        @Nullable GitHubWebhookAppPermissionsProfile copilotRequests,
        @Nullable GitHubWebhookAppPermissionsActions deployments,
        @Nullable GitHubWebhookAppPermissionsActions discussions,
        @Nullable GitHubWebhookAppPermissionsActions drives,
        @Nullable GitHubWebhookAppPermissionsActions emails,
        @Nullable GitHubWebhookAppPermissionsActions environments,
        @Nullable GitHubWebhookAppPermissionsActions issues,
        @Nullable GitHubWebhookAppPermissionsActions keys,
        @Nullable GitHubWebhookAppPermissionsActions members,
        @Nullable GitHubWebhookAppPermissionsActions mergeQueues,
        @Nullable GitHubWebhookAppPermissionsActions metadata,
        @Nullable GitHubWebhookAppPermissionsActions models,
        @Nullable GitHubWebhookAppPermissionsActions organizationAdministration,
        @Nullable GitHubWebhookAppPermissionsActions organizationHooks,
        @Nullable GitHubWebhookAppPermissionsActions organizationPackages,
        @Nullable GitHubWebhookAppPermissionsActions organizationPlan,
        @Nullable GitHubWebhookAppPermissionsOrganizationProjects organizationProjects,
        @Nullable GitHubWebhookAppPermissionsActions organizationSecrets,
        @Nullable GitHubWebhookAppPermissionsActions organizationSelfHostedRunners,
        @Nullable GitHubWebhookAppPermissionsActions organizationUserBlocking,
        @Nullable GitHubWebhookAppPermissionsActions packages,
        @Nullable GitHubWebhookAppPermissionsActions pages,
        @Nullable GitHubWebhookAppPermissionsActions pullRequests,
        @Nullable GitHubWebhookAppPermissionsActions repositoryHooks,
        @Nullable GitHubWebhookAppPermissionsOrganizationProjects repositoryProjects,
        @Nullable GitHubWebhookAppPermissionsActions secretScanningAlerts,
        @Nullable GitHubWebhookAppPermissionsActions secrets,
        @Nullable GitHubWebhookAppPermissionsActions securityEvents,
        @Nullable GitHubWebhookAppPermissionsActions securityScanningAlert,
        @Nullable GitHubWebhookAppPermissionsActions singleFile,
        @Nullable GitHubWebhookAppPermissionsActions statuses,
        @Nullable GitHubWebhookAppPermissionsActions vulnerabilityAlerts,
        @Nullable GitHubWebhookAppPermissionsActions workflows) {}
