package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDeploymentReviewApprovedApprover;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookEnterprise;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The deployment review approved event payload.
 *
 * @param approver approver
 * @param comment comment
 * @param enterprise An enterprise on GitHub. Webhook payloads contain the {@code enterprise} property when the webhook
 *     is configured on an enterprise account or an organization that's part of an enterprise account. For more
 *     information, see "[About enterprise accounts](https://docs.github.com/admin/overview/about-enterprise-accounts)."
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param repository The repository on GitHub where the event occurred. Webhook payloads contain the {@code repository}
 *     property when the event occurs from activity in a repository.
 * @param reviewers reviewers
 * @param sender A GitHub user.
 * @param since since
 * @param workflowJobRun workflow_job_run
 * @param workflowJobRuns workflow_job_runs
 * @param workflowRun workflow_run
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-review-approved/requestBody")
public record GitHubWebhookDeploymentReviewApprovedEvent(
        @Nullable GitHubWebhookDeploymentReviewApprovedApprover approver,
        @Nullable String comment,
        @Nullable GitHubWebhookEnterprise enterprise,
        @Nullable GitHubWebhookSimpleInstallation installation,
        GitHubWebhookOrganizationSimple organization,
        GitHubWebhookForkRepository repository,
        @Nullable List<GitHubWebhookDeploymentReviewApprovedReviewer> reviewers,
        GitHubWebhookSimpleUser sender,
        String since,
        @Nullable GitHubWebhookDeploymentReviewApprovedWorkflowJobRun workflowJobRun,
        @Nullable List<GitHubWebhookDeploymentReviewApprovedWorkflowJobRunsItem> workflowJobRuns,
        @Nullable GitHubWebhookDeploymentWorkflowRun workflowRun)
        implements GitHubWebhookDeploymentReviewEvent {
    public GitHubWebhookDeploymentReviewApprovedEvent {
        requireNonNull(organization, "organization");
        requireNonNull(repository, "repository");
        requireNonNull(sender, "sender");
        requireNonNull(since, "since");
    }
}
