package io.github.piotr_janczukowicz.github.webhook.secretscanningscan;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** If the scan was triggered by a custom pattern update, this will be the scope of the pattern that was updated */
@CatalogSchema("webhooks/secret-scanning-scan-completed/requestBody/properties/custom_pattern_scope")
public enum GitHubWebhookSecretScanningScanCompletedCustomPatternScope {
    REPOSITORY("repository"),
    ORGANIZATION("organization"),
    ENTERPRISE("enterprise"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookSecretScanningScanCompletedCustomPatternScope> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookSecretScanningScanCompletedCustomPatternScope.class,
                    GitHubWebhookSecretScanningScanCompletedCustomPatternScope::wireValue);

    private final String wireValue;

    GitHubWebhookSecretScanningScanCompletedCustomPatternScope(final String wireValue) {
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
     * The secret scanning scan completed custom pattern scope from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookSecretScanningScanCompletedCustomPatternScope fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
