package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The merge method to use. */
@CatalogSchema(
        "webhooks/deployment-protection-rule-requested/requestBody/properties/pull_requests/items/properties/auto_merge/properties/merge_method")
public enum GitHubWebhookPullRequestAutoMergeMergeMethod {
    MERGE("merge"),
    SQUASH("squash"),
    REBASE("rebase"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookPullRequestAutoMergeMergeMethod> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookPullRequestAutoMergeMergeMethod.class,
            GitHubWebhookPullRequestAutoMergeMergeMethod::wireValue);

    private final String wireValue;

    GitHubWebhookPullRequestAutoMergeMergeMethod(final String wireValue) {
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
     * The pull request auto merge merge method from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookPullRequestAutoMergeMergeMethod fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
