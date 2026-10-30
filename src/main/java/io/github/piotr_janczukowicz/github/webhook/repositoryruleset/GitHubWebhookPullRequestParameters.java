package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestAutoMergeMergeMethod;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The pull request parameters payload.
 *
 * @param allowedMergeMethods Array of allowed merge methods. Allowed values include {@code merge}, {@code squash}, and
 *     {@code rebase}. At least one option must be enabled.
 * @param dismissStaleReviewsOnPush New, reviewable commits pushed will dismiss previous pull request review approvals.
 * @param dismissalRestriction Specify people, teams, or apps allowed to dismiss pull request reviews.
 * @param requireCodeOwnerReview Require an approving review in pull requests that modify files that have a designated
 *     code owner.
 * @param requireLastPushApproval Whether the most recent reviewable push must be approved by someone other than the
 *     person who pushed it.
 * @param requiredApprovingReviewCount The number of approving reviews that are required before a pull request can be
 *     merged.
 * @param requiredReviewThreadResolution All conversations on code must be resolved before a pull request can be merged.
 * @param requiredReviewers A collection of reviewers and associated file patterns. Each reviewer has a list of file
 *     patterns which determine the files that reviewer is required to review.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/7/properties/parameters")
public record GitHubWebhookPullRequestParameters(
        @Nullable List<GitHubWebhookPullRequestAutoMergeMergeMethod> allowedMergeMethods,
        boolean dismissStaleReviewsOnPush,
        @Nullable GitHubWebhookDismissalRestriction dismissalRestriction,
        boolean requireCodeOwnerReview,
        boolean requireLastPushApproval,
        long requiredApprovingReviewCount,
        boolean requiredReviewThreadResolution,
        @Nullable List<GitHubWebhookRequiredReviewerConfiguration> requiredReviewers) {}
