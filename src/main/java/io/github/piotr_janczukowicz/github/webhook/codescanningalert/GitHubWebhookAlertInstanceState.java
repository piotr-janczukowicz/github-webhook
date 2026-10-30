package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** State of a code scanning alert. */
@CatalogSchema(
        "webhooks/code-scanning-alert-appeared-in-branch/requestBody/properties/alert/properties/most_recent_instance/properties/state")
public enum GitHubWebhookAlertInstanceState {
    OPEN("open"),
    DISMISSED("dismissed"),
    FIXED("fixed"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookAlertInstanceState> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookAlertInstanceState.class, GitHubWebhookAlertInstanceState::wireValue);

    private final String wireValue;

    GitHubWebhookAlertInstanceState(final String wireValue) {
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
     * The alert instance state from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookAlertInstanceState fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
