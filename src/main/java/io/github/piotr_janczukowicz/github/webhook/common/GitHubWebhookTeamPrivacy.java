package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The team privacy. */
@CatalogSchema("webhooks/membership-added/requestBody/properties/team/properties/privacy")
public enum GitHubWebhookTeamPrivacy {
    OPEN("open"),
    CLOSED("closed"),
    SECRET("secret"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookTeamPrivacy> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookTeamPrivacy.class, GitHubWebhookTeamPrivacy::wireValue);

    private final String wireValue;

    GitHubWebhookTeamPrivacy(final String wireValue) {
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
     * The team privacy from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookTeamPrivacy fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
