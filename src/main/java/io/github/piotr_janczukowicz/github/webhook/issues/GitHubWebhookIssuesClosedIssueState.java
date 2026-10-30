package io.github.piotr_janczukowicz.github.webhook.issues;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The issues closed issue state. */
@CatalogSchema("webhooks/issues-closed/requestBody/properties/issue/properties/state")
public enum GitHubWebhookIssuesClosedIssueState {
    CLOSED("closed"),
    OPEN("open"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookIssuesClosedIssueState> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookIssuesClosedIssueState.class, GitHubWebhookIssuesClosedIssueState::wireValue);

    private final String wireValue;

    GitHubWebhookIssuesClosedIssueState(final String wireValue) {
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
     * The issues closed issue state from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookIssuesClosedIssueState fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
