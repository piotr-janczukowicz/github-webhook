package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The bypass type of the user making the API request for this ruleset. This field is only returned when querying the
 * repository-level endpoint.
 */
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/current_user_can_bypass")
public enum GitHubWebhookRepositoryRulesetCurrentUserCanBypass {
    ALWAYS("always"),
    PULL_REQUESTS_ONLY("pull_requests_only"),
    NEVER("never"),
    EXEMPT("exempt"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositoryRulesetCurrentUserCanBypass> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookRepositoryRulesetCurrentUserCanBypass.class,
                    GitHubWebhookRepositoryRulesetCurrentUserCanBypass::wireValue);

    private final String wireValue;

    GitHubWebhookRepositoryRulesetCurrentUserCanBypass(final String wireValue) {
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
     * The repository ruleset current user can bypass from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositoryRulesetCurrentUserCanBypass fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
