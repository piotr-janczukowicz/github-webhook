package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The permissions granted to the fine-grained access token.
 *
 * @param actions The level of permission to grant the access token for GitHub Actions workflows, workflow runs, and
 *     artifacts.
 * @param administration The level of permission to grant the access token for repository creation, deletion, settings,
 *     teams, and collaborators creation.
 * @param artifactMetadata The level of permission to grant the access token to create and retrieve build artifact
 *     metadata records.
 * @param attestations The level of permission to create and retrieve the access token for repository attestations.
 * @param checks The level of permission to grant the access token for checks on code.
 * @param codeQuality The level of permission to grant the access token to view and manage code quality data.
 * @param codespaces The level of permission to grant the access token to create, edit, delete, and list Codespaces.
 * @param contents The level of permission to grant the access token for repository contents, commits, branches,
 *     downloads, releases, and merges.
 * @param customPropertiesForOrganizations The level of permission to grant the access token to view and edit custom
 *     properties for an organization, when allowed by the property.
 * @param dependabotSecrets The level of permission to grant the access token to manage Dependabot secrets.
 * @param deployments The level of permission to grant the access token for deployments and deployment statuses.
 * @param discussions The level of permission to grant the access token for discussions and related comments and labels.
 * @param emailAddresses The level of permission to grant the access token to manage the email addresses belonging to a
 *     user.
 * @param enterpriseAdministration The level of permission to grant the access token to administer an enterprise
 *     account.
 * @param enterpriseCustomProperties The level of permission to grant the access token for repository custom properties
 *     management at the enterprise level.
 * @param enterpriseCustomPropertiesForOrganizations The level of permission to grant the access token for organization
 *     custom properties management at the enterprise level.
 * @param enterpriseOrganizationInstallationRepositories The level of permission to grant the access token to manage
 *     repository access of GitHub Apps on Enterprise-owned organizations.
 * @param enterpriseOrganizationInstallations The level of permission to grant the access token to manage installation
 *     of GitHub Apps on Enterprise-owned organizations.
 * @param environments The level of permission to grant the access token for managing repository environments.
 * @param followers The level of permission to grant the access token to manage the followers belonging to a user.
 * @param gitSshKeys The level of permission to grant the access token to manage git SSH keys.
 * @param gpgKeys The level of permission to grant the access token to view and manage GPG keys belonging to a user.
 * @param interactionLimits The level of permission to grant the access token to view and manage interaction limits on a
 *     repository.
 * @param issues The level of permission to grant the access token for issues and related comments, assignees, labels,
 *     and milestones.
 * @param members The level of permission to grant the access token for organization teams and members.
 * @param mergeQueues The level of permission to grant the access token to manage the merge queues for a repository.
 * @param metadata The level of permission to grant the access token to search repositories, list collaborators, and
 *     access repository metadata.
 * @param organizationAdministration The level of permission to grant the access token to manage access to an
 *     organization.
 * @param organizationAnnouncementBanners The level of permission to grant the access token to view and manage
 *     announcement banners for an organization.
 * @param organizationCopilotAgentSettings The level of permission to grant the access token to view and manage Copilot
 *     cloud agent settings for an organization.
 * @param organizationCopilotRequests The level of permission to grant the access token to make Copilot requests billed
 *     to the organization where the app is installed. This property is in public preview and is subject to change.
 * @param organizationCopilotSeatManagement The level of permission to grant the access token for managing access to
 *     GitHub Copilot for members of an organization with a Copilot Business subscription. This property is in public
 *     preview and is subject to change.
 * @param organizationCustomOrgRoles The level of permission to grant the access token for custom organization roles
 *     management.
 * @param organizationCustomProperties The level of permission to grant the access token for repository custom
 *     properties management at the organization level.
 * @param organizationCustomRoles The level of permission to grant the access token for custom repository roles
 *     management.
 * @param organizationEvents The level of permission to grant the access token to view events triggered by an activity
 *     in an organization.
 * @param organizationExternalPropertiesForRepos The level of permission to grant the access token for managing external
 *     custom properties for repositories in an organization.
 * @param organizationHooks The level of permission to grant the access token to manage the post-receive hooks for an
 *     organization.
 * @param organizationPackages The level of permission to grant the access token for organization packages published to
 *     GitHub Packages.
 * @param organizationPersonalAccessTokenRequests The level of permission to grant the access token for viewing and
 *     managing fine-grained personal access tokens that have been approved by an organization.
 * @param organizationPersonalAccessTokens The level of permission to grant the access token for viewing and managing
 *     fine-grained personal access token requests to an organization.
 * @param organizationPlan The level of permission to grant the access token for viewing an organization's plan.
 * @param organizationProjects The level of permission to grant the access token to manage organization projects and
 *     projects public preview (where available).
 * @param organizationSecrets The level of permission to grant the access token to manage organization secrets.
 * @param organizationSelfHostedRunners The level of permission to grant the access token to view and manage GitHub
 *     Actions self-hosted runners available to an organization.
 * @param organizationUserBlocking The level of permission to grant the access token to view and manage users blocked by
 *     the organization.
 * @param packages The level of permission to grant the access token for packages published to GitHub Packages.
 * @param pages The level of permission to grant the access token to retrieve Pages statuses, configuration, and builds,
 *     as well as create new builds.
 * @param profile The level of permission to grant the access token to manage the profile settings belonging to a user.
 * @param pullRequests The level of permission to grant the access token for pull requests and related comments,
 *     assignees, labels, milestones, and merges.
 * @param repositoryCustomProperties The level of permission to grant the access token to view and edit custom
 *     properties for a repository, when allowed by the property.
 * @param repositoryHooks The level of permission to grant the access token to manage the post-receive hooks for a
 *     repository.
 * @param repositoryProjects The level of permission to grant the access token to manage repository projects, columns,
 *     and cards.
 * @param secretScanningAlerts The level of permission to grant the access token to view and manage secret scanning
 *     alerts.
 * @param secrets The level of permission to grant the access token to manage repository secrets.
 * @param securityEvents The level of permission to grant the access token to view and manage security events like code
 *     scanning alerts.
 * @param singleFile The level of permission to grant the access token to manage just a single file.
 * @param starring The level of permission to grant the access token to list and manage repositories a user is starring.
 * @param statuses The level of permission to grant the access token for commit statuses.
 * @param vulnerabilityAlerts The level of permission to grant the access token to manage Dependabot alerts.
 * @param workflows The level of permission to grant the access token to update GitHub Actions workflow files.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/installation-created/requestBody/properties/installation/properties/permissions")
public record GitHubWebhookAppPermissions(
        @Nullable GitHubWebhookAppPermissionsActions actions,
        @Nullable GitHubWebhookAppPermissionsActions administration,
        @Nullable GitHubWebhookAppPermissionsActions artifactMetadata,
        @Nullable GitHubWebhookAppPermissionsActions attestations,
        @Nullable GitHubWebhookAppPermissionsActions checks,
        @Nullable GitHubWebhookAppPermissionsActions codeQuality,
        @Nullable GitHubWebhookAppPermissionsActions codespaces,
        @Nullable GitHubWebhookAppPermissionsActions contents,
        @Nullable GitHubWebhookAppPermissionsActions customPropertiesForOrganizations,
        @Nullable GitHubWebhookAppPermissionsActions dependabotSecrets,
        @Nullable GitHubWebhookAppPermissionsActions deployments,
        @Nullable GitHubWebhookAppPermissionsActions discussions,
        @Nullable GitHubWebhookAppPermissionsActions emailAddresses,
        @Nullable GitHubWebhookAppPermissionsActions enterpriseAdministration,
        @Nullable GitHubWebhookAppPermissionsActions enterpriseCustomProperties,
        @Nullable GitHubWebhookAppPermissionsOrganizationProjects enterpriseCustomPropertiesForOrganizations,
        @Nullable GitHubWebhookAppPermissionsActions enterpriseOrganizationInstallationRepositories,
        @Nullable GitHubWebhookAppPermissionsActions enterpriseOrganizationInstallations,
        @Nullable GitHubWebhookAppPermissionsActions environments,
        @Nullable GitHubWebhookAppPermissionsActions followers,
        @Nullable GitHubWebhookAppPermissionsActions gitSshKeys,
        @Nullable GitHubWebhookAppPermissionsActions gpgKeys,
        @Nullable GitHubWebhookAppPermissionsActions interactionLimits,
        @Nullable GitHubWebhookAppPermissionsActions issues,
        @Nullable GitHubWebhookAppPermissionsActions members,
        @Nullable GitHubWebhookAppPermissionsActions mergeQueues,
        @Nullable GitHubWebhookAppPermissionsActions metadata,
        @Nullable GitHubWebhookAppPermissionsActions organizationAdministration,
        @Nullable GitHubWebhookAppPermissionsActions organizationAnnouncementBanners,
        @Nullable GitHubWebhookAppPermissionsActions organizationCopilotAgentSettings,
        @Nullable GitHubWebhookAppPermissionsOrganizationCopilotRequests organizationCopilotRequests,
        @Nullable GitHubWebhookAppPermissionsActions organizationCopilotSeatManagement,
        @Nullable GitHubWebhookAppPermissionsActions organizationCustomOrgRoles,
        @Nullable GitHubWebhookAppPermissionsOrganizationProjects organizationCustomProperties,
        @Nullable GitHubWebhookAppPermissionsActions organizationCustomRoles,
        @Nullable GitHubWebhookAppPermissionsOrganizationCopilotRequests organizationEvents,
        @Nullable GitHubWebhookAppPermissionsOrganizationProjects organizationExternalPropertiesForRepos,
        @Nullable GitHubWebhookAppPermissionsActions organizationHooks,
        @Nullable GitHubWebhookAppPermissionsActions organizationPackages,
        @Nullable GitHubWebhookAppPermissionsActions organizationPersonalAccessTokenRequests,
        @Nullable GitHubWebhookAppPermissionsActions organizationPersonalAccessTokens,
        @Nullable GitHubWebhookAppPermissionsOrganizationCopilotRequests organizationPlan,
        @Nullable GitHubWebhookAppPermissionsOrganizationProjects organizationProjects,
        @Nullable GitHubWebhookAppPermissionsActions organizationSecrets,
        @Nullable GitHubWebhookAppPermissionsActions organizationSelfHostedRunners,
        @Nullable GitHubWebhookAppPermissionsActions organizationUserBlocking,
        @Nullable GitHubWebhookAppPermissionsActions packages,
        @Nullable GitHubWebhookAppPermissionsActions pages,
        @Nullable GitHubWebhookAppPermissionsProfile profile,
        @Nullable GitHubWebhookAppPermissionsActions pullRequests,
        @Nullable GitHubWebhookAppPermissionsActions repositoryCustomProperties,
        @Nullable GitHubWebhookAppPermissionsActions repositoryHooks,
        @Nullable GitHubWebhookAppPermissionsOrganizationProjects repositoryProjects,
        @Nullable GitHubWebhookAppPermissionsActions secretScanningAlerts,
        @Nullable GitHubWebhookAppPermissionsActions secrets,
        @Nullable GitHubWebhookAppPermissionsActions securityEvents,
        @Nullable GitHubWebhookAppPermissionsActions singleFile,
        @Nullable GitHubWebhookAppPermissionsActions starring,
        @Nullable GitHubWebhookAppPermissionsActions statuses,
        @Nullable GitHubWebhookAppPermissionsActions vulnerabilityAlerts,
        @Nullable GitHubWebhookAppPermissionsProfile workflows) {}
