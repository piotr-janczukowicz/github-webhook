package io.github.piotr_janczukowicz.github.webhook;

import io.github.piotr_janczukowicz.github.webhook.branchprotectionconfiguration.GitHubWebhookBranchProtectionConfigurationEvent;
import io.github.piotr_janczukowicz.github.webhook.branchprotectionrule.GitHubWebhookBranchProtectionRuleEvent;
import io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning.GitHubWebhookBypassRequestSecretScanningEvent;
import io.github.piotr_janczukowicz.github.webhook.cachesync.GitHubWebhookCacheSyncEvent;
import io.github.piotr_janczukowicz.github.webhook.checkrun.GitHubWebhookCheckRunEvent;
import io.github.piotr_janczukowicz.github.webhook.checksuite.GitHubWebhookCheckSuiteEvent;
import io.github.piotr_janczukowicz.github.webhook.codescanningalert.GitHubWebhookCodeScanningAlertEvent;
import io.github.piotr_janczukowicz.github.webhook.commitcomment.GitHubWebhookCommitCommentEvent;
import io.github.piotr_janczukowicz.github.webhook.create.GitHubWebhookCreateEvent;
import io.github.piotr_janczukowicz.github.webhook.customproperty.GitHubWebhookCustomPropertyEvent;
import io.github.piotr_janczukowicz.github.webhook.custompropertyvalues.GitHubWebhookCustomPropertyValuesEvent;
import io.github.piotr_janczukowicz.github.webhook.delete.GitHubWebhookDeleteEvent;
import io.github.piotr_janczukowicz.github.webhook.dependabotalert.GitHubWebhookDependabotAlertEvent;
import io.github.piotr_janczukowicz.github.webhook.deploykey.GitHubWebhookDeployKeyEvent;
import io.github.piotr_janczukowicz.github.webhook.deployment.GitHubWebhookDeploymentEvent;
import io.github.piotr_janczukowicz.github.webhook.deploymentprotectionrule.GitHubWebhookDeploymentProtectionRuleEvent;
import io.github.piotr_janczukowicz.github.webhook.deploymentreview.GitHubWebhookDeploymentReviewEvent;
import io.github.piotr_janczukowicz.github.webhook.deploymentstatus.GitHubWebhookDeploymentStatusEvent;
import io.github.piotr_janczukowicz.github.webhook.discussion.GitHubWebhookDiscussionEvent;
import io.github.piotr_janczukowicz.github.webhook.discussioncomment.GitHubWebhookDiscussionCommentEvent;
import io.github.piotr_janczukowicz.github.webhook.dismissalrequestcodescanning.GitHubWebhookDismissalRequestCodeScanningEvent;
import io.github.piotr_janczukowicz.github.webhook.dismissalrequestdependabot.GitHubWebhookDismissalRequestDependabotEvent;
import io.github.piotr_janczukowicz.github.webhook.dismissalrequestlicensecompliance.GitHubWebhookDismissalRequestLicenseComplianceEvent;
import io.github.piotr_janczukowicz.github.webhook.dismissalrequestsecretscanning.GitHubWebhookDismissalRequestSecretScanningEvent;
import io.github.piotr_janczukowicz.github.webhook.enterprise.GitHubWebhookEnterpriseEvent;
import io.github.piotr_janczukowicz.github.webhook.exemptionrequestpushruleset.GitHubWebhookExemptionRequestPushRulesetEvent;
import io.github.piotr_janczukowicz.github.webhook.fork.GitHubWebhookForkEvent;
import io.github.piotr_janczukowicz.github.webhook.githubappauthorization.GitHubWebhookGithubAppAuthorizationEvent;
import io.github.piotr_janczukowicz.github.webhook.gollum.GitHubWebhookGollumEvent;
import io.github.piotr_janczukowicz.github.webhook.installation.GitHubWebhookInstallationEvent;
import io.github.piotr_janczukowicz.github.webhook.installationrepositories.GitHubWebhookInstallationRepositoriesEvent;
import io.github.piotr_janczukowicz.github.webhook.installationtarget.GitHubWebhookInstallationTargetEvent;
import io.github.piotr_janczukowicz.github.webhook.issuecomment.GitHubWebhookIssueCommentEvent;
import io.github.piotr_janczukowicz.github.webhook.issuedependencies.GitHubWebhookIssueDependenciesEvent;
import io.github.piotr_janczukowicz.github.webhook.issuerelatesto.GitHubWebhookIssueRelatesToEvent;
import io.github.piotr_janczukowicz.github.webhook.issues.GitHubWebhookIssuesEvent;
import io.github.piotr_janczukowicz.github.webhook.label.GitHubWebhookLabelEvent;
import io.github.piotr_janczukowicz.github.webhook.marketplacepurchase.GitHubWebhookMarketplacePurchaseEvent;
import io.github.piotr_janczukowicz.github.webhook.member.GitHubWebhookMemberEvent;
import io.github.piotr_janczukowicz.github.webhook.membership.GitHubWebhookMembershipEvent;
import io.github.piotr_janczukowicz.github.webhook.mergegroup.GitHubWebhookMergeGroupEvent;
import io.github.piotr_janczukowicz.github.webhook.meta.GitHubWebhookMetaEvent;
import io.github.piotr_janczukowicz.github.webhook.milestone.GitHubWebhookMilestoneEvent;
import io.github.piotr_janczukowicz.github.webhook.organization.GitHubWebhookOrganizationEvent;
import io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty.GitHubWebhookOrganizationCustomPropertyEvent;
import io.github.piotr_janczukowicz.github.webhook.organizationcustompropertyvalues.GitHubWebhookOrganizationCustomPropertyValuesEvent;
import io.github.piotr_janczukowicz.github.webhook.orgblock.GitHubWebhookOrgBlockEvent;
import io.github.piotr_janczukowicz.github.webhook.packageevents.GitHubWebhookPackageEvent;
import io.github.piotr_janczukowicz.github.webhook.pagebuild.GitHubWebhookPageBuildEvent;
import io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest.GitHubWebhookPersonalAccessTokenRequestEvent;
import io.github.piotr_janczukowicz.github.webhook.ping.GitHubWebhookPingEvent;
import io.github.piotr_janczukowicz.github.webhook.project.GitHubWebhookProjectEvent;
import io.github.piotr_janczukowicz.github.webhook.projectcard.GitHubWebhookProjectCardEvent;
import io.github.piotr_janczukowicz.github.webhook.projectcolumn.GitHubWebhookProjectColumnEvent;
import io.github.piotr_janczukowicz.github.webhook.projectsv2.GitHubWebhookProjectsV2Event;
import io.github.piotr_janczukowicz.github.webhook.projectsv2item.GitHubWebhookProjectsV2ItemEvent;
import io.github.piotr_janczukowicz.github.webhook.projectsv2statusupdate.GitHubWebhookProjectsV2StatusUpdateEvent;
import io.github.piotr_janczukowicz.github.webhook.publicevents.GitHubWebhookPublicEvent;
import io.github.piotr_janczukowicz.github.webhook.pullrequest.GitHubWebhookPullRequestEvent;
import io.github.piotr_janczukowicz.github.webhook.pullrequestreview.GitHubWebhookPullRequestReviewEvent;
import io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment.GitHubWebhookPullRequestReviewCommentEvent;
import io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread.GitHubWebhookPullRequestReviewThreadEvent;
import io.github.piotr_janczukowicz.github.webhook.push.GitHubWebhookPushEvent;
import io.github.piotr_janczukowicz.github.webhook.registrypackage.GitHubWebhookRegistryPackageEvent;
import io.github.piotr_janczukowicz.github.webhook.release.GitHubWebhookReleaseEvent;
import io.github.piotr_janczukowicz.github.webhook.repository.GitHubWebhookRepositoryEvent;
import io.github.piotr_janczukowicz.github.webhook.repositoryadvisory.GitHubWebhookRepositoryAdvisoryEvent;
import io.github.piotr_janczukowicz.github.webhook.repositorydispatch.GitHubWebhookRepositoryDispatchEvent;
import io.github.piotr_janczukowicz.github.webhook.repositoryimport.GitHubWebhookRepositoryImportEvent;
import io.github.piotr_janczukowicz.github.webhook.repositoryruleset.GitHubWebhookRepositoryRulesetEvent;
import io.github.piotr_janczukowicz.github.webhook.repositoryvulnerabilityalert.GitHubWebhookRepositoryVulnerabilityAlertEvent;
import io.github.piotr_janczukowicz.github.webhook.secretscanningalert.GitHubWebhookSecretScanningAlertEvent;
import io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation.GitHubWebhookSecretScanningAlertLocationEvent;
import io.github.piotr_janczukowicz.github.webhook.secretscanningscan.GitHubWebhookSecretScanningScanEvent;
import io.github.piotr_janczukowicz.github.webhook.securityadvisory.GitHubWebhookSecurityAdvisoryEvent;
import io.github.piotr_janczukowicz.github.webhook.securityandanalysis.GitHubWebhookSecurityAndAnalysisEvent;
import io.github.piotr_janczukowicz.github.webhook.sponsorship.GitHubWebhookSponsorshipEvent;
import io.github.piotr_janczukowicz.github.webhook.star.GitHubWebhookStarEvent;
import io.github.piotr_janczukowicz.github.webhook.status.GitHubWebhookStatusEvent;
import io.github.piotr_janczukowicz.github.webhook.subissues.GitHubWebhookSubIssuesEvent;
import io.github.piotr_janczukowicz.github.webhook.team.GitHubWebhookTeamEvent;
import io.github.piotr_janczukowicz.github.webhook.teamadd.GitHubWebhookTeamAddEvent;
import io.github.piotr_janczukowicz.github.webhook.user.GitHubWebhookUserEvent;
import io.github.piotr_janczukowicz.github.webhook.watch.GitHubWebhookWatchEvent;
import io.github.piotr_janczukowicz.github.webhook.workflowdispatch.GitHubWebhookWorkflowDispatchEvent;
import io.github.piotr_janczukowicz.github.webhook.workflowjob.GitHubWebhookWorkflowJobEvent;
import io.github.piotr_janczukowicz.github.webhook.workflowrun.GitHubWebhookWorkflowRunEvent;

/**
 * A webhook delivery GitHub sent, decoded: one type for each family of events (an event with actions is a sealed
 * interface of one record per action), or {@link GitHubWebhookUnknownEvent} for an event this library version does not
 * know.
 */
public sealed interface GitHubWebhookEvent
        permits GitHubWebhookBranchProtectionConfigurationEvent,
                GitHubWebhookBranchProtectionRuleEvent,
                GitHubWebhookBypassRequestSecretScanningEvent,
                GitHubWebhookCacheSyncEvent,
                GitHubWebhookCheckRunEvent,
                GitHubWebhookCheckSuiteEvent,
                GitHubWebhookCodeScanningAlertEvent,
                GitHubWebhookCommitCommentEvent,
                GitHubWebhookCreateEvent,
                GitHubWebhookCustomPropertyEvent,
                GitHubWebhookCustomPropertyValuesEvent,
                GitHubWebhookDeleteEvent,
                GitHubWebhookDependabotAlertEvent,
                GitHubWebhookDeployKeyEvent,
                GitHubWebhookDeploymentEvent,
                GitHubWebhookDeploymentProtectionRuleEvent,
                GitHubWebhookDeploymentReviewEvent,
                GitHubWebhookDeploymentStatusEvent,
                GitHubWebhookDiscussionCommentEvent,
                GitHubWebhookDiscussionEvent,
                GitHubWebhookDismissalRequestCodeScanningEvent,
                GitHubWebhookDismissalRequestDependabotEvent,
                GitHubWebhookDismissalRequestLicenseComplianceEvent,
                GitHubWebhookDismissalRequestSecretScanningEvent,
                GitHubWebhookEnterpriseEvent,
                GitHubWebhookExemptionRequestPushRulesetEvent,
                GitHubWebhookForkEvent,
                GitHubWebhookGithubAppAuthorizationEvent,
                GitHubWebhookGollumEvent,
                GitHubWebhookInstallationEvent,
                GitHubWebhookInstallationRepositoriesEvent,
                GitHubWebhookInstallationTargetEvent,
                GitHubWebhookIssueCommentEvent,
                GitHubWebhookIssueDependenciesEvent,
                GitHubWebhookIssueRelatesToEvent,
                GitHubWebhookIssuesEvent,
                GitHubWebhookLabelEvent,
                GitHubWebhookMarketplacePurchaseEvent,
                GitHubWebhookMemberEvent,
                GitHubWebhookMembershipEvent,
                GitHubWebhookMergeGroupEvent,
                GitHubWebhookMetaEvent,
                GitHubWebhookMilestoneEvent,
                GitHubWebhookOrgBlockEvent,
                GitHubWebhookOrganizationCustomPropertyEvent,
                GitHubWebhookOrganizationCustomPropertyValuesEvent,
                GitHubWebhookOrganizationEvent,
                GitHubWebhookPackageEvent,
                GitHubWebhookPageBuildEvent,
                GitHubWebhookPersonalAccessTokenRequestEvent,
                GitHubWebhookPingEvent,
                GitHubWebhookProjectCardEvent,
                GitHubWebhookProjectColumnEvent,
                GitHubWebhookProjectEvent,
                GitHubWebhookProjectsV2Event,
                GitHubWebhookProjectsV2ItemEvent,
                GitHubWebhookProjectsV2StatusUpdateEvent,
                GitHubWebhookPublicEvent,
                GitHubWebhookPullRequestEvent,
                GitHubWebhookPullRequestReviewCommentEvent,
                GitHubWebhookPullRequestReviewEvent,
                GitHubWebhookPullRequestReviewThreadEvent,
                GitHubWebhookPushEvent,
                GitHubWebhookRegistryPackageEvent,
                GitHubWebhookReleaseEvent,
                GitHubWebhookRepositoryAdvisoryEvent,
                GitHubWebhookRepositoryDispatchEvent,
                GitHubWebhookRepositoryEvent,
                GitHubWebhookRepositoryImportEvent,
                GitHubWebhookRepositoryRulesetEvent,
                GitHubWebhookRepositoryVulnerabilityAlertEvent,
                GitHubWebhookSecretScanningAlertEvent,
                GitHubWebhookSecretScanningAlertLocationEvent,
                GitHubWebhookSecretScanningScanEvent,
                GitHubWebhookSecurityAdvisoryEvent,
                GitHubWebhookSecurityAndAnalysisEvent,
                GitHubWebhookSponsorshipEvent,
                GitHubWebhookStarEvent,
                GitHubWebhookStatusEvent,
                GitHubWebhookSubIssuesEvent,
                GitHubWebhookTeamAddEvent,
                GitHubWebhookTeamEvent,
                GitHubWebhookUserEvent,
                GitHubWebhookWatchEvent,
                GitHubWebhookWorkflowDispatchEvent,
                GitHubWebhookWorkflowJobEvent,
                GitHubWebhookWorkflowRunEvent,
                GitHubWebhookUnknownEvent {}
