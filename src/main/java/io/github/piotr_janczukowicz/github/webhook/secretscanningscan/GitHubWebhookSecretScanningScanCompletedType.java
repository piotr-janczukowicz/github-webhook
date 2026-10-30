package io.github.piotr_janczukowicz.github.webhook.secretscanningscan;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** What type of scan was completed */
@CatalogSchema("webhooks/secret-scanning-scan-completed/requestBody/properties/type")
public enum GitHubWebhookSecretScanningScanCompletedType {
    BACKFILL("backfill"),
    CUSTOM_PATTERN_BACKFILL("custom-pattern-backfill"),
    PATTERN_VERSION_BACKFILL("pattern-version-backfill"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookSecretScanningScanCompletedType> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookSecretScanningScanCompletedType.class,
            GitHubWebhookSecretScanningScanCompletedType::wireValue);

    private final String wireValue;

    GitHubWebhookSecretScanningScanCompletedType(final String wireValue) {
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
     * The secret scanning scan completed type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookSecretScanningScanCompletedType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
