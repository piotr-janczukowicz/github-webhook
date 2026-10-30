package io.github.piotr_janczukowicz.github.webhook.secretscanningscan;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** What type of content was scanned */
@CatalogSchema("webhooks/secret-scanning-scan-completed/requestBody/properties/source")
public enum GitHubWebhookSecretScanningScanCompletedSource {
    GIT("git"),
    ISSUES("issues"),
    PULL_REQUESTS("pull-requests"),
    DISCUSSIONS("discussions"),
    WIKI("wiki"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookSecretScanningScanCompletedSource> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookSecretScanningScanCompletedSource.class,
                    GitHubWebhookSecretScanningScanCompletedSource::wireValue);

    private final String wireValue;

    GitHubWebhookSecretScanningScanCompletedSource(final String wireValue) {
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
     * The secret scanning scan completed source from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookSecretScanningScanCompletedSource fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
