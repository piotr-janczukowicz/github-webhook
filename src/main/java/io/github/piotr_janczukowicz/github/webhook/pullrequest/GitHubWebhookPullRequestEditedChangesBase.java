package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The pull request edited changes base payload.
 *
 * @param ref ref
 * @param sha sha
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-edited/requestBody/properties/changes/properties/base")
public record GitHubWebhookPullRequestEditedChangesBase(
        GitHubWebhookIssuesEditedChangesBody ref, GitHubWebhookIssuesEditedChangesBody sha) {
    public GitHubWebhookPullRequestEditedChangesBase {
        requireNonNull(ref, "ref");
        requireNonNull(sha, "sha");
    }
}
