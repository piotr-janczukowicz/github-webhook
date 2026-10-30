package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The reactions payload.
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
@CatalogSchema("webhooks/commit-comment-created/requestBody/properties/comment/properties/reactions")
public record GitHubWebhookReactions(
        @JsonProperty("+1") long plusOne,
        @JsonProperty("-1") long minusOne,
        long confused,
        long eyes,
        long heart,
        long hooray,
        long laugh,
        long rocket,
        long totalCount,
        String url) {
    public GitHubWebhookReactions {
        requireNonNull(url, "url");
    }
}
