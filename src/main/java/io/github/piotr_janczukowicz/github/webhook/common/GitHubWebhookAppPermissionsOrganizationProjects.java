package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The level of permission to grant the access token for organization custom properties management at the enterprise
 * level.
 */
@CatalogSchema(
        "webhooks/check-suite-completed/requestBody/properties/check_suite/properties/app/properties/permissions/properties/organization_projects")
public enum GitHubWebhookAppPermissionsOrganizationProjects {
    READ("read"),
    WRITE("write"),
    ADMIN("admin"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookAppPermissionsOrganizationProjects> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookAppPermissionsOrganizationProjects.class,
                    GitHubWebhookAppPermissionsOrganizationProjects::wireValue);

    private final String wireValue;

    GitHubWebhookAppPermissionsOrganizationProjects(final String wireValue) {
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
     * The app permissions organization projects from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookAppPermissionsOrganizationProjects fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
