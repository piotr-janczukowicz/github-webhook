package io.github.piotr_janczukowicz.github.webhook.member;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The member added changes permission to. */
@CatalogSchema("webhooks/member-added/requestBody/properties/changes/properties/permission/properties/to")
public enum GitHubWebhookMemberAddedChangesPermissionTo {
    WRITE("write"),
    ADMIN("admin"),
    READ("read"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookMemberAddedChangesPermissionTo> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookMemberAddedChangesPermissionTo.class, GitHubWebhookMemberAddedChangesPermissionTo::wireValue);

    private final String wireValue;

    GitHubWebhookMemberAddedChangesPermissionTo(final String wireValue) {
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
     * The member added changes permission to from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookMemberAddedChangesPermissionTo fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
