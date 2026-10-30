package io.github.piotr_janczukowicz.github.webhook.meta;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The meta deleted hook config content type. */
@CatalogSchema("webhooks/meta-deleted/requestBody/properties/hook/properties/config/properties/content_type")
public enum GitHubWebhookMetaDeletedHookConfigContentType {
    JSON("json"),
    FORM("form"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookMetaDeletedHookConfigContentType> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookMetaDeletedHookConfigContentType.class,
                    GitHubWebhookMetaDeletedHookConfigContentType::wireValue);

    private final String wireValue;

    GitHubWebhookMetaDeletedHookConfigContentType(final String wireValue) {
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
     * The meta deleted hook config content type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookMetaDeletedHookConfigContentType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
