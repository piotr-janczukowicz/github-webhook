package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The state of the Dependabot alert. */
@CatalogSchema("webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/state")
public enum GitHubWebhookDependabotAlertFixedAlertState {
    AUTO_DISMISSED("auto_dismissed"),
    DISMISSED("dismissed"),
    FIXED("fixed"),
    OPEN("open"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookDependabotAlertFixedAlertState> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookDependabotAlertFixedAlertState.class, GitHubWebhookDependabotAlertFixedAlertState::wireValue);

    private final String wireValue;

    GitHubWebhookDependabotAlertFixedAlertState(final String wireValue) {
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
     * The dependabot alert fixed alert state from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDependabotAlertFixedAlertState fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
