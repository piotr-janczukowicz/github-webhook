package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;

/**
 * A reviewing team, and file patterns describing which files they must approve changes to.
 *
 * @param filePatterns Array of file patterns. Pull requests which change matching files must be approved by the
 *     specified team. File patterns use fnmatch syntax.
 * @param minimumApprovals Minimum number of approvals required from the specified team. If set to zero, the team will
 *     be added to the pull request but approval is optional.
 * @param reviewer A required reviewing team
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/7/properties/parameters/properties/required_reviewers/items")
public record GitHubWebhookRequiredReviewerConfiguration(
        List<String> filePatterns, long minimumApprovals, GitHubWebhookReviewer reviewer) {
    public GitHubWebhookRequiredReviewerConfiguration {
        requireNonNull(filePatterns, "filePatterns");
        requireNonNull(reviewer, "reviewer");
    }
}
