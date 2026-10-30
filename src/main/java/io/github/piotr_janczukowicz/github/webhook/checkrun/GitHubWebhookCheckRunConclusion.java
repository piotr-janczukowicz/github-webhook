package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The check run conclusion. */
@CatalogSchema("webhooks/check-run-completed/requestBody/properties/check_run/properties/conclusion")
public enum GitHubWebhookCheckRunConclusion {
    WAITING("waiting"),
    PENDING("pending"),
    STARTUP_FAILURE("startup_failure"),
    STALE("stale"),
    SUCCESS("success"),
    FAILURE("failure"),
    NEUTRAL("neutral"),
    CANCELLED("cancelled"),
    SKIPPED("skipped"),
    TIMED_OUT("timed_out"),
    ACTION_REQUIRED("action_required"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookCheckRunConclusion> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookCheckRunConclusion.class, GitHubWebhookCheckRunConclusion::wireValue);

    private final String wireValue;

    GitHubWebhookCheckRunConclusion(final String wireValue) {
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
     * The check run conclusion from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookCheckRunConclusion fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
