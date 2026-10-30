package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The side of the first line of the range for a multi-line comment. */
@CatalogSchema("webhooks/pull-request-review-comment-deleted/requestBody/properties/comment/properties/side")
public enum GitHubWebhookPullRequestReviewCommentSide {
    LEFT("LEFT"),
    RIGHT("RIGHT"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookPullRequestReviewCommentSide> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookPullRequestReviewCommentSide.class, GitHubWebhookPullRequestReviewCommentSide::wireValue);

    private final String wireValue;

    GitHubWebhookPullRequestReviewCommentSide(final String wireValue) {
        this.wireValue = wireValue;
    }

    /**
     * Value GitHub sends in JSON.
     *
     * @return wire string
     */
    @JsonValue
    public String wireValue() {
        return wireValue;
    }

    /**
     * The pull request review comment side from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookPullRequestReviewCommentSide fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
