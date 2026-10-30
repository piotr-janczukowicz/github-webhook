package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** Type of repository selection requested. */
@CatalogSchema(
        "webhooks/personal-access-token-request-approved/requestBody/properties/personal_access_token_request/properties/repository_selection")
public enum GitHubWebhookPersonalAccessTokenRequestRepositorySelection {
    NONE("none"),
    ALL("all"),
    SUBSET("subset"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookPersonalAccessTokenRequestRepositorySelection> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookPersonalAccessTokenRequestRepositorySelection.class,
                    GitHubWebhookPersonalAccessTokenRequestRepositorySelection::wireValue);

    private final String wireValue;

    GitHubWebhookPersonalAccessTokenRequestRepositorySelection(final String wireValue) {
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
     * The personal access token request repository selection from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookPersonalAccessTokenRequestRepositorySelection fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
