package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The pull request base payload.
 *
 * @param label label
 * @param ref ref
 * @param repo A repository on GitHub.
 * @param sha sha
 * @param user A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/deployment-protection-rule-requested/requestBody/properties/pull_requests/items/properties/base")
public record GitHubWebhookPullRequestBase(
        String label, String ref, GitHubWebhookRepository repo, String sha, GitHubWebhookSimpleUser user) {
    public GitHubWebhookPullRequestBase {
        requireNonNull(label, "label");
        requireNonNull(ref, "ref");
        requireNonNull(repo, "repo");
        requireNonNull(sha, "sha");
        requireNonNull(user, "user");
    }
}
