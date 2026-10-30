package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The level of permission to grant the access token for GitHub Actions workflows, workflow runs, and artifacts. */
@CatalogSchema(
        "webhooks/check-suite-completed/requestBody/properties/check_suite/properties/app/properties/permissions/properties/actions")
public enum GitHubWebhookAppPermissionsActions {
    READ("read"),
    WRITE("write"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookAppPermissionsActions> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookAppPermissionsActions.class, GitHubWebhookAppPermissionsActions::wireValue);

    private final String wireValue;

    GitHubWebhookAppPermissionsActions(final String wireValue) {
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
     * The app permissions actions from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookAppPermissionsActions fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
