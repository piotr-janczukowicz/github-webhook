package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The enforcement level of the ruleset. {@code evaluate} allows admins to test rules before enforcing them. Admins can
 * view insights on the Rule Insights page ({@code evaluate} is only available with GitHub Enterprise).
 */
@CatalogSchema("webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/enforcement")
public enum GitHubWebhookRepositoryRulesetEnforcement {
    DISABLED("disabled"),
    ACTIVE("active"),
    EVALUATE("evaluate"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositoryRulesetEnforcement> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookRepositoryRulesetEnforcement.class, GitHubWebhookRepositoryRulesetEnforcement::wireValue);

    private final String wireValue;

    GitHubWebhookRepositoryRulesetEnforcement(final String wireValue) {
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
     * The repository ruleset enforcement from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositoryRulesetEnforcement fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
