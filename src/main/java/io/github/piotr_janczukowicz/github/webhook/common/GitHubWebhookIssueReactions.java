package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The issue reactions payload.
 *
 * @param plusOne +1
 * @param minusOne -1
 * @param confused confused
 * @param eyes eyes
 * @param heart heart
 * @param hooray hooray
 * @param laugh laugh
 * @param rocket rocket
 * @param totalCount total_count
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issue-comment-created/requestBody/properties/issue/properties/reactions")
public record GitHubWebhookIssueReactions(
        @Nullable @JsonProperty("+1") Long plusOne,
        @Nullable @JsonProperty("-1") Long minusOne,
        @Nullable Long confused,
        @Nullable Long eyes,
        @Nullable Long heart,
        @Nullable Long hooray,
        @Nullable Long laugh,
        @Nullable Long rocket,
        @Nullable Long totalCount,
        @Nullable String url) {}
