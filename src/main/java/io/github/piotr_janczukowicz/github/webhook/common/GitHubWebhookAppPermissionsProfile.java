package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The level of permission to grant the access token to manage the profile settings belonging to a user. */
@CatalogSchema(
        "webhooks/check-suite-requested/requestBody/properties/check_suite/properties/app/properties/permissions/properties/copilot_requests")
public enum GitHubWebhookAppPermissionsProfile {
    WRITE("write"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookAppPermissionsProfile> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookAppPermissionsProfile.class, GitHubWebhookAppPermissionsProfile::wireValue);

    private final String wireValue;

    GitHubWebhookAppPermissionsProfile(final String wireValue) {
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
     * The app permissions profile from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookAppPermissionsProfile fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
