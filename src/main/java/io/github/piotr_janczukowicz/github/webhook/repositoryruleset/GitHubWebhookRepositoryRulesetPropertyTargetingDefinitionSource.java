package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The source of the repository property. Defaults to 'custom' if not specified. */
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/conditions/properties/repository_property/properties/exclude/items/properties/source")
public enum GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionSource {
    CUSTOM("custom"),
    SYSTEM("system"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionSource>
            WIRE_INDEX = EnumUtils.index(
                    GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionSource.class,
                    GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionSource::wireValue);

    private final String wireValue;

    GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionSource(final String wireValue) {
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
     * The repository ruleset property targeting definition source from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionSource fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
