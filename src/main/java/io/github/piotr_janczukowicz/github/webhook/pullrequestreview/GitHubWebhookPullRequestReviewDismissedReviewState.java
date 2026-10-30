package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The pull request review dismissed review state. */
@CatalogSchema("webhooks/pull-request-review-dismissed/requestBody/properties/review/properties/state")
public enum GitHubWebhookPullRequestReviewDismissedReviewState {
    DISMISSED("dismissed"),
    APPROVED("approved"),
    CHANGES_REQUESTED("changes_requested"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookPullRequestReviewDismissedReviewState> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookPullRequestReviewDismissedReviewState.class,
                    GitHubWebhookPullRequestReviewDismissedReviewState::wireValue);

    private final String wireValue;

    GitHubWebhookPullRequestReviewDismissedReviewState(final String wireValue) {
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
     * The pull request review dismissed review state from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookPullRequestReviewDismissedReviewState fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
