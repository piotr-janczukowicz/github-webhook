package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The deployment review requested reviewer type. */
@CatalogSchema("webhooks/deployment-review-requested/requestBody/properties/reviewers/items/properties/type")
public enum GitHubWebhookDeploymentReviewRequestedReviewerType {
    USER("User"),
    TEAM("Team"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookDeploymentReviewRequestedReviewerType> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookDeploymentReviewRequestedReviewerType.class,
                    GitHubWebhookDeploymentReviewRequestedReviewerType::wireValue);

    private final String wireValue;

    GitHubWebhookDeploymentReviewRequestedReviewerType(final String wireValue) {
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
     * The deployment review requested reviewer type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDeploymentReviewRequestedReviewerType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
