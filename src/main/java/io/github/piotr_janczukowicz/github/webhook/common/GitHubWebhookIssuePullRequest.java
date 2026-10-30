package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The issue pull request payload.
 *
 * @param diffUrl diff_url
 * @param htmlUrl html_url
 * @param mergedAt merged_at
 * @param patchUrl patch_url
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issue-comment-created/requestBody/properties/issue/properties/pull_request")
public record GitHubWebhookIssuePullRequest(
        @Nullable String diffUrl,
        @Nullable String htmlUrl,
        @Nullable Instant mergedAt,
        @Nullable String patchUrl,
        @Nullable String url) {}
