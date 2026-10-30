package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The issue active lock reason. */
@CatalogSchema("webhooks/issue-comment-pinned/requestBody/properties/issue/properties/active_lock_reason")
public enum GitHubWebhookIssueActiveLockReason {
    RESOLVED("resolved"),
    OFF_TOPIC("off-topic"),
    TOO_HEATED("too heated"),
    SPAM("spam"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookIssueActiveLockReason> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookIssueActiveLockReason.class, GitHubWebhookIssueActiveLockReason::wireValue);

    private final String wireValue;

    GitHubWebhookIssueActiveLockReason(final String wireValue) {
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
     * The issue active lock reason from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookIssueActiveLockReason fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
