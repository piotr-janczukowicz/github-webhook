package io.github.piotr_janczukowicz.github.webhook.installationrepositories;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookEnterprise;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookInstallationCreatedRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookInstallationRepositorySelection;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The installation repositories added event payload.
 *
 * @param enterprise An enterprise on GitHub. Webhook payloads contain the {@code enterprise} property when the webhook
 *     is configured on an enterprise account or an organization that's part of an enterprise account. For more
 *     information, see "[About enterprise accounts](https://docs.github.com/admin/overview/about-enterprise-accounts)."
 * @param installation Installation
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param repositoriesAdded An array of repository objects, which were added to the installation.
 * @param repositoriesRemoved An array of repository objects, which were removed from the installation. When
 *     {@code repository_selection} changes from {@code all} to {@code selected}, this array is empty.
 * @param repository The repository on GitHub where the event occurred. Webhook payloads contain the {@code repository}
 *     property when the event occurs from activity in a repository.
 * @param repositorySelection Describe whether all repositories have been selected or there's a selection involved
 * @param requester requester
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/installation-repositories-added/requestBody")
public record GitHubWebhookInstallationRepositoriesAddedEvent(
        @Nullable GitHubWebhookEnterprise enterprise,
        GitHubWebhookInstallation installation,
        @Nullable GitHubWebhookOrganizationSimple organization,
        List<GitHubWebhookInstallationCreatedRepository> repositoriesAdded,
        List<GitHubWebhookInstallationRepositoriesAddedRepositoriesRemoved> repositoriesRemoved,
        @Nullable GitHubWebhookForkRepository repository,
        GitHubWebhookInstallationRepositorySelection repositorySelection,
        @Nullable GitHubWebhookUser requester,
        GitHubWebhookSimpleUser sender)
        implements GitHubWebhookInstallationRepositoriesEvent {
    public GitHubWebhookInstallationRepositoriesAddedEvent {
        requireNonNull(installation, "installation");
        requireNonNull(repositoriesAdded, "repositoriesAdded");
        requireNonNull(repositoriesRemoved, "repositoriesRemoved");
        requireNonNull(repositorySelection, "repositorySelection");
        requireNonNull(sender, "sender");
    }
}
