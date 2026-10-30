package io.github.piotr_janczukowicz.github.webhook.status;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The new state. Can be {@code pending}, {@code success}, {@code failure}, or {@code error}. */
@CatalogSchema("webhooks/status/requestBody/properties/state")
public enum GitHubWebhookStatusState {
    PENDING("pending"),
    SUCCESS("success"),
    FAILURE("failure"),
    ERROR("error"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookStatusState> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookStatusState.class, GitHubWebhookStatusState::wireValue);

    private final String wireValue;

    GitHubWebhookStatusState(final String wireValue) {
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
     * The status state from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookStatusState fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
