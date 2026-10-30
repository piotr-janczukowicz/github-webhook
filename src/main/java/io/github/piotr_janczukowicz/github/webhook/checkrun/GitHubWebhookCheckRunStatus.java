package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The phase of the lifecycle that the check is currently in. */
@CatalogSchema("webhooks/check-run-completed/requestBody/properties/check_run/properties/status")
public enum GitHubWebhookCheckRunStatus {
    QUEUED("queued"),
    IN_PROGRESS("in_progress"),
    COMPLETED("completed"),
    PENDING("pending"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookCheckRunStatus> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookCheckRunStatus.class, GitHubWebhookCheckRunStatus::wireValue);

    private final String wireValue;

    GitHubWebhookCheckRunStatus(final String wireValue) {
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
     * The check run status from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookCheckRunStatus fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
