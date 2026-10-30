package io.github.piotr_janczukowicz.github.webhook.gollum;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The action that was performed on the page. Can be {@code created} or {@code edited}. */
@CatalogSchema("webhooks/gollum/requestBody/properties/pages/items/properties/action")
public enum GitHubWebhookGollumPageAction {
    CREATED("created"),
    EDITED("edited"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookGollumPageAction> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookGollumPageAction.class, GitHubWebhookGollumPageAction::wireValue);

    private final String wireValue;

    GitHubWebhookGollumPageAction(final String wireValue) {
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
     * The gollum page action from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookGollumPageAction fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
