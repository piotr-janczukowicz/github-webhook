package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * A credit given to a user for a repository security advisory.
 *
 * @param state The state of the user's acceptance of the credit.
 * @param type The type of credit the user is receiving.
 * @param user A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-advisory-published/requestBody/properties/repository_advisory/properties/credits_detailed/items")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailed(
        GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailedState state,
        GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType type,
        GitHubWebhookSimpleUser user) {
    public GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailed {
        requireNonNull(state, "state");
        requireNonNull(type, "type");
        requireNonNull(user, "user");
    }
}
