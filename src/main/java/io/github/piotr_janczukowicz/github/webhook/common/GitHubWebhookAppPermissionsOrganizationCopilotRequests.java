package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The level of permission to grant the access token to make Copilot requests billed to the organization where the app
 * is installed. This property is in public preview and is subject to change.
 */
@CatalogSchema(
        "webhooks/installation-created/requestBody/properties/installation/properties/permissions/properties/organization_copilot_requests")
public enum GitHubWebhookAppPermissionsOrganizationCopilotRequests {
    READ("read"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookAppPermissionsOrganizationCopilotRequests> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookAppPermissionsOrganizationCopilotRequests.class,
                    GitHubWebhookAppPermissionsOrganizationCopilotRequests::wireValue);

    private final String wireValue;

    GitHubWebhookAppPermissionsOrganizationCopilotRequests(final String wireValue) {
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
     * The app permissions organization copilot requests from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookAppPermissionsOrganizationCopilotRequests fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
