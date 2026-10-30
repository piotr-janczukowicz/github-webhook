package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The type of the source of the ruleset */
@CatalogSchema("webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/source_type")
public enum GitHubWebhookRepositoryRulesetSourceType {
    REPOSITORY("Repository"),
    ORGANIZATION("Organization"),
    ENTERPRISE("Enterprise"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositoryRulesetSourceType> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookRepositoryRulesetSourceType.class, GitHubWebhookRepositoryRulesetSourceType::wireValue);

    private final String wireValue;

    GitHubWebhookRepositoryRulesetSourceType(final String wireValue) {
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
     * The repository ruleset source type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositoryRulesetSourceType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
