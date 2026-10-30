package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The level at which the comment is targeted, can be a diff line or a file. */
@CatalogSchema("webhooks/pull-request-review-comment-deleted/requestBody/properties/comment/properties/subject_type")
public enum GitHubWebhookPullRequestReviewCommentSubjectType {
    LINE("line"),
    FILE("file"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookPullRequestReviewCommentSubjectType> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookPullRequestReviewCommentSubjectType.class,
                    GitHubWebhookPullRequestReviewCommentSubjectType::wireValue);

    private final String wireValue;

    GitHubWebhookPullRequestReviewCommentSubjectType(final String wireValue) {
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
     * The pull request review comment subject type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookPullRequestReviewCommentSubjectType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
