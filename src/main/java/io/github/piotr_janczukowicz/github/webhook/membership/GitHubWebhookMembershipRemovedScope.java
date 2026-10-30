package io.github.piotr_janczukowicz.github.webhook.membership;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The scope of the membership. Currently, can only be {@code team}. */
@CatalogSchema("webhooks/membership-removed/requestBody/properties/scope")
public enum GitHubWebhookMembershipRemovedScope {
    TEAM("team"),
    ORGANIZATION("organization"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookMembershipRemovedScope> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookMembershipRemovedScope.class, GitHubWebhookMembershipRemovedScope::wireValue);

    private final String wireValue;

    GitHubWebhookMembershipRemovedScope(final String wireValue) {
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
     * The membership removed scope from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookMembershipRemovedScope fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
