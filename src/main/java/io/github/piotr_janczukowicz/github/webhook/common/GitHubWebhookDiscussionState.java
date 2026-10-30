package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The current state of the discussion. {@code converting} means that the discussion is being converted from an issue.
 * {@code transferring} means that the discussion is being transferred from another repository.
 */
@CatalogSchema("webhooks/discussion-answered/requestBody/properties/discussion/properties/state")
public enum GitHubWebhookDiscussionState {
    OPEN("open"),
    CLOSED("closed"),
    LOCKED("locked"),
    CONVERTING("converting"),
    TRANSFERRING("transferring"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookDiscussionState> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookDiscussionState.class, GitHubWebhookDiscussionState::wireValue);

    private final String wireValue;

    GitHubWebhookDiscussionState(final String wireValue) {
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
     * The discussion state from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDiscussionState fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
