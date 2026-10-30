package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The reason for the current state */
@CatalogSchema(
        "webhooks/issue-dependencies-blocked-by-added/requestBody/properties/blocked_issue/properties/state_reason")
public enum GitHubWebhookIssueStateReason {
    COMPLETED("completed"),
    REOPENED("reopened"),
    NOT_PLANNED("not_planned"),
    DUPLICATE("duplicate"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookIssueStateReason> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookIssueStateReason.class, GitHubWebhookIssueStateReason::wireValue);

    private final String wireValue;

    GitHubWebhookIssueStateReason(final String wireValue) {
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
     * The issue state reason from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookIssueStateReason fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
