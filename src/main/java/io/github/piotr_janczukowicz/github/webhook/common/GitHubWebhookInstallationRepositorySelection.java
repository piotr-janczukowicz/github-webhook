package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** Describe whether all repositories have been selected or there's a selection involved */
@CatalogSchema("webhooks/installation-created/requestBody/properties/installation/properties/repository_selection")
public enum GitHubWebhookInstallationRepositorySelection {
    ALL("all"),
    SELECTED("selected"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookInstallationRepositorySelection> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookInstallationRepositorySelection.class,
            GitHubWebhookInstallationRepositorySelection::wireValue);

    private final String wireValue;

    GitHubWebhookInstallationRepositorySelection(final String wireValue) {
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
     * The installation repository selection from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookInstallationRepositorySelection fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
