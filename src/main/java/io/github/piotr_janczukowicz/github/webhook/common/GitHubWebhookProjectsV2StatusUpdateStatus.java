package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The current status. */
@CatalogSchema(
        "webhooks/projects-v2-closed/requestBody/properties/projects_v2/properties/latest_status_update/properties/status")
public enum GitHubWebhookProjectsV2StatusUpdateStatus {
    INACTIVE("INACTIVE"),
    ON_TRACK("ON_TRACK"),
    AT_RISK("AT_RISK"),
    OFF_TRACK("OFF_TRACK"),
    COMPLETE("COMPLETE"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookProjectsV2StatusUpdateStatus> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookProjectsV2StatusUpdateStatus.class, GitHubWebhookProjectsV2StatusUpdateStatus::wireValue);

    private final String wireValue;

    GitHubWebhookProjectsV2StatusUpdateStatus(final String wireValue) {
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
     * The projects v2 status update status from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookProjectsV2StatusUpdateStatus fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
