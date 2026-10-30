package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The type of the reviewer */
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/7/properties/parameters/properties/required_reviewers/items/properties/reviewer/properties/type")
public enum GitHubWebhookReviewerType {
    TEAM("Team"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookReviewerType> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookReviewerType.class, GitHubWebhookReviewerType::wireValue);

    private final String wireValue;

    GitHubWebhookReviewerType(final String wireValue) {
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
     * The reviewer type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookReviewerType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
