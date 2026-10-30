package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The reason for the current state */
@CatalogSchema("webhooks/discussion-answered/requestBody/properties/discussion/properties/state_reason")
public enum GitHubWebhookDiscussionStateReason {
    RESOLVED("resolved"),
    OUTDATED("outdated"),
    DUPLICATE("duplicate"),
    REOPENED("reopened"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookDiscussionStateReason> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookDiscussionStateReason.class, GitHubWebhookDiscussionStateReason::wireValue);

    private final String wireValue;

    GitHubWebhookDiscussionStateReason(final String wireValue) {
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
     * The discussion state reason from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDiscussionStateReason fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
