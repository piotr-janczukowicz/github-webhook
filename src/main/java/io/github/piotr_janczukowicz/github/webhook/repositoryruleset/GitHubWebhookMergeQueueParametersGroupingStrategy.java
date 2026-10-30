package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * When set to ALLGREEN, the merge commit created by merge queue for each PR in the group must pass all required checks
 * to merge. When set to HEADGREEN, only the commit at the head of the merge group, i.e. the commit containing changes
 * from all of the PRs in the group, must pass its required checks to merge.
 */
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/4/properties/parameters/properties/grouping_strategy")
public enum GitHubWebhookMergeQueueParametersGroupingStrategy {
    ALLGREEN("ALLGREEN"),
    HEADGREEN("HEADGREEN"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookMergeQueueParametersGroupingStrategy> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookMergeQueueParametersGroupingStrategy.class,
                    GitHubWebhookMergeQueueParametersGroupingStrategy::wireValue);

    private final String wireValue;

    GitHubWebhookMergeQueueParametersGroupingStrategy(final String wireValue) {
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
     * The merge queue parameters grouping strategy from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookMergeQueueParametersGroupingStrategy fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
