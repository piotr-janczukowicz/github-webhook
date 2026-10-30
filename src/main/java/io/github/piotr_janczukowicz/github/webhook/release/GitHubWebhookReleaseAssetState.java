package io.github.piotr_janczukowicz.github.webhook.release;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** State of the release asset. */
@CatalogSchema("webhooks/release-created/requestBody/properties/release/properties/assets/items/properties/state")
public enum GitHubWebhookReleaseAssetState {
    UPLOADED("uploaded"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookReleaseAssetState> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookReleaseAssetState.class, GitHubWebhookReleaseAssetState::wireValue);

    private final String wireValue;

    GitHubWebhookReleaseAssetState(final String wireValue) {
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
     * The release asset state from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookReleaseAssetState fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
