package io.github.piotr_janczukowicz.github.webhook.deploymentprotectionrule;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDeployment;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The deployment protection rule requested event payload.
 *
 * @param deployment deployment
 * @param deploymentCallbackUrl The URL to review the deployment protection rule.
 * @param environment The name of the environment that has the deployment protection rule.
 * @param event The event that triggered the deployment protection rule.
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param pullRequests pull_requests
 * @param ref The ref (branch or tag) that triggered the workflow. Always populated from the check suite, regardless of
 *     whether a deployment is created.
 * @param repository The repository on GitHub where the event occurred. Webhook payloads contain the {@code repository}
 *     property when the event occurs from activity in a repository.
 * @param sender A GitHub user.
 * @param sha The commit SHA that triggered the workflow. Always populated from the check suite, regardless of whether a
 *     deployment is created.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-protection-rule-requested/requestBody")
public record GitHubWebhookDeploymentProtectionRuleRequestedEvent(
        @Nullable GitHubWebhookDeployment deployment,
        @Nullable String deploymentCallbackUrl,
        @Nullable String environment,
        @Nullable String event,
        @Nullable GitHubWebhookSimpleInstallation installation,
        @Nullable GitHubWebhookOrganizationSimple organization,
        @Nullable List<GitHubWebhookPullRequest> pullRequests,
        @Nullable String ref,
        @Nullable GitHubWebhookForkRepository repository,
        @Nullable GitHubWebhookSimpleUser sender,
        @Nullable String sha)
        implements GitHubWebhookDeploymentProtectionRuleEvent {}
