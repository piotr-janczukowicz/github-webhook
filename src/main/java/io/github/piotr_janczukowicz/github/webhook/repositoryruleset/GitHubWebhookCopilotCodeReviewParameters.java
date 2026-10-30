package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The copilot code review parameters payload.
 *
 * @param reviewDraftPullRequests Copilot automatically reviews draft pull requests before they are marked as ready for
 *     review.
 * @param reviewOnPush Copilot automatically reviews each new push to the pull request.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/19/properties/parameters")
public record GitHubWebhookCopilotCodeReviewParameters(
        @Nullable Boolean reviewDraftPullRequests, @Nullable Boolean reviewOnPush) {}
